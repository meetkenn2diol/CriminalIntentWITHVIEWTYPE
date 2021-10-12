package com.bignerdbranch.android.criminalintent;

public class ClassA {
    void aMethod(ClassA a){
        ClassB b=(ClassB)a;
    }
}
class ClassB extends ClassA{
    void bMethod(int num){
        switch (num){
            case 1:System.out.println("1");
            break;
            case 2:System.out.println("2");
            break;
            default:
        }
    }
}

