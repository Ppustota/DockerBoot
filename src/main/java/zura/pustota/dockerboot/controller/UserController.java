package zura.pustota.dockerboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zura.pustota.dockerboot.model.User;
import zura.pustota.dockerboot.repo.UserRepo;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserRepo userRepo;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
}
