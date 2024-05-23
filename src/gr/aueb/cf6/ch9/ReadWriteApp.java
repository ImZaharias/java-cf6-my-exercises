package gr.aueb.cf.ch0;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *  Read and Write to another file in a particular format.
 */

public class ReadWriteApp {

    public static void main(String[] args) {
        // Define input and output files.
        File lcIn = new File("C:/file/locations.txt"); // Input file path.
        File lcOut = new File("C:/file/locations2.txt"); // Output file path.

        try (Scanner in = new Scanner(lcIn); // Create a scanner to read from input file
             PrintWriter pw = new PrintWriter(lcOut, StandardCharsets.UTF_8)) { // Create a PrintWriter to write to the output file.

            // Read input file line by line.
            while (in.hasNextLine()) {
                String line = in.nextLine(); // Read the current line.
                String[] parts = line.split(","); // Split the line by comma.

                // Check if the line has correct format.
                if (parts.length != 3) {
                    // Print error message if line format is incorrect.
                    System.err.println("Error line format: " + line);
                    continue; // Skip to the next iteration.
                }

                // Extract location, latitude, and longitude from the line.
                String location = parts[0];
                String latitude = parts[1];
                String longitude = parts[2];

                // Format the output line
                String formattedLine = String.format("{ Location: '%s', Latitude: %s, Longitude: %s }", location, latitude, longitude);
                // Write the formatted line to the output file.
                pw.println(formattedLine);
            }

        } catch (IOException e) {
            // Handle IO exception if any
            e.printStackTrace(); // Print the stack trace of the exception.
        }
    }
}
