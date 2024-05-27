package com.yabeto.kanban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yabeto.kanban.entities.Column;

public interface ColumnRepository extends CrudRepository<Column, Long>{

}
