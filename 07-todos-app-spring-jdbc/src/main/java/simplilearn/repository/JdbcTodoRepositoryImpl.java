package simplilearn.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import simplilearn.model.Todo;

@Repository(value = "todoRepository")
public class JdbcTodoRepositoryImpl implements TodoRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	protected JdbcTodoRepositoryImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	//nested class 
	class TodoRowMapper implements RowMapper<Todo>{

		@Override
		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
//			System.out.println(" Row No # " + rowNum);
			Todo  theTodo = new Todo();
			theTodo.setId(rs.getLong("id"));
			theTodo.setDescription(rs.getString("description"));
			theTodo.setUsername(rs.getString("username"));
			theTodo.setTargetDate(rs.getDate("targetDate"));
			theTodo.setDone(rs.getBoolean("isDone"));
			return theTodo;
		}
		
	}
	@Override
	public List<Todo> findAll() {
		String sql = "select * from todos";
		List<Todo> todoList = jdbcTemplate.query(sql, new TodoRowMapper());
		return todoList;
	}

	@Override
	public Todo findById(long theId) {
		String sql = "select * from todos where id = ?";
		Todo theTodo = jdbcTemplate.queryForObject(sql,  new TodoRowMapper(), theId);
		return theTodo;
	}

	@Override
	public Todo save(Todo theTodo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo deleteById(long theId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
