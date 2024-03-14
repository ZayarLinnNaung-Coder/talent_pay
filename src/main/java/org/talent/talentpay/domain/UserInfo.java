package org.talent.talentpay.domain;

import lombok.Getter;
import lombok.Setter;
import org.talent.talentpay.entity.Users;

@Getter
@Setter
public class UserInfo {

    private String username;
    private String secretPhoneNumber;

    public static UserInfo of(Users user){
        UserInfo userInfo = new UserInfo();
        userInfo.username = user.getUsername();
        userInfo.secretPhoneNumber = "********" +
                user.getPhoneNumber().substring(0, user.getPhoneNumber().length() - 4);

        return userInfo;
    }

}
