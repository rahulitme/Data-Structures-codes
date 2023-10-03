public class arrayobject2 {

    public int id;
    public String name;

    // Method to set the data to
    // student objects
    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // display() method to display
    // the student data
    public void display() {
        System.out.println("Student id is: " + id + " "
                + "and Student name is: "
                + name);
        System.out.println();
    }
}
