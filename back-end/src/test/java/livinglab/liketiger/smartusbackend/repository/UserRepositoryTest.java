package livinglab.liketiger.smartusbackend.repository;

import livinglab.liketiger.smartusbackend.domain.Score;
import livinglab.liketiger.smartusbackend.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void createUser(){
        User user = User.builder()
                .username("niceyoo0221")
                .password("junho")
                .birth(new Date(System.currentTimeMillis()))
                .name("유준호")
                .build();
        userRepository.save(user);
    }

//    @Test
//    public void readScores(){
//        User user = userRepository.findById("niceyoo0221").get();
//        for (Score score:user.getScore()){
//            System.out.println(score.getScore());
//        }
//    }
}
