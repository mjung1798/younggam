package com.younggam.morethanchat.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Getter
@NoArgsConstructor
@Table(name = "chatroom")
@AllArgsConstructor
public class ChatRoom {
    @NotNull
    @Column(name = "chatroom_code")
    private String chatRoomCode;
    @NotNull
    @Column(unique = true, name = "customer_id")
    private Long customerId;
    @NotNull
    @Column(name = "provider_id")
    private Long providerId;
    @NotNull
    @Column(name = "reg_date")
    private String regDate;
}