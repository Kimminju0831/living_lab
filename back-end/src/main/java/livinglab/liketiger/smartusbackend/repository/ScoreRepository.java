package livinglab.liketiger.smartusbackend.repository;

import livinglab.liketiger.smartusbackend.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
