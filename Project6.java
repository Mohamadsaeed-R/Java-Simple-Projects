public class Project6 {
    public static void main(String[] args) {
        String s="Welcome To Java Programming Course!";
        System.out.format(" %s\n",s);
        System.out.format("length=%d\n",s.length());
        System.out.format("is empty=%s\n",s.isEmpty());
        System.out.format("character at position 3=%s\n",s.charAt(3));  //the final result will show c char because java is zero based.
        System.out.format("lower case %s\n",s.lowercase());
        System.out.format("upper case %s\n",s.toUpperCase());
        System.out.format("first space %d\n",s.indexOf(" ")); // shows the first space in the sentence.
        System.out.format("ends with %s\n",s.endsWith("!"));
        System.out.format("ends with %s\n" ,s.endsWith("."));

    }
}
