package com.chat.messegerrr.Controllers;

import com.chat.messegerrr.Entities.*;
import com.chat.messegerrr.Service.AdamService;
import com.chat.messegerrr.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @Autowired
    private AdamService adamService;

    @PostMapping("/createChat")
    public Chat createChat(@RequestBody String chatName) {
        return chatService.createChat(chatName);
    }

    @PostMapping("/createUser")
    public Adam createUser(@RequestBody String userName) {
        return adamService.createUser(userName);
    }


    @PostMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestBody SendMessageRequest request) {
        chatService.sendMessage(request.getChatId(), request.getSenderId(), request.getReceiverId(), request.getContent());
        return ResponseEntity.ok("Message sent successfully");
    }

    @GetMapping("/chatMessages/{chatId}")
    public List<Message> getAllMessagesInChat(@PathVariable Long chatId) {
        return chatService.getAllMessagesInChat(chatId);
    }
}



