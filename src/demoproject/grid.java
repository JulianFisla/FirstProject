package demoproject;

//Import statement
import java.util.Random;

public class grid {

    public void appleSpawn() {
        Random rand = new Random();

        //Dimensions 1280 x 720 pixels
        int upperboundX = 1281;
        int upperboundY = 721;

        //Generate random values
        int appleSpawnX = rand.nextInt(upperboundX);
        int appleSpawnY = rand.nextInt(upperboundY);

        System.out.println(appleSpawnX + "," + appleSpawnY);

    }

}

