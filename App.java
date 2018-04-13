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
public class App {
    public static void main(String[] args){
       
        List<Integer> list = new LinkdList();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        
        list.remove(100);
        
        list.travesList();
       // System.out.println(list.gethead());
        
    
    }
    
}
