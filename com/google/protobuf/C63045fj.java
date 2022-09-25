package com.google.protobuf;

import java.util.Arrays;

/* renamed from: com.google.protobuf.fj */
/* compiled from: PG */
public final class C63045fj {

    /* renamed from: a */
    public static final C63045fj f170156a = new C63045fj(0, new int[0], new Object[0], false);

    /* renamed from: b */
    public int f170157b;

    /* renamed from: c */
    public int[] f170158c;

    /* renamed from: d */
    public Object[] f170159d;

    /* renamed from: e */
    public int f170160e;

    /* renamed from: f */
    public boolean f170161f;

    public C63045fj() {
        this(0, new int[8], new Object[8], true);
    }

    private C63045fj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f170160e = -1;
        this.f170157b = i;
        this.f170158c = iArr;
        this.f170159d = objArr;
        this.f170161f = z;
    }

    /* renamed from: b */
    static C63045fj m95891b(C63045fj fjVar, C63045fj fjVar2) {
        int i = fjVar.f170157b + fjVar2.f170157b;
        int[] copyOf = Arrays.copyOf(fjVar.f170158c, i);
        System.arraycopy(fjVar2.f170158c, 0, copyOf, fjVar.f170157b, fjVar2.f170157b);
        Object[] copyOf2 = Arrays.copyOf(fjVar.f170159d, i);
        System.arraycopy(fjVar2.f170159d, 0, copyOf2, fjVar.f170157b, fjVar2.f170157b);
        return new C63045fj(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    public final int mo59105a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f170160e;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f170157b; i6++) {
            int i7 = this.f170158c[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f170159d[i6]).longValue();
                    i = C62906an.m95321N(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int N = C62906an.m95321N(i8 << 3);
                    int d = ((C63088z) this.f170159d[i6]).mo59031d();
                    i5 += N + C62906an.m95321N(d) + d;
                } else if (i9 == 3) {
                    int M = C62906an.m95320M(i8);
                    i3 = M + M;
                    i2 = ((C63045fj) this.f170159d[i6]).mo59105a();
                } else if (i9 == 5) {
                    ((Integer) this.f170159d[i6]).intValue();
                    i = C62906an.m95321N(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(new C62973cs());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f170159d[i6]).longValue();
                i3 = C62906an.m95321N(i8 << 3);
                i2 = C62906an.m95322O(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f170160e = i5;
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo59106c() {
        if (!this.f170161f) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo59107d(int i, Object obj) {
        mo59106c();
        int i2 = this.f170157b;
        int[] iArr = this.f170158c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f170158c = Arrays.copyOf(iArr, i3);
            this.f170159d = Arrays.copyOf(this.f170159d, i3);
        }
        int[] iArr2 = this.f170158c;
        int i4 = this.f170157b;
        iArr2[i4] = i;
        this.f170159d[i4] = obj;
        this.f170157b = i4 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo59108e(int i, C62897ae aeVar) {
        int m;
        mo59106c();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mo59107d(i, Long.valueOf(aeVar.mo58681p()));
            return true;
        } else if (i3 == 1) {
            mo59107d(i, Long.valueOf(aeVar.mo58680o()));
            return true;
        } else if (i3 == 2) {
            mo59107d(i, aeVar.mo58688w());
            return true;
        } else if (i3 == 3) {
            C63045fj fjVar = new C63045fj();
            do {
                m = aeVar.mo58678m();
                if (m == 0 || !fjVar.mo59108e(m, aeVar)) {
                    aeVar.mo58658A((i2 << 3) | 4);
                    mo59107d(i, fjVar);
                }
                m = aeVar.mo58678m();
                break;
            } while (!fjVar.mo59108e(m, aeVar));
            aeVar.mo58658A((i2 << 3) | 4);
            mo59107d(i, fjVar);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                mo59107d(i, Integer.valueOf(aeVar.mo58672g()));
                return true;
            }
            throw new C62973cs();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C63045fj)) {
            return false;
        }
        C63045fj fjVar = (C63045fj) obj;
        int i = this.f170157b;
        if (i == fjVar.f170157b) {
            int[] iArr = this.f170158c;
            int[] iArr2 = fjVar.f170158c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f170159d;
                    Object[] objArr2 = fjVar.f170159d;
                    int i3 = this.f170157b;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo59110f(C62907ao aoVar) {
        if (this.f170157b != 0) {
            for (int i = 0; i < this.f170157b; i++) {
                int i2 = this.f170158c[i];
                Object obj = this.f170159d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    aoVar.f169854a.mo58781x(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    aoVar.f169854a.mo58768k(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    aoVar.f169854a.mo58763aa(i3, (C63088z) obj);
                } else if (i4 == 3) {
                    aoVar.f169854a.mo58778u(i3, 3);
                    ((C63045fj) obj).mo59110f(aoVar);
                    aoVar.f169854a.mo58778u(i3, 4);
                } else if (i4 == 5) {
                    aoVar.f169854a.mo58766i(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(new C62973cs());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.f170157b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f170158c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f170159d;
        int i7 = this.f170157b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
