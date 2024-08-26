import java.util.ArrayList;

public class Loops {
    static void primeFactorisation(int n){
        int initial_n = n;
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; n > 1; i++){
            boolean isPrime = true;
            for (int prime: primes){
                if (i%prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primes.add(i);
                while (n % i == 0){
                    n /= i;
                    factors.add(i);
                }
            }
        }
        System.out.print("Prime factorisation of " + initial_n + " = ");
        int index = 0;
        for (int factor: factors){
            System.out.print(factor);
            if (factors.size() != index + 1){
                System.out.print(" * ");
            }
            else{
                System.out.println();
            }
            index += 1;
        }
    }

    static double pi(int digits){
        double piApproximation = 0;
        double lastPiApproximation = 69420;
        int k = 0;
        while (Math.abs(piApproximation - lastPiApproximation) > Math.pow(10, -digits)){
            lastPiApproximation = piApproximation;
            piApproximation += Math.pow(-1, k)/(2*k + 1);
            k ++;
        }
        return piApproximation*4;
    }
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(213);
        primeFactorisation(12532120);
        primeFactorisation(1223142);
        primeFactorisation(1242334);
        primeFactorisation(15485864);
        primeFactorisation(1073741824);
        primeFactorisation(21313);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}