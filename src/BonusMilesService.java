public class BonusMilesService {
    int cost;
    int costOneMiles = 20;
    public int calculate (int cost) {
         int miles = cost / costOneMiles;
        return miles;
    }

}
