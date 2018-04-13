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
public interface List<T extends Comparable<T>> {
    public void insert(T data);
    public void remove(T data);
    public void travesList();
    public int size();
    public T gethead();
}
