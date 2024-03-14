package org.talent.talentpay.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.talent.talentpay.domain.NewUserRequest;
import org.talent.talentpay.domain.UserInfo;
import org.talent.talentpay.domain.UserValidateRequest;
import org.talent.talentpay.entity.Users;
import org.talent.talentpay.repo.UserRepo;
import org.talent.talentpay.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public UserInfo validateUser(UserValidateRequest request) {
        // validate user with phoneNumber
        // if does not exist, error response
        // or else return userInfo

        final Users user = userRepo
                .findUsersByPhoneNumber(request.getPhoneNumber())
                .orElseThrow(() -> new RuntimeException("No user"));

        return UserInfo.of(user);

    }

    @Override
    public Users registerUser(NewUserRequest request) {
        Users user = Users.of(request);
        return userRepo.save(user);
    }

}
