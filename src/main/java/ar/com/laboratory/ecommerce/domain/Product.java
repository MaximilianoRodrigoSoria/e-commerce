package ar.com.laboratory.ecommerce.domain;


import ar.com.laboratory.ecommerce.infrastructure.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
public class Product {


    private Integer id;
    private String code;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    private UserEntity user;

    public Product(){
        this.setCode(UUID.randomUUID().toString());
    }


}
