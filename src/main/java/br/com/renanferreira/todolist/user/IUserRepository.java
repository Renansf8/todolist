package br.com.renanferreira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/* Interface -> implementação dos métodos da classe */
/* No JpaRepository tenho que passar qual a classe que esse repository ta 
 * representando e o tipo de id da entidade
 */
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUserName(String username);
}
