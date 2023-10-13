package ar.com.laboratory.ecommerce.application.service;


import ar.com.laboratory.ecommerce.application.repository.UserRepository;
import ar.com.laboratory.ecommerce.domain.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.getUsers();
    }


    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }


    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.update(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }
}
