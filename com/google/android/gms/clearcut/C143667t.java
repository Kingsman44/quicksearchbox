package com.google.android.gms.clearcut;

/* renamed from: com.google.android.gms.clearcut.t */
/* compiled from: PG */
public final class C143667t implements Comparable {

    /* renamed from: a */
    public final byte[] f389500a;

    public C143667t() {
        this((byte[]) null);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C143673z.f389506e.compare(this.f389500a, ((C143667t) obj).f389500a);
    }

    public final String toString() {
        return new String(this.f389500a, C143673z.f389502a);
    }

    public C143667t(byte[] bArr) {
        this.f389500a = bArr == null ? C143673z.f389503b : bArr;
    }
}
