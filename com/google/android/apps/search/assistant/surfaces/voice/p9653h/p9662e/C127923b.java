package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.e.b */
/* compiled from: PG */
public enum C127923b implements C62957cd {
    UNKNOWN(0),
    ONLINE(1),
    SODA(2),
    ORCHESTRATION(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f352133f;

    private C127923b(int i) {
        this.f352133f = i;
    }

    /* renamed from: a */
    public static C127923b m209045a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ONLINE;
        }
        if (i == 2) {
            return SODA;
        }
        if (i != 3) {
            return null;
        }
        return ORCHESTRATION;
    }

    /* renamed from: b */
    public static C62959cf m209046b() {
        return C127922a.f352126a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f352133f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
