import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> list;

    public AddressBook() {
        this.list = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        list.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        int index = list.indexOf(buddy);
        if (index != -1) {
            list.remove(index);
        }
    }

    public int getListSize() {
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println("AddressBook test");
    }

}
