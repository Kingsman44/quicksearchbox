package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.b */
/* compiled from: PG */
public enum C34612b implements C62957cd {
    MODE_DEFAULT(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: c */
    private final int f91927c;

    private C34612b(int i) {
        this.f91927c = i;
    }

    /* renamed from: a */
    public static C34612b m63344a(int i) {
        if (i != 0) {
            return null;
        }
        return MODE_DEFAULT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f91927c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
