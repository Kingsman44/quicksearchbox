package com.google.android.apps.search.podcasts.p10591p;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.podcasts.p.q */
/* compiled from: PG */
public enum C140751q implements C62957cd {
    UNKNOWN_EVENT(0),
    PLAYBACK_REQUESTED(1),
    PLAYBACK_STARTED(2),
    PLAYBACK_COMPLETED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f382212f;

    private C140751q(int i) {
        this.f382212f = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f382212f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
