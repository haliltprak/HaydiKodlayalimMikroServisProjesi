package com.haydikodlayalim.accountservice.service;

import com.haydikodlayalim.accountservice.entity.Account;
import com.haydikodlayalim.accountservice.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private  AccountRepository accountRepository;

    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    public Account get(String id){
        return accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Account save(Account account){
        return accountRepository.save(account);
    }

    public Account update(String id,Account account){
        Account tempAccount = accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        tempAccount.setUsername(account.getUsername());
        tempAccount.setEmail(account.getEmail());
        tempAccount.setPassword(account.getPassword());

        return accountRepository.save(tempAccount);
    }

    public void delete(String id){
        accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        accountRepository.deleteById(id);
    }


}
