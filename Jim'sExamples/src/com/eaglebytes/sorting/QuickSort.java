//Seth is the best tho!
package com.eaglebytes.sorting;

public class QuickSort implements Sort{

    public QuickSort(){
        
    }
    
    public int temp = 0;
    
    @Override
    public void init(int[] data){
        left = 0;
        right = data.length-1;
        iterations = right-left;
    }
    
    public int theArray[];
    private int nElems;
    
     public void quickSort() {
         iterations--;
        recQuickSort(0, nElems - 1);
        
    }
    
     private int iterations = 0;
     
    public void recQuickSort(int left, int right) {
        System.out.println(iterations);
        if (right - left <= iterations) // if size <= 1,
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
    
    private int left, right;
    
    @Override
    public int[] sortStep(int[] data){
        
        long pivot = theArray[right];      // rightmost item
        // partition range
        int partition = partitionIt(left, right, pivot);
        
        
        
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
