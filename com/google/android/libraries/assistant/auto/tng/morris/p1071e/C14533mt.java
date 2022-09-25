package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mt */
/* compiled from: PG */
public enum C14533mt implements C62957cd {
    UNKNOWN_ASSISTANT_FLOW_EVENT(0),
    STARTUP_ON_CALL_TAP(1),
    STARTUP_ON_CALL_TILE(23),
    STARTUP_ON_CALL_TOP_CONTACT(24),
    STARTUP_ON_CALL_SOMEONE_ELSE(25),
    STARTUP_ON_CALL_RECENT_CALL(31),
    STARTUP_ON_GVIS(2),
    STARTUP_ON_IMMERSIVE_DESTINATION_SEARCH_BUTTON_TAP(3),
    STARTUP_ON_IMMERSIVE_MEDIA_BUTTON_TAP(4),
    STARTUP_ON_SCREEN_MIC(5),
    STARTUP_ON_SEND_MESSAGE_TAP(6),
    STARTUP_ON_SEND_MESSAGE_TILE(32),
    STARTUP_ON_SEND_MESSAGE_TOP_CONTACT(33),
    STARTUP_ON_SEND_MESSAGE_MESSAGE_SOMEONE_ELSE(34),
    STARTUP_ON_SEND_MESSAGE_MESSAGE_CENTER_SEND_MESSAGE(35),
    STARTUP_ON_SEND_MESSAGE_EMPTY_STATE_SEND_MESSAGE(36),
    STARTUP_ON_PLAY_MEDIA_TAP(16),
    STARTUP_ON_HOTWORD(17),
    STARTUP_ON_PAY_FOR_GAS_TAP(18),
    STARTUP_ON_GENERIC_TAP(19),
    STARTUP_ON_CALL_ANNOUNCE(20),
    ANNOUNCE_WIDGET(22),
    FOLLOW_ON_TEXT_QUERY(7),
    FOLLOW_ON_CLIENT_INPUT(21),
    CANCEL_ACTIVITY_STOP(8),
    CANCEL_CALL_CONNECTED(9),
    CANCEL_CALL_DISCONNECTED(10),
    CANCEL_CALL_DISMISSED(15),
    CANCEL_GENERIC(11),
    CANCEL_ON_MESSAGE(12),
    CANCEL_ON_SCREEN_MIC(13),
    CANCEL_ONGOING_CONVERSATION(26),
    CANCEL_CLOSE_IMMERSIVE_TASK(27),
    CANCEL_MODE_CHANGE(28),
    CANCEL_SEARCH_IN_MAPS_TAP(29),
    CANCEL_TASK_REJECTED(30),
    END_FAILURE_CANNOT_CONNECT(14),
    UNRECOGNIZED(-1);
    

    /* renamed from: M */
    private final int f43961M;

    private C14533mt(int i) {
        this.f43961M = i;
    }

    /* renamed from: a */
    public static C14533mt m30633a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ASSISTANT_FLOW_EVENT;
            case 1:
                return STARTUP_ON_CALL_TAP;
            case 2:
                return STARTUP_ON_GVIS;
            case 3:
                return STARTUP_ON_IMMERSIVE_DESTINATION_SEARCH_BUTTON_TAP;
            case 4:
                return STARTUP_ON_IMMERSIVE_MEDIA_BUTTON_TAP;
            case 5:
                return STARTUP_ON_SCREEN_MIC;
            case 6:
                return STARTUP_ON_SEND_MESSAGE_TAP;
            case 7:
                return FOLLOW_ON_TEXT_QUERY;
            case 8:
                return CANCEL_ACTIVITY_STOP;
            case 9:
                return CANCEL_CALL_CONNECTED;
            case 10:
                return CANCEL_CALL_DISCONNECTED;
            case 11:
                return CANCEL_GENERIC;
            case 12:
                return CANCEL_ON_MESSAGE;
            case 13:
                return CANCEL_ON_SCREEN_MIC;
            case 14:
                return END_FAILURE_CANNOT_CONNECT;
            case 15:
                return CANCEL_CALL_DISMISSED;
            case 16:
                return STARTUP_ON_PLAY_MEDIA_TAP;
            case 17:
                return STARTUP_ON_HOTWORD;
            case 18:
                return STARTUP_ON_PAY_FOR_GAS_TAP;
            case 19:
                return STARTUP_ON_GENERIC_TAP;
            case 20:
                return STARTUP_ON_CALL_ANNOUNCE;
            case 21:
                return FOLLOW_ON_CLIENT_INPUT;
            case 22:
                return ANNOUNCE_WIDGET;
            case 23:
                return STARTUP_ON_CALL_TILE;
            case 24:
                return STARTUP_ON_CALL_TOP_CONTACT;
            case 25:
                return STARTUP_ON_CALL_SOMEONE_ELSE;
            case 26:
                return CANCEL_ONGOING_CONVERSATION;
            case 27:
                return CANCEL_CLOSE_IMMERSIVE_TASK;
            case 28:
                return CANCEL_MODE_CHANGE;
            case 29:
                return CANCEL_SEARCH_IN_MAPS_TAP;
            case 30:
                return CANCEL_TASK_REJECTED;
            case 31:
                return STARTUP_ON_CALL_RECENT_CALL;
            case 32:
                return STARTUP_ON_SEND_MESSAGE_TILE;
            case 33:
                return STARTUP_ON_SEND_MESSAGE_TOP_CONTACT;
            case 34:
                return STARTUP_ON_SEND_MESSAGE_MESSAGE_SOMEONE_ELSE;
            case 35:
                return STARTUP_ON_SEND_MESSAGE_MESSAGE_CENTER_SEND_MESSAGE;
            case 36:
                return STARTUP_ON_SEND_MESSAGE_EMPTY_STATE_SEND_MESSAGE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43961M;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
