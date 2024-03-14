package org.talent.talentpay.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class UserResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private String username;
    private String phoneNumber;
    private String mail;
    private String address;
    private String nrc;
    private LocalDate dob;
    private String profileImage;
}
