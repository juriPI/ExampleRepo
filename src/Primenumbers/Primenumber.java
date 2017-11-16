
package Primenumbers;

/**
 * 
 * @author Juri & Meris
 */
public class Primenumber {

    private String[] stringArray;
    private int[] intArray;

    
    private Primenumber(String[] stringArray, int[] intArray) {
        this.stringArray = stringArray;
        this.intArray = intArray;
    }
     
    
    private static int[] calcPrimes(int n) {
        int[] prime_numbers = new int[n];
        int sum_primes = 0;
        for (int i = 2; sum_primes < n ; i++) {
            boolean is_prime = true;
            for (int j = 2; j < i && is_prime; j++) {
                if ((i % j) == 0) {
                    is_prime = false;
                }              
            }           
            if (is_prime) {
                sum_primes++;
                prime_numbers[sum_primes-1] = i;
            }
        }
        return prime_numbers;  
    }
    
    
    private static void intArrayOutput(int[] prime_array){
        System.out.println("Primzahlenausgabe als Int-Array");
        for (int i = 0; i < prime_array.length ; i++) {
            System.out.println(i+1 +")\t" +prime_array[i]);
        }
        System.out.println("\n");
    }
    
    private static String[] intToStringArray(int[] prime_array){
        String[] stringArray = new String[prime_array.length];
        for (int i = 0; i < prime_array.length ; i++) {
            stringArray[i]= String.valueOf(prime_array[i]); 
        }
        return stringArray;
    }
    
    
    private static void stringArrayOutput(String[] stringArray){
        System.out.println("Primzahlenausgabe als String-Array");
        for (int i = 0; i < stringArray.length ; i++) {   
            System.out.println(i+1 +")\t" +stringArray[i]);           
        }
        System.out.println("\n");
    }
    
    
    private static void structOutput(String[] stringArray, int[] intArray){
        Primenumber prim = new Primenumber(stringArray, intArray);
        
        System.out.println("Primzahlenausgabe als Struktur");
        
        for (int i = 0; i < intArray.length; i++) {   
            System.out.println(i+1 +")\tString-Array: " +prim.stringArray[i]+ " \tInteger-Array: "
            + prim.intArray[i]);           
        }
        System.out.println("\n");
    }
    

    public static void main(String[] args) {    
        intArrayOutput(calcPrimes(10));
        stringArrayOutput(intToStringArray(calcPrimes(10)));
        structOutput(intToStringArray(calcPrimes(10)), calcPrimes(10));
    }
}

