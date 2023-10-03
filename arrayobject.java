
// Java program to demonstrate initializing
// an array of objects using constructor

class arrayobject {

    public static void main(String args[]) {

        // Declaring an array of student
        Student[] arr;

        // Allocating memory for 2 objects
        // of type student
        arr = new Student[2];

        // Initializing the first element
        // of the array
        arr[0] = new Student(1701289270, "Satyabrata");

        // Initializing the second element
        // of the array
        arr[1] = new Student(1701289219, "Omm Prasad");

        // Displaying the student data
        System.out.println(
                "Student data in student arr 0: ");
        arr[0].display();

        System.out.println(
                "Student data in student arr 1: ");
        arr[1].display();
    }
}