package livinglab.liketiger.smartusbackend.repository;

import livinglab.liketiger.smartusbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
