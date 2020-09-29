package TopInterviewQuestions.EasyCollection.Array;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given two arrays, write a function to compute their intersection.
*/

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr= new ArrayList<>();
        Arrays.sort(nums1); Arrays.sort(nums2);
        int i=0, j=0;

        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                arr.add(nums1[i]);
                i++; j++;
            }
            else if(nums1[i]> nums2[j])
                j++;
            else
                i++;
        }

        int[] result= new int[arr.size()];

        for(i=0; i < result.length; i++)
            result[i]=arr.get(i);

        return result;
    }
}
