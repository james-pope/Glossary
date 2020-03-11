import java.util.ArrayList;

public class GlossaryEntry {

    private String word;
    private ArrayList<Integer> numsList;

    public GlossaryEntry(String x){
        word = x.toUpperCase();
        numsList = new ArrayList<>();
    }
    public void add(int num) {
        if (!numsList.contains(num)) numsList.add(num);
    }
    public String getWord() {return word;}
    public String toString(){
        String x = word + " ";
        for (Integer e : numsList){
            x += e + ", ";
        }
        return x;
    }
    public static void main(String[] args){
        GlossaryEntry ge = new GlossaryEntry("Hello");
        ge.add(5);
        ge.add(7);
        ge.add(5);
        ge.add(7);
        System.out.println(ge);
    }
}
