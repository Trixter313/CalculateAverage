/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nickcipriani
 */

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.PrintWriter;

public class CalculateAverage {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
	// TODO code application logic here
	System.out.println("This application will calculate the average of a list of numbers from an input file.");
	System.out.print("Path to input file (include file extension): ");
	
	//kIn stands for "keyboard in"
	Scanner kIn = new Scanner(System.in);
	String inputFilePath = kIn.next();
	
	System.out.print("Path to output file (if it doesn't exist already, it will be created. Existing files will be OVERWRITTEN!): ");
	String outputFilePath = kIn.next();
	
	File inputFile = new File(inputFilePath);
	//fIn stands for "file in"
	Scanner fIn = new Scanner(inputFile);
	
	ArrayList<Double> numberList = new ArrayList<>();
	
	//Fill array with numbers from file
	while (fIn.hasNextDouble()) {
	    numberList.add(fIn.nextDouble());
	}
	
	double sum = 0;
	
	for (int i=0; i < numberList.size(); i++) {
	    sum = sum + numberList.get(i);
	}
	
	double average = sum / numberList.size();
	
	PrintWriter out = new PrintWriter(outputFilePath);
	out.print(average + " <-- average");
	
	fIn.close();
	out.close();
	
	/* Failed attempt at being fancy. :(
	try {
	    //fIn stands for "file in"
	    Scanner fIn = new Scanner(inputFile);
	    
	} catch (FileNotFoundException exception) {
	    System.out.print("The program could not find the input file specified. Please check to make sure it is entered correctly; the program will now exit.");
	} finally {
	    fIn.close();
	} */
    }
    
}
