package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.s */
/* compiled from: PG */
public enum C124721s implements C62957cd {
    UNKNOWN_DEVICE_TYPE(0),
    BAYWOLF(1),
    APOLLO(2),
    GENERIC_SCALED(3),
    SCOUT(4),
    WIRED(5);
    

    /* renamed from: g */
    public final int f344111g;

    private C124721s(int i) {
        this.f344111g = i;
    }

    /* renamed from: a */
    public static C124721s m204382a(int i) {
        if (i == 0) {
            return UNKNOWN_DEVICE_TYPE;
        }
        if (i == 1) {
            return BAYWOLF;
        }
        if (i == 2) {
            return APOLLO;
        }
        if (i == 3) {
            return GENERIC_SCALED;
        }
        if (i == 4) {
            return SCOUT;
        }
        if (i != 5) {
            return null;
        }
        return WIRED;
    }

    /* renamed from: b */
    public static C62959cf m204383b() {
        return C124720r.f344103a;
    }

    public final int getNumber() {
        return this.f344111g;
    }

    public final String toString() {
        return Integer.toString(this.f344111g);
    }
}
