package com.eaglebytes.util;

public class MathUtils {
    
    public MathUtils(){
        
    }
    
    public static float clamp(float value, float min, float max){
        return value < min ? min : value > max ? max : value;
    }
    
    public static float scale(float value, float min, float max, float newMin, float newMax){
        return value/(max-min)*(newMax-newMin);
    }
    
    public static int getMaxIndex(int[] arr){
        int temp = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
                index = i;
            }
        }
        return index;
    }
    
}
