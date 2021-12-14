package Lab5_3;

public class Powerball {
    private int redBall;
    private int whiteBall1;
    private int whiteBall2;
    private int whiteBall3;
    private int whiteBall4;
    private int whiteBall5;

    public void play() {
        this.redBall = (int) (Math.random() * (1 - 42) + 42);

        for (int i = 1; i <= 5; i++) {
            int nb = (int) (Math.random() * (1 - 49) + 49);

            switch (i) {
                case 1:
                    this.whiteBall1 = nb;
                    break;
                case 2:
                    this.whiteBall2 = nb;
                    break;
                case 3:
                    this.whiteBall3 = nb;
                    break;
                case 4:
                    this.whiteBall4 = nb;
                    break;
                case 5:
                    this.whiteBall5 = nb;
                    break;
                default:
                    break;
            }
        }
    }

    public void displayResults() {
        System.out.println("The red ball is: " + this.redBall);
        System.out.println("The white balls are: [" + this.whiteBall1 + ", " + this.whiteBall2 + ", " + this.whiteBall3
                + ", " + this.whiteBall4 + ", " + this.whiteBall5 + "]");
    }
}
