package com.retailer.customerreward.util;

import java.math.BigDecimal;

public class RewardCalculatorUtil {

	public static BigDecimal calculateReward(BigDecimal totalTransactionAmount) {

		BigDecimal rewardPoints = BigDecimal.ZERO;
		if (totalTransactionAmount.compareTo(BigDecimal.valueOf(100)) >= 0) {
			return calculateMoreThanHundredReward(totalTransactionAmount, rewardPoints);

		} else if (totalTransactionAmount.compareTo(BigDecimal.valueOf(50)) >= 0)
			return calculateMoreThanFiftyReward(totalTransactionAmount, rewardPoints);
		return rewardPoints;

	}

	private static BigDecimal calculateMoreThanFiftyReward(BigDecimal totalTransactionAmount, BigDecimal rewardPoints) {
		BigDecimal transactionAmount = totalTransactionAmount.subtract(BigDecimal.valueOf(50));
		rewardPoints = rewardPoints.add(transactionAmount.multiply(BigDecimal.valueOf(1)));
		if (transactionAmount.compareTo(BigDecimal.valueOf(50)) > 0)
			calculateMoreThanHundredReward(transactionAmount, rewardPoints);
		return rewardPoints;
	}

	private static BigDecimal calculateMoreThanHundredReward(BigDecimal totalTransactionAmount,
			BigDecimal rewardPoints) {
		BigDecimal transactionAmount = totalTransactionAmount.subtract(BigDecimal.valueOf(100));
		rewardPoints = rewardPoints.add(transactionAmount.multiply(BigDecimal.valueOf(2)));
		if (transactionAmount.compareTo(BigDecimal.valueOf(100)) > 0)
			calculateMoreThanHundredReward(transactionAmount, rewardPoints);
		BigDecimal remainingAmount = totalTransactionAmount.subtract(transactionAmount);
		if (remainingAmount.compareTo(BigDecimal.valueOf(50)) >= 0) {
			rewardPoints = calculateMoreThanFiftyReward(remainingAmount, rewardPoints);
		}
		return rewardPoints;
	}

//	public static BigDecimal calculateTotalTransactionAmount(BigDecimal totalTransactionAmount) {
//		
//	}

}
