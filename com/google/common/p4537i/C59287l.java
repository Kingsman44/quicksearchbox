package com.google.common.p4537i;

import java.io.Serializable;

/* renamed from: com.google.common.i.l */
/* compiled from: PG */
final class C59287l extends C59289n implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final int f157413a;

    public C59287l(int i) {
        this.f157413a = i;
    }

    /* renamed from: a */
    public final int mo56771a() {
        return this.f157413a;
    }

    /* renamed from: b */
    public final int mo56772b() {
        return 32;
    }

    /* renamed from: c */
    public final long mo56773c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    /* renamed from: d */
    public final boolean mo56774d(C59289n nVar) {
        return this.f157413a == nVar.mo56771a();
    }

    /* renamed from: e */
    public final byte[] mo56775e() {
        int i = this.f157413a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
