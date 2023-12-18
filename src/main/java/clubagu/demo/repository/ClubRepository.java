package clubagu.demo.repository;

import clubagu.demo.dao.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClubRepository extends JpaRepository<Club,Long> {
}
