public class BonusMilesService {
    public int calculate(int price) {
        int costForOneMile = 20;//Количество рублей для одной бонусной мили
        return price / costForOneMile;//количество бонусных миль
    }
}
