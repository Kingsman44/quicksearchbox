package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.id */
/* compiled from: PG */
public enum C52179id implements C62957cd {
    UNKNOWN_MEDIA_ERROR(0),
    APP_ERROR(1),
    NOT_SUPPORTED(2),
    AUTHENTICATION_EXPIRED(3),
    PREMIUM_ACCOUNT_REQUIRED(4),
    CONCURRENT_STREAM_LIMIT(5),
    PARENTAL_CONTROL_RESTRICTED(6),
    NOT_AVAILABLE_IN_REGION(7),
    CONTENT_ALREADY_PLAYING(8),
    SKIP_LIMIT_REACHED(9),
    ACTION_ABORTED(10),
    END_OF_QUEUE(11),
    DEVICE_SCREEN_LOCKED(12),
    MEDIA_SESSION_UNSUPPORTED(13),
    CLOUD_ERROR(14),
    UNSUPPORTED_RECEIVER_COMMAND(15),
    MEDIA_SESSION_REQUIRED(16),
    DEVICE_NOT_FOUND(17),
    DEVICE_UNREACHABLE(18),
    LANGUAGE_NOT_SUPPORTED(19),
    VOLUME_ALREADY_UNMUTED(20),
    VOLUME_ALREADY_MAX(21),
    VOLUME_ALREADY_MIN(22),
    VOLUME_CHANGE_INCAPABLE(23),
    DISPLAY_CONTROL_ERROR(24),
    APP_UNAVAILABLE(25),
    APP_PLAYBACKSTATE_INVALID(26);
    

    /* renamed from: B */
    public final int f136953B;

    private C52179id(int i) {
        this.f136953B = i;
    }

    /* renamed from: a */
    public static C52179id m86535a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MEDIA_ERROR;
            case 1:
                return APP_ERROR;
            case 2:
                return NOT_SUPPORTED;
            case 3:
                return AUTHENTICATION_EXPIRED;
            case 4:
                return PREMIUM_ACCOUNT_REQUIRED;
            case 5:
                return CONCURRENT_STREAM_LIMIT;
            case 6:
                return PARENTAL_CONTROL_RESTRICTED;
            case 7:
                return NOT_AVAILABLE_IN_REGION;
            case 8:
                return CONTENT_ALREADY_PLAYING;
            case 9:
                return SKIP_LIMIT_REACHED;
            case 10:
                return ACTION_ABORTED;
            case 11:
                return END_OF_QUEUE;
            case 12:
                return DEVICE_SCREEN_LOCKED;
            case 13:
                return MEDIA_SESSION_UNSUPPORTED;
            case 14:
                return CLOUD_ERROR;
            case 15:
                return UNSUPPORTED_RECEIVER_COMMAND;
            case 16:
                return MEDIA_SESSION_REQUIRED;
            case 17:
                return DEVICE_NOT_FOUND;
            case 18:
                return DEVICE_UNREACHABLE;
            case 19:
                return LANGUAGE_NOT_SUPPORTED;
            case 20:
                return VOLUME_ALREADY_UNMUTED;
            case 21:
                return VOLUME_ALREADY_MAX;
            case 22:
                return VOLUME_ALREADY_MIN;
            case 23:
                return VOLUME_CHANGE_INCAPABLE;
            case 24:
                return DISPLAY_CONTROL_ERROR;
            case 25:
                return APP_UNAVAILABLE;
            case 26:
                return APP_PLAYBACKSTATE_INVALID;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86536b() {
        return C52178ic.f136924a;
    }

    public final int getNumber() {
        return this.f136953B;
    }

    public final String toString() {
        return Integer.toString(this.f136953B);
    }
}
