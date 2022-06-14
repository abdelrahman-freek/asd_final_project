package edu.mum.cs.cs525.labs.exercises.project.ui.framework.account.factory;

import edu.mum.cs.cs525.labs.exercises.project.ui.framework.account.Account;
import edu.mum.cs.cs525.labs.exercises.project.ui.framework.account.AccountDao;
import edu.mum.cs.cs525.labs.exercises.project.ui.framework.account.FileMemoryAccountDao;

public class TestingFactory implements AccountFactory {
    @Override
    public AccountDao getAccountDao() {
        return FileMemoryAccountDao.getInstance("Banking");
    }

    @Override
    public Account createAccount() {
        return null;
    }
}
