import java.util.Scanner;

public class CompIntCal {
    public static void main(String[] args) {

        double finalAmount;
        double principal;
        double annualIntRate;
        int compoundFreq;
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate (in percent): ");
        annualIntRate = scanner.nextDouble() / 100;
        System.out.print("Compound Frequency (12 - montly, 4 - quaterly, 1 - annualy): ");
        compoundFreq = scanner.nextInt();
        System.out.print("Time (For how many years): ");
        year = scanner.nextInt();

        finalAmount = principal * Math.pow(1 + annualIntRate / compoundFreq, compoundFreq * year);

        System.out.println("====================================");
        System.out.printf("In %d years, you're gonna have: %,.2f RUB\n", year,  finalAmount);
        System.out.printf("You're compound interest is: %,.2f RUB\n", finalAmount - principal);
        System.out.println("====================================");

        scanner.close();

    }
}
