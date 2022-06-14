package edu.mum.cs.cs525.labs.exercises.project.ui.framework.account.interest_strategy.impl;

import edu.mum.cs.cs525.labs.exercises.project.ui.framework.account.interest_strategy.InterestStrategy;

public class DefaultInterestStrategy implements InterestStrategy {

    @Override
    public double getInterestPercentage() {
        return 0;
    }

    @Override
    public double calculateInterest(double balance) {

        return 0;
    }

    @Override
    public double minimumPaymentPercentage() {
        return 0;
    }
}
