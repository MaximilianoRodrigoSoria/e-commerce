package ar.com.laboratory.ecommerce.application.repository;

import ar.com.laboratory.ecommerce.domain.User;

public interface UserRepository {
    Iterable<User> getUsers();
    User getUserById(Integer id);
    User save(User user);
    void deleteUser(Integer id);
}
