package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); // imprime somente o nome do arquivo
		System.out.println("getParent: " + path.getParent()); // imprime somente o caminho do arquivo
		System.out.println("getPath: " + path.getPath()); // imprime o caminho completo
		
		sc.close();
	}
}
