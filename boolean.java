public class app {
    public static void main(String []args) {
        System.out.println("Hello  M");
        boolean isAlien = false;//یک شرط منطقی را در خود قرار میدهد
        if (isAlien == false) {
            System.out.println("its not an alien!");
            System.out.println("and he scared of  alien!");
        }
        int topScorer = 80;
        if (topScorer >= 80) {
            System.out.println("he is the top scorer!\n");
        }
        int SecondScorer = 79;
        if ((topScorer > SecondScorer) && (topScorer  <100)) {
            System.out.println("he scored more than Second scorer!\n");
        }
        if ((topScorer > 85 )|| (SecondScorer  < 80)) {
            System.out.println("this conditon is true!\n");
        }
    }
}

