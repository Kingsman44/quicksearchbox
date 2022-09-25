package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ari */
/* compiled from: PG */
public class ari {

    /* renamed from: a */
    Object[] f21448a;

    /* renamed from: b */
    int f21449b;

    /* renamed from: c */
    boolean f21450c;

    public ari() {
    }

    public ari(byte[] bArr) {
        this();
        ary.m19461n(4, "initialCapacity");
        this.f21448a = new Object[4];
        this.f21449b = 0;
    }

    /* renamed from: c */
    private void m19386c(int i) {
        Object[] objArr = this.f21448a;
        int length = objArr.length;
        if (length < i) {
            this.f21448a = Arrays.copyOf(objArr, m19385a(length, i));
            this.f21450c = false;
        } else if (this.f21450c) {
            this.f21448a = (Object[]) objArr.clone();
            this.f21450c = false;
        }
    }

    /* renamed from: b */
    public void mo15268b(Object obj) {
        aqd.m19282j(obj);
        m19386c(this.f21449b + 1);
        Object[] objArr = this.f21448a;
        int i = this.f21449b;
        this.f21449b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: a */
    static int m19385a(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
