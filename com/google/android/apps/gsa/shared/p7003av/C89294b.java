package com.google.android.apps.gsa.shared.p7003av;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.shared.av.b */
/* compiled from: PG */
public enum C89294b implements C62957cd {
    UNKNOWN(0),
    DESTROYED(1),
    STOPPED(2),
    PAUSED(3),
    RESUMED(4);
    

    /* renamed from: f */
    private final int f242104f;

    private C89294b(int i) {
        this.f242104f = i;
    }

    public final int getNumber() {
        return this.f242104f;
    }

    public final String toString() {
        return Integer.toString(this.f242104f);
    }
}
