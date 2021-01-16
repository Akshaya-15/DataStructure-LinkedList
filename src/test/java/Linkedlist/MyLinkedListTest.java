package Linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	 @Test
	    public void given3NumbersWhenAddedToLinkedListShouldAddedToTop() {
	        INode<Integer> myFirstNode = new INode<>(70);
	        INode<Integer> MySecondNode =new INode<>(30);
	        INode<Integer> myThirdNode = new INode<>(56);
	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.add(myFirstNode);
	        myLinkedList.add(MySecondNode);
	        myLinkedList.add(myThirdNode);

	        boolean result = myLinkedList.head.equals(myThirdNode) &&
	                myLinkedList.head.getNext().equals(MySecondNode) &&
	                myLinkedList.tail.equals(myFirstNode);
	        Assert.assertTrue(result);

	    }
	}

