package com.google.common.p4522b;

import java.util.Arrays;

/* renamed from: com.google.common.b.pa */
/* compiled from: PG */
public final class C58708pa extends C58706oz {

    /* renamed from: f */
    transient long[] f156450f;

    /* renamed from: g */
    private transient int f156451g;

    /* renamed from: h */
    private transient int f156452h;

    public C58708pa() {
        super(3);
    }

    /* renamed from: s */
    private final int m90477s(int i) {
        return (int) (this.f156450f[i] >>> 32);
    }

    /* renamed from: a */
    public final int mo55792a() {
        int i = this.f156451g;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* renamed from: e */
    public final int mo55796e(int i) {
        int i2 = (int) this.f156450f[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    /* renamed from: f */
    public final int mo55797f(int i, int i2) {
        return i == this.f156439c ? i2 : i;
    }

    /* renamed from: l */
    public final void mo55803l() {
        super.mo55803l();
        this.f156451g = -2;
        this.f156452h = -2;
    }

    /* renamed from: n */
    public final void mo55805n(int i, Object obj, int i2, int i3) {
        super.mo55805n(i, obj, i2, i3);
        m90478t(this.f156452h, i);
        m90478t(i, -2);
    }

    /* renamed from: o */
    public final void mo55806o(int i) {
        int i2 = this.f156439c - 1;
        m90478t(m90477s(i), (int) this.f156450f[i]);
        if (i < i2) {
            m90478t(m90477s(i2), i);
            m90478t(i, (int) this.f156450f[i2]);
        }
        super.mo55806o(i);
    }

    /* renamed from: p */
    public final void mo55807p(int i) {
        super.mo55807p(i);
        long[] jArr = this.f156450f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f156450f = copyOf;
        Arrays.fill(copyOf, length, i, -1);
    }

    /* renamed from: r */
    public final void mo55809r(int i) {
        super.mo55809r(i);
        this.f156451g = -2;
        this.f156452h = -2;
        long[] jArr = new long[i];
        this.f156450f = jArr;
        Arrays.fill(jArr, -1);
    }

    public C58708pa(byte[] bArr) {
        super(3);
    }

    /* renamed from: t */
    private final void m90478t(int i, int i2) {
        if (i == -2) {
            this.f156451g = i2;
            i = -2;
        } else {
            long[] jArr = this.f156450f;
            jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f156452h = i;
            return;
        }
        long[] jArr2 = this.f156450f;
        jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
    }

    public C58708pa(C58706oz ozVar) {
        mo55809r(ozVar.f156439c);
        int a = ozVar.mo55792a();
        while (a != -1) {
            mo55798g(ozVar.mo55802k(a), ozVar.mo55794c(a));
            a = ozVar.mo55796e(a);
        }
    }
}
