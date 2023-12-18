package clubagu.demo.service;

import clubagu.demo.dao.entity.Club;
import clubagu.demo.dto.ClubDto;
import java.util.List;

public interface ClubService {
    ClubDto save(ClubDto clubDto);

    ClubDto getById(Long id);

    List<ClubDto> getClubs();

    Boolean delete(Long id);

    ClubDto update(Long id, ClubDto clubDto);

    ClubDto addUserToClub(Long userId, Long clubId);

    ClubDto removeUserFromClub(Long userId, Long clubId);

   List<ClubDto> getFiltered(Long userId);


}
