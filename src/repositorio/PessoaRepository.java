package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Pessoa;

public class PessoaRepository {
	public void create (Pessoa pessoa) throws Exception {
		//parametros para conexão vcom banco de dados
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5433/bd_projetoaula04";
		String user="postgres";
		String password="coti";
		Class.forName(driver);
		//abrindo conexao com banco de dados
		Connection connection = DriverManager.getConnection(url,user,password);
		//gravando um registro na tabela de pessoa do banco de dados (linguagem SQL)
		PreparedStatement statement = connection.prepareStatement("insert into pessoa (id,nome,cpf)values (?,?,?)");
		statement.setObject(1,pessoa.getId());
		statement.setString(2,pessoa.getNome());
		statement.setString(3,pessoa.getCpf());
		statement.execute();
		
		connection.close();
		
		
		
	}

}
