public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int miles = (ticketPrice / 20);
        return miles;
    }

}
