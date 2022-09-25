package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.af */
/* compiled from: PG */
final class C62898af implements C63016eh {

    /* renamed from: a */
    private final C62897ae f169832a;

    /* renamed from: b */
    private int f169833b;

    /* renamed from: c */
    private int f169834c;

    /* renamed from: d */
    private int f169835d = 0;

    private C62898af(C62897ae aeVar) {
        C62972cr.m95549i(aeVar, "input");
        this.f169832a = aeVar;
        aeVar.f169831f = this;
    }

    /* renamed from: P */
    private final Object m95143P(C63066gd gdVar, Class cls, C62921ba baVar) {
        C63066gd gdVar2 = C63066gd.DOUBLE;
        switch (gdVar.ordinal()) {
            case 0:
                return Double.valueOf(mo58728a());
            case 1:
                return Float.valueOf(mo58729b());
            case 2:
                return Long.valueOf(mo58739l());
            case 3:
                return Long.valueOf(mo58742o());
            case 4:
                return Integer.valueOf(mo58734g());
            case 5:
                return Long.valueOf(mo58738k());
            case 6:
                return Integer.valueOf(mo58733f());
            case 7:
                return Boolean.valueOf(mo58726T());
            case 8:
                return mo58750x();
            case 10:
                return mo58746t(cls, baVar);
            case 11:
                return mo58743q();
            case 12:
                return Integer.valueOf(mo58737j());
            case 13:
                return Integer.valueOf(mo58732e());
            case 14:
                return Integer.valueOf(mo58735h());
            case 15:
                return Long.valueOf(mo58740m());
            case 16:
                return Integer.valueOf(mo58736i());
            case 17:
                return Long.valueOf(mo58741n());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: V */
    private final Object m95144V(C63022en enVar, C62921ba baVar) {
        int i = this.f169834c;
        this.f169834c = ((this.f169833b >>> 3) << 3) | 4;
        try {
            Object e = enVar.mo58995e();
            enVar.mo58998h(e, this, baVar);
            enVar.mo58996f(e);
            if (this.f169833b == this.f169834c) {
                return e;
            }
            throw C62974ct.m95556f();
        } finally {
            this.f169834c = i;
        }
    }

    /* renamed from: W */
    private final Object m95145W(C63022en enVar, C62921ba baVar) {
        int n = this.f169832a.mo58679n();
        C62897ae aeVar = this.f169832a;
        if (aeVar.f169828c < aeVar.f169829d) {
            int e = aeVar.mo58670e(n);
            Object e2 = enVar.mo58995e();
            this.f169832a.f169828c++;
            enVar.mo58998h(e2, this, baVar);
            enVar.mo58996f(e2);
            this.f169832a.mo58658A(0);
            C62897ae aeVar2 = this.f169832a;
            aeVar2.f169828c--;
            aeVar2.mo58659B(e);
            return e2;
        }
        throw C62974ct.m95557g();
    }

    /* renamed from: X */
    private final void m95146X(int i) {
        if (this.f169832a.mo58669d() != i) {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: Y */
    private final void m95147Y(int i) {
        if ((this.f169833b & 7) != i) {
            throw new C62973cs();
        }
    }

    /* renamed from: Z */
    private static final void m95148Z(int i) {
        if ((i & 3) != 0) {
            throw C62974ct.m95556f();
        }
    }

    /* renamed from: aa */
    private static final void m95149aa(int i) {
        if ((i & 7) != 0) {
            throw C62974ct.m95556f();
        }
    }

    /* renamed from: p */
    public static C62898af m95150p(C62897ae aeVar) {
        C62898af afVar = aeVar.f169831f;
        if (afVar != null) {
            return afVar;
        }
        return new C62898af(aeVar);
    }

    /* renamed from: A */
    public final void mo58708A(List list) {
        int m;
        int m2;
        if (list instanceof C62908ap) {
            C62908ap apVar = (C62908ap) list;
            int i = this.f169833b & 7;
            if (i == 1) {
                do {
                    apVar.mo58801g(this.f169832a.mo58667b());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int n = this.f169832a.mo58679n();
                m95149aa(n);
                int d = this.f169832a.mo58669d() + n;
                do {
                    apVar.mo58801g(this.f169832a.mo58667b());
                } while (this.f169832a.mo58669d() < d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f169832a.mo58667b()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int n2 = this.f169832a.mo58679n();
                m95149aa(n2);
                int d2 = this.f169832a.mo58669d() + n2;
                do {
                    list.add(Double.valueOf(this.f169832a.mo58667b()));
                } while (this.f169832a.mo58669d() < d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: B */
    public final void mo58709B(List list) {
        int m;
        int m2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    caVar.mo58916g(this.f169832a.mo58671f());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    caVar.mo58916g(this.f169832a.mo58671f());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58671f()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58671f()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: C */
    public final void mo58710C(List list) {
        int m;
        int m2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i = this.f169833b & 7;
            if (i == 2) {
                int n = this.f169832a.mo58679n();
                m95148Z(n);
                int d = this.f169832a.mo58669d() + n;
                do {
                    caVar.mo58916g(this.f169832a.mo58672g());
                } while (this.f169832a.mo58669d() < d);
            } else if (i == 5) {
                do {
                    caVar.mo58916g(this.f169832a.mo58672g());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 2) {
                int n2 = this.f169832a.mo58679n();
                m95148Z(n2);
                int d2 = this.f169832a.mo58669d() + n2;
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58672g()));
                } while (this.f169832a.mo58669d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58672g()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: D */
    public final void mo58711D(List list) {
        int m;
        int m2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i = this.f169833b & 7;
            if (i == 1) {
                do {
                    dhVar.mo58929f(this.f169832a.mo58680o());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int n = this.f169832a.mo58679n();
                m95149aa(n);
                int d = this.f169832a.mo58669d() + n;
                do {
                    dhVar.mo58929f(this.f169832a.mo58680o());
                } while (this.f169832a.mo58669d() < d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f169832a.mo58680o()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int n2 = this.f169832a.mo58679n();
                m95149aa(n2);
                int d2 = this.f169832a.mo58669d() + n2;
                do {
                    list.add(Long.valueOf(this.f169832a.mo58680o()));
                } while (this.f169832a.mo58669d() < d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: E */
    public final void mo58712E(List list) {
        int m;
        int m2;
        if (list instanceof C62929bi) {
            C62929bi biVar = (C62929bi) list;
            int i = this.f169833b & 7;
            if (i == 2) {
                int n = this.f169832a.mo58679n();
                m95148Z(n);
                int d = this.f169832a.mo58669d() + n;
                do {
                    biVar.mo58861g(this.f169832a.mo58668c());
                } while (this.f169832a.mo58669d() < d);
            } else if (i == 5) {
                do {
                    biVar.mo58861g(this.f169832a.mo58668c());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 2) {
                int n2 = this.f169832a.mo58679n();
                m95148Z(n2);
                int d2 = this.f169832a.mo58669d() + n2;
                do {
                    list.add(Float.valueOf(this.f169832a.mo58668c()));
                } while (this.f169832a.mo58669d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f169832a.mo58668c()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else {
                throw new C62973cs();
            }
        }
    }

    @Deprecated
    /* renamed from: F */
    public final void mo58713F(List list, C63022en enVar, C62921ba baVar) {
        int m;
        int i = this.f169833b;
        if ((i & 7) == 3) {
            do {
                list.add(m95144V(enVar, baVar));
                if (!this.f169832a.mo58661D() && this.f169835d == 0) {
                    m = this.f169832a.mo58678m();
                } else {
                    return;
                }
            } while (m == i);
            this.f169835d = m;
            return;
        }
        throw new C62973cs();
    }

    /* renamed from: G */
    public final void mo58714G(List list) {
        int m;
        int m2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    caVar.mo58916g(this.f169832a.mo58673h());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    caVar.mo58916g(this.f169832a.mo58673h());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58673h()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58673h()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: H */
    public final void mo58715H(List list) {
        int m;
        int m2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    dhVar.mo58929f(this.f169832a.mo58681p());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    dhVar.mo58929f(this.f169832a.mo58681p());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f169832a.mo58681p()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Long.valueOf(this.f169832a.mo58681p()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo58727U() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.C62974ct("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58716I(java.util.Map r8, com.google.protobuf.C62993dl r9, com.google.protobuf.C62921ba r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m95147Y(r0)
            com.google.protobuf.ae r1 = r7.f169832a
            int r1 = r1.mo58679n()
            com.google.protobuf.ae r2 = r7.f169832a
            int r1 = r2.mo58670e(r1)
            java.lang.Object r2 = r9.f170053b
            java.lang.Object r3 = r9.f170055d
        L_0x0014:
            int r4 = r7.mo58730c()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.ae r5 = r7.f169832a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo58661D()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo58727U()     // Catch:{ cs -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.ct r4 = new com.google.protobuf.ct     // Catch:{ cs -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ cs -> 0x004f }
            throw r4     // Catch:{ cs -> 0x004f }
        L_0x003a:
            com.google.protobuf.gd r4 = r9.f170054c     // Catch:{ cs -> 0x004f }
            java.lang.Object r5 = r9.f170055d     // Catch:{ cs -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ cs -> 0x004f }
            java.lang.Object r3 = r7.m95143P(r4, r5, r10)     // Catch:{ cs -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.gd r4 = r9.f170052a     // Catch:{ cs -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.m95143P(r4, r5, r5)     // Catch:{ cs -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo58727U()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.ct r8 = new com.google.protobuf.ct     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.ae r8 = r7.f169832a
            r8.mo58659B(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.ae r9 = r7.f169832a
            r9.mo58659B(r1)
            goto L_0x006d
        L_0x006c:
            throw r8
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62898af.mo58716I(java.util.Map, com.google.protobuf.dl, com.google.protobuf.ba):void");
    }

    /* renamed from: J */
    public final void mo58717J(List list, C63022en enVar, C62921ba baVar) {
        int m;
        int i = this.f169833b;
        if ((i & 7) == 2) {
            do {
                list.add(m95145W(enVar, baVar));
                if (!this.f169832a.mo58661D() && this.f169835d == 0) {
                    m = this.f169832a.mo58678m();
                } else {
                    return;
                }
            } while (m == i);
            this.f169835d = m;
            return;
        }
        throw new C62973cs();
    }

    /* renamed from: K */
    public final void mo58718K(List list) {
        int m;
        int m2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i = this.f169833b & 7;
            if (i == 2) {
                int n = this.f169832a.mo58679n();
                m95148Z(n);
                int d = this.f169832a.mo58669d() + n;
                do {
                    caVar.mo58916g(this.f169832a.mo58676k());
                } while (this.f169832a.mo58669d() < d);
            } else if (i == 5) {
                do {
                    caVar.mo58916g(this.f169832a.mo58676k());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 2) {
                int n2 = this.f169832a.mo58679n();
                m95148Z(n2);
                int d2 = this.f169832a.mo58669d() + n2;
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58676k()));
                } while (this.f169832a.mo58669d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58676k()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: L */
    public final void mo58719L(List list) {
        int m;
        int m2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i = this.f169833b & 7;
            if (i == 1) {
                do {
                    dhVar.mo58929f(this.f169832a.mo58685t());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int n = this.f169832a.mo58679n();
                m95149aa(n);
                int d = this.f169832a.mo58669d() + n;
                do {
                    dhVar.mo58929f(this.f169832a.mo58685t());
                } while (this.f169832a.mo58669d() < d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f169832a.mo58685t()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int n2 = this.f169832a.mo58679n();
                m95149aa(n2);
                int d2 = this.f169832a.mo58669d() + n2;
                do {
                    list.add(Long.valueOf(this.f169832a.mo58685t()));
                } while (this.f169832a.mo58669d() < d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: M */
    public final void mo58720M(List list) {
        int m;
        int m2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    caVar.mo58916g(this.f169832a.mo58677l());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    caVar.mo58916g(this.f169832a.mo58677l());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58677l()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58677l()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: N */
    public final void mo58721N(List list) {
        int m;
        int m2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    dhVar.mo58929f(this.f169832a.mo58686u());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    dhVar.mo58929f(this.f169832a.mo58686u());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f169832a.mo58686u()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Long.valueOf(this.f169832a.mo58686u()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: O */
    public final void mo58722O(List list) {
        mo58749w(list, false);
    }

    /* renamed from: Q */
    public final void mo58723Q(List list) {
        mo58749w(list, true);
    }

    /* renamed from: R */
    public final void mo58724R(List list) {
        int m;
        int m2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    caVar.mo58916g(this.f169832a.mo58679n());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    caVar.mo58916g(this.f169832a.mo58679n());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58679n()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Integer.valueOf(this.f169832a.mo58679n()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: S */
    public final void mo58725S(List list) {
        int m;
        int m2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    dhVar.mo58929f(this.f169832a.mo58687v());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    dhVar.mo58929f(this.f169832a.mo58687v());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f169832a.mo58687v()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Long.valueOf(this.f169832a.mo58687v()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: T */
    public final boolean mo58726T() {
        m95147Y(0);
        return this.f169832a.mo58662E();
    }

    /* renamed from: U */
    public final boolean mo58727U() {
        int i;
        if (this.f169832a.mo58661D() || (i = this.f169833b) == this.f169834c) {
            return false;
        }
        return this.f169832a.mo58663F(i);
    }

    /* renamed from: a */
    public final double mo58728a() {
        m95147Y(1);
        return this.f169832a.mo58667b();
    }

    /* renamed from: b */
    public final float mo58729b() {
        m95147Y(5);
        return this.f169832a.mo58668c();
    }

    /* renamed from: c */
    public final int mo58730c() {
        int i = this.f169835d;
        if (i != 0) {
            this.f169833b = i;
            this.f169835d = 0;
        } else {
            i = this.f169832a.mo58678m();
            this.f169833b = i;
        }
        if (i == 0 || i == this.f169834c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: d */
    public final int mo58731d() {
        return this.f169833b;
    }

    /* renamed from: e */
    public final int mo58732e() {
        m95147Y(0);
        return this.f169832a.mo58671f();
    }

    /* renamed from: f */
    public final int mo58733f() {
        m95147Y(5);
        return this.f169832a.mo58672g();
    }

    /* renamed from: g */
    public final int mo58734g() {
        m95147Y(0);
        return this.f169832a.mo58673h();
    }

    /* renamed from: h */
    public final int mo58735h() {
        m95147Y(5);
        return this.f169832a.mo58676k();
    }

    /* renamed from: i */
    public final int mo58736i() {
        m95147Y(0);
        return this.f169832a.mo58677l();
    }

    /* renamed from: j */
    public final int mo58737j() {
        m95147Y(0);
        return this.f169832a.mo58679n();
    }

    /* renamed from: k */
    public final long mo58738k() {
        m95147Y(1);
        return this.f169832a.mo58680o();
    }

    /* renamed from: l */
    public final long mo58739l() {
        m95147Y(0);
        return this.f169832a.mo58681p();
    }

    /* renamed from: m */
    public final long mo58740m() {
        m95147Y(1);
        return this.f169832a.mo58685t();
    }

    /* renamed from: n */
    public final long mo58741n() {
        m95147Y(0);
        return this.f169832a.mo58686u();
    }

    /* renamed from: o */
    public final long mo58742o() {
        m95147Y(0);
        return this.f169832a.mo58687v();
    }

    /* renamed from: q */
    public final C63088z mo58743q() {
        m95147Y(2);
        return this.f169832a.mo58688w();
    }

    @Deprecated
    /* renamed from: r */
    public final Object mo58744r(Class cls, C62921ba baVar) {
        m95147Y(3);
        return m95144V(C63013ee.f170090a.mo59017a(cls), baVar);
    }

    @Deprecated
    /* renamed from: s */
    public final Object mo58745s(C63022en enVar, C62921ba baVar) {
        m95147Y(3);
        return m95144V(enVar, baVar);
    }

    /* renamed from: t */
    public final Object mo58746t(Class cls, C62921ba baVar) {
        m95147Y(2);
        return m95145W(C63013ee.f170090a.mo59017a(cls), baVar);
    }

    /* renamed from: u */
    public final Object mo58747u(C63022en enVar, C62921ba baVar) {
        m95147Y(2);
        return m95145W(enVar, baVar);
    }

    /* renamed from: v */
    public final String mo58748v() {
        m95147Y(2);
        return this.f169832a.mo58690y();
    }

    /* renamed from: w */
    public final void mo58749w(List list, boolean z) {
        int m;
        int m2;
        if ((this.f169833b & 7) != 2) {
            throw new C62973cs();
        } else if ((list instanceof C62983db) && !z) {
            C62983db dbVar = (C62983db) list;
            do {
                dbVar.mo58969i(mo58743q());
                if (!this.f169832a.mo58661D()) {
                    m2 = this.f169832a.mo58678m();
                } else {
                    return;
                }
            } while (m2 == this.f169833b);
            this.f169835d = m2;
        } else {
            do {
                list.add(z ? mo58750x() : mo58748v());
                if (!this.f169832a.mo58661D()) {
                    m = this.f169832a.mo58678m();
                } else {
                    return;
                }
            } while (m == this.f169833b);
            this.f169835d = m;
        }
    }

    /* renamed from: x */
    public final String mo58750x() {
        m95147Y(2);
        return this.f169832a.mo58691z();
    }

    /* renamed from: y */
    public final void mo58751y(List list) {
        int m;
        int m2;
        if (list instanceof C63078p) {
            C63078p pVar = (C63078p) list;
            int i = this.f169833b & 7;
            if (i == 0) {
                do {
                    pVar.mo58923f(this.f169832a.mo58662E());
                    if (!this.f169832a.mo58661D()) {
                        m2 = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m2 == this.f169833b);
                this.f169835d = m2;
            } else if (i == 2) {
                int d = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    pVar.mo58923f(this.f169832a.mo58662E());
                } while (this.f169832a.mo58669d() < d);
                m95146X(d);
            } else {
                throw new C62973cs();
            }
        } else {
            int i2 = this.f169833b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f169832a.mo58662E()));
                    if (!this.f169832a.mo58661D()) {
                        m = this.f169832a.mo58678m();
                    } else {
                        return;
                    }
                } while (m == this.f169833b);
                this.f169835d = m;
            } else if (i2 == 2) {
                int d2 = this.f169832a.mo58669d() + this.f169832a.mo58679n();
                do {
                    list.add(Boolean.valueOf(this.f169832a.mo58662E()));
                } while (this.f169832a.mo58669d() < d2);
                m95146X(d2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: z */
    public final void mo58752z(List list) {
        int m;
        if ((this.f169833b & 7) == 2) {
            do {
                list.add(mo58743q());
                if (!this.f169832a.mo58661D()) {
                    m = this.f169832a.mo58678m();
                } else {
                    return;
                }
            } while (m == this.f169833b);
            this.f169835d = m;
            return;
        }
        throw new C62973cs();
    }
}
