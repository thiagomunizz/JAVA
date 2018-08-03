package view;

import java.sql.Connection;

import model.Alunos;
import controller.AlunosJdbcDAO;
import controller.JdbUtil;;

public class AlunosExec {
	public static void main(String args[]) {
		Alunos alunos = new Alunos();
		try {
			
			alunos.setNome("Matheus Durães");
			alunos.setEndereco("Rua Zero, 6553 ");
			alunos.setBairro("Pantanal");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.listar();
			//alunosJdbcDao.alterar(alunos);
			//alunosJdbcDao.excluir(1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
