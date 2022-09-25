package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.pcp.m.k */
/* compiled from: PG */
public enum C18981k implements C62957cd {
    UNKNOWN(0),
    CONTEXTUAL_SUGGESTIONS(1),
    POTTER_MEDIA(2),
    PRELOADED_ON_DEVICE(3),
    SHORTCUTS(4),
    VEHICLE(5),
    PERMISSIONS(6),
    COMMUNICATION_SUGGESTIONS(7),
    MEDIA_SUGGESTIONS(8),
    NOTIFICATIONS(9),
    LOCAL_CALENDAR(10),
    PROACTIVE_BACKEND(11),
    UNIT_TEST_1(9001),
    UNIT_TEST_2(9002),
    UNIT_TEST_3(9003),
    UNIT_TEST_4(9004),
    UNIT_TEST_5(9005);
    

    /* renamed from: r */
    private final int f53339r;

    private C18981k(int i) {
        this.f53339r = i;
    }

    /* renamed from: a */
    public static C18981k m36415a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONTEXTUAL_SUGGESTIONS;
            case 2:
                return POTTER_MEDIA;
            case 3:
                return PRELOADED_ON_DEVICE;
            case 4:
                return SHORTCUTS;
            case 5:
                return VEHICLE;
            case 6:
                return PERMISSIONS;
            case 7:
                return COMMUNICATION_SUGGESTIONS;
            case 8:
                return MEDIA_SUGGESTIONS;
            case 9:
                return NOTIFICATIONS;
            case 10:
                return LOCAL_CALENDAR;
            case 11:
                return PROACTIVE_BACKEND;
            default:
                switch (i) {
                    case 9001:
                        return UNIT_TEST_1;
                    case 9002:
                        return UNIT_TEST_2;
                    case 9003:
                        return UNIT_TEST_3;
                    case 9004:
                        return UNIT_TEST_4;
                    case 9005:
                        return UNIT_TEST_5;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m36416b() {
        return C18980j.f53320a;
    }

    public final int getNumber() {
        return this.f53339r;
    }

    public final String toString() {
        return Integer.toString(this.f53339r);
    }
}
