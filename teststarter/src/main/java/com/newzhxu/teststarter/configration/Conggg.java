package com.newzhxu.teststarter.configration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("tools1.ip")
@Configuration
@Data
public class Conggg {
    private String display = "simple";
    private String display2 = "simple";
}
