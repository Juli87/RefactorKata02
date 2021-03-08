public class TennisGame4 implements TennisGame {

    private final String LOVE = "Love";
    private final String FIFTEEN = "Fifteen";
    private final String THIRTY = "Thirty";
    private final String FORTY = "Forty";

    private final String LOVE_TIE = "Love-All";
    private final String FIFTEEN_TIE = "Fifteen-All";
    private final String THIRTY_TIE = "Thirty-All";
    private final String OTHER_TIE = "Deuce";

    private final Integer CERO = 0;
    private final Integer QUINCE = 1;
    private final Integer TREINTA = 2;
    private final Integer CUARENTA = 3;

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
        if (player1.getScore() == player2.getScore()){
            return  getTieScoreName(player1, player2);
        }else if (player1.getScore() >=  4){
            return "";
        }else {
            return getScoreName(player1) + "-" + getScoreName(player2);
        }
    }

    private String getScoreName(Player player){
        if (isScore(player, CERO)){
            return  LOVE;
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
        }else if (isTieScore(player1, player2, CUARENTA)){
            return OTHER_TIE;
        }
        return "";
    }

    private Boolean isScore(Player player, Integer score){
        return player.getScore() == score;
    }


    private Boolean isTieScore(Player player1, Player player2, Integer score){
        return player1.getScore().equals(player2.getScore()) && player1.getScore() == score;
    }


    
}
