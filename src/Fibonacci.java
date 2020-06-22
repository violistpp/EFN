public class Fibonacci {

    public static void main(String[] args) {
        int fibonacci = 1;
        int temp = 1;
        int sum = fibonacci;

        do {
            fibonacci += temp;
            sum += fibonacci;
            temp = fibonacci;
        } while(sum + fibonacci + temp < 4000000);

        System.out.println("Sum: " + sum); // Answer is 2097151
    }

}
