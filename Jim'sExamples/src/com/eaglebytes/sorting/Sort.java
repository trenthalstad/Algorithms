package com.eaglebytes.sorting;

public interface Sort {
    
    public void init(int[] data);
    
    public int[] sort(int[] data);
    
    public int[] sortStep(int[] data);
    
    public int getTemp();
    
    public int getTempIndex();
    
}
