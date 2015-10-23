package com.eaglebytes.util;

public class MathUtils {
    
    public MathUtils(){
        
    }
    
    public static float clamp(float value, float min, float max){
        return value < min ? min : value > max ? max : value;
    }
    
    public static float scale(float value, float min, float max, float newMin, float newMax){
        return value/(max-min)*(newMax-newMix);
    }
    
}
