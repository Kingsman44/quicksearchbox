package com.google.common.p4537i;

import java.io.Serializable;
import java.util.zip.Checksum;

/* renamed from: com.google.common.i.i */
/* compiled from: PG */
final class C59284i extends C59277b implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C59295t f157409a;

    /* renamed from: b */
    private final String f157410b;

    public C59284i(C59295t tVar, String str) {
        this.f157409a = tVar;
        this.f157410b = str;
    }

    /* renamed from: e */
    public final C59291p mo56748e() {
        return new C59283h((Checksum) this.f157409a.mo6453a());
    }

    public final String toString() {
        return this.f157410b;
    }
}
