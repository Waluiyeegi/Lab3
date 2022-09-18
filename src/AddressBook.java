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

        BuddyInfo joe = new BuddyInfo("Joe", "123 Maple Street", 12345678);
        BuddyInfo bob = new BuddyInfo("Bob", "131 Maple Street", 12359049);
        AddressBook book = new AddressBook();
        System.out.println("The Address Book currently has " + book.getListSize() + " items.");
        book.addBuddy(joe);
        System.out.println("The Address Book currently has " + book.getListSize() + " items.");
        book.addBuddy(bob);
        System.out.println("The Address Book currently has " + book.getListSize() + " items.");
        book.removeBuddy(joe);
        System.out.println("The Address Book currently has " + book.getListSize() + " items.");
        book.removeBuddy(bob);
        System.out.println("The Address Book currently has " + book.getListSize() + " items.");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
