import java.util.Random;
public class Player {

    public static String[] kartenspiel = 
    new String[] {"7", "8", "9", "10", "B", "D", "K", "A"};
    Text text = new Text();

    //Erzeugt das Objekt Player
    public Player() {}

    public void getCards() {
        //Ausgabe der zugeteilten Spielkarten
        StringBuffer karten = new StringBuffer("");
        for (int i = 0; i < kartenspiel.length; i = i + 1) {
            karten.append(kartenspiel[i] + " ");
        }
        System.out.println("\n\t" + karten);
    }

    public void show() {
        text.show(1);
        getCards();
        text.show(2);
        //Schleife zur Abfrage von Befehlen !hier
    }

    public void help() {
        text.help();
    }
    
    public void start() {
        text.start();
        //Schleife zur Abfrage von Befehlen !hier
    }

    public void shuffleDeck(String[] random) {
        this.kartenspiel = random;
        text.shuffle(1);
        getCards();
        text.shuffle(2);
    }
    
    public void shuffle() {
        Random r = new Random();
        String buffer = "";
        int zufall = 0;
        
        for (int i = 0; i < kartenspiel.length - i; i = i + 1) {
            zufall = r.nextInt(kartenspiel.length);
            buffer = kartenspiel[zufall];
            kartenspiel[zufall] = kartenspiel[i];
            kartenspiel[i] = buffer;
        }
        shuffleDeck(kartenspiel);
    }
    
    public void end() {
        text.end();
    }
    
    public void sort() {
        text.sort(1);
        //Sortierverfahren wird gewaehlt
        text.sort(2);
        //Sortieralgorithmus wird gewaehlt
        text.sort(3);
        //Schleife zur Abfrage von Befehlen !hier
    }

}
