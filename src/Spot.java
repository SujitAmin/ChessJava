public class Spot {
    private Piece piece;
    private int x;
    private int y;

    public Spot( int x, int y, Piece piece) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }


    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
