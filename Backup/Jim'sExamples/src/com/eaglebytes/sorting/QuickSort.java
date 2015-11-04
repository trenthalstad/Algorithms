//Seth is the best tho!
package com.eaglebytes.sorting;

public class QuickSort implements Sort{

    public QuickSort(){
        
    }
    
    public int temp = 0;
    
    @Override
    public void init(int[] data){
        
    }
    
    public int theArray[];
    private int nElems;
    
     public void quickSort() {
        recQuickSort(0, nElems - 1);
    }
    
    public void recQuickSort(int left, int right) {
        if (right - left <= 0) // if size <= 1,
        {
            return;                      //    already sorted
        } else // size is 2 or larger
        {
            System.out.println("quiiick");
            long pivot = theArray[right];      // rightmost item
            // partition range
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);   // sort left side
            recQuickSort(partition + 1, right);  // sort right side
        }
    }
    
    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;           // left    (after ++)
        int rightPtr = right;           // right-1 (after --)
        while (true) {                            // find bigger item
            while (theArray[++leftPtr] < pivot)
             ;  // (nop)
            // find smaller item
            while (rightPtr > 0 && theArray[--rightPtr] > pivot)
             ;  // (nop)

            if (leftPtr >= rightPtr) // if pointers cross,
            {
                break;                    //    partition done
            } else // not crossed, so
            {
                swap(leftPtr, rightPtr);  //    swap elements
            }
        }  // end while(true)
        swap(leftPtr, right);           // restore pivot
        return leftPtr;                 // return pivot location
    } 
    
    public void swap(int dex1, int dex2) // swap two elements
    {
        temp = theArray[dex1]; 
        System.out.println(temp);// A into temp
        theArray[dex1] = theArray[dex2];   // B into A
        theArray[dex2] = temp;             // temp into B
    }

    @Override
    public int[] sort(int[] data){
        theArray = data;
        nElems = theArray.length;
        quickSort();
        return theArray;
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
