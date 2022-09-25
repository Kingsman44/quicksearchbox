package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.i */
/* compiled from: PG */
public enum C124711i implements C62957cd {
    BUTTON_ACTION_UNKNOWN(0),
    BUTTON_ACTION_ASSISTANT(1),
    BUTTON_ACTION_NEXT_TRACK(2);
    

    /* renamed from: d */
    public final int f344062d;

    private C124711i(int i) {
        this.f344062d = i;
    }

    /* renamed from: a */
    public static C124711i m204374a(int i) {
        if (i == 0) {
            return BUTTON_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_ACTION_ASSISTANT;
        }
        if (i != 2) {
            return null;
        }
        return BUTTON_ACTION_NEXT_TRACK;
    }

    /* renamed from: b */
    public static C62959cf m204375b() {
        return C124710h.f344057a;
    }

    public final int getNumber() {
        return this.f344062d;
    }

    public final String toString() {
        return Integer.toString(this.f344062d);
    }
}
