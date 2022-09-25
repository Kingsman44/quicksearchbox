package com.google.android.libraries.assistant.p1467d.p1471b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.d.b.i */
/* compiled from: PG */
public enum C17823i implements C62957cd {
    UNKNOWN(0),
    STOPPED(1),
    RUNNING_IN_BACKGROUND(3),
    GUIDED_NAVIGATION_IN_FOREGROUND(4),
    FREE_NAVIGATION_IN_FOREGROUND(5);
    

    /* renamed from: f */
    public final int f51144f;

    private C17823i(int i) {
        this.f51144f = i;
    }

    /* renamed from: a */
    public static C17823i m35069a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STOPPED;
        }
        if (i == 3) {
            return RUNNING_IN_BACKGROUND;
        }
        if (i == 4) {
            return GUIDED_NAVIGATION_IN_FOREGROUND;
        }
        if (i != 5) {
            return null;
        }
        return FREE_NAVIGATION_IN_FOREGROUND;
    }

    /* renamed from: b */
    public static C62959cf m35070b() {
        return C17822h.f51137a;
    }

    public final int getNumber() {
        return this.f51144f;
    }

    public final String toString() {
        return Integer.toString(this.f51144f);
    }
}
