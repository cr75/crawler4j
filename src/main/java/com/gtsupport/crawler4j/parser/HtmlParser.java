package com.gtsupport.crawler4j.parser;

import com.gtsupport.crawler4j.crawler.Page;
import com.gtsupport.crawler4j.crawler.exceptions.ParseException;

public interface HtmlParser {

    HtmlParseData parse(Page page, String contextURL) throws ParseException;

}
