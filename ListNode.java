public class ListNode {
    String firstName;
    String lastName;
    String address;
    String city;
    String phoneNumber;
    ListNode next;

    // Constructor to initialize the contact details
    public ListNode(String firstName, String lastName, String address, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
