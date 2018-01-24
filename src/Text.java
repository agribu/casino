public class Text {

    public Text(){}
    
    public void help() {
        System.out.println("\nWillkommen im Spielcasino \"Las Vegas\"!\n\n" +
        "Ihnen stehen folgende Befehle zur Verfuegung:\n");
        System.out.println("\tstart\t-\tStartet ein neues Spiel\n" +
        "\tshowt\t-\tDeckt die eigenen Karten auf\n" +
        "\tshuffle\t-\tMischt die eigenen Karten\n" +
        "\tsort\t-\tSortiert die eigenen Karten\n" +
        "\tende\t-\tBeendet das Spiel\n" +
        "\thelp\t-\tZeigt diese Befehlsuebersicht an\n\n");
        System.out.println("Nutzen Sie nun die Eingabeaufforderung um einen" +
        " weiteren Befehl auszufuehren:\n");
    }
    
    public void sort(int abschnitt) {
        switch (abschnitt) {
            case 1:
        System.out.println("\nSie haben eine Pechstraehne und werden langsam" +
        " ungluecklich. Doch nach einem genauen Hinsehen faellt Ihnen auf," + 
        " dass Sie viel erfolgreicher sein koennten, wenn doch nur Ihre " + 
        "Karten besser sortiert waeren.\n");
        System.out.println("\nEs gibt zwei Arten von Sortierverfahren:\n");
        System.out.println("\n\t1. Alle Karten werden auf einmal sortiert." + 
        "\n\t2. Jede Karten wird nacheinander sortiert.\n");
        System.out.println("\nTreffen Sie nun Ihre Auswahl:\n");
            break;
            case 2:
        System.out.println("\n\nEs gibt zudem drei Sortieralgorithmen:");
        System.out.println("\n\t1. Sortieren durch Mischen" + 
        "\n\t2. Sortieren durch Austauschen" + 
        "\n\t3. Sortieren durch Einfuegen\n");
            break;
            case 3:
        System.out.println("\nWaehlen Sie nun Ihren bevorzugten" + 
        " Sortieralgorithmus:\n");
            break;
        }
    }

    public void start() {
        System.out.println("\nSie starten ein neues Spiel. Der Dealer faengt an" + 
        "Tisch 23 faengt an die Spielkarten zu mischen. Nach einem wilden" + 
        " Auftritt, bei dem die Spielkarten blind hinter dem Ruecken des" +
        " Dealers gemischt wurden, waehrend dieser barfuss ueber heisse Kohlen " +
        "lief, werden nun jedem Spieler fuenf Karten ausgeteilt. \n" +
        "Sie haben Ihre Karten erhalten. Das Spiel kann nun beginnen.\n \n" +
        "Nutzen Sie nun die Eingabeaufforderung um einen weiteren Befehl" +
        " auszufuehren:\n");
    }
    
    public void show(int abschnitt) {
        switch (abschnitt) {
            case 1:
                System.out.println("\nNatuerlich wollen Sie wissen, welche " +
                "Spielkarten Ihnen  ausgeteilt wurden. \n\nNeugierig werfen " +
                "Sie einen Blick auf Ihre Karten:");
            break;
            case 2:
                System.out.println("\nNutzen Sie nun die Eingabeaufforderung" +
                " um einen weiteren Befehl auszufuehren:\n");
            break;
        }
    }
    
    public void shuffle(int abschnitt) {
        switch (abschnitt) {
            case 1:
        System.out.println("\nDie Reihenfolge Ihrer Spielkarten gefaellt " + 
        "Ihnen nicht.\nSie fangen an Ihre Karten neu zu mischen.\nIhre Karten " +
        "sind nun neu gemischt:");
            break;
            case 2:
        System.out.println("\nNutzen Sie nun die Eingabeaufforderung um einen" + 
        " weiteren Befehl auszufuehren:\n");
            break;
        }
    }
    
    public void end() {
        System.out.println("\nSie haben genug gespielt fuer heute und werden " +
        "langsam muede. Doch ploetzlich faellt Ihnen ein, dass Sie noch ein Date" +
        "mit der huebschen Dame von der Bar haben. Grund genug den Tisch zu" +   
        "verlassen und sich frisch zu machen mit der Hoffnung aus aufregende " +
        "Abendstunden.");
    }
}
