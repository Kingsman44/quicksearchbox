package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.sc */
/* compiled from: PG */
public enum C52448sc implements C62957cd {
    UNSPECIFIED(0),
    SET_WIND_DOWN(1),
    START_WIND_DOWN(2),
    STOP_WIND_DOWN(3),
    GET_APP_USAGE(4),
    SET_APP_TIMER(5),
    GET_ALL_APPS_USAGE(6),
    UNSET_APP_TIMER(7);
    

    /* renamed from: i */
    private final int f137678i;

    private C52448sc(int i) {
        this.f137678i = i;
    }

    /* renamed from: a */
    public static C52448sc m86638a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return SET_WIND_DOWN;
            case 2:
                return START_WIND_DOWN;
            case 3:
                return STOP_WIND_DOWN;
            case 4:
                return GET_APP_USAGE;
            case 5:
                return SET_APP_TIMER;
            case 6:
                return GET_ALL_APPS_USAGE;
            case 7:
                return UNSET_APP_TIMER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86639b() {
        return C52447sb.f137668a;
    }

    public final int getNumber() {
        return this.f137678i;
    }

    public final String toString() {
        return Integer.toString(this.f137678i);
    }
}
