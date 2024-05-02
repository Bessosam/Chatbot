package com.saad.RealTimeChat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

    /**
     * Enum representing the type of message.
     */
    public enum MessageType {
        CHAT, LEAVE, JOIN
    }
}
