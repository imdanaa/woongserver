package com.cloud.woongserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();  // findAll()로 모든 데이터 조회
    }
}
