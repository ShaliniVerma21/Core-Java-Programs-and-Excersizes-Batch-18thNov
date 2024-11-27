package Excercize_6;
//Circle Pattern with ASCII Art
public class Circle3 {
	 public static void main(String[] args) {
	        int radius = 10; // Radius of the circle
	        for (int i = 0; i <= 2 * radius; i++) {
	            for (int j = 0; j <= 2 * radius; j++) {
	                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
	                if (distance >= radius - 0.5 && distance <= radius + 0.5) {
	                    System.out.print("O"); // ASCII character for circle
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}