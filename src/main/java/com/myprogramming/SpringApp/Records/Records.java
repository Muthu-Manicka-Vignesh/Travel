package com.myprogramming.SpringApp.Records;

import com.myprogramming.SpringApp.Model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Records extends JpaRepository<Travel,Integer> {
}
