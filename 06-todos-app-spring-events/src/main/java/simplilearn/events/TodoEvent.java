package simplilearn.events;

import org.springframework.context.ApplicationEvent;

import simplilearn.repository.TodoRepository;

public class TodoEvent extends ApplicationEvent{
	
	private String type;
	private TodoRepository todoRepository;
	

	public TodoEvent(Object source, String type) {
		super(source);
		this.type = type;
		this.todoRepository = todoRepository;
	}

	public String getType() {
		return type;
	}
	
	
}
