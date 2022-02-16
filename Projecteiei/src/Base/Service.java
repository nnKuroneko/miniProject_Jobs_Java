package Base; //อยู่ในโฟลเดอร์ Base
public class Service extends info{ // Sup Classs หลักที่ extends กับ info
    private String Rank2; // ค่าของตำแหน่งของ Service
    private int Salary2; // ค่าของเงินเดือนของ Service

public Service(String newName , String newID , int newAge , String newRank2 , int newSalary2){     // Construct method ของ Service ที่มีการประกาศค่า
    super(newName, newID, newAge); // กรณีใช้ Super เพราะ extends จาก info มาใช้ 
    this.Rank2 = newRank2; // ตัวชี้ค่าของ Rank
    this.Salary2 = newSalary2; //ตัวชี้ค่าของ Salary
}


//Get and Set ของ Rank
public String getRank2(){ //getter ของ rank     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้

    return Rank2; //รับ return ค่า
}
public void setName(String Rank2){  // setter ของ rank

    this.Rank2 = Rank2; // กำหนดค่า
}
//---------------------------------

//Get and Set ของ Salary
public int getSalary2(){ //getter ของ Salary     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้

    return Salary2; //รับ return ค่า
}
public void setSalary2(int Salary2){ // setter ของ Salary

    this.Salary2 = Salary2; // กำหนดค่า
}
//---------------------------------


public void Serviceinfo(){ //ฟังชั่นก์ Serviceinfo ทำหน้าทีแสดงข้อมูล
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
    System.out.println("ตำแหน่งที่คุณต้องการ : "+ this.Rank2 );
    System.out.println("เงินเดือนที่คุณต้องการ : "+ this.Salary2);
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();
    System.out.println(" คุณตกลงที่จะรับข้อเสนอหรือไม่ ตอบ Y หรือ N :  ");

}

public void AcceptService(){ //ฟังชั่นก์ AcceptService ทำหน้าทีแสดงข้อมูล
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
    System.out.println("ตำแหน่ง : " + this.Rank2 );
    System.out.println("เงินเดือน : " + this.Salary2 );
    System.out.println();
    System.out.println("---------------------------------------------------------------------------");
}










}



