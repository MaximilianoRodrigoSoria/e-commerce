package ar.com.laboratory.ecommerce.infrastructure.entity;

import ar.com.laboratory.ecommerce.domain.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String fistName;
    private String lastName;
    private String email;
    private String address;
    private String cellphone;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private LocalDateTime dateCreated;

}
