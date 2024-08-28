package com.xample.chitchat2o

import android.graphics.Bitmap
import com.example.chitchat2o.data.Chat

/**
 * @author Abhishek Rajput
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)