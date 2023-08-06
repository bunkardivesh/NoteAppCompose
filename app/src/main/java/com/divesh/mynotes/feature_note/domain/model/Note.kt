package com.divesh.mynotes.feature_note.domain.model

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.divesh.mynotes.ui.theme.BabyBlue
import com.divesh.mynotes.ui.theme.LightGreen
import com.divesh.mynotes.ui.theme.RedOrange
import com.divesh.mynotes.ui.theme.RedPink
import com.divesh.mynotes.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val image: Uri?,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)