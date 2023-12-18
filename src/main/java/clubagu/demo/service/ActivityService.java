package clubagu.demo.service;

import clubagu.demo.dto.ActivityDto;
import clubagu.demo.dto.ActivityEditDto;

import java.util.List;

public interface ActivityService {
    ActivityDto save(ActivityEditDto activityDto);

    ActivityDto getById(Long id);

    List<ActivityDto> getActivities();

    Boolean delete(Long id);

    ActivityDto update(Long id, ActivityEditDto activityDto);

    List<ActivityDto> findByClubid(Long id);

}
