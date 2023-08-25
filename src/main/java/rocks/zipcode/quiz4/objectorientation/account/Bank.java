package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> bankAccountList;

    public Bank() {
        this.bankAccountList = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount theAccount = this.bankAccountList.get(indexNumber);
        int index = indexNumber;
        this.bankAccountList.remove(index);
        return theAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.bankAccountList.contains(bankAccount);
    }
}
