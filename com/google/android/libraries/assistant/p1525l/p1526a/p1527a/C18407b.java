package com.google.android.libraries.assistant.p1525l.p1526a.p1527a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.l.a.a.b */
/* compiled from: PG */
public enum C18407b implements C62957cd {
    UNKNOWN_SOURCE(0),
    HOTWORD(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f52242d;

    private C18407b(int i) {
        this.f52242d = i;
    }

    /* renamed from: a */
    public static C18407b m35849a(int i) {
        if (i == 0) {
            return UNKNOWN_SOURCE;
        }
        if (i != 1) {
            return null;
        }
        return HOTWORD;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52242d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
