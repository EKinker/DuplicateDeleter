package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public int countOccurrences(String string) {
        int count = 0;
        for (String s : array) {
            if (s.equals(string)) count++;
        }
        return count;
    }
    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int newArraySize = 0;
        for (String s : array) {
            if (countOccurrences(s) < maxNumberOfDuplications) newArraySize++;
        }
        String[] newArray = new String[newArraySize];

        int newIndex = 0;
        for (String s : array) {
            if (countOccurrences(s) < maxNumberOfDuplications) {
                newArray[newIndex] = s;
                newIndex++;
            }
        }
        return newArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int newArraySize = 0;
        for (String s : array) {
            if (countOccurrences(s) != exactNumberOfDuplications) newArraySize++;
        }
        String[] newArray = new String[newArraySize];

        int newIndex = 0;
        for (String s : array) {
            if (countOccurrences(s) != exactNumberOfDuplications) {
                newArray[newIndex] = s;
                newIndex++;
            }
        }
        return newArray;
    }
}
