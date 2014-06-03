/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.kiev.pkg;

import java.util.EmptyStackException;

/**
 *
 * @author Andrii_Rodionov
 */
public class MyStack {
    private Integer[] arr;    
    private int size;
    private final int MAX_STACK_SIZE;
    
    public MyStack(){
       this(10);
    }
    
    public MyStack(int stack_size){
        MAX_STACK_SIZE = stack_size;
        arr = new Integer[MAX_STACK_SIZE];
        
    }
    
    public Integer push(Integer item){
        if(size == MAX_STACK_SIZE){
            throw new IndexOutOfBoundsException();
        }
        
        arr[size++] = item;
        return item;
    }  
    
    public Integer peek(){
        if(empty()){
            throw new EmptyStackException();
        }
            
        return arr[size];
    }
    
    public Integer pop(){
        if(empty()){
            throw new EmptyStackException();
        }
        return arr[size--];
    }
    
    public boolean empty(){
        return (size == 0);
    }
}
