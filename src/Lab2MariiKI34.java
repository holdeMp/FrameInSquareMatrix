import java.io.*;
import java.util.*;
/**
 * Class implements frame of placeholder character in square matrix
 * @version 1.0
 * @since version 1.0
 *
 */
public class Lab2MariiKI34
{
	 /**
	 * The static main method is the entry point into the program
	 *
	 * @throws FileNotFoundException
	 * @param args
	 */
	 public static void main(String[] args) throws FileNotFoundException
	 {
		 int nRows;
		 char[][] arr;
		 String filler;
		 Scanner in = new Scanner(System.in);
		 File dataFile = new File("MyFile.txt");
		 PrintWriter fout = new PrintWriter(dataFile);
		
		 System.out.print("Enter size of row: ");
		 nRows = in.nextInt();
		 in.nextLine();
		 int Edge =nRows/5;
		 if (Edge==0) {
			 Edge=1;
		 }
		 arr = new char[nRows][nRows];
		 
		
		 System.out.print("\nEnter character-placeholder: ");
		 filler = in.nextLine();
		 in.close();
		 exit:
			 if(filler.length() == 1)
			 {
				 for(int i=0;i<nRows;i++) {
						for(int j=0;j<nRows;j++) {
							arr[i][j]='0';
						}
					}
				for(int j = Edge;j < 2*Edge ; j++) { 
				 for(int i = Edge; i < nRows-Edge; i++)
				 {	
					 
					arr[j][i] = (char) filler.codePointAt(0);
					//PrintArr(fout,arr,nRows);
					//System.out.print("========================");
					arr[i][j] = (char) filler.codePointAt(0);
					//System.out.print("========================");
					arr[nRows-j-1][i] = (char) filler.codePointAt(0);
					//System.out.print("========================");
					arr[i][nRows-j-1] = (char) filler.codePointAt(0);
					//PrintArr(fout,arr,nRows);
					//System.out.print("========================");
				 }
				}				
				PrintArr(fout,arr,nRows);
				fout.flush();
				fout.close();
			 }
			 else if (filler.length() == 0)
			 {
				 System.out.print("\nThe placeholder character is not entered");
				break exit;
			 }
			 else
			 {
				 System.out.print("\nToo many placeholder character");
				 break exit;
			 }
				}
		
	 /**
	 * The static PrintArr method outputs the array to a file and to the console
	 *
	 * @param fout
	 * @param arr
	 * @param nRows
	 *
	 */
	 public static void PrintArr(PrintWriter fout,char[][] arr,int nRows) {
		 for(int i=0;i<nRows;i++) {
				for(int j=0;j<nRows;j++) {
					System.out.print(arr[i][j] + " ");
					fout.print(arr[i][j] + " ");
				}
				System.out.print("\n");
				fout.print("\n");
			}
		 
	 }
}
