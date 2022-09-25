package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kq */
/* compiled from: PG */
public final class C7072kq {

    /* renamed from: a */
    public final int f22632a;

    /* renamed from: b */
    public final byte[] f22633b;

    /* renamed from: c */
    public final int f22634c;

    /* renamed from: d */
    public final int f22635d;

    public C7072kq(int i, byte[] bArr, int i2, int i3) {
        this.f22632a = i;
        this.f22633b = bArr;
        this.f22634c = i2;
        this.f22635d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7072kq kqVar = (C7072kq) obj;
            return this.f22632a == kqVar.f22632a && this.f22634c == kqVar.f22634c && this.f22635d == kqVar.f22635d && Arrays.equals(this.f22633b, kqVar.f22633b);
        }
    }

    public final int hashCode() {
        return (((((this.f22632a * 31) + Arrays.hashCode(this.f22633b)) * 31) + this.f22634c) * 31) + this.f22635d;
    }
}
