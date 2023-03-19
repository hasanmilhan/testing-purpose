public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public class Average {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        double average = calculateAverage(numbers);
        System.out.println("The average is " + average);
    }
    
    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}

}
