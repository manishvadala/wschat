package org.max.wschat.api.controller;

import org.max.wschat.model.ChatMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ResponseEntity<ChatMessage> sendMessage(@Payload ChatMessage chatMessage) {
        return new ResponseEntity<>(chatMessage, HttpStatus.OK);
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ResponseEntity<Boolean> addUser(@Payload ChatMessage chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
