package br.com.projectwithtests.api.services;

import br.com.projectwithtests.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
