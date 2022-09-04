package br.com.api.clientesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.api.clientesapi.model.User;
import br.com.api.clientesapi.repository.UserRepository;
import br.com.api.clientesapi.services.UserService;

@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/user") //definicao a nivel de classe
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Object> saveUser(){
        User user = new User();

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
    @GetMapping("/user")
    public ResponseEntity<Object> listUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }
}
