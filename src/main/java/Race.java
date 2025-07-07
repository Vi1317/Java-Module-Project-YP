public class Race {
    private String winnerName = "";
    private int winnerPath = 0;

    void calculateWinner(Car car) {
        if ((car.speed * 24) > winnerPath) {
            winnerName = car.name;
            winnerPath = car.speed * 24;
        }
    }

    String getWinnerName () {
        return winnerName;
    }
}
