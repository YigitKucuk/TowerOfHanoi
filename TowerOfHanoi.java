import java.util.Scanner;

public class TowerOfHanoi {
   
    public static void replaceDisk(int n, String from_peg, String to_peg, String helper_peg)
    {
        if (n == 1){
            System.out.println("Take disk " + n + " from peg " +  from_peg + " to peg " + to_peg);
            return;

        }else{
            replaceDisk(n-1, from_peg, helper_peg, to_peg);
            System.out.println("Take disk " + n + " from peg " +  from_peg + " to peg " + to_peg);
            replaceDisk(n-1, helper_peg, to_peg, from_peg);
        }
    }
    public static void main(String args[]){

        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numberOfDisks;

        try{
            numberOfDisks = input.nextInt();
            replaceDisk(numberOfDisks, "A", "B", "C");
            System.out.println("Completed in " + ((int) (Math.pow(2, numberOfDisks) - 1 )) + " steps!\n");
        }catch (Exception e){
            System.out.println("Enter a valid integer!");
        }

        input.close();  
    }
} 
