package com.search.config;

import com.search.lucene.ESIndex;
import com.search.lucene.Index;
import com.search.lucene.LuceneIndex;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @copyright (C), 1996-2025, 中移全通系统集成有限公司
 * @class_name: SearchProperties
 * @date: 2020-11-22 21:30
 * @author: SunFei
 * @description: ->
 */
@ConfigurationProperties(
        prefix = "search",
        ignoreUnknownFields = true
)
@Data
public class SearchProperties {

    private String searchType;

    public Index getIndex() {
        Index index;
        String type = getSearchType();
        switch (type) {
            case "es":
                index = new ESIndex();
                break;
            case "lucene":
                index = new LuceneIndex();
                break;
            default:
                index = new LuceneIndex();
        }
        return index;
    }

}
