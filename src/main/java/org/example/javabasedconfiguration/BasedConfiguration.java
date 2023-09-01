package org.example.javabasedconfiguration;

import org.example.annotation.AccountRepository2Impl;
import org.example.annotation.AccountService2Impl;
import org.example.pojo.AccountRepository;
import org.example.pojo.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.annotation")
public class BasedConfiguration {
    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepository2Impl();
    }

    @Bean
    public AccountService accountService(AccountRepository accountRepository) {
        return new AccountService2Impl(accountRepository);
    }
}
