package livinglab.liketiger.smartusbackend.repository;

import livinglab.liketiger.smartusbackend.domain.Score;
import livinglab.liketiger.smartusbackend.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Optional;

@SpringBootTest
public class ScoreRepositoryTest {
    @Autowired
    private ScoreRepository scoreRepository;
    @Autowired
    private UserRepository userRepository;
    @Test
    public void createScore(){
        String username="niceyoo0221";
        Optional<User> user = userRepository.findById(username);
        if (!user.isEmpty()){
            Score score = Score.builder()
                    .user(user.get())
                    .score(90L)
                    .time(20L)
                    .playDate(new Timestamp(System.currentTimeMillis()))
                    .build();
            scoreRepository.save(score);
        }
    }
}
