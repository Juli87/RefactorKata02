public interface TennisGame {

    String LOVE = "Love";
    String FIFTEEN = "Fifteen";
    String THIRTY = "Thirty";
    String FORTY = "Forty";

    String LOVE_TIE = "Love-All";
    String FIFTEEN_TIE = "Fifteen-All";
    String THIRTY_TIE = "Thirty-All";
    String OTHER_TIE = "Deuce";

    Integer CERO = 0;
    Integer QUINCE = 1;
    Integer TREINTA = 2;
    Integer CUARENTA = 3;
    Integer GAME = 4;

    String VENTAJA_JUGADOR1 = "Advantage player1";
    String VENTAJA_JUGADOR2 = "Advantage player2";
    String VICTORIA_JUGADOR1 = "Win for player1";
    String VICTORIA_JUGADOR2 ="Win for player2";

    void wonPoint(String playerName);
    String getScore();
}