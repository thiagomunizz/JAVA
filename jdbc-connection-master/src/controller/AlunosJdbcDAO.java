package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Alunos;

public class AlunosJdbcDAO {
	
	private Connection conn;
	
	public AlunosJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	

	
	
	public void deletar(int id) throws SQLException{
		String sql = "delete from alunos where id ="+id;
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
	
}
