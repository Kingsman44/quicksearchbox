package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.s.a.gg */
/* compiled from: PG */
public enum C53232gg implements C62957cd {
    UNKNOWN(0),
    ZERO_STATE_SERVER(1),
    GCM_PUSH(2),
    WEATHER_WIDGET(3),
    WEATHER_WIDGET_POST_REMOVE(4),
    FLIGHT_LANDING(5);
    

    /* renamed from: g */
    public final int f139522g;

    private C53232gg(int i) {
        this.f139522g = i;
    }

    /* renamed from: a */
    public static C53232gg m86789a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ZERO_STATE_SERVER;
        }
        if (i == 2) {
            return GCM_PUSH;
        }
        if (i == 3) {
            return WEATHER_WIDGET;
        }
        if (i == 4) {
            return WEATHER_WIDGET_POST_REMOVE;
        }
        if (i != 5) {
            return null;
        }
        return FLIGHT_LANDING;
    }

    /* renamed from: b */
    public static C62959cf m86790b() {
        return C53231gf.f139514a;
    }

    public final int getNumber() {
        return this.f139522g;
    }

    public final String toString() {
        return Integer.toString(this.f139522g);
    }
}
