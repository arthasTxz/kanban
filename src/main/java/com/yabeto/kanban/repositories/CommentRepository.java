package com.yabeto.kanban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yabeto.kanban.entities.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
