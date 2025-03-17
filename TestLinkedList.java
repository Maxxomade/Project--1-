import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        StateLinkedList list = new StateLinkedList();


        list.addState("California", Arrays.asList("Oregon", "Nevada", "Arizona"));
        list.addState("Texas", Arrays.asList("New Mexico", "Oklahoma", "Louisiana"));
        list.addState("Florida", Arrays.asList("Georgia", "Alabama"));
        list.addState("New York", Arrays.asList("Pennsylvania", "New Jersey", "Connecticut"));


        System.out.println("List of states and neighbors:");
        list.printStates();

 
        list.deleteState("Texas");

     
        System.out.println("\nAfter deleting Texas:");
        list.printStates();

        list.deleteState("California");
        System.out.println("\nAfter deleting California:");
        list.printStates();

        list.deleteState("Florida");
        System.out.println("\nAfter deleting Florida:");
        list.printStates();

        list.deleteState("New York");
        System.out.println("\nAfter deleting New York:");
        list.printStates();

        list.deleteState("Nonexistent State");
        System.out.println("\nAfter deleting Nonexistent State:");
        list.printStates();


        list.addState("Montana", Arrays.asList("Idaho","Wyoming","North Dakota","South Dakota"));
        System.out.println("\nAfter adding Montana to an empty List:");
        list.printStates();

    }
}
