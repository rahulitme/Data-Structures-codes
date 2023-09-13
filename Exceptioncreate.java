package firstprgm;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

package firstprgm;

import java.util.Scanner;

class No extends Exception {
 No(String msg) {
     super(msg);
 }
}

class Exceptioncreate {
 int age;

 jio(int age) {
     this.age = age;
 }

 void ck() throws No {
     if (age < 18) {
         throw new No("You are not eligible to vote");
     } else {
         System.out.println("You are eligible to vote");
     }
 }

 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     
     try {
         System.out.print("Enter your age: ");
         int age = sc.nextInt();
         jio person = new jio(age);
         person.ck();
     } catch (No e) {
         System.out.println(e.getMessage());
     }
 }
}

