public abstract class GameCalculator {
    public abstract void hesapla();


    public final void gameOver() {
        System.out.println("oyun bitti.");

        GameCalculator gameCalculator = new GameCalculator() {
            //abstract sınıflar override edilmeden new lenemez.....
            @Override
            public void hesapla() {

            }
        };
    }
}
