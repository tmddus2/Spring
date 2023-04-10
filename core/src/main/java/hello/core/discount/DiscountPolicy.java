package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /*
    * @return 할인 대상 금액 => 1000원 할인해주면, 1000 리턴
    * */
    int discount(Member member, int price);
}
