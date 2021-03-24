package com.chanpion.spring.service;

import com.chanpion.spring.entity.User;
import com.chanpion.spring.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author April Chen
 * @date 2021/2/8 10:10
 */
@Service
public class UserService {
//    @Resource
    private UserRepository userRepository;

    public Mono<Long> save(User user) {
        return Mono.create(monoSink -> monoSink.success(userRepository.insert(user)));
    }

    public Mono<User> findById(Long id) {
        return Mono.justOrEmpty(userRepository.findById(id));
    }

    public Flux<User> findList() {
        return Flux.fromIterable(userRepository.findList());
    }
}
