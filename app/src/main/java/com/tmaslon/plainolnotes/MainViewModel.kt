package com.tmaslon.plainolnotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tmaslon.plainolnotes.data.NoteEntity
import com.tmaslon.plainolnotes.data.SampleDataProvider

class MainViewModel : ViewModel() {

    val notesList = MutableLiveData<List<NoteEntity>>()

    init {
        notesList.value = SampleDataProvider.getNotes()
    }
}