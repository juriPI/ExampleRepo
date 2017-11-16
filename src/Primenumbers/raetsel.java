/**
 *
 * @author JBevz
 */
public class Bitte_Loesen {
    
    public static void raetsel(int n, int m) {
        int x = n+1;
        int y = n+m;
        int z = x + y;
        System.out.printf("%f\n", z);
    }
    
    public static void main(String[] args) {
        raetsel(2, 3);
    }
}
