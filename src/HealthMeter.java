import java.util.Scanner;


public class HealthMeter {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight : ");
        int kilo = scanner.nextInt();
        System.out.println("Please enter height: ");
        double boy =scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        System.out.println("BMI : " +  bki);
        
    }
    
}
