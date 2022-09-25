package com.google.android.apps.search.sceneviewer.p10650e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.sceneviewer.e.a */
/* compiled from: PG */
public enum C141547a implements C62957cd {
    SUCCESS(0),
    NOT_SUPPORTED(1),
    MALFORMED_PAYLOAD(2),
    MISSING_PAYLOAD_FIELDS(3),
    INFEASIBLE(4),
    OTHER_FAILURES(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f384202h;

    private C141547a(int i) {
        this.f384202h = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f384202h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
