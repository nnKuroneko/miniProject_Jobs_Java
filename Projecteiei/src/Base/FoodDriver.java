package Base;//อยู่ในโฟลเดอร์ Base
public class FoodDriver extends info{  // Super Classs หลักที่ extends กับ info
    private String Rank1; // ค่าของตำแหน่งของ Service
    private int Salary1; // ค่าของเงินเดือนของ Service

public FoodDriver(String newName , String newID , int newAge , String newRank1 , int newSalary1){ // Construct method ของ Service ที่มีการประกาศค่า
    super(newName, newID, newAge);   // กรณีใช้ Super เพราะ extends จาก info มาใช้ 
    this.Rank1 = newRank1; // ตัวชี้ค่าของ Rank
    this.Salary1 = newSalary1; //ตัวชี้ค่าของ Salary
}


//Get and Set ของ Rank
public String getRank1(){ //getter ของ rank     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return Rank1; //รับ return ค่า
}
public void setName(String Rank1){ // setter ของ rank
    this.Rank1 = Rank1; // กำหนดค่า
}
//---------------------------------

//Get and Set ของ Salary
public int getSalary1(){ //getter ของ rank     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return Salary1; //รับ return ค่า
}

public void setSalary1(int Salary1){ // setter ของ rank
    this.Salary1 = Salary1; // กำหนดค่า
}
//---------------------------------


public void FoodDriverinfo(){ //ฟังชั่นก์ FoodDriverinfo ทำหน้าทีแสดงข้อมูล
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("ยินดีต้อนรับคุณ  " + super.getName() + "  ได้เข้าสู่รายการหางานออนไลน์เรียบร้อยแล้ว");
    System.out.println("                              ข้อมูลส่วนตัวทั่วไป                                 ");
    System.out.println("คุณ : " + super.getName() );
    System.out.println("ไอดี : " + super.getID());
    System.out.println("อายุ : " + super.getAge());
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println();
    System.out.println("ขอขอบคุณที่คุณเลือกงาน คนส่งอาหาร นี่คือข้อเสนอที่คุณจะได้รับเมื่อเข้าทำงาน");
    System.out.println();
    System.out.println("ตำแหน่งที่คุณต้องการ : "+ this.Rank1 );
    System.out.println("เงินเดือนที่คุณต้องการ : "+ this.Salary1);
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println(" คุณตกลงที่จะรับข้อเสนอหรือไม่ ตอบ Y หรือ N :  ");

}

public void AcceptFoodDriver(){ //ฟังชั่นก์ FoodDriverinfo ทำหน้าทีแสดงข้อมูล
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println();
    System.out.println("                      ยินดีด้วยคุณได้เป็นส่วนนึงของบริษัทเราแล้ว                      ");
    System.out.println();
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println("บัตรประจำตัวของคุณ  " + super.getName() );
    System.out.println("                              ข้อมูลส่วนตัวทั่วไป                                 ");
    System.out.println("คุณ : " + super.getName() );
    System.out.println("ไอดี : " + super.getID());
    System.out.println("อายุ : " + super.getAge());
    System.out.println("ตำแหน่ง : " + this.Rank1 );
    System.out.println("เงินเดือน : " + this.Salary1 );
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
}










}



