import java.util.Scanner;

public class soal_2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int nilai;
        System.out.print("masukkan nilai = ");
        nilai = input.nextInt();

        if(nilai>=87){
            System.out.println("A");
        }
        else if (nilai>=87 && nilai<87){
         System.out.println ("AB");   
        }
        else if (nilai>=69 && nilai<78){
            System.out.println ("BC");   
        }
        else if (nilai>=51 && nilai<60){
            System.out.println ("C");   
        }
        else if (nilai>=41 && nilai<51){
            System.out.println ("D");   
        }
        else if (nilai>=41){
            System.out.println ("E");   
        }
        if(nilai>=87){
            System.out.println("A");
        }
        else if (nilai>=87 && nilai<87){
         System.out.println ("AB");   
        }
        else if (nilai>=69 && nilai<78){
            System.out.println ("BC");   
        }
        else if (nilai>=51 && nilai<60){
            System.out.println ("C");   
        }
        else if (nilai>=41 && nilai<51){
            System.out.println ("D");   
        }
        else if (nilai>=41){
            System.out.println ("E");  
        }
        else {
            System.out.println("invalid"); 
        }   
    }

}
