package clubagu.demo.dto;

import clubagu.demo.dao.entity.Activity;
import lombok.Data;

import java.util.List;

@Data
public class ClubDto {
    private int id;
    private String name;
    private String content;
    private String communication;
    private List<Long> usersId;
    private List<ActivityDto> activities;


}
