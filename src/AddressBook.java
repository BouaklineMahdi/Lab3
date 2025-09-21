import java.util.ArrayList;
import java.util.List;

// Comment for lab3

public class AddressBook {

    // A collection to hold BuddyInfo objects
    private ArrayList<BuddyInfo> buddies;

    // Constructor initializes the collection
    public AddressBook() {
        buddies = new ArrayList<>();
    }

    // Adds a BuddyInfo to the address book
    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    // Removes a BuddyInfo at a specific index
    public void removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            buddies.remove(index);
        }
    }

    // Example main method to test functionality
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-1234");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);
    }

}
