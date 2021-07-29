package test.fileproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.fileproject.entity.Role;
import test.fileproject.entity.User;
import test.fileproject.repository.UserRepository;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User updateRoleAdmin(String email){

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 회원 입니다."));

        user.updateRole(Role.ADMIN);

        return user;
    }
}
