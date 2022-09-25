package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.m */
/* compiled from: PG */
public enum C128181m implements C62957cd {
    UNKNOWN(0),
    NEW_USER(1),
    INACTIVE_USER(2),
    OVER_APP(3);
    

    /* renamed from: e */
    public final int f352628e;

    private C128181m(int i) {
        this.f352628e = i;
    }

    /* renamed from: a */
    public static C128181m m209263a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NEW_USER;
        }
        if (i == 2) {
            return INACTIVE_USER;
        }
        if (i != 3) {
            return null;
        }
        return OVER_APP;
    }

    /* renamed from: b */
    public static C62959cf m209264b() {
        return C128180l.f352622a;
    }

    public final int getNumber() {
        return this.f352628e;
    }

    public final String toString() {
        return Integer.toString(this.f352628e);
    }
}
