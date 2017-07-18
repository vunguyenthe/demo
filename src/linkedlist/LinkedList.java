package exercise.demo.linkedlist;

public class LinkedList {
	Node pHead; // Head is the first element in a list
	Node pTail; // Tail is the last element in a list

	/**
     * Check whether a linked list is empty or not 
     *
     * @param list
     *            LinkedList
     * @return True: link list is empty, False: link list is not empty
     */
	
	boolean isLinkedListEmpty(LinkedList list)
	{
	    if (list.pHead == null)
	    {
	        return true;
	    }
	    return false;
	}
	/**
	 * visit all of elements in a list and print out
	 *
	 */	
	void viewLinkedList(LinkedList list)
	{
	    Node pNode;
	    if (isLinkedListEmpty(list))
	    {
	       System.out.println("Double link list is empty");
	    }
	    else
	    {
	        pNode = list.pHead;
	        while (pNode != null)
	        {
	        	System.out.printf("%d ", pNode.data);
	            pNode = pNode.pNext;
	        }
	    }
	}
	/**
	 * Build a new node
	 *
	 * @param data
	 * return a new node that is initialized
	 */
	Node newNode(int data)
	{
	    Node pNode = new Node();
	    pNode.data = data;
	    pNode.pPrev = pNode.pNext = null;
	    return pNode;
	}
	/**
	 * Insert a element at head of the list 
	 *
	 * @param list
	 * 			LinkedList
	 * @param node a new node that will be inserted
	 * 			Node	 
	 * return true is ok, otherwise return false 
	 */	
	boolean insertHead(LinkedList list, Node node)
	{
	    if (node == null)
	    {
	        return false;
	    }
	    if (list.pHead == null)
	    {
	        list.pHead = list.pTail = node;
	    }
	    else
	    {
	        list.pHead.pPrev = node;
	        node.pNext = list.pHead;
	        list.pHead = node;
	    }
	    return true;
	}	
	/**
	 * Insert a element at head of the list 
	 *
	 * @param list
	 * 			LinkedList
	 * @param node a new node that will be inserted
	 * 			Node	 
	 * return true is ok, otherwise return false 
	 */		
	boolean insertTail(LinkedList list, Node node)
	{
	    if (node == null)
	    {
	        return false;
	    }
	    if (list.pHead == null)
	    {
	        list.pHead = list.pTail = node;
	    }
	    else
	    {
	        list.pTail.pNext = node;
	        node.pPrev = list.pTail;
	        list.pTail = node;
	    }
	    return true;
	}	
	/**
	 * Delete a element at head of the list 
	 *
	 */	
	
	void delHead(LinkedList list)
	{
	    Node pNode;
	    pNode = list.pHead;
        if (list.pHead == list.pTail)
        {
            list.pHead = list.pTail = null;
        }
        else
        {
            list.pHead.pNext.pPrev = null;
            list.pHead = list.pHead.pNext;
        } 
	}
	/**
	 * Delete a element at last of the list 
	 *
	 */	
	void delTail(LinkedList list)
	{
	    Node pNode;
	    pNode = list.pTail;
        if (list.pHead == list.pTail)
        {
            list.pHead = list.pTail = null;
        }
        else
        {
            list.pTail.pPrev.pNext = null;
            list.pTail = list.pTail.pPrev;
        }
	}	
	boolean delAfter (LinkedList l, Node q )
	{
		if (q != null && q.pNext != null) {
			Node p = q.pNext;
			q.pNext = p.pNext;
			if (p == l.pTail)
			{
				l.pTail = q;
			}
			p = null;
			return true;
		} else
		{
			return false;
		}	
	}	
	/**
	 * Delete all of elements in node that greater than a target value
	 *
	 */	
	void DeleteElementByTargetValue(LinkedList list, int targetValue)
	{
	    Node pNode;
	    if (isLinkedListEmpty(list))
	    {
	       System.out.println("Double link list is empty");
	    }
	    else
	    {
	        pNode = list.pHead;
	        while (pNode != null)
	        {
	        	if(pNode.data > targetValue) 
	        	{
	        		deleteSpecificNode(pNode.data, list);
	        	}	
	        	pNode = pNode.pNext;
	        }
	    }
	}	
	/**
	 * Delete a node by a target value
	 *
	 */		
	public void deleteSpecificNode (int targetValue, LinkedList list)
	{   
		Node p = list.pHead;
		Node q = null;
		while (p != null) {
			if (p.data == targetValue)
				break;
			q = p;
			p = p.pNext;
		}
		if (p == null) {
			return;
		} else if (q == null) {
			delHead(list);
		} else {
			delAfter(list, q);
		}
	}	
	/**
	 * Clear all of elements in list
	 *
	 */
	void delList(LinkedList list)
	{
	    while(!isLinkedListEmpty(list))
	    {
	        delHead(list);
	    }
	}
}