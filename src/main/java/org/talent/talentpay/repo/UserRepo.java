package org.talent.talentpay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talent.talentpay.entity.Users;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

public interface UserRepo extends JpaRepository<Users, UUID> {

    Optional<Users> findUsersByPhoneNumber(String phoneNumber);
    Optional<Users> findUsersByMail(String mail);

}
