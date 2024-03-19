import java.util.HashMap;
import java.util.Map;

public class PhonebookManager {
    private ListNode head;
    private Map<Integer, ListNode> contactMap;
    private int contactCount;

    public PhonebookManager() {
        head = null;  // Initialize the head of the linked list to null
        contactMap = new HashMap<>();  // Initialize a HashMap to store contacts
        contactCount = 0;  
    }

    public void addEntry(String firstName, String lastName, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        if (head == null) {  // If the list is empty, make the new node the head
            head = newNode;
        } else {
            // Traverse the list to find the last node and append the new node
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        contactMap.put(++contactCount, newNode);  // Add the new contact to the map with a unique key
    }

    public void deleteEntry(int contactNumber) {
        ListNode nodeToDelete = contactMap.get(contactNumber);
        if (nodeToDelete == null) {
            System.out.println("Contact with number " + contactNumber + " not found.");
            return;
        }

        if (nodeToDelete == head) {
            head = head.next;  
        } else {
            // Traverse the list to find the node before the one to delete and adjust pointers
            ListNode current = head;
            while (current.next != nodeToDelete) {
                current = current.next;
            }
            current.next = nodeToDelete.next;
        }

        contactMap.remove(contactNumber);  // Remove the contact from the map
        System.out.println("Contact with number " + contactNumber + " deleted.");
    }

    public void viewContacts() {
        if (head == null) {
            System.out.println("Phonebook is empty.");
            return;
        }

        System.out.println("Contacts:");
        ListNode current = head;
        int contactNumber = 1;
        // print the details of each contact
        while (current != null) {
            System.out.println(contactNumber + ". Name: " + current.firstName + " " + current.lastName);
            System.out.println("   Address: " + current.address + ", " + current.city);
            System.out.println("   Phone Number: " + current.phoneNumber);
            System.out.println("-----------------------------");
            contactMap.put(contactNumber, current);  // Update the contact map with the current contact
            current = current.next;
            contactNumber++;
        }
    }

public void editName(int contactNumber, String newFirstName, String newLastName) {
    ListNode contact = contactMap.get(contactNumber);
    if (contact == null) {
        System.out.println("Contact with number " + contactNumber + " not found.");
        return;
    }
    contact.firstName = newFirstName;
    contact.lastName = newLastName;
    System.out.println("Name updated for contact " + contactNumber);
}

public void editAddress(int contactNumber, String newAddress, String newCity) {
    ListNode contact = contactMap.get(contactNumber);
    if (contact == null) {
        System.out.println("Contact with number " + contactNumber + " not found.");
        return;
    }
    contact.address = newAddress;
    contact.city = newCity;
    System.out.println("Address updated for contact " + contactNumber);
}

public void editPhoneNumber(int contactNumber, String newPhoneNumber) {
    ListNode contact = contactMap.get(contactNumber);
    if (contact == null) {
        System.out.println("Contact with number " + contactNumber + " not found.");
        return;
    }
    contact.phoneNumber = newPhoneNumber;
    System.out.println("Phone number updated for contact " + contactNumber);
}

    
}
