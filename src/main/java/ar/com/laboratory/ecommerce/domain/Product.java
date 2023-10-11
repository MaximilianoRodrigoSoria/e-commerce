package ar.com.laboratory.ecommerce.domain;


import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    @ManyToOne
    private UserEntity userEntity;


}
