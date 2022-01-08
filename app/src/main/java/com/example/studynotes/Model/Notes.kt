package com.example.studynotes.Model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Notes")
class Notes(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var title: String,
    var subtitle: String,
    var notes: String,
    var date: String,
    var priority: String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    )

    companion object : Parceler<Notes> {

        override fun Notes.write(parcel: Parcel, flags: Int) {
            parcel.writeValue(id)
            parcel.writeString(title)
            parcel.writeString(subtitle)
            parcel.writeString(notes)
            parcel.writeString(date)
            parcel.writeString(priority)
        }

        override fun create(parcel: Parcel): Notes {
            return Notes(parcel)
        }
    }
}