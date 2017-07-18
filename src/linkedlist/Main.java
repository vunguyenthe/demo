package exercise.demo.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Node node = linkedList.newNode(10);
		linkedList.insertHead(linkedList, node);
		node = linkedList.newNode(16);
		linkedList.insertHead(linkedList, node);
		node = linkedList.newNode(17);
		linkedList.insertTail(linkedList, node);
		node = linkedList.newNode(19);
		linkedList.insertTail(linkedList, node);
		linkedList.DeleteElementByTargetValue(linkedList, 18);
		linkedList.viewLinkedList(linkedList);
		//linkedList.deleteSpecificNode(17, linkedList); 
		//linkedList.viewLinkedList(linkedList);
	}

}
