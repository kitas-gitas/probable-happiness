package lt.techin.calc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pvz {


    public static void main(String[] args)  {

        try {
            metodas1();
        } catch (IOException e) {
            //throw new RuntimeException(e);
        }
        System.out.println("pabaiga");
    }

    private static void metodas1() throws IOException {



        metodas2();

    }

    private static void metodas2() throws IOException, InterruptedException {

        Thread.sleep(1000);


        Files.readAllLines(Paths.get(""));


    }
}
