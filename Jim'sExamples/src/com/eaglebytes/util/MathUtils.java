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
    
    public static int getMin(int[] arr){
        int temp = Integer.MAX_VALUE;
        for(int i : arr)
            if(temp > i)
                temp = i;
        return temp;
    }
    
    public static int getMax(int[] arr){
        int temp = 0;
        for(int i : arr)
            if(temp < i)
                temp = i;
        return temp;
    }
    
    public static int getMaxIndex(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[temp] < arr[i])
                temp = i;
        return temp;
    }
        
    public static int getIntFromColor(int red, int green, int blue){
        return (0xFF000000 | (red << 16) & 0x00FF0000) | ((green << 8) & 0x0000FF00) | (blue & 0x000000FF);
    }
    
}
