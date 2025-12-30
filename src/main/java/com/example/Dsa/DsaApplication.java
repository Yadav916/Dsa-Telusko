package com.example.Dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DsaApplication.class, args);
        int nums[] = new int[10000];
        int target = 11;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);

        if (result1 != 1) {
            System.out.println("Element Found at index : " + result1);

        } else {
            System.out.println("Element not Found");
        }

    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("|||-------Steps for linear : " + steps);

                return i;
            }

        }
        System.out.println("|||-------Steps for linear : " + steps);
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("|||-------Steps for Binary : " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("|||-------Steps for Binary : " + steps);
        return -1;
    }

}
