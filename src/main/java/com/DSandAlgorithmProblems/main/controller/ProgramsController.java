package com.DSandAlgorithmProblems.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DSandAlgorithmProblems.main.service.Fizzbuzz;
import com.DSandAlgorithmProblems.main.service.SubsetSum;

@RestController
@RequestMapping("programs")
public class ProgramsController {

	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to Data Structures and Algorithms Problems!";
	}

	/*
	 * Fizzbuzz Problems
	 */
	@Autowired
	private Fizzbuzz fizzbuzz;

	@GetMapping("fizzbuzz")
	public String fizbuzz(int number) {
		return fizzbuzz.fizzbuzz(number);
	}

	@GetMapping("fizzbuzzjava8")
	public String fizzbuzzjava8(int number) {
		return fizzbuzz.fizzbuzzjava8(number);
	}

	@GetMapping("fizzbuzzTillNumber")
	public List<String> fizzbuzzTillNumber(int number) {
		return fizzbuzz.fizzbuzzTillNumber(number);
	}
	/*
	 * Fizzbuzz Problems
	 */

	/*
	 * Subset Sum Problems
	 */
	@Autowired
	private SubsetSum subsetSum;

	@GetMapping("subSetSum")
	public List<String> subSetSum(@RequestParam("array") int[] array, @RequestParam("sum") int sum) {
		return subsetSum.printPairs(array, sum);
	}
	/*
	 * Subset Sum Problems
	 */
}
