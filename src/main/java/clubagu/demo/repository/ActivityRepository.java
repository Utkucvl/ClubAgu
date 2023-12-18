package clubagu.demo.repository;

import clubagu.demo.dao.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity,Long> {
    List<Activity> findByClubId(Long id);
}
