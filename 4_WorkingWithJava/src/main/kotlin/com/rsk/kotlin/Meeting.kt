package com.rsk.kotlin

import java.lang.Exception

class Meeting(val title : String) {
    var location = ""

    @Throws(MeetingException::class)
    fun addAttendee(attendee : String) {
        if (attendee.isNullOrEmpty()) throw MeetingException("Attendee must have a name")
    }

    @JvmField
    var description = ""

    companion object {
        @JvmField
        val APP_Version = 1

        @JvmStatic
        fun getAppVersion() : Int {
            return APP_Version
        }
    }
}

class MeetingException(message : String) : Exception(message) {}
