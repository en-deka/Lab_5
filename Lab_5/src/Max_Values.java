import java.io.*;
import java.lang.Iterable;
import java.util.Scanner;
public class Max_Values {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File f = new File("input.csv");
		Scanner fileScan = new Scanner (f);
		String maxval;
		String[] maxVals = null;
		String vals = null;
		int max = 0, count = 1;

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		
		System.out.println("Maximum Values");
		
		
		while (fileScan.hasNext()) {
			maxval = fileScan.nextLine();
			maxVals = maxval.split(",");
			for (int i = 0; i < maxVals.length; i++); {
				int i = 0;
				while (Integer.parseInt(maxVals[i]) > max);
					i++;
				//	max = Integer.parseInt(maxVals[i]);
				
		System.out.println("Row " + count +": " + max);
		
		fileScan.close();
		
					
				}
			}
		}
		
		



	}


