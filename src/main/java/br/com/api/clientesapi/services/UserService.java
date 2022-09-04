package br.com.api.clientesapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.clientesapi.model.User;
import br.com.api.clientesapi.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository; //add ponto de injeção do userRepository
    

    public Object save(User user){
        return userRepository.save(user);
    }


    public Object findAll() {
        return null;
    }
}
