public class GameSaleManager implements GameSaleService{
    @Override
    public void Sell(Gamer gamer, Campaign campaign, Game game) {
        System.out.println(game.getName() + "" + gamer.getFirstName() + "" + campaign.getTitle());
    }
}
