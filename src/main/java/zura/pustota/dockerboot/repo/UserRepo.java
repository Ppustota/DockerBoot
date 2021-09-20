package zura.pustota.dockerboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import zura.pustota.dockerboot.model.User;

public interface UserRepo  extends JpaRepository<User, Long> {

}
