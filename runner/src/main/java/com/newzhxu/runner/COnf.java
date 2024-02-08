package com.newzhxu.runner;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("tools.ip")
@Configuration
@Data
public class COnf {
    private String display = "simple";
    private String display2 = "simple";
}
