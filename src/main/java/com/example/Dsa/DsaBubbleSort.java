/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Dsa;

/**
 *
 * @author YadavK
 */
public class DsaBubbleSort {

    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp = 0;
        System.out.print("Before Sorting");
        for (int num : nums) {
            System.out.println(num + " ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println(" ");

            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println("----After Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
