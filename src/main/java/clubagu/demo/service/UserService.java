package clubagu.demo.service;
import clubagu.demo.dao.entity.Club;
import clubagu.demo.dao.entity.User;
import clubagu.demo.repository.ClubRepository;
import clubagu.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    private ClubRepository clubRepository;



    public UserService(UserRepository userRepository , ClubRepository clubRepository) {
        this.userRepository = userRepository;
        this.clubRepository = clubRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User createOneUser(User user) {
        return userRepository.save(user);
    }

    public User getOneUserByUserName(String userName) {
        return (userRepository.findByUserName(userName));
    }



}
