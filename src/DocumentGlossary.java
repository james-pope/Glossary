import java.util.ArrayList;

public class DocumentGlossary extends ArrayList<GlossaryEntry> {

    public DocumentGlossary(){
        super();
    }
    public DocumentGlossary(int length){
        super(length);
    }

    private int foundOrInserted(String word){
        if (this.size() == 0) {
            GlossaryEntry x = new GlossaryEntry(word);
            add(x);
        }
        for(int i = this.size() - 1; i >= 0; i++){
            GlossaryEntry n = this.get(i);
            int compare = n.getWord().compareToIgnoreCase(word);
            if(compare == 0) {
                if (n.getWord().equals(word)) {
                    return indexOf(i);
                } else {
                    GlossaryEntry y = new GlossaryEntry(word);
                    add(i, y);
                    return indexOf(y);
                }
            }
        }
        return 0;
    }

    public void addWord(String word, int num){
        GlossaryEntry ge = new GlossaryEntry(word);
        foundOrInserted(word);
        ge.add(num);
    }
    public void addAllWords(String str, int num){
        String[] s = str.split("\\W+");
        for (String s1 : s){
             addWord(str, num);
        }
    }
}
