package com.chat.messegerrr.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "adams")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Adam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    @JsonIgnore
    @ManyToMany
    private List<Chat> chats = new ArrayList<>();

}
