package com.DSandAlgorithmProblems.main.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.DSandAlgorithmProblems.main.service.SubsetSum;

@Service
public class SubsetSumImpl implements SubsetSum {

	@Override
	public List<String> printPairs(int[] array, int sum) {
		List<String> pairs = new ArrayList<>();
		pairs.add("Given sum = " + sum);
		pairs.add("Given Array = " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];

				if ((first + second) == sum) {
					pairs.add("(" + first + "," + second + ")");
				}
			}
		}
		return pairs;
	}

}
