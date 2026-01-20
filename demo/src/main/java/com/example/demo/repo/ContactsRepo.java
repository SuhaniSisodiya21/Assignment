package com.example.demo.repo;

import com.example.demo.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepo extends JpaRepository<Contacts, Integer> {
}
