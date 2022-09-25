package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: com.google.common.b.oz */
/* compiled from: PG */
public class C58706oz {

    /* renamed from: a */
    transient Object[] f156437a;

    /* renamed from: b */
    transient int[] f156438b;

    /* renamed from: c */
    transient int f156439c;

    /* renamed from: d */
    transient int f156440d;

    /* renamed from: e */
    transient long[] f156441e;

    /* renamed from: f */
    private transient int[] f156442f;

    /* renamed from: g */
    private transient float f156443g;

    /* renamed from: h */
    private transient int f156444h;

    public C58706oz() {
        mo55809r(3);
    }

    /* renamed from: s */
    private final int m90454s() {
        return this.f156442f.length - 1;
    }

    /* renamed from: t */
    private static long m90455t(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: u */
    private final void m90456u(int i) {
        if (this.f156442f.length >= 1073741824) {
            this.f156444h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f156443g)) + 1;
        int[] v = m90457v(i);
        long[] jArr = this.f156441e;
        int length = v.length - 1;
        for (int i3 = 0; i3 < this.f156439c; i3++) {
            int i4 = (int) (jArr[i3] >>> 32);
            int i5 = i4 & length;
            int i6 = v[i5];
            v[i5] = i3;
            jArr[i3] = (((long) i4) << 32) | (((long) i6) & 4294967295L);
        }
        this.f156444h = i2;
        this.f156442f = v;
    }

