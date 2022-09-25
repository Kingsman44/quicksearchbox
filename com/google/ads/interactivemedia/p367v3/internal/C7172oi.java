package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oi */
/* compiled from: PG */
final class C7172oi {

    /* renamed from: d */
    private static final byte[] f23244d = {0, 0, 1};

    /* renamed from: a */
    public int f23245a;

    /* renamed from: b */
    public int f23246b;

    /* renamed from: c */
    public byte[] f23247c = new byte[128];

    /* renamed from: e */
    private boolean f23248e;

    /* renamed from: a */
    public final void mo16225a() {
        this.f23248e = false;
        this.f23245a = 0;
        this.f23246b = 0;
    }

    /* renamed from: b */
    public final boolean mo16226b(int i, int i2) {
        if (this.f23248e) {
            int i3 = this.f23245a - i2;
            this.f23245a = i3;
            if (this.f23246b == 0 && i == 181) {
                this.f23246b = i3;
            } else {
                this.f23248e = false;
                return true;
            }
        } else if (i == 179) {
            this.f23248e = true;
        }
        mo16227c(f23244d, 0, 3);
        return false;
    }

    /* renamed from: c */
    public final void mo16227c(byte[] bArr, int i, int i2) {
        if (this.f23248e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f23247c;
            int length = bArr2.length;
            int i4 = this.f23245a + i3;
            if (length < i4) {
                this.f23247c = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f23247c, this.f23245a, i3);
            this.f23245a += i3;
        }
    }
}
