package com.example.backendspring.controllers;

import com.example.backendspring.models.User;
import com.example.backendspring.repositories.UserRepo;
//import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@ApiOperation(value = "/api/user", tags = "user profil controller")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

  //  @ApiOperation(value = "retourne tout les utilisateur")
    @GetMapping()
    public List<User> getUsers(){
        return userRepo.findAll();
    }

//    @ApiOperation(value = "cree un utilisateur")
    @PostMapping()
    public User createUser(@RequestBody User user){
        userRepo.save(user);
        return user;
    }

  //  @ApiOperation(value = "modifie un utilisateur")
    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setNom(user.getNom());
        updatedUser.setPrenom(user.getPrenom());
        userRepo.save(updatedUser);
        return "updated...";
    }

  //  @ApiOperation(value = "supprime un utilisateur")
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "delete user with id..."+id;
    }

}
