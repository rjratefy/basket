package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Playor;

@RestController
@RequestMapping
class TestController {

        @GetMapping("huhu")
        public String huhu() {
            return "hahahah";
        }

        @GetMapping("allPlayor")
        public List<Playor> allPlayor() {
            List<Playor> allPlayor = Playor.getAll(null);

            return allPlayor;
        }
}