public class Move {
    private  Player player;
    private  Spot start;
    private Spot end;
    private  Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;
    public Move(Player player, Spot start, Spot end) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

    public void setPieceKilled(Piece destPiece) {
    }
    public boolean isCastlingMove() {
        return this.castlingMove;
    }

    public Spot getStart() {
        return start;
    }

    public void setStart(Spot start) {
        this.start = start;
    }

    public Spot getEnd() {
        return end;
    }

    public void setEnd(Spot end) {
        this.end = end;
    }

    public void setCastlingMove(boolean castlingMove) {
        this.castlingMove =  castlingMove;
    }
}
