package com.chat.messegerrr.Service.ServiceImpl;

import com.chat.messegerrr.Entities.Adam;
import com.chat.messegerrr.Entities.Chat;
import com.chat.messegerrr.Entities.Message;
import com.chat.messegerrr.Repository.AdamRepository;
import com.chat.messegerrr.Repository.ChatRepository;
import com.chat.messegerrr.Repository.MessageRepository;
import com.chat.messegerrr.Service.ChatService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatServiceImpl implements ChatService {
    private final ChatRepository chatRepository;
    private final AdamRepository adamRepository;
    private final MessageRepository messageRepository;

    @Autowired
    public ChatServiceImpl(ChatRepository chatRepository, AdamRepository adamRepository, MessageRepository messageRepository) {
        this.chatRepository = chatRepository;
        this.adamRepository = adamRepository;
        this.messageRepository = messageRepository;
    }

        @Override
        public Chat createChat(String chatName) {
            Chat chat = new Chat();
            chat.setName(chatName);
            return chatRepository.save(chat);
        }

    @Transactional
    @Override
    public void sendMessage(Long chatId, Long senderId, Long receiverId, String content) {
        Chat chat = chatRepository.findById(chatId)
                .orElseThrow(() -> new IllegalArgumentException("Chat not found"));

        Adam sender = adamRepository.findById(senderId)
                .orElseThrow(() -> new IllegalArgumentException("Sender not found"));

        Adam receiver = adamRepository.findById(receiverId)
                .orElseThrow(() -> new IllegalArgumentException("Receiver not found"));

        Message message = new Message();
        message.setContent(content);
        message.setSender(sender);
        message.setReceiver(receiver);
        message.setChat(chat);

        messageRepository.save(message);
    }


    @Override
    public List<Message> getAllMessagesInChat(Long chatId) {
        Chat chat = chatRepository.findById(chatId)
                .orElseThrow(() -> new IllegalArgumentException("Chat not found"));
        return chat.getMessages();
    }
    }



