package com.project.newsapp.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TotalNews {

    @NonNull
    private String status;

    @NonNull
    @SerializedName("totalResults")
    private int totalNewsCount;

    @NonNull
    @SerializedName("articles")
    private List<News> newsList;

    public TotalNews() {
    }

    @NonNull
    public String getStatus() {
        return status;
    }

    public void setStatus(@NonNull String status) {
        this.status = status;
    }

    public int getTotalNewsCount() {
        return totalNewsCount;
    }

    public void setTotalNewsCount(int totalNewsCount) {
        this.totalNewsCount = totalNewsCount;
    }

    @NonNull
    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(@NonNull List<News> newsList) {
        this.newsList = newsList;
    }
}
