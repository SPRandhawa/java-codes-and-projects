import java.util.Scanner;

// This is my first Java program in this repository.
// It takes 5 numbers as input from the user and displays them.
// It represents my starting point in learning Java concepts like classes, arrays, and constructors.

class First {
    int arr[];  // Array to store numbers
    int len;    // Length of the array

    // Constructor to initialize array
    First() {
        arr = new int[5];
        len = 5;
    }

    // Method to take input from user
    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            System.out.println("Enter a number:");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Method to display the array
    void display() {
        System.out.println("The entered elements are:");
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        First obj = new First();
        obj.input();
        obj.display();
    }
}
