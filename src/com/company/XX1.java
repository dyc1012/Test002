package com.company;

import java.util.Date;

public class XX1 {
    public String getUserId() {
        return userId;
    }

    public XX1(String userId) {
        this.userId = userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String userId;

    public static void main(String[] args) {
        try {
            System.out.println(123);
            synchronized (String.class) {
                System.out.println();
                System.out.println();

            }
            Date date = new Date();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
