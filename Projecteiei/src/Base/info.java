package Base; // อยู่โฟลเดอร์เกี่ยวกับ Base 

public class info { // Super Class //คลาสแม่มีคุ๊สมมัติที่ใช้ร่วมกับ คลาสลูกได้
    private String name; // ประกาศค่าตัวแปลของ Name เป็น String
    private String ID; // ประกาศค่าตัวแปลของ ID เป็น String
    private int Age; // ประกาศค่าตัวแปลของ Age เป็น Int

public info(String newName , String newID , int newAge){ // Construct method ของ info ที่มีการประกาศค่า
    this.name = newName;  //ตัวชี้ค่าของ name
    this.ID = newID;  //ตัวชี้ค่าของ ID
    this.Age = newAge; //ตัวชี้ค่าของ Age
}

 //เป็น private ใช้ get set ในการเข้าถึง
//Get and Set ของ Name
public String getName(){ //getter ของ Name     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return name; //รับ return ค่า
}
public void setName(String name){ // setter ของ rank
    this.name = name; //รับ return ค่า
}
//---------------------------------

//Get and Set ของ ID
public String getID(){ //getter ของ ID     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return ID; //รับ return ค่า
}
public void setID(String ID){ // setter ของ rank
    this.ID = ID; //รับ return ค่า
} 
//---------------------------------

//Get and Set ของ Age
public int getAge(){ //getter ของ Age     // getter method สามารถเข้าถึงหรือดึงตัวแปรมาใช้ได้
    return Age;  //รับ return ค่า
}
public void setID(int Age){ // setter ของ rank
    this.Age = Age; //รับ return ค่า
}
//---------------------------------

public void displayinfo(){ //ฟังชั่นก์ displayinfo ทำหน้าทีแสดงข้อมูล
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("ยินดีต้อนรับคุณ  " + this.name + "  ได้เข้าสู่รายการหางานออนไลน์เรียบร้อยแล้ว");
    System.out.println("                              ข้อมูลส่วนตัวทั่วไป                                 ");
    System.out.println("คุณ : " + this.name );
    System.out.println("ไอดี : " + this.ID);
    System.out.println("อายุ : " + this.Age);
    System.out.println("---------------------------------------------------------------------------");

}




//public void Myinfo() {
//    info if1 = new info(name,ID,Age);
//    System.out.printf("Your name : %c",if1.getName() );
//    System.out.printf("Your ID : %c",if1.getID() );
//    System.out.printf("Your Age : %c",if1.getAge() );
//}








}
