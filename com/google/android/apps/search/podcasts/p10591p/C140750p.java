package com.google.android.apps.search.podcasts.p10591p;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.podcasts.p.p */
/* compiled from: PG */
public enum C140750p implements C62957cd {
    UNKNOWN_ERROR(0),
    PLAYBACK_ERROR(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f382205d;

    private C140750p(int i) {
        this.f382205d = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f382205d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
