import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		Connection conexao=null;
		Pais p;
		
		ConexaoDB db = new ConexaoDB();
		conexao= db.conectar();
		System.out.println("conectou");
		
		p = new Pais("HOLANDA", 444444, 555555);
		p.incluir();
		p= new Pais();
		p.consultapopulacao();
		p.maiorpopulacao();
		System.out.println("==================================================================");
		p.menorArea();
		System.out.println("==================================================================");
		p.vetorTresPaises();
		Pais pais =new Pais();
		pais.carregar(1);

	}

}
