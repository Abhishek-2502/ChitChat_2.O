package com.xample.chitchat2o

import android.graphics.Bitmap

/**
 * @author Abhishek Rajput
 */
sealed class ChatUiEvent {
    data class UpdatePrompt(val newPrompt: String) : ChatUiEvent()
    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?
    ) : ChatUiEvent()
}
