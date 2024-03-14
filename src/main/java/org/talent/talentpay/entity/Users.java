package org.talent.talentpay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.talent.talentpay.domain.NewUserRequest;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
    private boolean isDeleted;

    public static Users of(NewUserRequest request){
        Users users = new Users();
        users.firstName = request.getFirstName();
        users.lastName = request.getLastName();
        users.dob = request.getDob();
        users.nrc = request.getNrc();
        users.phoneNumber = request.getPhoneNumber();
        users.mail = request.getEmail();
        users.address = request.getAddress();

        return users;
    }

}
