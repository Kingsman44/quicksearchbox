package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.ag.c.eq */
/* compiled from: PG */
public enum C49051eq implements C62957cd {
    UNDEFINED(0),
    WEATHER(5),
    WEATHER_PRECISE(1),
    PROMOTIONAL(2),
    REALTIME_PROMOTIONAL(3),
    MANUAL_SUBSCRIPTION(4),
    ZEROSTATE_CONTEXTUAL_SUGGESTIONS(7),
    POTTER_MEDIA(8),
    PLAY_MEDIA(9),
    VEHICLE(10),
    PRELOADED_ON_DEVICE(11),
    PERMISSIONS(12),
    COMMUNICATION(13),
    SHORTCUTS(14),
    CALENDAR_EVENT(15),
    UNIT_TESTING_1(1000),
    UNIT_TESTING_2(1001),
    UNIT_TESTING_3(1002),
    UNIT_TESTING_4(1003);
    

    /* renamed from: t */
    public final int f126885t;

    private C49051eq(int i) {
        this.f126885t = i;
    }

    /* renamed from: a */
    public static C49051eq m85352a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return WEATHER_PRECISE;
        }
        if (i == 2) {
            return PROMOTIONAL;
        }
        if (i == 3) {
            return REALTIME_PROMOTIONAL;
        }
        if (i == 4) {
            return MANUAL_SUBSCRIPTION;
        }
        if (i == 5) {
            return WEATHER;
        }
        switch (i) {
            case 7:
                return ZEROSTATE_CONTEXTUAL_SUGGESTIONS;
            case 8:
                return POTTER_MEDIA;
            case 9:
                return PLAY_MEDIA;
            case 10:
                return VEHICLE;
            case 11:
                return PRELOADED_ON_DEVICE;
            case 12:
                return PERMISSIONS;
            case 13:
                return COMMUNICATION;
            case 14:
                return SHORTCUTS;
            case 15:
                return CALENDAR_EVENT;
            default:
                switch (i) {
                    case 1000:
                        return UNIT_TESTING_1;
                    case 1001:
                        return UNIT_TESTING_2;
                    case 1002:
                        return UNIT_TESTING_3;
                    case 1003:
                        return UNIT_TESTING_4;
                    default:
                        return null;
                }
        }
    }

    public final int getNumber() {
        return this.f126885t;
    }

    public final String toString() {
        return Integer.toString(this.f126885t);
    }
}
