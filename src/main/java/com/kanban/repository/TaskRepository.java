package com.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kanban.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
