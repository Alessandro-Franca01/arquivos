package fontes;
import modelos.Item;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ExercicioUdemy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Item it = new Item("TV", 4, 1200.00);
		Item it01 = new Item("Celular", 10, 900.00);
		Scanner sc;
		String conteudo, escrever, novoConteudo;
		
		System.out.println("Sera que o arquivo vai ser criado!?");
		System.out.println(it.toString());
		escrever = "\n"+it.toString();
		
		// CRIANDO UM ARQUIVO
		File file = new File("arquivo.txt");
		file.createNewFile(); 
		//file.delete();
		
		// CRIANDO UMA PASTA!!
		//File file = new File("Nova_pasta");
		//file.mkdir(); 
		//file.delete();   // apagando a pasta!
		
		
		//ESCREVENDO EM UM ARQUIVO E SALVANDO
		// Para ler e escrever, sempre vamos usar um combinação de FileReader/Writer com BufferedReader/Writer
		FileWriter fr = new FileWriter(file); 
		BufferedWriter bfr = new BufferedWriter(fr);
		bfr.write(escrever); 
		// Obs01: Só salva o arquivo depois que vc fecha
		// Obs02: A ordem de fechamneto de arquivo  tem que ser essa mesmo!
		bfr.close();
		fr.close();
	
		
		//file.createNewFile();
		//BufferedWriter bf = new BufferedWriter(file);
		
	}

}
