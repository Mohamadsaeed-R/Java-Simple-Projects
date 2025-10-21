public class Main2 {
    public static void main(String[] args) {
        boolean GameOver = true;
        int Score = 10000;
        int LevelComplete = 8;
        int Bonus = 200;
        int finalscore = Score;

        if (GameOver) {
            finalscore += (Bonus * LevelComplete);
            System.out.println("final score:" + finalscore);


        }

    }
}

