package Class_2;

import java.util.Random;

public class CreditScore {
    public int score(){
        return new Random().nextInt(300, 850);
    }
}
