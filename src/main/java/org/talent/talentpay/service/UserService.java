package org.talent.talentpay.service;

import org.talent.talentpay.domain.NewUserRequest;
import org.talent.talentpay.domain.UserInfo;
import org.talent.talentpay.domain.UserValidateRequest;
import org.talent.talentpay.entity.Users;

public interface UserService {

    UserInfo validateUser(UserValidateRequest request);
    Users registerUser(NewUserRequest request);

}
