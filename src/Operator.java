import java.io.*;

public class Operator {

    private Janitor fredJanitor;
    private Player linusPlayer;
    private CardCollator davidCardCollator;

    public Operator() {}

    public void setJanitor(Janitor fredJanitor) {
        this.fredJanitor = fredJanitor;
    }

    public void setPlayer(Player linusPlayer) {
        this.linusPlayer = linusPlayer;
    }

    public void setCardCollator(CardCollator davidCardCollator) {
        this.davidCardCollator = davidCardCollator;
    }

    public void cmdRead() {
        try {
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(System.in));
            String cmd = "";
            while (cmd != null) {
                System.out.print("> prompt: ");
                cmd = in.readLine();
                if (cmd.equals("help")) {
                    fredJanitor.clearConsole();
                    linusPlayer.help();
                } else if (cmd.equals("start")) {
                    fredJanitor.clearConsole();
                    linusPlayer.start();
                } else if (cmd.equals("show")) {
                    fredJanitor.clearConsole();
                    linusPlayer.show();
                } else if (cmd.equals("shuffle")) {
                    fredJanitor.clearConsole();
                    linusPlayer.shuffle();
                } else if (cmd.equals("sort")) {
                    fredJanitor.clearConsole();
                    linusPlayer.sort();
                } else if (cmd.equals("end")) {
                    fredJanitor.clearConsole();
                    linusPlayer.end();
                } else {
                    fredJanitor.clearConsole();
                    System.out.println("\nBitte geben Sie einen gültigen " +
                    "Befehl ein!\nTippen Sie \"help\" um eine Übersicht " +
                    "aller Befehle zu bekommen:\n");
                    cmdRead();
                }
                cmd = null;
            }
        } catch (IOException e) {
        }
    }
    public void sortMode() {
        try {
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(System.in));
            String cmd = "";
            while (cmd != null) {
                System.out.print("> prompt: ");
                cmd = in.readLine();
                if (cmd.equals("a)") || cmd.equals("a") || cmd.equals("A")) {
                    System.out.println("Success!");
                } else if (cmd.equals("end")) {
                    fredJanitor.clearConsole();
                    linusPlayer.end();
                    System.exit(0);

                } else {
                    System.out.println("\nBitte geben Sie einen gültige " +
                    "Auswahl ein!\nTippen Sie z.B.: a , a) oder A!");
                    sortMode();
                }
                cmd = null;
            }
        } catch (IOException e) {
        }
    }
    public void sortAlg() {
        try {
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(System.in));
            String cmd = "";
            while (cmd != null) {
                System.out.print("> prompt: ");
                cmd = in.readLine();
                if (cmd.equals("1") || cmd.equals("1.") || cmd.equals("1)")) {
                    davidCardCollator.insertionSort();
                } else if (cmd.equals("2") || cmd.equals("2.") || 
                                                    cmd.equals("2)")) {
                    davidCardCollator.selectionSort();
                } else if (cmd.equals("3") || cmd.equals("3.") || 
                                                    cmd.equals("3)")) {
                    davidCardCollator.mergeSort();
                } else if (cmd.equals("4") || cmd.equals("4.") || 
                                                    cmd.equals("4)")) {
                    davidCardCollator.quickSort();
                }else if (cmd.equals("end")) {
                    fredJanitor.clearConsole();
                    linusPlayer.end();
                    System.exit(0);

                } else {
                    System.out.println("\nBitte geben Sie einen gültige " +
                    "Auswahl ein!\nTippen Sie z.B.: a , a) oder A!");
                    sortMode();
                }
                cmd = null;
            }
        } catch (IOException e) {
        }
    }
}
