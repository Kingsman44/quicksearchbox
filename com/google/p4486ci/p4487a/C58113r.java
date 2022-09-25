package com.google.p4486ci.p4487a;

import com.google.common.base.C58838bb;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.ci.a.r */
/* compiled from: PG */
public final class C58113r implements C58097b {

    /* renamed from: a */
    private final byte[] f155353a;

    /* renamed from: b */
    private int f155354b;

    /* renamed from: c */
    private int f155355c;

    public C58113r(byte[] bArr) {
        this.f155353a = bArr;
    }

    /* renamed from: a */
    public final synchronized int mo54639a(byte[] bArr, int i, int i2) {
        C58838bb.m90869d(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f155354b;
        int length = this.f155353a.length;
        if (i3 == length) {
            return 0;
        }
        int min = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < min; i4++) {
            byte[] bArr2 = this.f155353a;
            int i5 = this.f155354b;
            bArr[i + i4] = bArr2[i5];
            this.f155354b = i5 + 1;
        }
        return min;
    }

    /* renamed from: b */
    public final synchronized long mo54640b() {
        return (long) this.f155355c;
    }

    /* renamed from: c */
    public final synchronized long mo54641c() {
        return Long.MAX_VALUE;
    }

    public final synchronized void close() {
    }

    /* renamed from: d */
    public final synchronized long mo54643d() {
        return (long) this.f155354b;
    }

    /* renamed from: e */
    public final synchronized long mo54644e() {
        return (long) this.f155353a.length;
    }

    /* renamed from: f */
    public final synchronized long mo54645f(long j) {
        long min;
        min = Math.min(j, (long) (this.f155353a.length - this.f155354b));
        this.f155354b = (int) (((long) this.f155354b) + min);
        return min;
    }

    /* renamed from: g */
    public final synchronized void mo54646g() {
        this.f155355c = this.f155354b;
    }

    /* renamed from: h */
    public final synchronized void mo54647h() {
        this.f155354b = this.f155355c;
    }

    /* renamed from: i */
    public final synchronized boolean mo54648i() {
        return this.f155354b < this.f155353a.length;
    }

    public C58113r(String str) {
        try {
            this.f155353a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
