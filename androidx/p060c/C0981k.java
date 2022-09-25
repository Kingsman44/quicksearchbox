package androidx.p060c;

import androidx.p060c.p061a.C0969a;

/* renamed from: androidx.c.k */
/* compiled from: PG */
public final class C0981k implements Cloneable {

    /* renamed from: a */
    private boolean f3106a;

    /* renamed from: b */
    private long[] f3107b;

    /* renamed from: c */
    private Object[] f3108c;

    /* renamed from: d */
    private int f3109d;

    public C0981k() {
        this(10);
    }

    /* renamed from: n */
    private final void m2940n() {
        int i = this.f3109d;
        long[] jArr = this.f3107b;
        Object[] objArr = this.f3108c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != C0982l.f3110a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3106a = false;
        this.f3109d = i2;
    }

    /* renamed from: a */
    public final int mo3673a(long j) {
        if (this.f3106a) {
            m2940n();
        }
        return C0969a.m2916b(this.f3107b, this.f3109d, j);
    }

    /* renamed from: b */
    public final int mo3674b(Object obj) {
        if (this.f3106a) {
            m2940n();
        }
        int i = this.f3109d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3108c[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo3675c() {
        if (this.f3106a) {
            m2940n();
        }
        return this.f3109d;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C0981k kVar = (C0981k) super.clone();
        kVar.f3107b = (long[]) this.f3107b.clone();
        kVar.f3108c = (Object[]) this.f3108c.clone();
        return kVar;
    }

    /* renamed from: e */
    public final Object mo3678e(long j) {
        Object obj;
        int b = C0969a.m2916b(this.f3107b, this.f3109d, j);
        if (b < 0 || (obj = this.f3108c[b]) == C0982l.f3110a) {
            return null;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f3108c[r3];
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3679f(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            long[] r0 = r2.f3107b
            int r1 = r2.f3109d
            int r3 = androidx.p060c.p061a.C0969a.m2916b(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f3108c
            r3 = r4[r3]
            java.lang.Object r4 = androidx.p060c.C0982l.f3110a
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060c.C0981k.mo3679f(long, java.lang.Object):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo3681h() {
        int i = this.f3109d;
        Object[] objArr = this.f3108c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3109d = 0;
        this.f3106a = false;
    }

    /* renamed from: i */
    public final void mo3682i(long j, Object obj) {
        int b = C0969a.m2916b(this.f3107b, this.f3109d, j);
        if (b >= 0) {
            this.f3108c[b] = obj;
            return;
        }
        int i = b ^ -1;
        int i2 = this.f3109d;
        if (i < i2) {
            Object[] objArr = this.f3108c;
            if (objArr[i] == C0982l.f3110a) {
                this.f3107b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3106a && i2 >= this.f3107b.length) {
            m2940n();
            i = C0969a.m2916b(this.f3107b, this.f3109d, j) ^ -1;
        }
        int i3 = this.f3109d;
        long[] jArr = this.f3107b;
        int length = jArr.length;
        if (i3 >= length) {
            int e = C0969a.m2919e(i3 + 1);
            long[] jArr2 = new long[e];
            Object[] objArr2 = new Object[e];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            Object[] objArr3 = this.f3108c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3107b = jArr2;
            this.f3108c = objArr2;
        }
        int i4 = this.f3109d - i;
        if (i4 != 0) {
            long[] jArr3 = this.f3107b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4);
            Object[] objArr4 = this.f3108c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f3109d - i);
        }
        this.f3107b[i] = j;
        this.f3108c[i] = obj;
        this.f3109d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f3108c;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3683j(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f3107b
            int r1 = r2.f3109d
            int r3 = androidx.p060c.p061a.C0969a.m2916b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f3108c
            r0 = r4[r3]
            java.lang.Object r1 = androidx.p060c.C0982l.f3110a
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f3106a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060c.C0981k.mo3683j(long):void");
    }

    /* renamed from: k */
    public final void mo3684k(int i) {
        Object[] objArr = this.f3108c;
        Object obj = objArr[i];
        Object obj2 = C0982l.f3110a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f3106a = true;
        }
    }

    /* renamed from: l */
    public final boolean mo3685l(long j) {
        return mo3673a(j) >= 0;
    }

    /* renamed from: m */
    public final boolean mo3686m() {
        return mo3675c() == 0;
    }

    public final String toString() {
        if (mo3675c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3109d * 28);
        sb.append('{');
        int i = this.f3109d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(mo3677d(i2));
            sb.append('=');
            Object g = mo3680g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0981k(int i) {
        if (i == 0) {
            this.f3107b = C0969a.f3085b;
            this.f3108c = C0969a.f3086c;
            return;
        }
        int e = C0969a.m2919e(i);
        this.f3107b = new long[e];
        this.f3108c = new Object[e];
    }

    /* renamed from: d */
    public final long mo3677d(int i) {
        if (i < 0 || i >= this.f3109d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.f3106a) {
            m2940n();
        }
        return this.f3107b[i];
    }

    /* renamed from: g */
    public final Object mo3680g(int i) {
        if (i < 0 || i >= this.f3109d) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.f3106a) {
            m2940n();
        }
        return this.f3108c[i];
    }
}
