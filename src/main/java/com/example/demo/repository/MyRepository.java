package com.example.demo.repository;

import module.Index;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MyRepository {
    List<Integer> data = new ArrayList<>();

    // constructor
    public MyRepository() {
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

    }


    public List<Index> findIndex(String input) {


        int target = Integer.parseInt(input);
        List<Index> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {
            if (map.get(data.get(i)) != null) {
                Index one  = Index.builder()
                        .num(map.get(data.get(i)))
                        .build();
                Index two  = Index.builder()
                        .num(i)
                        .build();
                ans.add(one);
                ans.add(two);
                return ans;
            }
            map.put(target - data.get(i), i);
        }
        return ans;
    }

}
