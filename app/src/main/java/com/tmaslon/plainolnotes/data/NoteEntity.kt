package com.tmaslon.plainolnotes.data

import com.tmaslon.plainolnotes.NEW_NOTE_ID
import java.util.*

data class NoteEntity(
    var id: Int,
    var date: Date,
    var text: String
) {
    constructor() : this(NEW_NOTE_ID, Date(), "")
    constructor(date: Date, text: String) : this(NEW_NOTE_ID, date, text)
}