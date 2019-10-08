package com.example.demo;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
