//. Find the greater of three numbers

public class Problem {
    public static void main(String args[]) {
        int a = 23;
        int b = 25;
        int c = 29;
        System.out.println(Math.max(a,(Math.max(b,c))));
    }
}