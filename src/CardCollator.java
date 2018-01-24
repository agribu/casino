import java.util.Random;

public class CardCollator {

    private Narrator wolframNarrator;
    public static String[] kartendeck = 
    new String[] {"7", "8", "9", "10", "B", "D", "K", "A"};
    public static String[] orgDeck =
    new String[] {"7", "8", "9", "10", "B", "D", "K", "A"};
    public static String[] sortDeck = new String[8];

    public CardCollator() {}

    public void setNarrator(Narrator wolframNarrator) {
        this.wolframNarrator = wolframNarrator;
    }

    public void getCards(String[] kartendeck) {
        StringBuffer karten = new StringBuffer("");
        for (int i = 0; i < kartendeck.length; i = i + 1) {
            karten.append(kartendeck[i] + " ");
        }
        System.out.println("\n\t" + karten);
    }

    public void getCards() {
        StringBuffer karten = new StringBuffer("");
        for (int i = 0; i < kartendeck.length; i = i + 1) {
            karten.append(kartendeck[i] + " ");
        }
        System.out.println("\n\t" + karten);
    }

    public void shuffleDeck() {
        wolframNarrator.shuffle(1);
        getCards();
        wolframNarrator.shuffle(2);
    }
    
    public void random() {
        Random r = new Random();
        String buffer = "";
        int zufall = 0;
        
        //for (int i = 0; i < kartendeck.length - i; i = i + 1) {
        for (int i = 0; i < kartendeck.length - 1; i = i + 1) {
            zufall = r.nextInt(kartendeck.length);
            buffer = kartendeck[zufall];
            kartendeck[zufall] = kartendeck[i];
            kartendeck[i] = buffer;
        }
    }

    public void insertionSort() {
        int position = 0;
        for (int i = 0; i < kartendeck.length - 1; i = i + 1) {
            if (kartendeck[i] == orgDeck[position]) {
                sortDeck[position] = kartendeck[i];
                position = position + 1;
            } else {
                position = position + 1;
            }
        }
        getCards(sortDeck);
    }

    public void selectionSort() {
        getCards();
    }

    public void mergeSort() {
        getCards();
    }

    public void quickSort() {
        getCards();
    }

}
