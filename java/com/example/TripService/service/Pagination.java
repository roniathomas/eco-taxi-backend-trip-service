package com.example.TripService.service;

public class Pagination {
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private int totalItems;

    // Constructor
    public Pagination(int currentPage, int pageSize, int totalItems) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalItems = totalItems;
        this.totalPages = (int) Math.ceil((double) totalItems / pageSize);
    }
}
