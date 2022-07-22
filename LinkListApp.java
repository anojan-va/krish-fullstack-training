
import java.util.*;
class Link
{
	int iData;
	
	Link next;
	Link prv;
	
	Link(int id)
	{
		iData =id;
		
		
	}
	void displayLink()
	{
		System.out.println("["+iData+"]");
	}
	
}

class LinkList
{
	Link first;
	
	ArrayList<Integer> link1 = new ArrayList<>();
	ArrayList<Integer> link2 = new ArrayList<>();
	
	LinkList()
	{
		first=null;
	}
	void insertFirst(int id)
	{
		Link newLink = new Link(id);
		link1.add(newLink.iData);
		newLink.next=first;
		first=newLink;
	}
	
	void displayList()
	{
		System.out.println("List(first-->Last):");
		Link current = first; 
		while(current!=null)
		{
			link2.add(current.iData);
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
		
	}
	
	void check()
	{
		System.out.println("is the Linklist Palindrome?");
		System.out.println(link1.equals(link2));
	
		
	}

	
}
	
	class LinkListApp
{
	public static void main(String [] args)
	{
		LinkList theList= new LinkList();
		theList.insertFirst(22);
		theList.insertFirst(21);
		theList.insertFirst(30);
		theList.insertFirst(21);
		theList.insertFirst(22);
		
		
		theList.displayList();
		theList.check();

	}
}

