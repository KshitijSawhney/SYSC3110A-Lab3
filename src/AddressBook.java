//Kshitij Sawhney Lab 3 (2/10/20)

import java.util.*;
public class AddressBook {
    private ArrayList<BuddyInfo> book;

    public AddressBook() {
        this.book = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy!=null){
            this.book.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index>=0 && index < book.size()) {
            return this.book.remove(index);
        }
        else return null;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        BuddyInfo buddy = new BuddyInfo("Carlos", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }
}
