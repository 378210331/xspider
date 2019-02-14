package com.hsy.xspider.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Systemroperties {


    @Value("${spider.exe}")
    public String plamPath;


    public String getPlamPath() {
        return plamPath;
    }

    public void setPlamPath(String plamPath) {
        this.plamPath = plamPath;
    }

}
