
//package pyramid;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		String name[] = new String[5];
		double marks[] = new double[5];

		
		for(int x = 1; x < name.length; x++) {
			
			 name[x] = JOptionPane.showInputDialog("Enter Module " + x);
			 
			marks[x] = Double.parseDouble(JOptionPane.showInputDialog("Enter mark for " + name[x]));
			
			if(marks[x] >= 48.5 && marks[x] <= 50)
			{
				marks[x] = 50;
			}
			
			 
		}
	
		int y = 1;
		double temp = 0;
		String temp2 = "";
		for(int i = 0; i < marks.length; i++) {
			for(y = 1; y < marks.length; y++) {
				
				if(marks[y-1] > marks[y])
				{
					temp = marks[y-1];
					temp2 = name[y-1];
					marks[y-1] = marks[y];
					name[y-1] = name[y];
					marks[y] = temp;
					name[y] = temp2;
				}
		
			}
		
		 }
		
		double low = 100;
		String out = "";
		String out2 = "";
		double high = 0;
		for(int a = 1; a < marks.length; a++) {
			if(marks[a] <= low)
			{
				low = marks[a];
				out = name[a];
			}
				  
			if(marks[a] >= high)
			{
				high = marks[a];
				out2 = name[a];
			}
			
		}
		System.out.println("Hihgest mark is "+ out2 +" with " + high + "\t Lowest mark is " + out + " with " + low);
		System.out.println(" ");
		
		for(int z = 1; z < name.length; z++) {
			
			System.out.println(name[z] + "\t" + marks[z]);
			
		}


	}

}
