package br.com.api.clientesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.clientesapi.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{ //Long
    
}
