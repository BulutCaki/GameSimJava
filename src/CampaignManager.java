public class CampaignManager implements CampaignService{

    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya eklendi"+campaign.getTitle());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi"+campaign.getTitle());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi"+campaign.getTitle());
    }
}
