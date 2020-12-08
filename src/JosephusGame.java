import java.util.*;
public class JosephusGame
{   
    private Node head = null;
    private Node tail = null;

    public JosephusGame()
    {           
    }


    public void addNode(int value) 
    {
        Node newNode = new Node(value);
   
        if (head == null) head = newNode; 
        else tail.nextNode = newNode;
   
        tail = newNode;
        tail.nextNode = head;
    }

    public void deleteNode(int valueToDelete) 
    {
        Node currentNode = head;
      
        if (head != null) 
        {
            if (currentNode.value == valueToDelete) 
            {
                head = head.nextNode;
                tail.nextNode = head;                
            } 
            else 
            {
                do 
                {
                    Node nextNode = currentNode.nextNode;

                    if (nextNode.value == valueToDelete) 
                    {
                        if(nextNode.value == tail.value)
                        {
                            tail=currentNode;
                            tail.nextNode = head;

                        } 
                        currentNode.nextNode = nextNode.nextNode;
                        break;
                    }
                    currentNode = currentNode.nextNode;
                } 
                while (currentNode != head);
            }
        }
    }

    

    public void showNthPerson(int eachNode) 
    {
        Node currentNode = tail;       

        if (head != null) 
        {
            while(true) 
            {
                for (int j = 0; j < eachNode; j++) currentNode = currentNode.nextNode;     

                System.out.println("     _,_______");
                System.out.println("    / _==_____() o  o  o   " +currentNode.value);
                System.out.println("   /##(_)-'");
                System.out.println("  /##/");
                System.out.println("  '''");
                
                deleteNode(currentNode.value);

                if(currentNode.value == currentNode.nextNode.value) break;
            }    
        }
        System.out.println("**************************************************");
        System.out.println("               Last Man Standing: " + head.value);
        System.out.println("**************************************************");
    }

}

class Node 
{
    int value;
    Node nextNode;

    public Node(int value) 
    {
        this.value = value;
    }
}





 