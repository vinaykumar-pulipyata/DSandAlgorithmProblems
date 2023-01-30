package com.DSandAlgorithmProblems.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DSandAlgorithmProblems.main.service.Fizzbuzz;

@Service
public class FizzbuzzImpl implements Fizzbuzz {

	@Override
	public String fizzbuzz(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

	@Override
	public String fizzbuzzjava8(int number) {
		String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") 
                               + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
	}

	@Override
	public List<String> fizzbuzzTillNumber(int number) {
		List<String> fizzbuzz = new ArrayList<>();
		for(int i=1;i<=number;i++)
		{
			fizzbuzz.add(fizzbuzz(i));
		}
		return fizzbuzz;
	}

}
