package Application;

import java.lang.NullPointerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.io.IOException;
import entities.product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class program {

	public static void main(String[] args) {
		
		String path = "C:\\Project\\in.csv";
		List <product>lista = new ArrayList();
		product p = new product();
		String[] arq = null;
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String itemCsv = br.readLine();
			
			
			while (itemCsv!=null ) {
				
				arq = itemCsv.split(",");
				
				lista.add(new product(arq[0], arq[1], arq[2]));
				
				itemCsv = br.readLine();
			}	
			
		}
		
		catch (IOException e) {
			System.out.print("Error:" + e.getMessage());
		}
		
		Boolean sucess = new File ("c:\\project\\out").mkdir();
		String path1 = "c:\\project\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter (path1)) ){
			p = new product(arq[0], arq[1], arq[2]);
			
			for (product p1: lista) {
				System.out.print(p1);
				String s = p1.toString();
				bw.write(s);
				bw.newLine();
				
			}
			
		}
		
		catch (IOException e) {
			System.out.print("Write Error" + e.getMessage());
				
		}
			
	}

}
