package common;

import java.util.Random;

public class RandomUtil {

    public static int getRandomSingle(int n){
        Random random = new Random();
        return random.nextInt(n);
    }

}
