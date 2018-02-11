/**
 * An istance of this class represents a member.
 */

import java.util.GregorianCalendar;

public class Member 
{
    // class variables
    private static final String INITIAL = "MB";
    private static final String DEFAULT_STRING = "Unassigned";
    private static int counter = 0;

    // instance variables
    /** the id of this memeber */
    private String  memberId;
    /** the name of this memeber */
    private String  memberName;
    /** the expiry date of the membership for this memeber */
    private GregorianCalendar expiryDate;
    /** the current point of this memeber */
    private int     point;

    //-------------------
    // Constructors
    //-------------------
    /**
     * Constructor.
     *
     * @param memberName	the name of this memeber
     *
     */

    public Member(String memberName) 
    {
        this(memberName, new GregorianCalendar());
    } // end one-argument Member constructor

    /**
     * Constructor.
     *
     * @param expiryDate    the expiry date of the membership for this memeber
     *
     */
    public Member(GregorianCalendar expiryDate) 
    {
        this(DEFAULT_STRING, expiryDate);
    } // end one-argument Member constructor

    /**
     * Constructor.
     *
     * @param memberName    the name of this memeber
     * @param expiryDate    the expiry date of the membership for this memeber
     *
     */
    public Member(String memberName, GregorianCalendar expiryDate) 
    {
        this.setMemberId();
        setMemberName(memberName);
        setExpiryDate(expiryDate);
        addPoint(0);
    } // end two-argument Member constructor

    public static int getCounter (){
        return counter;
    }

    private void setMemberId(){
        counter++;
        memberId = INITIAL + "-" + counter;
    }

    /**
     * Returns the id of this memeber
     *
     * @return the id of this memeber
     */ 
    public String getMemberId( ){
        return memberId;
    }

    /**
     * Sets the name of this memeber
     * 
     * @param name the name of this memeber
     */ 
    public void setMemberName( String name){
        memberName = name;
    }

    /**
     * Returns the name of this memeber
     *
     * @return the name of this memeber
     */
    public String getMemberName( ){
        return memberName;
    }   

    public void setExpiryDate(GregorianCalendar date){
        expiryDate = date;
    }

    public GregorianCalendar getExpiryDate(){
        return expiryDate;
    }

    public int getPoint( ){
        return point;
    }   

    public void addPoint( int point )
    {
        this.point += point;

    } // end addPoint

    public void addPoint( int point, int bonus )
    {
        this.point += (point * bonus);

    } // end addPoint
    public void redeemPoint( int point )
    {
        if (this.point >= point) 
            this.point = this.point - point;
    } // end redeemPoint

    public String toString(){
        String s = String.format("%1$td/%1$tm/%1$ty", getExpiryDate());

        return String.format("%10s  %30s    %10s    %6d", getMemberId(), getMemberName(), s, getPoint());
    } // end toString
} // end Member
