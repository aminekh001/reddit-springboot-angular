package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import  static jakarta.persistence.GenerationType.IDENTITY;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "token")
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = IDENTITY )
    private long id ;

    @OneToMany (fetch = FetchType.LAZY)
    private String token;
    private User user;
    private Instant expiryDate;
}
