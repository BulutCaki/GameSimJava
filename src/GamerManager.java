public class GamerManager implements GamerService{

    ValidatorManager validatorManager;

    public GamerManager(ValidatorManager validatorManager) {
        this.validatorManager = validatorManager;
    }

    @Override
    public void add(Gamer gamer) {
        if(this.validatorManager.validate(gamer)) {
            System.out.println("Oyuncu eklendi" + gamer.getFirstName());
        }else{
            System.out.println("Olmadı... :( ");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi" + gamer.getFirstName());
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu güncellendi" + gamer.getFirstName());
    }
}
