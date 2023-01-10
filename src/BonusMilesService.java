public class BonusMilesService {

    public int calculate(int cost) {
        int costOneMiles = 20;
        int miles = cost / costOneMiles;
        return miles;
    }

}
