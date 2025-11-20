

/**
 * File: Lab11Prob01.java
 * Class: CSCI 1302
 * Author: Payten Roach, Leslie Monroy
 * Created on: November 14, 2025
 * Last Modified: November 14, 2025
 */

import java.io.*;

public class Lab11Prob01 {

	public static void main(String[] args) {
		File inputFile = new File("src/people.dat");
		File outputFile = new File("src/people-copy.dat");

		// Read the input file
		try (DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
				DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile))) {
			while (true) {

				// Read values in correct order
				int age = input.readInt();
				String name = input.readUTF();
				String address = input.readUTF();
				int zip = input.readInt();
				double salary = input.readDouble();

				// Print to console
				System.out.printf("%d %s %s %d %.2f%n", age, name, address, zip, salary);
			
				// Write copy to output file
				output.writeInt(age);
				output.writeUTF(name);
				output.writeUTF(address);
				output.writeInt(zip);
				output.writeDouble(salary);

			}
		} catch (EOFException e) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
