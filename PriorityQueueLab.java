// import statements
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;

public class PriorityQueueLab {
    public static void main(String[] args) throws FileNotFoundException {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        try {
            File randIntegers = new File("RandIntegers.txt");   
            Scanner scan = new Scanner(randIntegers);
            while(scan.hasNextInt()) queue.add((scan.nextInt()));
            while (!queue.isEmpty()) System.out.println(queue.poll());    
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
    }
}

