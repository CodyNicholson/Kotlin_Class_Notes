package com.rsk.java;

import com.rsk.kotlin.Meeting;
import com.rsk.kotlin.MeetingException;

public class Program {
    public static void main(String[] args) {
        Meeting board = new Meeting("Board Meeting");

        board.setLocation("London");
        System.out.println("The meeting is in " + board.getLocation());

        board.description = "A board meeting";

        // Meeting.Companion.getAPP_Version();
        int version = Meeting.getAppVersion();

        try {
            board.addAttendee("");
        } catch (MeetingException e) {
            e.printStackTrace();
        }
    }
}
