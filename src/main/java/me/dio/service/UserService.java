package me.dio.service;

import me.dio.domain.model.User;

//Com o "UserServiceImpl" eu faço com que nao exponho minha classe com os metodos e sim a INTERFACE.
public interface UserService {
    User findById (Long id);

    User create (User userToCreate);
}
