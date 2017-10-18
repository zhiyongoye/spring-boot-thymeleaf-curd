package com.neo.repository;

import com.neo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 相当于dao层
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    Long deleteById(Long id);
}