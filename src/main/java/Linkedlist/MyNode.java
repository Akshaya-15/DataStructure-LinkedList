package Linkedlist;

public class MyNode<K>implements INode {
	
	    private K key;
	    private INode next;

	    public void INode(K key) {
	        this.key = key;
	        this.next = null;
	    }

	    public INode getNext() {
	        return next;
	    }

	    public void setNext(INode next) {
	        this.next = next;
	    }

	    public K getKey() {
	        return key;
	    }

	    public void setkey(K key) {
	        this.key = key;
	    }
	}


