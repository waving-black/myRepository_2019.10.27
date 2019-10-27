package com.waving;

import java.util.Optional;

/**
 * @Author waving
 * @Date 2019/10/27
 */
public class myTest1 {
    public static void main(String[] args) {
        String str = "good night!";
        System.out.println("I will work tomorrow!");
        System.out.println("good luck!");
        Optional.ofNullable(str).orElse("").length();
    }
    
    public void method(){
        
    }
}
