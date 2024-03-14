package org.talent.talentpay.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.talent.talentpay.domain.NewUserRequest;
import org.talent.talentpay.domain.UserInfo;
import org.talent.talentpay.domain.UserValidateRequest;
import org.talent.talentpay.entity.Users;
import org.talent.talentpay.service.UserService;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/validate")
    public ResponseEntity<UserInfo> validateUser(@RequestBody UserValidateRequest request){
        return ResponseEntity.ok(userService.validateUser(request));
    }

    @PostMapping
    public void registerUser(@RequestBody NewUserRequest request){
        Users user = userService.registerUser(request);
    }

}
