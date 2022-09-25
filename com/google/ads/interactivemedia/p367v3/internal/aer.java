package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aer */
/* compiled from: PG */
public final class aer {

    /* renamed from: a */
    private long[] f20458a = new long[10];

    /* renamed from: b */
    private Object[] f20459b = new Object[10];

    /* renamed from: c */
    private int f20460c;

    /* renamed from: d */
    private int f20461d;

    /* renamed from: f */
    private final Object m18467f() {
        ary.m19464q(this.f20461d > 0);
        Object[] objArr = this.f20459b;
        int i = this.f20460c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f20460c = (i + 1) % objArr.length;
        this.f20461d--;
        return obj;
    }

    /* renamed from: a */
    public final synchronized void mo14592a(long j, Object obj) {
        int i = this.f20461d;
        if (i > 0) {
            if (j <= this.f20458a[((this.f20460c + i) - 1) % this.f20459b.length]) {
                mo14593b();
            }
        }
        int length = this.f20459b.length;
        if (this.f20461d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.f20460c;
            int i4 = length - i3;
            System.arraycopy(this.f20458a, i3, jArr, 0, i4);
            System.arraycopy(this.f20459b, this.f20460c, objArr, 0, i4);
            int i5 = this.f20460c;
            if (i5 > 0) {
                System.arraycopy(this.f20458a, 0, jArr, i4, i5);
                System.arraycopy(this.f20459b, 0, objArr, i4, this.f20460c);
            }
            this.f20458a = jArr;
            this.f20459b = objArr;
            this.f20460c = 0;
        }
        int i6 = this.f20460c;
        int i7 = this.f20461d;
        Object[] objArr2 = this.f20459b;
        int length2 = (i6 + i7) % objArr2.length;
        this.f20458a[length2] = j;
        objArr2[length2] = obj;
        this.f20461d = i7 + 1;
    }

    /* renamed from: b */
    public final synchronized void mo14593b() {
        this.f20460c = 0;
        this.f20461d = 0;
        Arrays.fill(this.f20459b, (Object) null);
    }

    /* renamed from: c */
    public final synchronized int mo14594c() {
        return this.f20461d;
    }

    /* renamed from: d */
    public final synchronized Object mo14595d() {
        if (this.f20461d == 0) {
            return null;
        }
        return m18467f();
    }

    /* renamed from: e */
    public final synchronized Object mo14596e(long j) {
        Object obj;
        obj = null;
        while (true) {
            if (this.f20461d <= 0) {
                break;
            } else if (j - this.f20458a[this.f20460c] < 0) {
                break;
            } else {
                obj = m18467f();
            }
        }
        return obj;
    }
}
