public class TennisGame4 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame4(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void wonPoint(String pointWinner) {
        if(pointWinner.equals(player1.getPlayer())){
            player1.wonPoint();
        }else {
            player2.wonPoint();
        }
    }

    @Override
    public String getScore() {
        if (isTieScore(player1, player2, player1.getScore())){
            return getTieScoreName(player1, player2);
        }else if (isGame(player1, player2)){
            return getTopScore(player1, player2);
        }else {
            return getScoreName(player1) + "-" + getScoreName(player2);
        }
    }

    private String getScoreName(Player player){
        if (isScore(player, CERO)){
            return LOVE;
        }else if (isScore(player, QUINCE)){
            return FIFTEEN;
        }else if (isScore(player, TREINTA)){
            return THIRTY;
        }else if (isScore(player, CUARENTA)){
            return FORTY;
        }
        return "";
    }

    private String getTieScoreName(Player player1, Player player2){
        if (isTieScore(player1, player2, CERO)){
            return  LOVE_TIE;
        }else if (isTieScore(player1, player2,QUINCE)){
            return FIFTEEN_TIE;
        }else if (isTieScore(player1, player2, TREINTA)){
            return THIRTY_TIE;
        }else {
            return OTHER_TIE;
        }
    }

    private Boolean isScore(Player player, Integer score){
        return player.getScore() == score;
    }

    private Boolean isTieScore(Player player1, Player player2, Integer score){
        return player1.getScore().equals(player2.getScore()) && player1.getScore() == score;
    }

    private Boolean isGame(Player player1, Player player2){
        return player1.getScore() >= GAME || player2.getScore() >= GAME;
    }

    private String getTopScore(Player player1, Player player2){
        if (isAdvantagePlayer1(player1.getScore(), player2.getScore())){
            return VENTAJA_JUGADOR1;
        } else if (isAdvantagePlayer2(player1.getScore(), player2.getScore())){
            return VENTAJA_JUGADOR2;
        }else if (isVictoryPlayer1(player1.getScore(), player2.getScore())){
            return VICTORIA_JUGADOR1;
        }else
            return VICTORIA_JUGADOR2;
    }

    private Boolean isAdvantagePlayer1(Integer scorePlayer1, Integer scorePlayer2){
        return ((scorePlayer1 - scorePlayer2) == 1);
    }

    private Boolean isAdvantagePlayer2(Integer scorePlayer1, Integer scorePlayer2){
        return ((scorePlayer1 - scorePlayer2) == -1);
    }

    private Boolean isVictoryPlayer1(Integer scorePlayer1, Integer scorePlayer2){
        return ((scorePlayer1 - scorePlayer2) >= 2);
    }

}
