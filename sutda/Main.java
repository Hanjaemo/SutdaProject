package sutda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        start();

        loading();

        System.out.println("[ System ] 누구와 게임하시겠습니까?");
        System.out.println("(1)뚱고 (2)교수 (3)곰쥐");
        System.out.print("숫자를 입력해주세요 >> ");
        Opponent opponent = new Opponent(scanner.nextInt());
        String trash = scanner.nextLine();
        System.out.println("[ System ] " + opponent.name + "님 입장합니다...");
        jeom();

        Deck deck = new Deck();

        System.out.println("[ System ] 플레이어님의 이름을 입력해주세요.");
        System.out.print(">> ");
        Player player = new Player(scanner.nextLine());
        System.out.println("[ System ] 플레이어님의 이름이 " + player.name + "(으)로 설정되었습니다!");
        loading();

        System.out.println("[ System ] enter를 입력하여 첫번째 카드를 뽑으세요.");
        System.out.print("Press Enter!!! ");
        String key = scanner.nextLine();
        System.out.println("---------------");

        if (key.equals("")) {
            player.firstCard = deck.pick();
            System.out.println("* " + player.firstCard + " *");
        }

        loading();

        gg();
        loading();

        System.out.println(opponent.name + "님의 차례입니다.");
        jeom();

        opponent.firstCard = deck.pick();
        System.out.println(opponent.name + "님이 첫번째 카드를 뽑았습니다.");
        System.out.println("--------------------");

        System.out.println("[ System ] enter를 입력하여 두번째 카드를 뽑으세요.");
        System.out.print("Press Enter!!! ");
        String key2 = scanner.nextLine();
        System.out.println("---------------");

        if (key2.equals("")) {
            player.secondCard = deck.pick();
            System.out.println("* " + player.secondCard + " *");
        }

        loading();

        gg();
        loading();

        System.out.println(opponent.name + "님의 차례입니다.");
        jeom();

        opponent.secondCard = deck.pick();
        System.out.println(opponent.name + "님이 두번째 카드를 뽑았습니다.");
        System.out.println("--------------------");

        System.out.println("[ System ] 어떤 카드를 공개하시겠습니까?");
        System.out.println("(1)" + player.firstCard + " (2)" + player.secondCard);
        System.out.print(">> ");
        int whatCard = scanner.nextInt();
        String trash2 = scanner.nextLine();
        if (whatCard == 1) {
            System.out.println(player.firstCard + "을(를) 공개합니다.");
        } else {
            System.out.println(player.secondCard + "을(를) 공개합니다.");
        }

        System.out.println("-----------------");

        if ((int)(Math.random()*10 - 8) == 1) {
            System.out.println(opponent.name + "님이 카드를 공개합니다. -> " + opponent.firstCard);
        } else {
            System.out.println(opponent.name + "님이 카드를 공개합니다. -> " + opponent.secondCard);
        }

        loading();

        gg();
        loading();

        System.out.println("[ System ] 결과를 공개합니다.");
    }

    static void start() {
        while(true) {
            System.out.println("-----------------------");
            System.out.println("게임을 시작하시겠습니까? [y/n]");
            System.out.print(">> ");
            String ans = new Scanner(System.in).nextLine();
            if (ans.equals("y")) {
                System.out.println("-------------");
                System.out.println("게임을 시작합니다.");
                break;
            } else if (ans.equals("n")) {
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            } else {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
        }
    }

    static void gg() {
        System.out.println("[ System ] go? die?");
        System.out.println("[ System ] 계속 진행하려면 'go', 종료하시려면 'die'를 입력해 주세요.");
        String gg = new Scanner(System.in).nextLine();
        if (gg.equals("go")) {
            return;
        } else if (gg.equals("die")) {
            System.out.println("패배하였습니다.");
            System.exit(0);
        }
    }

    static void loading() {
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("               loading...");
        System.out.println();
        System.out.println("-----------------------------------------");
    }

    static void jeom() {
        for (int i=0; i<3; i++) {
            System.out.println(".");
        }
    }
}