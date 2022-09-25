package com.google.common.p4537i;

import java.io.Serializable;

/* renamed from: com.google.common.i.m */
/* compiled from: PG */
final class C59288m extends C59289n implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final long f157414a;

    public C59288m(long j) {
        this.f157414a = j;
    }

    /* renamed from: a */
    public final int mo56771a() {
        return (int) this.f157414a;
    }

    /* renamed from: b */
    public final int mo56772b() {
        return 64;
    }

    /* renamed from: c */
    public final long mo56773c() {
        return this.f157414a;
    }

    /* renamed from: d */
    public final boolean mo56774d(C59289n nVar) {
        return this.f157414a == nVar.mo56773c();
    }

    /* renamed from: e */
    public final byte[] mo56775e() {
        long j = this.f157414a;
        return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
    }
}
