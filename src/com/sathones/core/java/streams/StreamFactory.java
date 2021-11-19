package com.sathones.core.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFactory {

    public static void main(String args[]){
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        List<Integer> intList = integerStream.map(i -> i*i).collect(Collectors.toList());
        intList.forEach(System.out::println);
    }
}
