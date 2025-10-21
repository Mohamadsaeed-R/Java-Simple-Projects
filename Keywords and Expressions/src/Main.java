public class Main {
    public static void main(String[] args) {
        boolean GameOver = true;
        int Score = 5000;
        int LevelComplete = 5;
        int Bonus = 10;
        if (Score > 4000 && Bonus > 10) {
            System.out.println("You Win!");

        } else if (Score < 4000) {
            System.out.println("You Score Was Less than 4000!");

        } else {
            System.out.println("You Got Here");
        }

    }
}

