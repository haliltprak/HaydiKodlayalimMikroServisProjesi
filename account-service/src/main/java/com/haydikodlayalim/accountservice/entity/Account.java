package com.haydikodlayalim.accountservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") // iki nesnenin esit olup olmadigini id uzerinden anlayacagimizi soyluyoruz
@ToString
@Getter
@Setter
@Table(value = "accounts") // cassandra dan geliyor bu notasyon. accounts adli bir tablo oldugunu soyluyoruz.
public class Account implements Serializable { // data nin cassandara ya yazilip okunmasi icin serializable ekliyoruz.

    @PrimaryKey // cassandra dan geliyor bu notasyon
    private String id = UUID.randomUUID().toString(); // otomatik bir sekilde id olusturuyoruz. her instance olustugunda bu field da otomatik olusacak

    @Column(value = "uname") // cassandra notasyonu
    private String username;

    @Column(value = "email")
    private String email;

    @Column(value = "pswd")
    private String password;

    @Column(value = "created_at")
    private Date createdAt;

    @Column(value = "is_active")
    private Boolean active;


}
