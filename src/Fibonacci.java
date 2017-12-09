public class Fibonacci{
    public static void main(String[] args){
        int num1 = 0, num2 = 1, num3, x, count = 10;
        System.out.println("Fibonacci of " + num1 + " and " + num2 + " is = ");
        for (x = 2;x<count;++x)
        {
            num3 = num2 + num1;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

