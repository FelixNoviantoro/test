package com.company.springsecurityjdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String date;
    private String name;
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;

}
