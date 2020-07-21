import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Print {
	List<String> output=new ArrayList<String>();
	
	public Print() {
		Scanner sc=new Scanner(System.in);
		String[] inputSet= {};
		System.out.println("Enter the number of input:");
		int input=sc.nextInt();
		inputSet=new String[input];
		for(int i=0;i<input;i++) {
			String str=sc.next();
			inputSet[i]=str;
		}
		int count=0;
		for(int j=0;j<inputSet.length;j++) {
			if(count>0) {
			if(diff(inputSet[j],inputSet[j-1])) {
				output.add(inputSet[j-1]);
				output.add(inputSet[j]);
			}
			else {
				//for(String set:output) {
				    if(output.size()>0) {
						System.out.print(output.get(0)+"-"+output.get(output.size()-1));
						output.clear();
				    }
				   
				    	System.out.print(","+inputSet[j]);
				    	//output.clear();
				    
					
				//}

			}
			}
			count++;
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new Print();
	}

	private boolean diff(String value1, String value2) {
		int val1=Integer.parseInt(value1);
		int val2=Integer.parseInt(value2);
		int value3=val1-val2;
		if(value3==1) {
			return true;
		}
		return false;
		
	}

}
