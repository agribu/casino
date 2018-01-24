public class StartCasino {

    public static void main(String[] args) {
        Player linusPlayerPlayer = new Player();
        Janitor fredJanitor = new Janitor();
        Operator jeffOperator = new Operator();
        Narrator wolframNarrator = new Narrator();
        CardCollator davidCardCollatorCardCollator = new CardCollator();

        linusPlayer.setNarrator(wolframNarrator);
        linusPlayer.setCardCollator(davidCardCollator);
        jeffOperator.setJanitor(fredJanitor);
        jeffOperator.setPlayer(linusPlayer);
        jeffOperator.setCardCollator(davidCardCollator);
        wolframNarrator.setOperator(jeffOperator);
        davidCardCollator.setNarrator(wolframNarrator);

        fredJanitor.clearConsole();
        linusPlayer.start();
//        davidCardCollator.insertionSort();
    }

}
