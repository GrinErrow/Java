package br.com.relatorio.fatec;

import java.util.List;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import br.com.modelo.fatec.Cliente;

public class ClienteREL
{
	private String path; //Caminho base
	private String pathToReportPackage; //Caminho para o package onde estao armazenados os clientes
	
	//Recupera os caminhos para que a classe possa encontrar os relatorios
		
		public ClienteREL() {
			this.path = this.getClass().getClassLoader().getResource("").getPath();
			this.pathToReportPackage = this.path + "MyReports";
			System.out.println(path);
		}
		
		//Imprime/gera uma lista de clientes
		
		public void imprimir (List<Cliente> clientes) throws Exception
		{
			JasperReport report = Jasper CompileManager.compileReport(this.getPathToReportPackage()+ "Clientes.jrxml");
			JasperPrint print = JasperFileManager.fillReport(report, null, new JRBeanCollectionDataSource(clientes));
			JasperExportManager.exportReportToPdfFile(print, "c:/Relatorio_Clientes.pdf");
			
		}
		public String getPathToReportPackage() {
			return this.pathToReportPackage;
		}
		public String getPath() {
			return this.path;
		}
}
