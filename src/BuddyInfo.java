import java.util.ArrayList;

public class BuddyInfo {

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    private String name;
    private String address;
    private int phoneNumber;


    public static void main(String[] args) {
        BuddyInfo joe = new BuddyInfo("Joe", "123 Maple Street", 12345678);
        System.out.println("Hiii " + joe.getName() + " who lives on " + joe.getAddress() + " and whose phone number is " + joe.getPhoneNumber() + ".");

    }
}





