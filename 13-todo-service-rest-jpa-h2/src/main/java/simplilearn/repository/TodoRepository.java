package simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import simplilearn.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
