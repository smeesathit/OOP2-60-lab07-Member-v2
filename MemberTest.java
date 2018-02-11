import java.util.GregorianCalendar;
import java.util.Calendar;

public class MemberTest
{
    public static void main(String[] args){
        Member member1, member2, member3;

        member1 = new Member("สุภาพ เรียบร้อย");
        System.out.println(member1.toString());

        member2 = new Member(new GregorianCalendar(2019, Calendar.FEBRUARY, 12));
        System.out.println(member2.toString());

        member3 = new Member("ดีใจ จริงจัง", new GregorianCalendar(2019, Calendar.MARCH, 12));
        System.out.println(member3.toString());
        System.out.println("\n");

        // show total number of members
        System.out.println("จำนวนสมาชิก = " + Member.getCounter());

        // set member name
        System.out.println("รหัสสมาชิก : " + member2.getMemberId());
        member2.setMemberName("เป็นต่อ พอใจ");
        System.out.println("ชื่อสมาชิก : " + member2.getMemberName());

        // add point
        // addPoint(point)
        member2.addPoint(100);
        System.out.println("เพิ่มแต้ม 100 แต้ม == > แต้มสะสม = " + member2.getPoint());
        // addPoint(point, bonus)
        member2.addPoint(50, 2);
        System.out.println("เพิ่มแต้ม 50 แต้ม มีโบนัส x 2 == > แต้มสะสม = " 
            + member2.getPoint());

        // redeem point
        member2.redeemPoint(300);
        System.out.println("ตัดแต้ม: 300 แต้ม == > แต้มสะสม = " + member2.getPoint());
        member2.redeemPoint(50);
        System.out.println("ตัดแต้ม: 50 แต้ม == > แต้มสะสม = " + member2.getPoint());

    } // end main
} // end MemberTest
