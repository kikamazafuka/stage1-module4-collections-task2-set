package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : sourceList){
            if (num%2==0){
                while (num>0){
                    set.add(num);
                    num/=2;
                }
            }else {
                set.add(num);
                set.add(num*2);
            }
        }
        return set;
    }
}
