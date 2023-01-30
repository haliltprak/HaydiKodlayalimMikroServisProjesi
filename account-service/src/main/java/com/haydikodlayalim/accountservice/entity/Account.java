package com.haydikodlayalim.accountservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") // iki nesnenin esit olup olmadigini id uzerinden anlayacagimizi soyluyoruz
@ToString
@Getter
@Setter
public class Account {

    private String id;
    private String username;
    private String email;
    private String passwd;

    public Account(String id) {
        this.id = id;
    }

}
