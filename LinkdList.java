/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author M.Odeh
 * @param <T>
 */
public class LinkdList<T extends Comparable<T>> implements List<T> {
    private Node<T> head=null;
    private int nodeNum=0;

  
    @Override
    public void insert(T data) {
         Node<T> newnode = null;
        if(head == null ){
           newnode = new Node(data);
           head = newnode;
           ++nodeNum;
           }else{
         insertDataAtBeginning(data);        
        }    
       }

    public void insertDataAtBeginning(T data){
     Node<T> newnode = new Node(data);
     newnode.setNextNode(head);
     head = newnode;
     ++nodeNum;
       
    }
    public void insertDataAtEnd(T data){
     Node<T> lastnode = head;
     Node<T> newNode = new Node(data); 
     while (lastnode.getNextNode() !=null){
     lastnode.setNextNode(lastnode);
     }
     lastnode.setNextNode(newNode);
     ++nodeNum;
    }
    
    @Override
    public void remove(T data) {
     Node<T> PreviousNode = null;
     Node<T> CurrentNode = head;
     
     if(CurrentNode == null ) 
       return;
     
     
      if (CurrentNode.getData().equals(data)){
            head = head.getNextNode();
            return;
        }
     if(CurrentNode.getNextNode() == null){
         System.out.println("Not found in list ");
          return;
          } 

     while (!(CurrentNode.getData().equals(data)) &&
            !(CurrentNode.getNextNode() == null )){
      PreviousNode = CurrentNode;
      CurrentNode = CurrentNode.getNextNode();
     }
     
     if(CurrentNode.getData().equals(data)){
        PreviousNode.setNextNode(CurrentNode.getNextNode());
        CurrentNode.setNextNode(null);
        
        --nodeNum;
    }else{
     
     }
     
    }

    @Override
    public void travesList() {
     Node node = head;
     if (head  == null) return;
     while(node.getNextNode() != null){
      System.out.print(node.getData()+" -> ");
      node = node.getNextNode();
     }
     System.out.print(node.getData()+"  ");
     
     System.out.println("  ");
    }
    public T gethead(){
     return  head.getData();
    }

    @Override
    public int size() {
      return nodeNum; 
    }
    
    
    
}
