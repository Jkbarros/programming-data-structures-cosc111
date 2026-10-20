package lab_binary;
//Problem1.jjava

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Problem1 {
      public static void main(String[] args) throws IOException {
              // replace below with your binary file name (which contain numbers)
              String filename = "numbers.dat";
              // opening file inn binary read mode
              ObjectInputStream inputStream = new ObjectInputStream(
                              new FileInputStream(filename));
              int count = 0;
              double sum = 0, input;
              // looping
              while (true) {
                      try {
                              // reading a double
                              input = inputStream.readDouble();
                              // adding to sum
                              sum += input;
                              // updating count
                              count++;
                      } catch (EOFException e) {
                              // stopping the loop when EOFException is thrown and caught
                              break;
                      }
              }
              // closing stream
              inputStream.close();
              // finding average, assuming count>0
              double avg = sum / count;
              // displaying it
              System.out.println("Average of numbers: " + avg);
      }
}