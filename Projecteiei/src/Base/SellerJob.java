package Base; //อยู่ในโฟลเดอร์ Base
public class SellerJob extends info{ // Sup Classs หลักที่ extends กับ info
    private String Rank;   // ค่าของตำแหน่งของ SellerJob
    private int Salary;  // ค่าของเงินเดือนของ SellerJob

public SellerJob(String newName , String newID , int newAge , String newRank , int newSalary){ // Construct method ของ SellerJob ที่มีการประกาศค่า
    super(newName, newID, newAge); // กรณีใช้ Super เพราะ extends จาก info มาใช้ 
    this.Rank = newRank; // ตัวชี้ค่าของ Rank
    this.Salary = newSalary; //ตัวชี้ค่าของ Salary
}


//Get and Set ของ Rank
public String getRank(){ //getter ของ rank     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return Rank; //รับ return ค่า
}
public void setName(String Rank){ // setter ของ rank
    this.Rank = Rank; // กำหนดค่า
}
//---------------------------------

//Get and Set ของ Salary
public int getSalary(){ //getter ของ Salary     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return Salary; //รับ return ค่า
}
public void setSalary(int Salary){ // setter ของ rank
    this.Salary = Salary; // กำหนดค่า
}
//---------------------------------


public void Sellerinfo(){ //ฟังชั่นก์ Sellerinfo ทำหน้าทีแสดงข้อมูล
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("ยินดีต้อนรับคุณ  " + super.getName() + "  ได้เข้าสู่รายการหางานออนไลน์เรียบร้อยแล้ว");
    System.out.println("                              ข้อมูลส่วนตัวทั่วไป                                 ");
    System.out.println("คุณ : " + super.getName() );
    System.out.println("ไอดี : " + super.getID());
    System.out.println("อายุ : " + super.getAge());
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println();
    System.out.println("ขอขอบคุณที่คุณเลือกงาน พนักงานขาย นี่คือข้อเสนอที่คุณจะได้รับเมื่อเข้าทำงาน");
    System.out.println();
    System.out.println("ตำแหน่งที่คุณต้องการ : "+ this.Rank );
    System.out.println("เงินเดือนที่คุณต้องการ : "+ this.Salary);
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println(" คุณตกลงที่จะรับข้อเสนอหรือไม่ ตอบ Y หรือ N :  ");

}

public void AcceptSeller(){ //ฟังชั่นก์ AcceptSeller ทำหน้าทีแสดงข้อมูล
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
    System.out.println("ตำแหน่ง : " + this.Rank );
    System.out.println("เงินเดือน : " + this.Salary );
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
}










}



