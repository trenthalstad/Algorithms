
package com.eaglebytes.sorting;

import com.eaglebytes.util.MathUtils;

public class PartitionSort implements Sort {
    
    public PartitionSort(){
        
    }
    
    public int temp = 0;
    
    @Override
    public void init(int[] data){
        
    }

    //sort function
    @Override
    public int[] sort(int[] data){
        int leftPtr = 1;
        int rightPtr = data.length-1;
        int tempData;
        int pivot = (MathUtils.getMax(data) + MathUtils.getMin(data))/2;
        while (leftPtr != rightPtr && leftPtr != rightPtr+1)
        {
            while (data[leftPtr] < pivot)
            {
                ++leftPtr;
            }
            while (data[rightPtr] > pivot)
            {
                --rightPtr;
            }
            tempData = data[leftPtr];
            data[leftPtr] = data[rightPtr];
            data[rightPtr] = tempData;
            
        }
        return data;
    }
        
    //sortstep make animate
    @Override
    public int[] sortStep(int[] data){
        int leftPtr = 0;
        int rightPtr = data.length-1;
        int tempData;
        int pivot = (MathUtils.getMax(data) + MathUtils.getMin(data))/2;
        while (data[leftPtr] < pivot && leftPtr != rightPtr)
        {
            ++leftPtr;
        }
        while (data[rightPtr] >= pivot && leftPtr != rightPtr)
        {
            --rightPtr;
        }
        tempData = data[rightPtr];
        data[rightPtr] = data[leftPtr];
        data[leftPtr] = tempData;
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
    
    @Override
    public int getTempIndex2(){
        return 0;
    }
}
