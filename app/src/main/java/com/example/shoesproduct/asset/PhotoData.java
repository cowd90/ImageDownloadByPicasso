package com.example.shoesproduct.asset;

import java.util.ArrayList;

public class PhotoData {

    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://images.unsplash.com/photo-1559181567-c3190ca9959b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1964&q=80", "Cherry", "Enjoy your meal! I would love to hear your comments! Check out my Instagram"));
        photos.add(new Photo(1, "https://images.unsplash.com/photo-1579613832125-5d34a13ffe2a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80", "Apple", "Enjoy your meal! I would love to hear your comments! Check out my Instagram"));
        photos.add(new Photo(2, "https://images.unsplash.com/photo-1557800636-894a64c1696f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1965&q=80", "Orange", "Enjoy your meal! I would love to hear your comments! Check out my Instagram"));
        photos.add(new Photo(3, "https://images.unsplash.com/photo-1523049673857-eb18f1d7b578?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1975&q=80", "Avocado", "Enjoy your meal! I would love to hear your comments! Check out my Instagram"));
        photos.add(new Photo(4, "https://images.unsplash.com/photo-1481349518771-20055b2a7b24?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1878&q=80", "Banana", "Enjoy your meal! I would love to hear your comments! Check out my Instagram"));
        photos.add(new Photo(5, "https://images.unsplash.com/photo-1581158222812-044e8471958b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1887&q=80", "Strawberry", "Enjoy your meal! I would love to hear your comments! Check out my Instagram"));

        return photos;
    }

    public static Photo getPhotoFromId(int id) {
        ArrayList<Photo> photos = generatePhotoData();
        for (int i = 0; i < photos.size(); i++) {
            if (photos.get(i).getId() == id) {
                return photos.get(i);
            }
        }
        return null;
    }
}
