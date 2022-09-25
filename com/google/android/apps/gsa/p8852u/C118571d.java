package com.google.android.apps.gsa.p8852u;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.u.d */
/* compiled from: PG */
public enum C118571d implements C62957cd {
    UNKNOWN_PERMISSION(0),
    ACCESS_COARSE_LOCATION(1),
    ACCESS_FINE_LOCATION(2),
    ADD_VOICEMAIL(3),
    BODY_SENSORS(4),
    CALL_PHONE(5),
    CAMERA(6),
    GET_ACCOUNTS(27),
    GOOGLE_AUTH_CP(7),
    PROCESS_OUTGOING_CALLS(8),
    READ_CALENDAR(9),
    READ_CALL_LOG(10),
    READ_CONTACTS(11),
    READ_EXTERNAL_STORAGE(12),
    READ_MEDIA_AUDIO(28),
    READ_MEDIA_IMAGES(29),
    READ_MEDIA_VIDEO(30),
    READ_PHONE_STATE(13),
    READ_SMS(14),
    RECEIVE_MMS(15),
    RECEIVE_SMS(16),
    RECEIVE_WAP_PUSH(17),
    RECORD_AUDIO(18),
    SEND_SMS(19),
    SYSTEM_ALERT_WINDOW(20),
    USE_SIP(21),
    WRITE_CALENDAR(22),
    WRITE_CALL_LOG(23),
    WRITE_CONTACTS(24),
    WRITE_EXTERNAL_STORAGE(25),
    WRITE_SETTINGS(26);
    

    /* renamed from: F */
    public final int f329810F;

    private C118571d(int i) {
        this.f329810F = i;
    }

    /* renamed from: a */
    public static C118571d m196862a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PERMISSION;
            case 1:
                return ACCESS_COARSE_LOCATION;
            case 2:
                return ACCESS_FINE_LOCATION;
            case 3:
                return ADD_VOICEMAIL;
            case 4:
                return BODY_SENSORS;
            case 5:
                return CALL_PHONE;
            case 6:
                return CAMERA;
            case 7:
                return GOOGLE_AUTH_CP;
            case 8:
                return PROCESS_OUTGOING_CALLS;
            case 9:
                return READ_CALENDAR;
            case 10:
                return READ_CALL_LOG;
            case 11:
                return READ_CONTACTS;
            case 12:
                return READ_EXTERNAL_STORAGE;
            case 13:
                return READ_PHONE_STATE;
            case 14:
                return READ_SMS;
            case 15:
                return RECEIVE_MMS;
            case 16:
                return RECEIVE_SMS;
            case 17:
                return RECEIVE_WAP_PUSH;
            case 18:
                return RECORD_AUDIO;
            case 19:
                return SEND_SMS;
            case 20:
                return SYSTEM_ALERT_WINDOW;
            case 21:
                return USE_SIP;
            case 22:
                return WRITE_CALENDAR;
            case 23:
                return WRITE_CALL_LOG;
            case 24:
                return WRITE_CONTACTS;
            case 25:
                return WRITE_EXTERNAL_STORAGE;
            case 26:
                return WRITE_SETTINGS;
            case 27:
                return GET_ACCOUNTS;
            case 28:
                return READ_MEDIA_AUDIO;
            case 29:
                return READ_MEDIA_IMAGES;
            case 30:
                return READ_MEDIA_VIDEO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m196863b() {
        return C118570c.f329777a;
    }

    public final int getNumber() {
        return this.f329810F;
    }

    public final String toString() {
        return Integer.toString(this.f329810F);
    }
}
