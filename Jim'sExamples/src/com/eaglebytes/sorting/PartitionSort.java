
package com.eaglebytes.sorting;

public class PartitionSort implements Sort {
    
    public PartitionSort(){
        
    }
    
    public int temp = 0;
    
    @Override
    public void init(int[] data){
        
    }

    @Override
    public int[] sort(int[] data){
        return data;
    }
    
    @Override
    public int[] sortStep(int[] data){
        return data;
    }
    
    @Override
    public int getTemp(){
        return temp;
    }
    
    @Override
    public int getTempIndex(){
        return 0;
    }
}
