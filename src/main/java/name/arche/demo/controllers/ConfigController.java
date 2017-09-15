package name.arche.demo.controllers;

import name.arche.demo.beans.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({Config.class})
public class ConfigController {

    @Autowired
    Config config;

    @RequestMapping("/config")
    public String config() {

        return config.toString();

    }
}
