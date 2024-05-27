package com.yabeto.kanban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yabeto.kanban.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
