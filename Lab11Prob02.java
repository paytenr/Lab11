

/**
 * File: Lab11Prob02.java
 * Class: CSCI 1302
 * Author: Payten Roach, Leslie Monroy
 * Created on: November 14, 2025
 * Last Modified: November 14, 2025
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lab11Prob02 {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		File inputFile = new File("src/people.dat");
		File outputFile = new File("src/people-copy.dat");

		// Read the input 
		try (DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
				DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile))) {
			while (true) {

				// Read values 
				int age = input.readInt();
				String name = input.readUTF();
				String address = input.readUTF();
				int zip = input.readInt();
				double salary = input.readDouble();

				Person p = new Person(age, name, address, zip, salary);

				people.add(p);

			}
		} catch (EOFException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}
		Collections.sort(people);

		// Read the input 
		try (DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
				DataOutputStream dataoutput = new DataOutputStream(
						new FileOutputStream("src/people-salary-sorted.dat"))) {
			int num = 0;
			while (num == 0) {

				for (Person p : people) {
					dataoutput.writeUTF(p.toString());
					System.out.println(p.toString());
				}
				num = 1;
			}
		} catch (EOFException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}

