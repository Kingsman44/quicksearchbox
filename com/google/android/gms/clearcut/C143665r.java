package com.google.android.gms.clearcut;

/* renamed from: com.google.android.gms.clearcut.r */
/* compiled from: PG */
public final class C143665r {

    /* renamed from: a */
    protected final int f389499a;

    public C143665r(int i) {
        if (i > 0) {
            this.f389499a = i;
            return;
        }
        throw new IllegalArgumentException("bad alias: " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C143665r) && this.f389499a == ((C143665r) obj).f389499a;
    }
}
