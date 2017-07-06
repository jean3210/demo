package com.example.demo.service;

import com.example.demo.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qqqqwww on 05/07/2017.
 */

@Service
public class CitireService {

    @Autowired
    ModelRepository modelRepository;
}
