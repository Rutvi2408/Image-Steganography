package com.example.imagesteganographylibrary.Text.AsyncTaskCallback;

import com.example.imagesteganographylibrary.Text.ImageSteganography;


public interface TextEncodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

}
