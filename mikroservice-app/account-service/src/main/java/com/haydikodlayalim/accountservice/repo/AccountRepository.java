package com.haydikodlayalim.accountservice.repo;

import com.haydikodlayalim.accountservice.entity.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository // bu notasyonu eklememize gerek yok. Spring otomatik bir sekilde anliyor zaten.
public interface AccountRepository extends CassandraRepository<Account,String> {
}
