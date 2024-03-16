/*
 * Student data
 * Name
 * Phone Number
 */

package college;
import java.util.Scanner;
public class CollegeManagement {

    public static void main(String[] args){
        ScannerClass scannerclass = new ScannerClass();
        scannerclass.datas();
    }
}
class ScannerClass{
    StudentdataPojo studentdatapojo = new StudentdataPojo();
        public String data () {
            String name = studentdatapojo.getName();
            return name;
        }
        public String data1 () {
            String DOB = studentdatapojo.getDOB();
            return DOB;
        }
        public long data2 () {
            long PhNo = studentdatapojo.getPhNO();
            return PhNo;
        }
        public void datas(){
            System.out.println(data());
            System.out.println(data1());
            System.out.println(data2());
        }
}
class StudentdataPojo{
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String DOB;
    private long PhNO;
    StudentdataPojo() {
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter your date of birth: ");
        this.DOB = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        this.PhNO = scanner.nextLong();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public long getPhNO() {
        return PhNO;
    }

    public void setPhNO(long phNO) {
        PhNO = phNO;
    }
}



