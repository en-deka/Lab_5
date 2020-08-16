import java.io.*;
import java.util.Scanner;
public class Max_Values {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "input.csv";
		File f = new File("C:\\Users\\15403\\Documents\\GitHub\\Lab5\\Lab_5\\Lab_5\\src\\input.csv");
		Scanner fileScan = new Scanner (f);
		String maxval;
		String[] maxVals = null;
		int max = 0, count = 1;
		
		System.out.println("Maximum Values");
		
		while (fileScan.hasNext()) {
			maxval = fileScan.nextLine();
			maxVals = maxval.split(",");
			for (int i = 0; i < maxVals.length; i++); {
				int i = 0;
				if (Integer.parseInt(maxVals[i]) > max);
					max = Integer.parseInt(maxVals[i]);
				
		System.out.println("Row " + count +": " + max);
		count++;
					
				}
			}
		}
		
		



	}


