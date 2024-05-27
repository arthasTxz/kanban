package com.yabeto.kanban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yabeto.kanban.entities.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
