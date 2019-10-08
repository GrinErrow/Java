package br.com.testes.fatec;

import java.util.ArrayList;
import java.util.List;

import br.com.modelo.fatec.Cliente;
import br.com.relatorio.fatec.ClienteREL;

public class RelatorioTeste {
	public static void main(String[] args) 
	{
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			
			Cliente Cliente1 = new Cliente();
			Cliente1.setNome("Gabriel");
			Cliente1.setTelefone("988509540");
			Cliente1.setDtNascimento("25/12/2000");
			Cliente1.setGenero("Masculino");
			Cliente1.setServico("Corte de Barba");
			
			clientes.add(Cliente1);
			
			ClienteREL relatorio = new ClienteRel();
			relatorio.imprimir(clientes);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
