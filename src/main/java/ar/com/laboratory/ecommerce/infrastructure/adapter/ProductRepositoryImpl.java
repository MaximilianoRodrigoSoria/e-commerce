package ar.com.laboratory.ecommerce.infrastructure.adapter;

import ar.com.laboratory.ecommerce.application.repository.ProductRepository;
import ar.com.laboratory.ecommerce.domain.Product;
import ar.com.laboratory.ecommerce.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;


@AllArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final  ProductCrudRepository repository;

    @Override
    public Iterable<Product> getProducts() {
        return null;
    }

    @Override
    public Iterable<Product> getProductsByUser(User user) {
        return null;
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Integer id) {

    }
}
