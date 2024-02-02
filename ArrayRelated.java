package hello;

public class ArrayRelated {

	    public static void main(String[] args) {
	        int a[] = {1, 2, 3};
	        int s = 0;

	        {
	            for (int i = 0; i < a.length; i++) {
	                s = s * 10 + a[i];
	            }
	            System.out.println(++s);
	        }

	        System.out.println("Hello, World!");
	    }
	}



