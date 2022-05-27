package com.tmaslon.plainolnotes.data

import java.util.*

class SampleDataProvider {

    companion object {
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note a\nline feed"
        private val sampleText3 = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. In dui sapien, accumsan vel ultricies non, pharetra a arcu. Vestibulum in vulputate purus. Ut at nunc diam. Suspendisse elementum, nibh ut viverra mattis, est massa auctor metus, eu commodo nibh libero et lacus. Morbi et ultricies erat, eget pharetra sem. Fusce sem lacus, mattis eget lobortis ut, viverra suscipit libero. Duis vel sem sit amet diam consequat venenatis.

            Nunc quis lacinia eros. Mauris pharetra nunc augue, nec mattis mauris tempor vel. Sed eget malesuada nulla. Pellentesque eget tempor nulla. Phasellus ac laoreet magna. Donec iaculis consectetur felis non molestie. Donec molestie felis a viverra finibus. Sed eget cursus est, sed ultricies felis. Integer nec dapibus dui, dapibus feugiat tellus. Nullam tincidunt est et tempor iaculis. Ut semper, nibh ac placerat ullamcorper, elit urna blandit ipsum, eget porttitor ligula ipsum nec enim. Sed fringilla purus ac venenatis mollis. Fusce euismod pretium eleifend.
        """.trimIndent()

        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEntity(1, getDate(0), sampleText1),
            NoteEntity(2, getDate(1), sampleText2),
            NoteEntity(3, getDate(2), sampleText3)
        )
    }
}