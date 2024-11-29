package com.cloud.woongserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();  // UserService에서 데이터를 조회하여 반환
    }
}
