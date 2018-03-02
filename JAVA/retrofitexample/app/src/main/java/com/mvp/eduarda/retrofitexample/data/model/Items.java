package com.mvp.eduarda.retrofitexample.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eduarda on 26/02/2018.
 */

public class Items {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("description")
    private String description;

    @SerializedName("url")
    private String url;

    @SerializedName("language")
    private String language;

    @SerializedName("watchers")
    private String watchers;

    @SerializedName("score")
    private String score;

    public Items() {
    }

    public Items(String id, String name, String fullName, String htmlUrl, String description, String url, String language, String watchers, String score) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.url = url;
        this.language = language;
        this.watchers = watchers;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getWatchers() {
        return watchers;
    }

    public void setWatchers(String watchers) {
        this.watchers = watchers;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
