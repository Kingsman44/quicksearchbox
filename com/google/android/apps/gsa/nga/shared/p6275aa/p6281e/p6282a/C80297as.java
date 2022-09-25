package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.as */
/* compiled from: PG */
public enum C80297as implements C62957cd {
    ACTION_UNSPECIFIED(0),
    CANCEL(1),
    CONFIRM(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f220367e;

    private C80297as(int i) {
        this.f220367e = i;
    }

    /* renamed from: a */
    public static C80297as m128116a(int i) {
        if (i == 0) {
            return ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return CANCEL;
        }
        if (i != 2) {
            return null;
        }
        return CONFIRM;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220367e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
