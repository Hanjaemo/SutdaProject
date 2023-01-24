package sutda;

class Card {
    int num;
    boolean isKwang;

    Card() {}

    Card(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return (num + (isKwang ? "광" : ""));
    }
}
