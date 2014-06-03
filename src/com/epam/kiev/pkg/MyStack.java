/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testpkg;

import java.util.EmptyStackException;

/**
 *
 * @author Andrii_Rodionov
 * @modified by Vadym_Kuzin
 */
public class MyStack {
    private Integer[] arr;    
    private int size;
    private final int MAX_STACK_SIZE;
    
    public MyStack(){
       this(10);
    }
    
    public MyStack(int stack_size){
    	if (stack_size>0) {
    		MAX_STACK_SIZE = stack_size;
    		arr = new Integer[MAX_STACK_SIZE];
    		size=0;
    	}
    	else {
    		MAX_STACK_SIZE = 10;
    		arr = new Integer[MAX_STACK_SIZE];
    		size=0;    		
    	}
    }
    
    public void push(Integer item){
        if(size == MAX_STACK_SIZE){
            throw new IndexOutOfBoundsException();
        }
        else{
        arr[size] = item;
        size++;}       
    }  
    
    public Integer peek(){
        if(empty()){
            throw new EmptyStackException();
        }
            
        return arr[size-1];
    }
    
    public Integer pop(){
        if(empty()){
            throw new EmptyStackException();
        }
        else{
        return arr[--size];
        }
        
    }
    
    public boolean empty(){
    	if (size==0){return true;}
    	else {return false;}
    }
}
