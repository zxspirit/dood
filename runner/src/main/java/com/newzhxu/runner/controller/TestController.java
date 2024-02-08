package com.newzhxu.runner.controller;

import com.newzhxu.teststarter.configration.TestConfigration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestController {

    private final TestConfigration testConfigration;

    @GetMapping
    public String test() {
        log.info("test");
        return "test";
    }
}
