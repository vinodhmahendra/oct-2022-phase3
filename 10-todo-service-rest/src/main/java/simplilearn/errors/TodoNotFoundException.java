package simplilearn.errors;

public class TodoNotFoundException extends RuntimeException {
	
	public TodoNotFoundException(String descriptionOfExcetion) {
		super(descriptionOfExcetion);
	}

}
