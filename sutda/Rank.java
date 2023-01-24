package sutda;

class Rank {
    Card firstCard;
    Card secondCard;
    String rankName;

    Rank() {}

    Rank(Card firstCard, Card secondCard) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
    }

    public void setRankName(Card firstCard, Card secondCard) {
        if (firstCard.isKwang && secondCard.isKwang) {
            if (firstCard.num == 1 || secondCard.num == 1) {
                if (firstCard.num == 3 || secondCard.num == 3) {
                    this.rankName = "13광땡";
                } else if (firstCard.num == 8 || secondCard.num == 8) {
                    this.rankName = "18광땡";
                }
            } else if ((firstCard.num == 3 && secondCard.num == 8) || (firstCard.num == 8 && secondCard.num == 3)) {
                this.rankName = "38광땡";
            }
        } else if (firstCard.num == secondCard.num) {
            if (firstCard.num == 10) {
                this.rankName = "장땡";
            } else {
                this.rankName = firstCard.num + "땡";
            }
        } else if (firstCard.num == 1 || secondCard.num == 1) {
            if (firstCard.num == 2 || secondCard.num == 2) {
                this.rankName = "알리";
            } else if (firstCard.num == 4 || secondCard.num == 4) {
                this.rankName = "독사";
            } else if (firstCard.num == 9 || secondCard.num == 9) {
                this.rankName = "구삥";
            } else if (firstCard.num == 10 || secondCard.num == 10) {
                this.rankName = "장삥";
            }
        } else if (firstCard.num == 4 || secondCard.num == 4) {
            if (firstCard.num == 10 || secondCard.num == 10) {
                this.rankName = "장사";
            } else if (firstCard.num == 6 || secondCard.num == 6) {
                this.rankName = "세륙";
            } else if (firstCard.num == 9 || secondCard.num == 9) {
                this.rankName = "구사";
            }
        } else if (firstCard.num == 7 || secondCard.num == 7) {
            if (firstCard.num == 3 || secondCard.num == 3) {
                this.rankName = "땡잡이";
            } else if (firstCard.num == 4 || secondCard.num == 4) {
                this.rankName = "암행어사";
            }
        } else {
            if ((firstCard.num + secondCard.num) % 10 == 0) {
                this.rankName = "망통";
            } else {
                this.rankName = (firstCard.num + secondCard.num) % 10 + "끗";
            }
        }


    }
}
