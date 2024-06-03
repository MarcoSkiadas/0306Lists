package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Sack {
    private int[] elements;
    private int size;

    public Sack() {
        elements = new int[10];
        size = 0;
    }

    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = element;
        size++;
    }

    public int remove(int index) {
        checkIndex(index);
        int removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }


    public void set(int index, int element) {
        checkIndex(index);
        elements[index] = element;
    }


    public int size() {
        return size;
    }

    private void resize() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
