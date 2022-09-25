package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.m */
/* compiled from: PG */
public enum C124715m implements C62957cd {
    UNKNOWN_CONNECTIVITY_STATUS(0),
    NOT_CONNECTED(1),
    AUDIO_ONLY(2),
    DATA_ONLY(3),
    FULLY_CONNECTED(4),
    DATA_DISCONNECTED_AUDIO_UNKNOWN(5),
    GATT_CONNECTED(6);
    

    /* renamed from: h */
    public final int f344081h;

    private C124715m(int i) {
        this.f344081h = i;
    }

    /* renamed from: a */
    public static C124715m m204378a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONNECTIVITY_STATUS;
            case 1:
                return NOT_CONNECTED;
            case 2:
                return AUDIO_ONLY;
            case 3:
                return DATA_ONLY;
            case 4:
                return FULLY_CONNECTED;
            case 5:
                return DATA_DISCONNECTED_AUDIO_UNKNOWN;
            case 6:
                return GATT_CONNECTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m204379b() {
        return C124714l.f344072a;
    }

    public final int getNumber() {
        return this.f344081h;
    }

    public final String toString() {
        return Integer.toString(this.f344081h);
    }
}
