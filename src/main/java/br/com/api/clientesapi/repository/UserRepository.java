package br.com.api.clientesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.clientesapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{ //Long
    
}