    /* renamed from: v */
    private static int[] m90457v(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: a */
    public int mo55792a() {
        return this.f156439c == 0 ? -1 : 0;
    }

    /* renamed from: b */
    public final int mo55793b(Object obj) {
        int d = mo55795d(obj);
        if (d == -1) {
            return 0;
        }
        return this.f156438b[d];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo55794c(int i) {
        C58838bb.m90861B(i, this.f156439c, "index");
        return this.f156438b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo55795d(Object obj) {
        int b = C58462fy.m89758b(obj);
        int i = this.f156442f[m90454s() & b];
        while (i != -1) {
            long j = this.f156441e[i];
            if (((int) (j >>> 32)) == b && C58832aw.m90831a(obj, this.f156437a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* renamed from: e */
    public int mo55796e(int i) {
        int i2 = i + 1;
        if (i2 < this.f156439c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: f */
    public int mo55797f(int i, int i2) {
        return i - 1;
    }

    /* renamed from: g */
    public final int mo55798g(Object obj, int i) {
        C58371co.m89407b(i, "count");
        long[] jArr = this.f156441e;
        Object[] objArr = this.f156437a;
        int[] iArr = this.f156438b;
        int b = C58462fy.m89758b(obj);
        int s = m90454s() & b;
        int i2 = this.f156439c;
        int[] iArr2 = this.f156442f;
        int i3 = iArr2[s];
        if (i3 == -1) {
            iArr2[s] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) != b || !C58832aw.m90831a(obj, objArr[i3])) {
                    int i4 = (int) j;
                    if (i4 == -1) {
                        jArr[i3] = m90455t(j, i2);
                        break;
                    }
                    i3 = i4;
                } else {
                    int i5 = iArr[i3];
                    iArr[i3] = i;
                    return i5;
                }
            }
        }
        int i6 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i7 = i2 + 1;
            int length = this.f156441e.length;
            if (i7 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max >= 0) {
                    i6 = max;
                }
                if (i6 != length) {
                    mo55807p(i6);
                }
            }
            mo55805n(i2, obj, i, b);
            this.f156439c = i7;
            if (i2 >= this.f156444h) {
                int length2 = this.f156442f.length;
                m90456u(length2 + length2);
            }
            this.f156440d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: h */
    public final int mo55799h(Object obj, int i) {
        int s = m90454s() & i;
        int i2 = this.f156442f[s];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (((int) (this.f156441e[i2] >>> 32)) != i || !C58832aw.m90831a(obj, this.f156437a[i2])) {
                    int i4 = (int) this.f156441e[i2];
                    if (i4 == -1) {
                        break;
                    }
                    int i5 = i4;
                    i3 = i2;
                    i2 = i5;
                } else {
                    int i6 = this.f156438b[i2];
                    if (i3 == -1) {
                        this.f156442f[s] = (int) this.f156441e[i2];
                    } else {
                        long[] jArr = this.f156441e;
                        jArr[i3] = m90455t(jArr[i3], (int) jArr[i2]);
                    }
                    mo55806o(i2);
                    this.f156439c--;
                    this.f156440d++;
                    return i6;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo55800i(int i) {
        return mo55799h(this.f156437a[i], (int) (this.f156441e[i] >>> 32));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C58691ok mo55801j(int i) {
        C58838bb.m90861B(i, this.f156439c, "index");
        return new C58705oy(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Object mo55802k(int i) {
        C58838bb.m90861B(i, this.f156439c, "index");
        return this.f156437a[i];
    }

    /* renamed from: l */
    public void mo55803l() {
        this.f156440d++;
        Arrays.fill(this.f156437a, 0, this.f156439c, (Object) null);
        Arrays.fill(this.f156438b, 0, this.f156439c, 0);
        Arrays.fill(this.f156442f, -1);
        Arrays.fill(this.f156441e, -1);
        this.f156439c = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo55804m(int i) {
        if (i > this.f156441e.length) {
            mo55807p(i);
        }
        if (i >= this.f156444h) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            m90456u(Math.max(2, highestOneBit + highestOneBit));
        }
    }

    /* renamed from: n */
    public void mo55805n(int i, Object obj, int i2, int i3) {
        this.f156441e[i] = (((long) i3) << 32) | 4294967295L;
        this.f156437a[i] = obj;
        this.f156438b[i] = i2;
    }

    /* renamed from: o */
    public void mo55806o(int i) {
        int i2 = this.f156439c - 1;
        if (i < i2) {
            Object[] objArr = this.f156437a;
            objArr[i] = objArr[i2];
            int[] iArr = this.f156438b;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.f156441e;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int s = m90454s() & ((int) (j >>> 32));
            int[] iArr2 = this.f156442f;
            int i3 = iArr2[s];
            if (i3 != i2) {
                while (true) {
                    long[] jArr2 = this.f156441e;
                    long j2 = jArr2[i3];
                    int i4 = (int) j2;
                    if (i4 != i2) {
                        i3 = i4;
                    } else {
                        jArr2[i3] = m90455t(j2, i);
                        return;
                    }
                }
            } else {
                iArr2[s] = i;
            }
        } else {
            this.f156437a[i] = null;
            this.f156438b[i] = 0;
            this.f156441e[i] = -1;
        }
    }

    /* renamed from: p */
    public void mo55807p(int i) {
        this.f156437a = Arrays.copyOf(this.f156437a, i);
        this.f156438b = Arrays.copyOf(this.f156438b, i);
        long[] jArr = this.f156441e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f156441e = copyOf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo55808q(int i, int i2) {
        C58838bb.m90861B(i, this.f156439c, "index");
        this.f156438b[i] = i2;
    }

    /* renamed from: r */
    public void mo55809r(int i) {
        C58838bb.m90869d(i >= 0, "Initial capacity must be non-negative");
        int c = C58462fy.m89759c(i);
        this.f156442f = m90457v(c);
        this.f156443g = 1.0f;
        this.f156437a = new Object[i];
        this.f156438b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f156441e = jArr;
        this.f156444h = Math.max(1, (int) ((float) c));
    }

    public C58706oz(int i) {
        mo55809r(i);
    }

    public C58706oz(C58706oz ozVar) {
        mo55809r(ozVar.f156439c);
        int a = ozVar.mo55792a();
        while (a != -1) {
            mo55798g(ozVar.mo55802k(a), ozVar.mo55794c(a));
            a = ozVar.mo55796e(a);
        }
    }
}
