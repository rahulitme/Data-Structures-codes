import java.util.Scanner;

public class Arrayinsert {
    public static void main(String[] args) {
        int size, loc, item;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        
        int[] a = new int[size]; // Declare and initialize the array
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the location to insert:");
        loc = sc.nextInt();

        System.out.println("Enter the element to insert:");
        item = sc.nextInt();
        
        // Shift elements to make space for the new element
        for (int i = size - 1; i >= loc; i--) {
            a[i + 1] = a[i];
        }
        
        a[loc] = item; // Insert the new element
        size++; // Increment the size
        
        System.out.println("Updated array:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
