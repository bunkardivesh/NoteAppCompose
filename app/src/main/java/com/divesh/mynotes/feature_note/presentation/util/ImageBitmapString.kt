package com.divesh.mynotes.feature_note.presentation.util

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import java.io.ByteArrayOutputStream


object ImageBitmapString {

    fun bitMapToString(bitmap: Bitmap): String? {
        val baos = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos)
        val b = baos.toByteArray()
        return Base64.encodeToString(b, Base64.DEFAULT)
    }

    fun stringToBitMap(encodedString: String): Bitmap? {
        return try {
            val encodeByte = Base64.decode(encodedString, Base64.DEFAULT)
            BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.size)
        } catch (ex: Exception) {
            ex.message
            null
        }
    }
}