package com.chanpion.spring.repository;

import com.chanpion.spring.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author April Chen
 * @date 2021/2/8 10:15
 */
@Repository
public interface UserRepository {

    Long insert(User user);

    User findById(long id);

    List<User> findList();
}
