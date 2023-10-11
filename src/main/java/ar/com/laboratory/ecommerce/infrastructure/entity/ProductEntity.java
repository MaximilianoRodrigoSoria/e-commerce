package ar.com.laboratory.ecommerce.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class ProductEntity {
    private Integer id;
    private String code;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private UserEntity user;

    public ProductEntity(){
        this.setCode(UUID.randomUUID().toString());
    }
}
