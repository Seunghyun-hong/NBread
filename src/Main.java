import java.util.HashMap;
import java.util.Scanner;

/**
 * N분의 1 (가칭)
 * 1. 찬조
 * 2. 메뉴별 N분의 1 (통닭 먹은 사람끼리, 술 마신 사람 끼리)
 * 3. 누구만 얼마 내고 나머지는 N빵
 * 4. 결과를 공유
 * 5. 절삭 단위 10원, 100원, 500원, 1000원
 * 6. 글로벌
 * 7. 사용하기 쉽게
 */

public class Main {
    private static String mMenuText;
    private int menu_1_price;
    private static int mPrintMenu;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * 총인원 N
         * 총액 T
         * 찬조 G
         *
         * 같이 먹은 음식 가격 S
         *
         * 나머지 각자는 SP
         * P에도
         * 같이 먹은 음식 SPs1
         * 같이 먹은 음식 SPs2
         * 같이 먹은 음식 SPs3
         *
         * 그 나머지는 p
         * 각자 계산 금액 p1
         * 각자 계산 금액 p2
         * 각자 계산 금액 p3
         *
         *
         * 그룹
         * S/N = 필수금액
         * S+SPs1 먹은 사람 = 필수금액 + SPs1/N-M
         * S+SPs2 먹은 사람 = 필수금액 + SPs1/N-M
         * ---------생각 막힘---------------
         *
         */

//
//        int 공통_음식수;
//        ArrayList<String> 공통_음식이름;
//        ArrayList<Integer> 메뉴가격;
//
//
//        int 총액 = scanner.nextInt();
//        int 찬조;
//        int 총인원 = scanner.nextInt();
//
//        /////////////////////////////////
//        /**
//         * 총액 = T
//         * a 사람에게 n값
//         * b 사람에게 m값
//         *
//         */
/////////////////////////////////생각 막힘//////ㅁ
//
//
//        // 다른 생각

/**
 *메뉴를 적고

 그 메뉴당 몇명의 사람이 먹었는지 체크!

 총인원 4
 치킨 4 =/4
 맥주 2 = /2
 콜라 3 = /3
 사이다1 = 1
 먹을땐?

 그리고 음료를 아무것도 안먹었다면?
 치킨은 기본!
 맥주 콜라 사이d다 안묵 3그룹이 있지
 그리고
 맥콜사안
 맥콜사 맥콜안 맥사안
 맥콜 맥사 맥안 콜사 콜안 사안
 맥 콜 사 안

 이거 구하는 식이
 조합공식
 조합의 경우의 수를 구하는 공식이다.
 조합은 n 개 중 서로 다른 r 개를 선택하되 순서를 고려하지 않는 것을 말한다.

 [출처] 경우의 수 공식 모음②|작성자 입시전문 유레카

 n!
 ________
 r!(n-r)!

 팩토리얼은 3! 라면 3*2*1 이다.

 저 식을 포문 돌리면..
 총 경우의 수가 나온다.

 ========================

 */
        System.out.print("먹은 음식의 수를 입력해주세요-> ");
        int menu_num = scanner.nextInt();

        // 배열 만큼 ! 데이터를 담는다...
        HashMap hm = new HashMap();

        for (int i = 0; i < menu_num; i++) {
            System.out.print("메뉴를 입력해주세요-> ");
            mMenuText = scanner.next();
            hm.put(i, mMenuText);   // 헤쉬멥에 넣어준다!
            System.out.print("메뉴의 총 가격을 입력해주세요-> ");
            int menuPrice = scanner.nextInt();
            System.out.print("그 음식을 먹은 사람의 수를 입력해주세요-> ");
            int people_num = scanner.nextInt();


            mPrintMenu = menuPrice / people_num;
            hm.put(mMenuText, mPrintMenu);   // 헤쉬멥에 넣어준다!
//            System.out.print(hm.get(print_menu_1));  // 이건 당근 널이지.. 이 키로 된 값이 없으니까.
            //아! 그럼 인덱스처럼 만들어줘서 숫자랑 이름 연결 시켜주고
            //이름이랑 가격이랑 연결시켜주면 되겠네!
            System.out.print("1인 당" + mMenuText + ": ");
            System.out.println(hm.get(mMenuText));
        }
        // 그런데 이걸 배열로 담아야 나중에 이용을 가능하겠지?
        // 현재 1인당 금액은 해쉬맵에 담아있지.. 키는 메뉴이름으로...

        //닭만 먹은 사람
        for (int i = 0; i < menu_num; i++) {
            for (int j = 0; j < menu_num; j++) {
//                System.out.println(hm.get(i));// 이렇게 이름을 받으면..
//                System.out.println(hm.get(hm.get(i))); // 이렇게 가격이..
                System.out.println(hm.get(i));

                // 이걸 체크 박스로 만들어서!
                // 체크하면 체크한 만큼만 금액을 알 수 있게 하는거지!
                // 그럼 메뉴 입력 한 수만큼 체크박스를 만들어줘야 하겠네. 이게 가능한가??

                // 그런데 막 6666 이렇게 나오면 어떻게 해결을 하지??

                // 계산한 사람이 소득 공제를 받으니까 10단위는 절삭해서 받으라고 할까?
                // 요새 계좌로 쏴주니까 그냥 1원단위도 해도 될꺼 같고.
                // 몇원은 결제한 놈이 내고.(현금영수증 소득공제 받을 테니까.ㅎㅎ)

                // 만약 계좌가 없다면??
                // 100원 단위로 맞춰줘야 겠지?
                // 만약 밑에 같은 예제라면 666 원씩 내야 한다면..
                // 700으로 받으면 100원이 초과되고
                // 600으로 받으면 200원이 모자란다.
                // 이걸 표시해 줘도 좋을꺼 같아!
                // 반올림 한거랑 그냠 버림한거랑 비교해주면 좋을듯.

            }
        }
    }

}
