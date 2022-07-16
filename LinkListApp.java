
import java.util.*;
class Link
{
	int iData;
	double dData;
	Link next;
	Link prv;
	
	Link(int id,double dd)
	{
		iData =id;
		dData=dd;
		
	}
	void displayLink()
	{
		System.out.println("["+iData+","+dData+"]");
	}
	
	
	
	
	
	
}

class LinkList
{
	Link first;
	
	ArrayList<Link> link1 = new ArrayList<>();
	ArrayList<Link> link2 = new ArrayList<>();
	
	LinkList()
	{
		first=null;
	}
	void insertFirst(int id,double dd)
	{
		Link newLink = new Link(id,dd);
		link1.add(newLink);
		newLink.next=first;
		first=newLink;
	}
	
	void displayList()
	{
		System.out.println("List(first-->Last):");
		Link current = first; 
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
		
	}
	void displayReverseList()
	{
		for(Link li:link1)
		{
			link2.add(li);
		}
		
		for(Link li2:link2)
		{
			li2.displayLink();
		}
		
		
		
	}
	
}
	
	class LinkListApp
{
	public static void main(String [] args)
	{
		LinkList theList= new LinkList();
		theList.insertFirst(22,2.99);
		theList.insertFirst(33,3.99);
		theList.insertFirst(44,4.99);
		theList.insertFirst(55,5.99);
		
		//theList.displayList();
		theList.displayReverseList();
		
	}
}

