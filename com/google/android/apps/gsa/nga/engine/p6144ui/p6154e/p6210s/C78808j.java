package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.j */
/* compiled from: PG */
public enum C78808j implements C62957cd {
    ESCAPE_HATCH(0),
    APP_SHORTCUTS(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f216907d;

    private C78808j(int i) {
        this.f216907d = i;
    }

    /* renamed from: a */
    public static C78808j m126594a(int i) {
        if (i == 0) {
            return ESCAPE_HATCH;
        }
        if (i != 1) {
            return null;
        }
        return APP_SHORTCUTS;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f216907d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
