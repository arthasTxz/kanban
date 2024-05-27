package com.yabeto.kanban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yabeto.kanban.entities.Card;

public interface CardRepository extends CrudRepository<Card, Long>{

}
