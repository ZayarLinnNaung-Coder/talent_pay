package org.talent.talentpay.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.talent.talentpay.domain.*;
import org.talent.talentpay.entity.Users;
import org.talent.talentpay.service.UserService;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final ModelMapper modelMapper;
    private final UserService userService;

    @PostMapping("/validate")
    public ResponseEntity<UserInfo> validateUser(@RequestBody UserValidateRequest request){
        return ResponseEntity.ok(userService.validateUser(request));
    }

    @PostMapping
    public ResponseEntity<TalentResponse<UserResponse>> registerUser(@RequestBody NewUserRequest request){
        TalentResponse<UserResponse> response =
                new TalentResponse<>(userService.registerUser(request), "Successfully registered", HttpStatus.CREATED);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
