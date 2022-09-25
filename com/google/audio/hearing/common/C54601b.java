package com.google.audio.hearing.common;

import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.audio.hearing.common.b */
/* compiled from: PG */
public final class C54601b {

    /* renamed from: a */
    public static final C59071e f143354a = C59071e.m91332i("com.google.audio.hearing.common.b");

    /* renamed from: b */
    public final byte[] f143355b;

    /* renamed from: c */
    public final int f143356c;

    /* renamed from: d */
    public long f143357d = 0;

    /* renamed from: e */
    public final ArrayList f143358e = new ArrayList();

    /* renamed from: f */
    private int f143359f = 0;

    public C54601b(int i) {
        this.f143355b = new byte[i];
        this.f143356c = i;
    }

    /* renamed from: a */
    public final synchronized long mo54142a() {
        return this.f143357d;
    }

    /* renamed from: b */
    public final synchronized boolean mo54143b(byte[] bArr, int i) {
        int i2 = this.f143356c;
        if (i > i2) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i3 = this.f143359f;
        if (i3 + i <= i2) {
            System.arraycopy(bArr, 0, this.f143355b, i3, i);
        } else {
            int i4 = i2 - i3;
            System.arraycopy(bArr, 0, this.f143355b, i3, i4);
            System.arraycopy(bArr, i4, this.f143355b, 0, i - i4);
        }
        this.f143359f = (this.f143359f + i) % this.f143356c;
        this.f143357d += (long) i;
        return true;
    }
}
