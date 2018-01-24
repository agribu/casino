public class Narrator {

    private Operator jeffOperator;

    public Narrator() {}
    
    public void setOperator(Operator jeffOperator) {
        this.jeffOperator = jeffOperator;
    }

    public void help() {
        System.out.println("\nWillkommen im Spielcasino \"Las Vegas\"!\n\n" +
        "Ihnen stehen folgende Befehle zur Verfügung:\n");
        System.out.println("\thelp\t-\tZeigt diese Befehlsübersicht an\n\n" +
        "\tstart\t-\tStartet ein neues Spiel\n" +
        "\tshow\t-\tDeckt die eigenen Karten auf\n" +
        "\tshuffle\t-\tMischt die eigenen Karten\n" +
        "\tsort\t-\tSortiert die eigenen Karten\n" +
        "\tend\t-\tBeendet das Spiel\n");
        System.out.println("Nutzen Sie nun die Eingabeaufforderung um einen" +
        " weiteren Befehl auszuführen.");
        System.out.println("Tippen Sie \"help\" um eine Übersicht aller " +
        "Befehle zu bekommen.\n");
        jeffOperator.cmdRead();
    }

    public void start() {
        System.out.println("\nSie starten ein neues Spiel. Der Dealer von" +
        " Tisch 23 fängt an die Spielkarten zu mischen. Nach einem wilden" +
        " Auftritt, bei dem die Spielkarten blind hinter dem Rücken des" +
        " Dealers gemischt wurden, während dieser barfuss über heisse Kohlen " +
        "lief, werden nun jedem Spieler die Karten ausgeteilt. \n\n" +
        "Sie haben Ihre Karten erhalten. Das Spiel kann nun beginnen.\n");
        System.out.println("Nutzen Sie nun die Eingabeaufforderung um einen" +
        " weiteren Befehl auszuführen.");
        System.out.println("Tippen Sie \"help\" um eine Übersicht aller " +
        "Befehle zu bekommen.\n");
        jeffOperator.cmdRead();
    }

    public void show(int abschnitt) {
        switch (abschnitt) {
            case 1:
                System.out.println("\nNatürlich wollen Sie wissen, welche " +
                "Spielkarten Ihnen ausgeteilt wurden. \nNeugierig werfen " +
                "Sie einen Blick auf Ihre Karten:");
            break;
            case 2:
                System.out.println("\nNutzen Sie nun die Eingabeaufforderung " +
                "um einen weiteren Befehl auszuführen.");
                System.out.println("Tippen Sie \"help\" um eine Übersicht " +
                "aller Befehle zu bekommen.\n");
                jeffOperator.cmdRead();
            break;
        }
    }
    
    public void shuffle(int abschnitt) {
        switch (abschnitt) {
            case 1:
                System.out.println("\nDie Reihenfolge Ihrer Spielkarten " +
                "gefällt Ihnen nicht.\nSie fangen an Ihre Karten neu zu " +
                "mischen. Ihre Karten sind nun neu gemischt:");
            break;
            case 2:
                System.out.println("\nNutzen Sie nun die Eingabeaufforderung " +
                "um einen weiteren Befehl auszuführen.");
                System.out.println("Tippen Sie \"help\" um eine Übersicht " +
                "aller Befehle zu bekommen.\n");
                jeffOperator.cmdRead();
            break;
        }
    }

    public void sort(int abschnitt) {
        switch (abschnitt) {
            case 1:
                System.out.println("\nSie haben eine Pechsträhne und werden " +
                "langsam unglücklich. Doch nach einem genauen Hinsehen fällt " +
                "Ihnen auf, dass Sie viel erfolgreicher sein könnten, wenn " +
                "doch nur Ihre Karten besser sortiert wären.\n");
                System.out.println("\nEs gibt zwei Arten von " +
                "Sortierverfahren:\n");
                System.out.println("\n\ta) Alle Karten werden auf einmal " +
                "sortiert.\n\tb) Jede Karten wird nacheinander sortiert.\n");
                System.out.println("\nTreffen Sie nun Ihre Auswahl:\n");
                //TODO ACHTUNG SPEZIALFALL
                jeffOperator.sortMode();
            break;
            case 2:
                System.out.println("\n\nEs gibt zudem drei " +
                "Sortieralgorithmen:");
                System.out.println("\n\t1. Insertion Sort" +
                "\n\t2. Selection Sort \n\t3. Merge Sort\n" +
                "\n\t4. Quick Sort\n");
            break;
            case 3:
                System.out.println("\nWählen Sie nun Ihren bevorzugten" +
                " Sortieralgorithmus:\n");
                //TODO ACHTUNG SPEZIALFALL
                jeffOperator.sortAlg();
            break;
        }
    }
    
    public void end() {
        System.out.println("\nSie haben genug gespielt für heute und werden " +
        "langsam müde. Doch plötzlich fällt Ihnen ein, dass Sie noch ein Date" +
        " mit der hübschen Dame von der Bar haben. Grund genug den Tisch zu " +
        "verlassen und sich frisch zu machen, mit der Hoffnung auf aufregende" +
        " Abendstunden.\n\n");
    }
}
