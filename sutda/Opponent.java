package sutda;

class Opponent {
    String name;
    Card firstCard;
    Card secondCard;

    Opponent() {}

    Opponent(int num) {
        switch (num) {
            case 1:
                this.name = "뚱고";
                break;
            case 2:
                this.name = "교수";
                break;
            case 3:
                this.name = "곰쥐";
                break;
            default:
                this.name = "???";
        }
    }
}
