package model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
	private JdbcTemplate jdbc;
	
	public void setDataSource(DataSource jdbc)
	{
		this.jdbc = new JdbcTemplate(jdbc);
	}
	
	public List<Student> getStudent()
	{
		return null;
	}

}
