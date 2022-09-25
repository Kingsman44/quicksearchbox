package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.app */
/* compiled from: PG */
final class C6801app {

    /* renamed from: a */
    private auh f21359a;

    /* renamed from: b */
    private byte[] f21360b;

    /* renamed from: c */
    private final int f21361c = 239;

    public C6801app() {
        mo15149a();
    }

    /* renamed from: a */
    public final void mo15149a() {
        byte[] bArr = new byte[this.f21361c];
        this.f21360b = bArr;
        this.f21359a = auh.m19651a(bArr);
    }

    /* renamed from: b */
    public final void mo15150b(int i, long j) {
        auh auh = this.f21359a;
        auh.mo15449e(i, 0);
        auh.mo15451h(j);
    }

    /* renamed from: c */
    public final void mo15151c(int i, String str) {
        auh auh = this.f21359a;
        auh.mo15449e(i, 2);
        auh.mo15446b(str);
    }

    /* renamed from: d */
    public final byte[] mo15152d() {
        int c = this.f21359a.mo15447c();
        if (c < 0) {
            throw new IOException();
        } else if (c == 0) {
            return this.f21360b;
        } else {
            byte[] bArr = this.f21360b;
            int length = bArr.length - c;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
    }
}
