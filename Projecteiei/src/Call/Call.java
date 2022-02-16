package Call;
import java.util.Scanner; //ดึงความสามารถของ Scanner มาใช้
import Base.Service; //ดึงข้อมูลของ Service มาเชื่อมกับ Call
import Base.FoodDriver; //ดึงข้อมูลของ FoodDriver มาเชื่อมกับ Call
import Base.SellerJob; //ดึงข้อมูลของ SellerJob มาเชื่อมกับ Call
import Base.info; //ดึงข้อมูลของ info มาเชื่อมกับ Call
// ลูกไม่สามารถสืบทอดได้ Construct method
//Construct method เป็นชื่อที Class ตรงกับ public ชื่อคลาส ใช้ในการกำหนดค่าเริ่มต้นเมือมีการประกาศ obj
public class Call { // Super Class หรือคลาสหลักของ Call
public static void main(String[] args) { // ฟังก์ชั่น Main หลักในการรันโปรแกรม

    Scanner input = new Scanner(System.in); // Scanner เพิ่มสแกนเพื่อนำมาใช้งาน
    
    //สมัครสมาชิกเพื่อเข้าสู่ระบบโปรแกรม
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();  
    System.out.println("ยินดีต้อนรับสู่โปรแกรมค้นหางานให้กับคุณ ง่ายๆเพียงแค่ทำตามขั้นตอน พร้อมได้งานเลยทันที !!!!");
    System.out.println();  
    System.out.println("                          โปรดทำการสมัครเพื่อเข้าสู่ระบบ !!                       ");
    System.out.println();  
    System.out.println("---------------------------------------------------------------------------");

    //รับค่าของ Username
    System.out.println("\n"); 
    System.out.println("โปรดตั้งชื่อของคุณ : ");
    String Username = input.next(); // รับค่าใส่ใน String Username

    //รับค่าของ Password
    System.out.println("\n");  
    System.out.println("โปรดตั้งเลขไอดีของคุณ : ");
    String Password = input.next(); // รับค่าใส่ใน String Password

    //รับค่าของ Age 
    System.out.println("\n");   
    System.out.println("หมายเหตุ : อายุต่ำกว่า 15 ไม่สามารถใช้งานโปรแกรมได้ ");
    System.out.println("โปรดกรอกอายุของคุณ : ");
    int Age = input.nextInt(); // รับค่าใส่ใน int Age

    //การเช็คค่าของ Age ว่าห้ามต่ำกว่า 15 ไม่งั้นระบบจะไม่ให้สมัคร
    if(Age < 15){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();  
        System.out.println(); 
        System.out.println("             ระบบ : ไม่สามารถใช้งานได้นอกจากคุณอายุน้อยเกินไป                    ");
        System.out.println();  
        System.out.println(); 
        System.out.println("---------------------------------------------------------------------------");
        System.exit(0); 
    }

    //ลงชื่อเข้าสู่ระบบ
    System.out.println("---------------------------------------------------------------------------");
    System.out.println();  
    System.out.println(); 
    System.out.println("                 ยินดีด้วยคุณสมัครสมาชิกเสร็จแล้ว ต่อไปคึอการเข้าสู่ระบบ                ");  
    System.out.println();  
    System.out.println(); 
    System.out.println("---------------------------------------------------------------------------");


    // รับต่าของ Name --> ที่อยู่ใน info เป็นค่าตัวแปร String ของ info
    System.out.print("กรอกชื่อของคุณ : ");
    String name = input.next();

    // รับต่าของ ID --> ที่อยู่ใน info เป็นค่าตัวแปร String ของ info
    System.out.print("กรอกไอดีของคุณ : ");
    String ID = input.next();



    //เช็คเงื่อนไขการล็อคอินการเข้าสู่่ระบบ
    

    if(Username.equals(name) && Password.equals(ID)) { // เช็คเงื่อนไขว่า Username = name , Password = ID หรือไม่ อันนี้ผ่านแล้ว
    System.out.println();
    System.out.println("คุณล็อคอินเข้าสู่ระบบสำเร็จแล้ว !!!");
    }

    else if (Username.equals(name)) { // กรณีนี้ Username ถูก แต่ไอดีผิด ให้ทำการกรอกรหัสใหม่ได้ 1 ครั้ง
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(); 
       System.out.println("ไอดีของคุณผิด โปรดกรอกใหม่อีกครั้ง!");
       System.out.println(); 
       System.out.print("กรอกชื่อของคุณ : ");
        name = input.next(); // รับค่า name อีกรอบ เพื่อเช็คกับ Username

        System.out.print("กรอกไอดีของคุณ : ");
        ID = input.next(); // รับค่า ID อีกรอบ เพื่อเช็คกับ Password
        System.out.println(); 
        System.out.println("---------------------------------------------------------------------------");

            if(Username.equals(name) && Password.equals(ID)) { // เช็คเงื่อนไขว่า Username = name , Password = ID หรือไม่ อันนี้ผ่านแล้ว
                System.out.println();
            System.out.println("คุณล็อคอินเข้าสู่ระบบสำเร็จแล้ว !!!");
            System.out.println(); 
             }
             else { // ระบบทำการปิดโปรแกรมเนื่องจาก ล็อคอินไม่ผ่าน
                System.out.println(); 
                System.out.println("กรุณาทำการสมัครใหม่อีกครั้ง ระบบได้ทำการปิดการล็อคอินของคุณเนื่องจากเข้าสู่ระบบไม่ผ่าน");
                System.exit(0); 
            }
    
    } 

    else if (Password.equals(ID)) { // กรณีนี้ Password ถูก แต่ Ussername ผิด ให้ทำการกรอกรหัสใหม่ได้ 1 ครั้ง
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(); 
        System.out.println("ชื่อของคุณผิด โปรดกรอกใหม่อีกครั้ง!");
        System.out.println(); 
        System.out.print("กรอกชื่อของคุณ : ");
        name = input.next(); // รับค่า name อีกรอบ เพื่อเช็คกับ Username

        System.out.print("กรอกไอดีของคุณ : ");
        ID = input.next(); // รับค่า ID อีกรอบ เพื่อเช็คกับ Password
        System.out.println(); 
        System.out.println("---------------------------------------------------------------------------");

            if(Username.equals(name) && Password.equals(ID)) { // เช็คเงื่อนไขว่า Username = name , Password = ID หรือไม่ อันนี้ผ่านแล้ว
                System.out.println();
            System.out.println("คุณล็อคอินเข้าสู่ระบบสำเร็จแล้ว !!!");
            System.out.println(); 
             }
             else { // ระบบทำการปิดโปรแกรมเนื่องจาก ล็อคอินไม่ผ่าน
                System.out.println(); 
                System.out.println("กรุณาทำการสมัครใหม่อีกครั้ง ระบบได้ทำการปิดการล็อคอินของคุณเนื่องจากเข้าสู่ระบบไม่ผ่าน");
                System.exit(0); 
            }


    } 
    else { // กรณีไม่พบทั้งสองเงื่อนไข เช่น ใส่ Username และ Password ไม่ถูกต้อง
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(); 
        System.out.println("ไม่พบข้อมูล โปรดกรอกใหม่อีกครั้ง");
        System.out.println(); 
        System.out.print("กรอกชื่อของคุณ : ");
        name = input.next(); // รับค่า name อีกรอบ เพื่อเช็คกับ Username

        System.out.print("กรอกไอดีของคุณ : ");
        ID = input.next(); // รับค่า ID อีกรอบ เพื่อเช็คกับ Password
        System.out.println(); 
        System.out.println("---------------------------------------------------------------------------");

            if(Username.equals(name) && Password.equals(ID)) { // เช็คเงื่อนไขว่า Username = name , Password = ID หรือไม่ อันนี้ผ่านแล้ว
                System.out.println();
            System.out.println("คุณล็อคอินเข้าสู่ระบบสำเร็จแล้ว !!!");
            System.out.println(); 
             }
             else { // ระบบทำการปิดโปรแกรมเนื่องจาก ล็อคอินไม่ผ่าน
                System.out.println(); 
                System.out.println("กรุณาทำการสมัครใหม่อีกครั้ง ระบบได้ทำการปิดการล็อคอินของคุณเนื่องจากเข้าสู่ระบบไม่ผ่าน");
                System.exit(0); 
            }
    }


    //สิ้นสุดการสมัคร และ ลงชื่อเข้าใช้







    //แสดงฟังชั่นของ displayinfo 
         //------ หน้าเมนูแสดงรายการงาน
         info if1 = new info(name,ID,Age); // constructor method ของ info ที่เก็บค่า name id age มาแล้ว
         if1.displayinfo(); // ฟังก์ชั่นนี้มาจาก Info ในการแดสงหน้าหลังจากล็อคอินสำเร็จแล้ว (แสดงค่าที่เราทำการสมัครด้วย name id age )
  
    


    //-------------------------------------------------------------------
    // obj ที่เกี่ยวกับหลังจากกรอกข้อมูลส่วนตัวลงไป 
    // create object

    System.out.println("คุณมีจุดประสงค์ต้องการหางานใช่มั้ย ??"); // ถามเพื่อใช้งานโปรแกรม
    System.out.println("ตอบ Y หรือ N : ");
    String answer = input.next(); // ระบค่าของ Answer ในการตรวจว่า จะใช้โปรแกรมต่อมั้ย

    if (answer.equals("Y")) // Y ใช้งานโปรแกรมต่อ จะแสดงข้อตวาม
        System.out.println("---------------------------------------------------------------------------\n รายการต่อไปจะเป็นช่วงเลือกงานที่ทางเราได้จัดเตรียมเอาไว้ให้คุณ \n1.บริษัทเกี่ยวกับพนักงานขาย (SellerJob) \n2.บริษัทเกี่ยวกับคนส่งอาหาร (Food Driver) \n3.บริษัทเกี่ยวกับพนักงานอำนวยความสะดวก (Service) \n4.กดยกเลิกการหางาน (Exit Program) \n\n");

    else{ // อื่นๆ จะแสดงข้อความละปิดโปรแกรมทันที
        System.out.println("ขอขอบคุณที่ให้ความสนใจ ถ้าต้องการใช้โปรแกรมมาใหม่ได้นะครับ");
        System.exit(0); }

    //-------------------------------------------------------------------
    
    System.out.print("กรุณาตอบเป็นตัวเลข :  "); // ป้อนงานที่เราสนใจ
    String Choice = input.next(); // เลือก Choine ของงาน 3 รายการ / เลือกตัวอื่นคือหยุดการทำงานโปรแกรม


    if (Choice.equals("1")) // เลือกงาน SellerJob ในส่วนนี้จะเกี่ยวกับ SellerJob ทั้งหมด
    {
            System.out.println();
            System.out.print("ตำแหน่ง : Car_Seller \n");
            System.out.print("ตำแหน่ง : Seller_Service \n");
            System.out.println();
            System.out.print("กรอกตำแหน่งที่คุณต้องการ : ");
            String Rank = input.next(); //รับค่าของ Rank เก็บใว้ (เก็บใว้ในของ SellerJob.java)

            System.out.print("กรอกเงินเดือนที่คุณต้องการ : ");
            int Salary = input.nextInt(); //รับค่าของ Salary เก็บใว้ (เก็บใว้ในของ SellerJob.java)

            SellerJob sell = new SellerJob(name, ID, Age, Rank, Salary); // constructor method ของ SellerJob
            sell.Sellerinfo(); // แสดงฟังชั่น ของ Sellerinfo (ที่อยู่ใน SellerJob.java )

            String SellYes = input.next(); //การรับค่าเพื่อที่จะยืนยันการสมัครงาน
                if (SellYes.equals("Y")) // รับงาน
                    sell.AcceptSeller(); // แสดงฟังชั่น ของ Sellerinfo อันนี้จะคือใบประจำตัวงาน คือเสร็จสิ้นแล้ว (ที่อยู่ใน SellerJob.java )
                else // กรณีอื่น
                    System.out.println("ขอขอบคุณที่ให้ความสนใจงาน พนักงานขาย"); // ไม่รับงานแล้วโปรแกรมปิดตัวทันที
                    System.exit(0);
    }

    if (Choice.equals("2")) // เลือกงาน FoodDriver ในส่วนนี้จะเกี่ยวกับ FoodDriver ทั้งหมด
    {
            System.out.println();  
            System.out.print("ตำแหน่ง : Line_Man \n");
            System.out.print("ตำแหน่ง : Food_Panda \n");
            System.out.println();
            System.out.print("กรอกตำแหน่งที่คุณต้องการ : ");
            String Rank1 = input.next(); //รับค่าของ Rank เก็บใว้ (เก็บใว้ในของ FoodDriver.java)

            System.out.print("กรอกเงินเดือนที่คุณต้องการ : ");
            int Salary1 = input.nextInt(); //รับค่าของ Salary เก็บใว้ (เก็บใว้ในของ FoodDriver.java)

            FoodDriver Food = new FoodDriver(name, ID, Age, Rank1, Salary1); // constructor method ของ FoodDriver
            Food.FoodDriverinfo(); // แสดงฟังชั่น ของ Sellerinfo (ที่อยู่ใน FoodDriver.java )

            String FoodYes = input.next(); //การรับค่าเพื่อที่จะยืนยันการสมัครงาน
                if (FoodYes.equals("Y")) // รับงาน
                    Food.AcceptFoodDriver(); // แสดงฟังชั่น ของ Sellerinfo อันนี้จะคือใบประจำตัวงาน คือเสร็จสิ้นแล้ว (ที่อยู่ใน FoodDriver.java )
                else // กรณีอื่น
                    System.out.println("ขอขอบคุณที่ให้ความสนใจงาน คนส่งอาหาร"); // ไม่รับงานแล้วโปรแกรมปิดตัวทันที
                    System.exit(0);
    }
        
    if (Choice.equals("3")) // เลือกงาน Service ในส่วนนี้จะเกี่ยวกับ Service ทั้งหมด
    {
            System.out.println();
            System.out.print("ตำแหน่ง : Service_Engineer \n");
            System.out.print("ตำแหน่ง : Service_Manager \n");
            System.out.println();
            System.out.print("กรอกตำแหน่งที่คุณต้องการ : ");
            String Rank2 = input.next(); //รับค่าของ Rank เก็บใว้ (เก็บใว้ในของ Service.java)
        
            System.out.print("กรอกเงินเดือนที่คุณต้องการ : ");
            int Salary2 = input.nextInt();  //รับค่าของ Salary เก็บใว้ (เก็บใว้ในของ Service.java)
        
            Service Serv = new Service(name, ID, Age, Rank2, Salary2); // constructor method ของ Service
            Serv.Serviceinfo(); // แสดงฟังชั่น ของ Service (ที่อยู่ใน Service.java )
        
            String ServYes = input.next(); //การรับค่าเพื่อที่จะยืนยันการสมัครงาน
                if (ServYes.equals("Y")) // รับงาน
                    Serv.AcceptService();  // แสดงฟังชั่น ของ Service อันนี้จะคือใบประจำตัวงาน คือเสร็จสิ้นแล้ว (ที่อยู่ใน Service.java )
                else // กรณีอื่น
                    System.out.println("ขอขอบคุณที่ให้ความสนใจงาน พนักงานเซอร์วิส");  // ไม่รับงานแล้วโปรแกรมปิดตัวทันที
                    System.exit(0);
    }
    else{ // กรณีเลือกช้อยอื่น
        System.out.println();
        System.out.println("ขอขอบคุณที่ให้ความสนใจ ไว้โอกาสหน้า"); //ปิดโปรแกรมทันที
        System.exit(0); }


}




} //ตัวปิด class
