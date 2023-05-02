package fr.cgs.cgs_back.controller;

import fr.cgs.cgs_back.dto.UserDto;
import fr.cgs.cgs_back.entity.User;
import fr.cgs.cgs_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserDto userDto){
        userService.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
    }

    @GetMapping("/bite")
    public List<User> bite(){
        return userService.findAll();
    }
}
