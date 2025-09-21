public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    // Comment to show a change.
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("Homer", "Homer Street", "111-1111");
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-1234");
        System.out.println("Hello " + buddy.getName());
    }

}
