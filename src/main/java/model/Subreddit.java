package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.time.Instant;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subreddit {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private  long id;

    @NotBlank(message = "community name is required")
    private String name;
    @NotBlank(message = "Descripition is required")
    private String descripition;
    @OneToMany(fetch = LAZY)
    private List<Post> postes;
    private Instant createdDate;
    @ManyToOne(fetch =LAZY)
    private User user;
}
