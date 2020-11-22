package com.search.lucene;

/**
 * @copyright (C), 1996-2025, 中移全通系统集成有限公司
 * @class_name: Index
 * @date: 2020-11-22 21:15
 * @author: SunFei
 * @description: ->
 */
public interface Index {

    public void createIndex();

    public Object searchDoc();
}
