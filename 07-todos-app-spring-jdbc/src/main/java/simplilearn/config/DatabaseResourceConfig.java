package simplilearn.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class DatabaseResourceConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource
				.setUrl("jdbc:mysql://localhost:3306/studentdb?allowPublicKeyRetrieval=true&useSSL=false");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("OmgPassword!");
		return driverManagerDataSource;
	}

}
