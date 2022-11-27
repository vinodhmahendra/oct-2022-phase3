package simplilearn;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A Stack")
public class TestingAStackDemo {

	Stack<Object> stack;
	
	@Test
	@DisplayName("is intantiated with new Stack()")
	void isInstantiatedWithNew() {
		new Stack();
	}
	
	@Nested
	@DisplayName("when new")
	class WhenNew {
		
		@BeforeEach
		void createNewStack() {
			stack = new Stack<>();
		}
		
		@Test
		@DisplayName("is empty")
		void isEmty() {
			assertTrue(stack.isEmpty());
		}
		
		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, stack::pop);
		}
		

		@Test
		@DisplayName("throws EmptyStackException when peeked")
		void throwsExceptionWhenPeeked() {
			assertThrows(EmptyStackException.class, stack::peek);
		}
		
		@Nested
		@DisplayName("after pushing an element")
		class  AfterPushing{
			String anElement = "an element";
			
			@BeforeEach
			void pushAnElement() {
				stack.push(anElement);
			}
			
			@Test
			@DisplayName("it is no longer empty")
			void isNotEmpty() {
				assertFalse(stack.isEmpty());
			}
			
			@Test
			@DisplayName("returns the element when popped and is empty")
			void returnELementWhenPopped() {
				assertEquals(anElement, stack.pop());
				assertTrue(stack.isEmpty());
			}
			
			@Test
			@DisplayName("returns the element when peeked but remains not empty")
			void returnElementWhenPeeked() {
				assertEquals(anElement, stack.peek());
				assertFalse(stack.isEmpty());
			}
		}
		
	}
}