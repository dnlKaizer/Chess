package com.chess.entity.base;

public enum Color {
    WHITE("Brancas", true),
    BLACK("Pretas", false);

    private final String name; // Nome da cor
    private final boolean isWhite; // Indica se é branca

    Color(String name, boolean isWhite) {
        this.name = name;
        this.isWhite = isWhite;
    }

    /**
     * Retorna a cor oposta.
     * @return {@code Color} oposta
     */
    public Color opposite() {
        return this.isWhite ? BLACK : WHITE;
    }

    /**
     * Verifica se é a cor branca.
     * @return {@code true} se for branca, {@code false} caso contrário
     */
    public boolean isWhite() {
        return isWhite;
    }

    /**
     * Verifica se é a cor preta.
     * @return {@code true} se for preta, {@code false} caso contrário
     */
    public boolean isBlack() {
        return !isWhite;
    }

    /**
     * Retorna o nome da cor.
     * @return {@code String} com nome da cor
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
