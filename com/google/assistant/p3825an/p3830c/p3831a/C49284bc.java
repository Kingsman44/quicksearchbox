package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.an.c.a.bc */
/* compiled from: PG */
public enum C49284bc implements C62957cd {
    UNSPECIFIED(0),
    APP_FEATURE(1),
    EXERCISE_ACTIVITY(2);
    

    /* renamed from: d */
    public final int f127384d;

    private C49284bc(int i) {
        this.f127384d = i;
    }

    /* renamed from: a */
    public static C49284bc m85403a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return APP_FEATURE;
        }
        if (i != 2) {
            return null;
        }
        return EXERCISE_ACTIVITY;
    }

    /* renamed from: b */
    public static C62959cf m85404b() {
        return C49283bb.f127379a;
    }

    public final int getNumber() {
        return this.f127384d;
    }

    public final String toString() {
        return Integer.toString(this.f127384d);
    }
}
