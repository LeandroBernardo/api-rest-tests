package br.com.projectwithtests.api.services;

import br.com.projectwithtests.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
