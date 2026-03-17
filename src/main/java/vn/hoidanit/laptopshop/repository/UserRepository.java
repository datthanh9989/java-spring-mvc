package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.hoidanit.laptopshop.domain.User;


public interface UserRepository extends JpaRepository<User, Long>{
    User save(User eric);
    List <User> findOneByEmail(String email);

    List<User> findAll();
}
