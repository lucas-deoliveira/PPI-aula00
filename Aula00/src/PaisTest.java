import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class PaisTest {
	int id =10;
		Pais pais=new Pais(10,"Cuba",111,222);
		Pais copia=new Pais(10,"Cuba",111,222);
		
		

	@Test
	void testCarrega() throws SQLException {
		System.out.println("Consulta");
		
		Pais fix = new Pais("BRASIL",207833825,8515767.0);
		Pais copia = new Pais();
		copia.carregar(1);
		assertEquals("testa consulta",copia,fix);
	}
	
	@Test
	
	void testIncluir() throws SQLException {
		pais.incluir();
		id = pais.getId();
		copia.setId(id);
		assertEquals("Testa inclusao", pais, copia);
	}


}
