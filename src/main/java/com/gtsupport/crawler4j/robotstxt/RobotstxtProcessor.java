/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gtsupport.crawler4j.robotstxt;

import com.gtsupport.crawler4j.url.WebURL;

/**
 *
 * @author kcarter
 */
public class RobotstxtProcessor {
    public String preProcess(WebURL url, String content) {
        return content;
    }
    
    public void postProcess(WebURL url, String content) {
    }
}
