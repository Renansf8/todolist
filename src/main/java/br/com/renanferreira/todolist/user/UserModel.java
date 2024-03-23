package br.com.renanferreira.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/** 
 * Lib Lombok -> vai otimizar a criação de getters e setters e constructors
 * na minha aplicação, posso colocar o decorator em cima do atributo apenas também
 */
@Data
@Entity(name = "tb_users")
public class UserModel {
  
  @Id
  // Eu posso escolher como vai ser gereado o id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  @Column(unique = true)
  private String userName;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
