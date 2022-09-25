package com.google.ads.interactivemedia.p367v3.internal;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jv */
/* compiled from: PG */
public final class C7050jv implements abu {

    /* renamed from: a */
    private final byte[] f22578a = new byte[4096];

    /* renamed from: b */
    private final abu f22579b;

    /* renamed from: c */
    private final long f22580c;

    /* renamed from: d */
    private long f22581d;

    /* renamed from: e */
    private byte[] f22582e = new byte[65536];

    /* renamed from: f */
    private int f22583f;

    /* renamed from: g */
    private int f22584g;

    public C7050jv(abu abu, long j, long j2) {
        this.f22579b = abu;
        this.f22581d = j;
        this.f22580c = j2;
    }

    /* renamed from: o */
    private final void m20901o(int i) {
        int i2 = this.f22583f + i;
        int length = this.f22582e.length;
        if (i2 > length) {
            this.f22582e = Arrays.copyOf(this.f22582e, aeu.m18490H(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: p */
    private final int m20902p(int i) {
        int min = Math.min(this.f22584g, i);
        m20904r(min);
        return min;
    }

    /* renamed from: q */
    private final int m20903q(byte[] bArr, int i, int i2) {
        int i3 = this.f22584g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f22582e, 0, bArr, i, min);
        m20904r(min);
        return min;
    }

    /* renamed from: r */
    private final void m20904r(int i) {
        int i2 = this.f22584g - i;
        this.f22584g = i2;
        this.f22583f = 0;
        byte[] bArr = this.f22582e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f22582e = bArr2;
    }

    /* renamed from: s */
    private final int m20905s(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.f22579b.mo14388a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: t */
    private final void m20906t(int i) {
        if (i != -1) {
            this.f22581d += (long) i;
        }
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        int q = m20903q(bArr, i, i2);
        if (q == 0) {
            q = m20905s(bArr, i, i2, 0, true);
        }
        m20906t(q);
        return q;
    }

    /* renamed from: b */
    public final boolean mo16089b(byte[] bArr, int i, int i2, boolean z) {
        int q = m20903q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = m20905s(bArr, i, i2, q, z);
        }
        m20906t(q);
        return q != -1;
    }

    /* renamed from: c */
    public final void mo16090c(byte[] bArr, int i, int i2) {
        mo16089b(bArr, i, i2, false);
    }

    /* renamed from: d */
    public final void mo16091d(int i) {
        int p = m20902p(i);
        while (p < i && p != -1) {
            p = m20905s(this.f22578a, -p, Math.min(i, p + 4096), p, false);
        }
        m20906t(p);
    }

    /* renamed from: e */
    public final int mo16092e(byte[] bArr, int i, int i2) {
        int i3;
        m20901o(i2);
        int i4 = this.f22584g;
        int i5 = this.f22583f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m20905s(this.f22582e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f22584g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f22582e, this.f22583f, bArr, i, i3);
        this.f22583f += i3;
        return i3;
    }

    /* renamed from: f */
    public final boolean mo16093f(byte[] bArr, int i, int i2, boolean z) {
        if (!mo16095h(i2, z)) {
            return false;
        }
        System.arraycopy(this.f22582e, this.f22583f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: g */
    public final void mo16094g(byte[] bArr, int i, int i2) {
        mo16093f(bArr, i, i2, false);
    }

    /* renamed from: h */
    public final boolean mo16095h(int i, boolean z) {
        m20901o(i);
        int i2 = this.f22584g - this.f22583f;
        while (i2 < i) {
            i2 = m20905s(this.f22582e, this.f22583f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f22584g = this.f22583f + i2;
        }
        this.f22583f += i;
        return true;
    }

    /* renamed from: i */
    public final void mo16096i(int i) {
        mo16095h(i, false);
    }

    /* renamed from: j */
    public final void mo16097j() {
        this.f22583f = 0;
    }

    /* renamed from: k */
    public final long mo16098k() {
        return this.f22581d + ((long) this.f22583f);
    }

    /* renamed from: l */
    public final long mo16099l() {
        return this.f22581d;
    }

    /* renamed from: m */
    public final long mo16100m() {
        return this.f22580c;
    }

    /* renamed from: n */
    public final int mo16101n() {
        int p = m20902p(1);
        if (p == 0) {
            p = m20905s(this.f22578a, 0, Math.min(1, 4096), 0, true);
        }
        m20906t(p);
        return p;
    }
}
