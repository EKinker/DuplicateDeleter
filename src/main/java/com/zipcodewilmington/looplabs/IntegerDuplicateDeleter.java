package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public int countOccurences(Integer value) {
        int count = 0;
        for(Integer i : array){
            if(i==value) count++;
        }
        return count;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int newArraySize = 0;
        for(Integer i : array){
            if(countOccurences(i)<maxNumberOfDuplications) newArraySize++;
        }
        Integer[] newArray = new Integer[newArraySize];

        int newIndex = 0;
        for(Integer i : array){
            if(countOccurences(i)<maxNumberOfDuplications){
                newArray[newIndex]=i;
                newIndex++;
            }
        }

        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int newArraySize = 0;
        for(Integer i : array){
            if(countOccurences(i)!=exactNumberOfDuplications) newArraySize++;
        }
        Integer[] newArray = new Integer[newArraySize];

        int newIndex = 0;
        for(Integer i : array){
            if(countOccurences(i)!=exactNumberOfDuplications){
                newArray[newIndex]=i;
                newIndex++;
            }
        }

        return newArray;
    }
}
