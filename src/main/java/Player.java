public class Player {

    private String player;
    private Integer score = 0;

    public Player(String player){
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer wonPoint(){
        return score++;
    }
}
