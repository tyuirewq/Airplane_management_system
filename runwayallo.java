package oops;
import java.util.Arrays;

public class runwayallo {
    public static int findrunway(double s[], double f[], int n)
    {
        int run = 1, result = 1;
        int i = 1, j = 0;
        for (i = 0; i < n; i++) {
            run = 1;

            for (j = i + 1; j < n; j++) {
                if ((s[i] >= s[j] && s[i] <= f[j]) || (s[j] >= s[i] && s[j] <= f[i]))
                    run++;
            }
            result = Math.max(result, run);
        }

        return result;
    }
    public static int list(String name[],double s[], double f[],int n)
    {
        int run = 1;
        int i = 1, j = 0;
        System.out.println("Full list of flights and their assigned runways");
        for (i = 0; i < n; i++) {
            run = 1;
            for (j = i + 1; j < n; j++) {
                if ((s[i] >= f[j] && s[i] <= f[j]) || (s[j] >= s[i] && s[j] <= f[i]))
                    run++;
            }

            System.out.println(name[i]+" Runway allocated " + run );
        }
        return 0;
    }

    public static void main(String[] args)
    {
        String name[] = {"SpiceJet11","Indigo12","AirAsia09","AirIndia001","SpiceJet132","Indigo23"};
        double start[] = { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
        double finals[] = { 9.10, 12.00, 11.20, 11.30, 19.00, 20.00 };
        int n = start.length;
        System.out.println("Minimum Number of RunWays Required = " + findrunway(start, finals, n));
        list(name,start,finals,n);
        System.out.println("");

    }
}
