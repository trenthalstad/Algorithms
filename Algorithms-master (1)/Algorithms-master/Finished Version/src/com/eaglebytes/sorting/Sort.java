package com.eaglebytes.sorting;

//sort
public interface Sort {
    
    //initialize
    public void init(int[] data);
    
    //sort
    public int[] sort(int[] data);
    
    //sortstep
    public int[] sortStep(int[] data);
    
    //gettemp
    public int getTemp();
    
    //gettempindex
    public int getTempIndex();
    
    //gettempindex2
    public int getTempIndex2();
    
}
