package livinglab.liketiger.smartusbackend.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

@ToString
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scoreId;

//    @Column(length = 15, nullable = false)
//    private String username;

    @Column(nullable = false)
    private Long score;

    @Column(nullable = false)
    private Long time;

    @Column(nullable = false)
    private Timestamp playDate;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;
}
