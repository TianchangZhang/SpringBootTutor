package com.example.demo.repository;

import module.Index;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MyRepository {
    List<Integer> data = new ArrayList<>();
    List<Index> d2 = new ArrayList<>();
    // constructor
    public MyRepository() {
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        Index one  = Index.builder()
                .num(1)
                .build();
        d2.add(one);
    }

    public List<Index> findAll(){
        //链接数据库
        //返回数据库的信息
        return  d2;
    }
    public List<Index> findIndex(String input) {
        Index one  = Index.builder()
                .num(1)
                .build();
        return new ArrayList<>(List.of(one));
        //int target = Integer.parseInt(input);




        //return ans;

//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < data.size(); i++) {
//            if (map.get(data.get(i)) != null) {
//                Index one  = Index.builder()
//                        .num(map.get(data.get(i)))
//                        .build();
//                Index two  = Index.builder()
//                        .num(i)
//                        .build();
//                ans.add(one);
//                ans.add(two);
//                //System.out.println(11);
//                return ans;
//            }
//            map.put(target - data.get(i), i);
//        }
//        return ans;
    }

}
