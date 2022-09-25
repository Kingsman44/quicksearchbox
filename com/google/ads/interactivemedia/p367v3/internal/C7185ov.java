package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ov */
/* compiled from: PG */
final class C7185ov {

    /* renamed from: a */
    public byte[] f23407a;

    /* renamed from: b */
    public int f23408b;

    /* renamed from: c */
    private final int f23409c;

    /* renamed from: d */
    private boolean f23410d;

    /* renamed from: e */
    private boolean f23411e;

    public C7185ov(int i) {
        this.f23409c = i;
        byte[] bArr = new byte[131];
        this.f23407a = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo16250a() {
        this.f23410d = false;
        this.f23411e = false;
    }

    /* renamed from: b */
    public final boolean mo16251b() {
        return this.f23411e;
    }

    /* renamed from: c */
    public final void mo16252c(int i) {
        boolean z = true;
        ary.m19464q(!this.f23410d);
        if (i != this.f23409c) {
            z = false;
        }
        this.f23410d = z;
        if (z) {
            this.f23408b = 3;
            this.f23411e = false;
        }
    }

    /* renamed from: d */
    public final void mo16253d(byte[] bArr, int i, int i2) {
        if (this.f23410d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f23407a;
            int length = bArr2.length;
            int i4 = this.f23408b + i3;
            if (length < i4) {
                this.f23407a = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f23407a, this.f23408b, i3);
            this.f23408b += i3;
        }
    }

    /* renamed from: e */
    public final boolean mo16254e(int i) {
        if (!this.f23410d) {
            return false;
        }
        this.f23408b -= i;
        this.f23410d = false;
        this.f23411e = true;
        return true;
    }
}
