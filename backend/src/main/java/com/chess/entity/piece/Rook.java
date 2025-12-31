package com.chess.entity.piece;

import java.util.List;

import com.chess.entity.base.*;
import com.chess.entity.board.Board;
import com.chess.utils.MoveUtils;

public class Rook extends Piece {

    protected Rook(Color color) {
        super(color);
    }

    @Override
    public char getSymbol() {
        return this.color.isWhite() ? 'T' : 't';
    }

    @Override
    public boolean isAttacking(Board board, Position from, Position to) {
        if (board == null || from == null || to == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos");
        }

        Direction dir = Direction.get(from, to);

        if (dir == null) return false;

        // Verifica se o caminho está livre de peças e se está na direção ortogonal
        boolean isAttacking = dir.isOrthogonal() && board.isPathClear(from, to);

        return isAttacking;
    }

    @Override
    public List<Position> getPossibleMoves(Board board, Position from) {
        if (board == null || from == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos");
        }

        Direction[] directions = Direction.getOrthogonalDirections();

        return MoveUtils.getSlidingMoves(board, this.color, from, directions);
    }

}
