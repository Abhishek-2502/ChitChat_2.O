package com.example.chitchat2o.data

import android.graphics.Bitmap

/**
 * @author Abhishek Rajput
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)