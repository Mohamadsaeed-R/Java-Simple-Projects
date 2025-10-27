public class Main2 {
    public static void main(String[] args) {
        boolean GameOver = true;
        int Score = 5000;
        int LevelComplete = 5;
        int Bonus = 100;
        int highScore=CalculateScore(GameOver,Score,LevelComplete,Bonus);

        System.out.println("The highScore is  "+highScore);
        System.out.println("The Next highScore is  "+
                                            CalculateScore(true,10000,8,200));
    }
    //this is a new Method
    public static int CalculateScore(boolean GameOver,int Score,int LevelComplete,int Bonus) {

        int finalscore = Score;

        if (GameOver) {
            finalscore += LevelComplete * Bonus;


        }
        return finalscore;
    }

}