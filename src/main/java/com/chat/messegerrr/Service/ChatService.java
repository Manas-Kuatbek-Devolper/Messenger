package com.chat.messegerrr.Service;


import com.chat.messegerrr.Entities.Chat;

import com.chat.messegerrr.Entities.Message;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public interface ChatService {
        Chat createChat(String chatName);
        void sendMessage(Long chatId, Long senderId, Long receiverId, String content);

        List<Message> getAllMessagesInChat(Long chatId);
    }





