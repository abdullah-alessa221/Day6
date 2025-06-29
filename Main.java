import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    /*

    1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to
        2 Test Data:
        array = 50, -20, 0, 30, 40, 60, 10
        Sample Output: false

    Solution:
                int length ;
                System.out.println("Please enter how manu number you would like to enter: ");
                length = input.nextInt();

                int [] numbers = new int[length];
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Please enter a number: ");
                    numbers[i] = input.nextInt();
                }
                if(numbers[0] == numbers[length-1]) {
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }

        2.Write a Java program to find the numbers greater than the average of the
            numbers of a given array.
            Original Array:
            [1, 4, 17, 7, 25, 3, 100]
            Expected Output:
            The average of the said array is: 22.0 The numbers in the said array that are
            greater than the average are: 25 100


        Solution:

        int length;
        int sum = 0;
        int grater_average = Integer.MIN_VALUE;

        System.out.println("\nEnter how many numbers you want to enter: ");
        length = input.nextInt();

        int [] numbers = new int[length];
        double average = 0 ;

        for(int i=0; i<=length-1;i++){
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];

            average = (double) sum/length;

            if(numbers[i] > average){
                grater_average = numbers[i];
            }
        }

        System.out.println("The average of numbers array is: "+average);
        System.out.println(grater_average+" grater than average");


    3.Write a Java program to get the larger value between first and last
        element of an array of integers.
        Original Array:
        [20, 30, 40]
        Sample Output:
        Larger value between first and last element: 40

    Solution:

            int number;
            int largest = 0;
            int index = 0;
            String choice;

            ArrayList<Integer> numbers = new ArrayList<>();

            while (true) {
                System.out.println("\nDo you want to enter a number? Y/N ");
                choice = input.next();

                if (choice.equalsIgnoreCase("N")||choice.equalsIgnoreCase("NO")) {
                    break;
                }else if (choice.equalsIgnoreCase("Y")||choice.equalsIgnoreCase("YES")) {
                    System.out.println("Please, enter a number");
                    number = input.nextInt();
                    numbers.add(index,number);
                    index++;
                    if (number > largest) {
                        largest = number;
                    }

                    }else{
                    System.out.println("Invalid input");
                }
                }

                System.out.println(numbers);
                System.out.println("The largest number is " + largest);

    4.Write a Java program to swap the first and last elements of an array and
        create a new array.
        Original Array:
        [20, 30, 40]
        Sample Output:
        New array after swapping the first and last elements: [40, 30, 20]

    Solution:
        int length;

        System.out.println("Enter length of array: ");
        length = input.nextInt();

        int [] originalArray = new int[length];

        for (int i = 0; i <= originalArray.length-1; i++) {
            System.out.println("Please, enter the number: ");
            originalArray[i] = input.nextInt();
        }



        int[] newArray = new int [originalArray.length];
        for(int i=0; i<= originalArray.length-1; i++) {
            newArray[i] = originalArray[i];
        }

        System.out.println("The original array: "+Arrays.toString(originalArray));
        newArray[0] = originalArray[originalArray.length-1];
        newArray[newArray.length-1] = originalArray[0];
        System.out.println("The new array: "+Arrays.toString(newArray));



       5. Write a program that places the odd elements of an array before the
            even elements.
            Original Array:
            [2,3,40,1,5,9,4,10,7]
            Sample Output:
            [3,1,5,9,7,2,40,4,10]
    Solution:
                String choice;
        int number;
        int index = 0;
        int num = 0;

        ArrayList<Integer> originalArray = new ArrayList<>();
       ArrayList<Integer> newArray = new ArrayList<>();

        while(true) {


            System.out.println("Do you want to enter a number? (Y/N)");
            choice = input.next();
            if(choice.equalsIgnoreCase("N")||choice.equalsIgnoreCase("No")) {
                break;
            }else if(choice.equalsIgnoreCase("Y")||choice.equalsIgnoreCase("Yes")) {
                System.out.println("Enter a number");
                number = input.nextInt();
                originalArray.add(number);

            }else {
                System.out.println("Invalid choice!");
            }

        }


    for(int n:originalArray){
        if(n%2!=0){
            newArray.add(n);
        }
    }

    for(int n:originalArray){
        if(n % 2 == 0){
            newArray.add(n);
        }
    }
        System.out.println("The original array is:"+originalArray);
        System.out.println("Number of even numbers: " + newArray);



    6. Write a program that test the equality of two arrays.
        [2,3,6,6,4] [2,3,6,6,4]
        Sample Output: true
    Solution:

    int length ;

        System.out.println("Enter length of First array: ");
        length = input.nextInt();
        int [] firstArray = new int[length];
        for (int i = 0; i <= firstArray.length-1; i++) {
            System.out.println("Please, enter a number: ");
            firstArray[i] = input.nextInt();
        }

        System.out.println("Enter length of Second array: ");
        length = input.nextInt();
        int [] secondArray = new int[length];
        for (int i = 0; i <= secondArray.length-1; i++) {
            System.out.println("Please, enter a number: ");
            secondArray[i] = input.nextInt();
        }

        boolean areEqual = Arrays.equals(firstArray, secondArray);
        System.out.println(areEqual ? "Yes" : "No");




     */









     }
}
