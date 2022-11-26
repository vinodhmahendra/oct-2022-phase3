package simplilearn.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import simplilearn.errors.TodoNotFoundException;
import simplilearn.model.Todo;
import simplilearn.services.TodoService;

@RestController
public class TodoResource {
	
	
	@GetMapping ( path = "/users/{username}/todos/{id}" )
	public Todo getTodo (@PathVariable String username, @PathVariable long id) {
		Todo theTodo = todoService.findById(id);
		
		if ( theTodo == null ) {
			throw new TodoNotFoundException("id - " + id);
		}
		
		return theTodo;	
	}

	
	
	@DeleteMapping ( path = "/users/{username}/todos/{id}")
	public ResponseEntity delete(@PathVariable String username, @PathVariable long id) {
		Todo theTodo = todoService.deleteById(id);
		
		if ( theTodo != null ) {
			return ResponseEntity.noContent().build();
		}
		
		return  ResponseEntity.notFound().build();
	}
	
	
	@PostMapping( path = "/users/{username}/todos")
	public ResponseEntity createTodo (@PathVariable String username ,@Valid @RequestBody Todo theTodo) {
		
		Todo saveTodo = todoService.save(theTodo);
		
		// current request  : http://localhost:8080/users/vinodh/todos
		
		// current request + path =  http://localhost:8080/users/vinodh/todos/4
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(saveTodo.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping ( path = "/users/{username}/todos" )
	public List<Todo> getAllTodos( @PathVariable String username){
		System.out.println( " username : " + username);
		return todoService.findAll();
	}
	
	
}
