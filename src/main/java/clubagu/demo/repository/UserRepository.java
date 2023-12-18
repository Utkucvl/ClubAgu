package clubagu.demo.repository;
import clubagu.demo.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
