package ar.com.laboratory.ecommerce.infrastructure.adapter;

import ar.com.laboratory.ecommerce.application.repository.ProductRepository;
import ar.com.laboratory.ecommerce.application.repository.UserRepository;
import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;
import ar.com.laboratory.ecommerce.domain.UserType;
import ar.com.laboratory.ecommerce.infrastructure.entity.ProductEntity;
import ar.com.laboratory.ecommerce.infrastructure.mapper.ProductMapper;
import ar.com.laboratory.ecommerce.infrastructure.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


@AllArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final  ProductCrudRepository repository;
    private final UserRepository userRepository;
    private final ProductMapper productMapper;
    private final UserMapper userMapper;


    @Override
    public Iterable<Product> getProducts() {
        return productMapper.toProducts(repository.findAll());
    }

    @Override
    public Iterable<Product> getProductsByUser(User user) {
        return productMapper.toProducts(repository.findAllByUser(userMapper.toEntity(user)));
    }

    @Override
    public Product getProductById(Integer id) {
        return productMapper.toProduct(repository.findById(id).get());
    }

    @Override
    public Product save(Product product) {
        product.setDateCreated(LocalDateTime.now());
        product.setDateUpdated(LocalDateTime.now());
        var user = userRepository.getUserById(1);
        product.setUser(user);
        return productMapper.toProduct(repository.save(productMapper.toEntity(product)));
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteById(id);

    }
}
