package ar.com.laboratory.ecommerce.infrastructure.adapter;

import ar.com.laboratory.ecommerce.application.repository.UserRepository;
import ar.com.laboratory.ecommerce.domain.User;
import ar.com.laboratory.ecommerce.infrastructure.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;


@AllArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {

    private UserCrudRepository repository;
    private UserMapper userMapper;
    @Override
    public Iterable<User> getUsers() {
        return userMapper.toUsers(repository.findAll());
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.toUser(repository.findById(id).get());
    }

    @Override
    public User save(User user) {
        return userMapper.toUser(repository.save(userMapper.toEntity(user)));
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);

    }
}
