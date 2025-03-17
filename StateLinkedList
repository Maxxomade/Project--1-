import java.util.List;

public class StateLinkedList {
    private Node head;

    public StateLinkedList() {
        head = null;
    }

    // Method to add a new state and its neighbors at the end of the list
    public void addState(String stateName, List<String> neighbors) {
        Node newNode = new Node(stateName, neighbors);
        if (head == null) {
            // Set head to newNode
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                // Traverse the list
                current = current.next;
            }
            // Set current.next to newNode
            current.next = newNode;
        }
    }

    // Method to delete a state by its name
    public void deleteState(String stateName) {
        if (head == null) {
            return; // List is empty
        }
        if (head.stateName.equals(stateName)) {
            // Update head to head.next
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.stateName.equals(stateName)) {
                // Remove the node by linking current.next to current.next.next
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Method to print all states and their neighbors
    public void printStates() {
        Node current = head;
        while (current != null) {
            System.out.println("State: " + current.stateName + ", Neighbors: " + current.neighbors);
            // Move to the next node
            current = current.next;
        }
    }

    //Main method for testing.
    public static void main(String[] args) {
        StateLinkedList stateList = new StateLinkedList();
        List<String> neighbors1 = List.of("StateB", "StateC");
        List<String> neighbors2 = List.of("StateA", "StateD");
        List<String> neighbors3 = List.of("StateA");
        List<String> neighbors4 = List.of("StateB");

        stateList.addState("StateA", neighbors1);
        stateList.addState("StateB", neighbors2);
        stateList.addState("StateC", neighbors3);
        stateList.addState("StateD", neighbors4);

        System.out.println("States after adding:");
        stateList.printStates();

        stateList.deleteState("StateB");

        System.out.println("\nStates after deleting StateB:");
        stateList.printStates();

        stateList.deleteState("StateA");

        System.out.println("\nStates after deleting StateA:");
        stateList.printStates();

        stateList.deleteState("StateC");
        System.out.println("\nStates after deleting StateC:");
        stateList.printStates();

        stateList.deleteState("StateD");
        System.out.println("\nStates after deleting StateD:");
        stateList.printStates();

    }
}
