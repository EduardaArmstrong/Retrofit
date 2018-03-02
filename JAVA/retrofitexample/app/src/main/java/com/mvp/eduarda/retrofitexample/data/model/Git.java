package com.mvp.eduarda.retrofitexample.data.model;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class Git {

    private String totalCount;
    private String incompleteResults;
    private Items items;

    public Git() {
    }

    public Git(String totalCount, String incompleteResults, Items items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(String incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

}
