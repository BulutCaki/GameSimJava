public class Game {

    private String name;
    private String gameDeveloper;
    private int gamerId;
    private int campaignId;

    public Game(){

    }

    public Game(String name, String gameDeveloper, int gamerId, int campaignId) {
        this.name = name;
        this.gameDeveloper = gameDeveloper;
        this.gamerId = gamerId;
        this.campaignId = campaignId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
}
