public class ValidatorManager implements  ValidatorService{

    @Override
    public boolean validate(Gamer gamer) {
        if(gamer.getBirthDate() < 2003 && gamer.getTcNo() > 4 ) {
            System.out.println("Kullanýcý Doðrulandý");
            return true;
        }
        else {
            System.out.println("Kullanýcý Doðrulanamadý!");
            return false;
        }
    }
}
