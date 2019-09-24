package fontes;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Abrindo_arquivo {

	public static void main(String[] args) {
		// Abrindo arquivos em java usando a classe Scanner
		File file = new File("C:\\Users\\SANDRINHO-PC\\arquivos_txt\\exemplo.txt");
		Scanner sc; // obejito é abrir o arquivo com FILE, depois passar para o Scanner e por fim imprimir na tela
		sc = null; 
		
		try {  
			sc= new Scanner(file);
			while(sc.hasNextLine()) { // vai testar as linhas do arquivo
				System.out.println(sc.nextLine()); // imprimir cada linha
			}
			
		}catch(IOException erro) { // tratando o erro!
			System.out.println("O correu um erro, msg: "+erro.getMessage());
		}
		
		finally {
			if(sc != null) { // se o objeto receber o arquivo, ele vai fecha-lo
				sc.close();
			}
		}
		System.out.println("END OF PROGRAM!!");
		
	}

}
