//Klein programma om een
import java.util.Scanner;
public class tafelsInputRange{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num,range;
        System.out.println("Voer een grond getal in: ");
        num=sc.nextInt();
        System.out.println("Wat is de gewenste range: ");
        range=sc.nextInt();
        //time complexity O(n)??
        for(int i=1; i<=range; i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}