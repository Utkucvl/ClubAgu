package clubagu.demo.controller;

import clubagu.demo.dao.entity.Club;
import clubagu.demo.dao.entity.User;
import clubagu.demo.dto.ClubDto;
import clubagu.demo.dto.UserClubDto;
import clubagu.demo.dto.UserDto;
import clubagu.demo.repository.ClubRepository;
import clubagu.demo.service.ClubService;
import clubagu.demo.service.UserService;
import clubagu.demo.service.impl.ClubServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    private ClubRepository clubRepository;

    public UserController(UserService userService,ClubServiceImpl clubServiceImpl) {
        this.userService = userService;
        this.clubRepository=clubRepository;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getOneUser(@PathVariable Long userId){
        User user = userService.findById(userId);
        UserDto userDto = new UserDto();
        userDto.setUserName(user.getUserName());
        userDto.setId(user.getId());
       // userDto.setClubs(user.getClubs());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

}
