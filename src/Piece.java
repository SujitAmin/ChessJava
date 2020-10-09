public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white) {
        this.setWhite(white);
    }

    private void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return this.white;
    }

    public abstract  boolean canMove(Board board, Spot start, Spot end);

    public void setKilled(boolean b) {
        this.killed = killed;
    }

    public boolean isKilled() {
        return this.killed;
    }

}
