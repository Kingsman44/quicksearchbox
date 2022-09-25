package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.dm */
/* compiled from: PG */
public enum C142388dm implements C62957cd {
    ACTIVE_AUDIO_SOURCE_UNSPECIFIED(0),
    ACTIVE_AUDIO_SOURCE_UNSUPPORTED(1),
    ACTIVE_AUDIO_SOURCE_NONE(2),
    ACTIVE_AUDIO_SOURCE_PRIMARY(3),
    ACTIVE_AUDIO_SOURCE_SECONDARY(4);
    

    /* renamed from: f */
    public final int f386382f;

    private C142388dm(int i) {
        this.f386382f = i;
    }

    /* renamed from: a */
    public static C142388dm m231072a(int i) {
        if (i == 0) {
            return ACTIVE_AUDIO_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTIVE_AUDIO_SOURCE_UNSUPPORTED;
        }
        if (i == 2) {
            return ACTIVE_AUDIO_SOURCE_NONE;
        }
        if (i == 3) {
            return ACTIVE_AUDIO_SOURCE_PRIMARY;
        }
        if (i != 4) {
            return null;
        }
        return ACTIVE_AUDIO_SOURCE_SECONDARY;
    }

    /* renamed from: b */
    public static C62959cf m231073b() {
        return C142387dl.f386375a;
    }

    public final int getNumber() {
        return this.f386382f;
    }

    public final String toString() {
        return Integer.toString(this.f386382f);
    }
}
