package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.ad.a.a.a.a.b.a.a.a.a.a */
/* compiled from: PG */
public enum C63122a implements C62957cd {
    UNKNOWN_STATUS(0),
    SUCCESS_STARTED(1),
    SUCCESS_KEYBOARD_STOP_REQUEST(2),
    SUCCESS_ASSISTANT_STOP_REQUEST(3),
    SUCCESS_VOICE_STOP_REQUEST(19),
    SUCCESS_KEYBOARD_HIDDEN(4),
    SUCCESS_MOVED_TO_UNSUPPORTED_FIELD(5),
    SUCCESS_FIELD_CHANGE(6),
    SUCCESS_SWITCH_TO_UNSUPPORTED_FIELD(42),
    SUCCESS_SEND(7),
    SUCCESS_SEND_DELAYED(41),
    SUCCESS_SEARCH(8),
    SUCCESS_APP_SUBMITTED_CONTENTS(9),
    SUCCESS_IDLE_TIMEOUT(10),
    SUCCESS_STOPPED_SHUTDOWN(23),
    SUCCESS_STOPPED_UNKNOWN(13),
    FAILURE_START_AUDIO_LIBRARY_ERROR(11),
    FAILURE_AUDIO_LIBRARY_STOPPED(18),
    FAILURE_UNCLASSIFIED_ASR_ERROR(25),
    FAILURE_ASR_START_TIMEOUT(40),
    FAILURE_ORATION_PROCESSOR_ERROR(27),
    FAILURE_ORATION_PROCESSOR_STALLED(28),
    FAILURE_ORATION_CLEANUP_ERROR(29),
    FAILURE_KEYBOARD_RPC_ERROR(12),
    FAILURE_KEYBOARD_DISCONNECTED(21),
    FAILURE_SHUTDOWN_ERROR(22),
    FAILURE_ORATION_INIT_ERROR(43),
    CANCEL_ALREADY_DICTATING(33),
    CANCEL_PREPARATION_WAIT_FOR_KEYBOARD_UP_TIMEOUT(34),
    CANCEL_PREPARATION_REQUIRE_KEYBOARD_UP_NOT_UP(35),
    CANCEL_PREPARATION_REQUIRE_KEYBOARD_UP_FOREGROUND_APP_MISMATCH(37),
    CANCEL_PREPARATION_WAIT_FOR_KEYBOARD_UP_FOREGROUND_APP_MISMATCH(38),
    CANCEL_PREPARATION_BRING_KEYBOARD_UP_FOREGROUND_APP_MISMATCH(39),
    FAILURE_KEYBOARD_UNAVAILABLE(32),
    FAILURE_KEYBOARD_CONFIGURATION_ERROR(30),
    FAILURE_KEYBOARD_PREPARATION_ERROR(14),
    FAILURE_KEYBOARD_PREPARATION_BRING_KEYBOARD_UP(36),
    FAILURE_NOT_ELIGIBLE(31),
    FAILURE_UNCLASSIFIED_START_ERROR(16),
    FAILURE_CAUSE_UNKNOWN(15),
    FAILURE_ORATION_ERROR(20),
    UNRECOGNIZED(-1);
    

    /* renamed from: Q */
    private final int f170442Q;

    private C63122a(int i) {
        this.f170442Q = i;
    }

    /* renamed from: a */
    public static C63122a m96183a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return SUCCESS_STARTED;
            case 2:
                return SUCCESS_KEYBOARD_STOP_REQUEST;
            case 3:
                return SUCCESS_ASSISTANT_STOP_REQUEST;
            case 4:
                return SUCCESS_KEYBOARD_HIDDEN;
            case 5:
                return SUCCESS_MOVED_TO_UNSUPPORTED_FIELD;
            case 6:
                return SUCCESS_FIELD_CHANGE;
            case 7:
                return SUCCESS_SEND;
            case 8:
                return SUCCESS_SEARCH;
            case 9:
                return SUCCESS_APP_SUBMITTED_CONTENTS;
            case 10:
                return SUCCESS_IDLE_TIMEOUT;
            case 11:
                return FAILURE_START_AUDIO_LIBRARY_ERROR;
            case 12:
                return FAILURE_KEYBOARD_RPC_ERROR;
            case 13:
                return SUCCESS_STOPPED_UNKNOWN;
            case 14:
                return FAILURE_KEYBOARD_PREPARATION_ERROR;
            case 15:
                return FAILURE_CAUSE_UNKNOWN;
            case 16:
                return FAILURE_UNCLASSIFIED_START_ERROR;
            case 18:
                return FAILURE_AUDIO_LIBRARY_STOPPED;
            case 19:
                return SUCCESS_VOICE_STOP_REQUEST;
            case 20:
                return FAILURE_ORATION_ERROR;
            case 21:
                return FAILURE_KEYBOARD_DISCONNECTED;
            case 22:
                return FAILURE_SHUTDOWN_ERROR;
            case 23:
                return SUCCESS_STOPPED_SHUTDOWN;
            case 25:
                return FAILURE_UNCLASSIFIED_ASR_ERROR;
            case 27:
                return FAILURE_ORATION_PROCESSOR_ERROR;
            case 28:
                return FAILURE_ORATION_PROCESSOR_STALLED;
            case 29:
                return FAILURE_ORATION_CLEANUP_ERROR;
            case 30:
                return FAILURE_KEYBOARD_CONFIGURATION_ERROR;
            case 31:
                return FAILURE_NOT_ELIGIBLE;
            case 32:
                return FAILURE_KEYBOARD_UNAVAILABLE;
            case 33:
                return CANCEL_ALREADY_DICTATING;
            case 34:
                return CANCEL_PREPARATION_WAIT_FOR_KEYBOARD_UP_TIMEOUT;
            case 35:
                return CANCEL_PREPARATION_REQUIRE_KEYBOARD_UP_NOT_UP;
            case 36:
                return FAILURE_KEYBOARD_PREPARATION_BRING_KEYBOARD_UP;
            case 37:
                return CANCEL_PREPARATION_REQUIRE_KEYBOARD_UP_FOREGROUND_APP_MISMATCH;
            case 38:
                return CANCEL_PREPARATION_WAIT_FOR_KEYBOARD_UP_FOREGROUND_APP_MISMATCH;
            case 39:
                return CANCEL_PREPARATION_BRING_KEYBOARD_UP_FOREGROUND_APP_MISMATCH;
            case 40:
                return FAILURE_ASR_START_TIMEOUT;
            case 41:
                return SUCCESS_SEND_DELAYED;
            case 42:
                return SUCCESS_SWITCH_TO_UNSUPPORTED_FIELD;
            case 43:
                return FAILURE_ORATION_INIT_ERROR;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f170442Q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
