/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author M.Odeh
*/


 class Node<T>{
  private T data;
  private Node NextNode=null;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return NextNode;
    }

    public void setNextNode(Node NextNode) {
        this.NextNode = NextNode;
    }
    
    
    
    
    
  
  
  
  
  
  
 }
   

