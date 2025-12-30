package com.chess.entity.piece;

import java.util.List;

import com.chess.entity.base.*;
import com.chess.entity.board.Board;
import com.chess.utils.MoveUtils;

public class Queen extends Piece {

    protected Queen(Color color) {
        super(color);
    }

    @Override
    public char getSymbol() {
        return this.color.isWhite() ? 'D' : 'd';
    }

    @Override
    public boolean isAttacking(Board board, Position from, Position to) {
        if (board == null || from == null || to == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos");
        }

        Direction dir = Direction.get(from, to);

        if (dir == null) return false;

        // Verifica se o caminho está livre de peças
        boolean isAttacking = board.isPathClear(from, to);

        return isAttacking;
    }

    @Override
    public List<Position> getPossibleMoves(Board board, Position from) {
        if (board == null || from == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos");
        }

        Direction[] directions = Direction.getAllDirections();

        return MoveUtils.getSlidingMoves(board, this.color, from, directions);
    }

}
