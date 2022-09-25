package com.google.common.p4535g;

import com.google.common.base.C58832aw;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.g.az */
/* compiled from: PG */
public final class C59133az implements Comparable, Serializable, C59165cd, C59173cl {

    /* renamed from: a */
    static final C59136bb f157140a = C59136bb.f157160c;

    /* renamed from: b */
    static final C59136bb f157141b = C59136bb.f157161d;

    /* renamed from: c */
    transient C59203do f157142c;

    /* renamed from: d */
    public final int f157143d;

    /* renamed from: e */
    public C59129av f157144e;

    /* renamed from: f */
    public C59129av f157145f;

    /* renamed from: g */
    public boolean f157146g;

    /* renamed from: h */
    public int f157147h;

    /* renamed from: i */
    private final AtomicInteger f157148i = new AtomicInteger();

    /* renamed from: j */
    private final C59136bb[] f157149j;

    public C59133az(C59133az azVar) {
        mo56483k();
        int i = azVar.f157143d;
        this.f157143d = i;
        this.f157149j = new C59136bb[i];
        for (int i2 = 0; i2 < this.f157143d; i2++) {
            this.f157149j[i2] = azVar.f157149j[i2];
        }
        this.f157144e = azVar.f157144e;
        this.f157145f = azVar.f157145f;
        this.f157146g = azVar.f157146g;
        this.f157147h = azVar.f157147h;
    }

    private Object readResolve() {
        mo56483k();
        return this;
    }

    /* renamed from: t */
    private final int m91638t() {
        int i;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            i = this.f157143d;
            if (i3 >= i) {
                break;
            }
            if (mo56481i(i3).compareTo(mo56481i(i2)) < 0) {
                i2 = i3;
            }
            i3++;
        }
        return (i <= 0 || mo56481i(i2 + 1).compareTo(mo56481i((this.f157143d + i2) + -1)) < 0) ? i2 : i2 + this.f157143d;
    }

    /* renamed from: a */
    public final int mo56419a() {
        return mo56488p() ? 0 : 1;
    }

    /* renamed from: b */
    public final int mo56420b() {
        if (mo56489q()) {
            return 0;
        }
        return this.f157143d;
    }

    /* renamed from: c */
    public final void mo56421c(int i, C59172ck ckVar) {
        C59136bb i2 = mo56481i(i);
        C59136bb i3 = mo56481i(i + 1);
        ckVar.f157226a = i2;
        ckVar.f157227b = i3;
    }

    /* renamed from: d */
    public final boolean mo56422d() {
        return this.f157146g;
    }

    /* renamed from: e */
    public final boolean mo56423e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59133az) {
            C59133az azVar = (C59133az) obj;
            if (!Arrays.equals(this.f157149j, azVar.f157149j) || this.f157146g != azVar.f157146g || !C58832aw.m90831a(this.f157144e, azVar.f157144e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final double mo56478f() {
        if (mo56489q()) {
            return this.f157146g ? -6.283185307179586d : 6.283185307179586d;
        }
        return C59210dv.m91843a(mo56482j());
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        throw null;
    }

    /* renamed from: h */
    public final int compareTo(C59133az azVar) {
        int i = this.f157143d;
        int i2 = azVar.f157143d;
        if (i != i2) {
            return i - i2;
        }
        if (i == 0) {
            return 0;
        }
        int t = m91638t() % this.f157143d;
        int t2 = azVar.m91638t() % azVar.f157143d;
        int i3 = 0;
        while (i3 < i) {
            int h = mo56481i(t).compareTo(azVar.mo56481i(t2));
            if (h != 0) {
                return h;
            }
            i3++;
            t++;
            t2++;
        }
        return 0;
    }

    public final int hashCode() {
        return this.f157144e.hashCode();
    }

    /* renamed from: i */
    public final C59136bb mo56481i(int i) {
        try {
            C59136bb[] bbVarArr = this.f157149j;
            int length = bbVarArr.length;
            if (i >= length) {
                i -= length;
            }
            return bbVarArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException("Invalid vertex index", e);
        }
    }

    /* renamed from: j */
    public final List mo56482j() {
        return Collections.unmodifiableList(Arrays.asList(this.f157149j));
    }

    /* renamed from: k */
    public final void mo56483k() {
        int i = this.f157143d;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.f157148i.set(i2);
        C59203do doVar = new C59203do();
        this.f157142c = doVar;
        doVar.mo56571c(this);
    }

    /* renamed from: l */
    public final void mo56484l() {
        C59136bb bbVar;
        mo56483k();
        int i = this.f157143d - 1;
        if (mo56489q()) {
            C59136bb[] bbVarArr = this.f157149j;
            if (mo56490r()) {
                bbVar = f157140a;
            } else {
                bbVar = f157141b;
            }
            bbVarArr[0] = bbVar;
        } else {
            for (int i2 = (i - 1) / 2; i2 >= 0; i2--) {
                C59136bb[] bbVarArr2 = this.f157149j;
                C59136bb bbVar2 = bbVarArr2[i2];
                int i3 = i - i2;
                bbVarArr2[i2] = bbVarArr2[i3];
                bbVarArr2[i3] = bbVar2;
            }
        }
        this.f157146g = !this.f157146g;
        C59214h hVar = this.f157144e.f157134a;
        if (hVar.f157289a <= -1.5707963267948966d || hVar.f157290b >= 1.5707963267948966d) {
            this.f157144e = null;
            m91639u();
            return;
        }
        C59129av h = C59129av.m91623h();
        this.f157144e = h;
        this.f157145f = h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo56485m(C59136bb bbVar) {
        if (this.f157143d < 3) {
            return this.f157146g;
        }
        C59119al alVar = new C59119al(C59222p.f157312d, bbVar, mo56481i(0));
        boolean z = this.f157146g;
        for (int i = 1; i <= this.f157143d; i++) {
            z ^= alVar.mo56437e(mo56481i(i));
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo56486n(C59136bb bbVar) {
        C59129av avVar;
        int i = 0;
        if (!this.f157142c.f157272c && (avVar = this.f157144e) != null && !avVar.mo56474o(bbVar)) {
            return false;
        }
        if (this.f157143d <= 32 || (!this.f157142c.f157272c && this.f157148i.decrementAndGet() > 0)) {
            return mo56485m(bbVar);
        }
        C59126as a = this.f157142c.mo56570a();
        if (!a.mo56449i(bbVar)) {
            return false;
        }
        C59200dl c = ((C59176co) a.mo56441c()).mo56552c(0);
        boolean g = c.mo56560g();
        int f = c.mo56559f();
        if (f > 0) {
            C59119al alVar = new C59119al(C59136bb.m91671n(a.mo56440b().mo56679z()), bbVar);
            int i2 = -2;
            while (i < f) {
                int e = c.mo56558e(i);
                if (e != i2 + 1) {
                    alVar.mo56436d(mo56481i(e));
                }
                g ^= alVar.mo56437e(mo56481i(e + 1));
                i++;
                i2 = e;
            }
        }
        return g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r6 = r7;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56487o(com.google.common.p4535g.C59133az r11) {
        /*
            r10 = this;
            com.google.common.g.av r0 = r10.f157145f
            com.google.common.g.av r1 = r11.f157144e
            com.google.common.g.h r2 = r0.f157134a
            com.google.common.g.h r3 = r1.f157134a
            boolean r4 = r3.mo56592h()
            r5 = 0
            if (r4 == 0) goto L_0x0010
            goto L_0x0020
        L_0x0010:
            double r6 = r3.f157289a
            double r8 = r2.f157289a
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00d8
            double r3 = r3.f157290b
            double r6 = r2.f157290b
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x00d8
        L_0x0020:
            com.google.common.g.n r0 = r0.f157135b
            com.google.common.g.n r1 = r1.f157135b
            boolean r0 = r0.mo56633j(r1)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r10.mo56489q()
            r1 = 1
            if (r0 != 0) goto L_0x00c9
            int r0 = r11.f157143d
            r2 = 2
            if (r0 >= r2) goto L_0x0038
            goto L_0x00c9
        L_0x0038:
            com.google.common.g.bb r0 = r11.mo56481i(r1)
            int r3 = r10.f157143d
            r4 = 10
            r6 = -1
            if (r3 >= r4) goto L_0x0057
            r3 = 1
        L_0x0044:
            int r4 = r10.f157143d
            if (r3 > r4) goto L_0x0099
            com.google.common.g.bb r4 = r10.mo56481i(r3)
            boolean r4 = r4.mo56506q(r0)
            if (r4 != 0) goto L_0x0055
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0055:
            r6 = r3
            goto L_0x0099
        L_0x0057:
            com.google.common.g.do r3 = r10.f157142c
            com.google.common.g.as r3 = r3.mo56570a()
            boolean r4 = r3.mo56449i(r0)
            if (r4 != 0) goto L_0x0064
            goto L_0x0099
        L_0x0064:
            com.google.common.g.ar r3 = r3.mo56441c()
            com.google.common.g.co r3 = (com.google.common.p4535g.C59176co) r3
            com.google.common.g.dl r3 = r3.mo56552c(r5)
            int r4 = r3.mo56559f()
            int r4 = r4 + r6
        L_0x0073:
            if (r4 < 0) goto L_0x0099
            int r7 = r3.mo56558e(r4)
            com.google.common.g.bb r8 = r10.mo56481i(r7)
            boolean r8 = r8.mo56506q(r0)
            if (r8 == 0) goto L_0x0088
            if (r7 != 0) goto L_0x0094
            int r6 = r10.f157143d
            goto L_0x0099
        L_0x0088:
            int r7 = r7 + 1
            com.google.common.g.bb r8 = r10.mo56481i(r7)
            boolean r8 = r8.mo56506q(r0)
            if (r8 == 0) goto L_0x0096
        L_0x0094:
            r6 = r7
            goto L_0x0099
        L_0x0096:
            int r4 = r4 + -1
            goto L_0x0073
        L_0x0099:
            if (r6 >= 0) goto L_0x00a4
            com.google.common.g.bb r11 = r11.mo56481i(r1)
            boolean r11 = r10.mo56486n(r11)
            return r11
        L_0x00a4:
            int r0 = r6 + -1
            com.google.common.g.bb r0 = r10.mo56481i(r0)
            com.google.common.g.bb r3 = r10.mo56481i(r6)
            int r6 = r6 + r1
            com.google.common.g.bb r4 = r10.mo56481i(r6)
            com.google.common.g.bb r6 = r11.mo56481i(r5)
            com.google.common.g.bb r11 = r11.mo56481i(r2)
            boolean r11 = com.google.common.p4535g.C59148bn.m91713b(r4, r11, r6, r3)
            if (r11 == 0) goto L_0x00c8
            boolean r11 = com.google.common.p4535g.C59148bn.m91713b(r6, r0, r4, r3)
            if (r11 == 0) goto L_0x00c8
            return r1
        L_0x00c8:
            return r5
        L_0x00c9:
            boolean r0 = r10.mo56490r()
            if (r0 != 0) goto L_0x00d7
            boolean r11 = r11.mo56488p()
            if (r11 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            return r5
        L_0x00d7:
            return r1
        L_0x00d8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59133az.mo56487o(com.google.common.g.az):boolean");
    }

    /* renamed from: p */
    public final boolean mo56488p() {
        return mo56489q() && !this.f157146g;
    }

    /* renamed from: q */
    public final boolean mo56489q() {
        return this.f157143d == 1;
    }

    /* renamed from: r */
    public final boolean mo56490r() {
        return mo56489q() && this.f157146g;
    }

    /* renamed from: s */
    public final boolean mo56491s() {
        return (this.f157147h & 1) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S2Loop, ");
        sb.append(this.f157149j.length);
        sb.append(" points. [");
        for (C59136bb p : this.f157149j) {
            sb.append(p.mo56505p());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    public C59133az(List list) {
        mo56483k();
        int size = list.size();
        this.f157143d = size;
        C59136bb[] bbVarArr = new C59136bb[size];
        this.f157149j = bbVarArr;
        list.toArray(bbVarArr);
        boolean z = false;
        this.f157147h = 0;
        if (size >= 3) {
            this.f157146g = false;
            if (C59148bn.m91713b(C59222p.m91901g(mo56481i(1)), mo56481i(0), mo56481i(2), mo56481i(1)) != mo56486n(mo56481i(1))) {
                this.f157146g = true;
            }
        } else if (mo56489q()) {
            this.f157146g = mo56481i(0).f157164g < C59203do.f157270a ? true : z;
        } else {
            this.f157146g = false;
        }
        m91639u();
    }

    public C59133az(List list, boolean z, C59129av avVar) {
        mo56483k();
        int size = list.size();
        this.f157143d = size;
        C59136bb[] bbVarArr = new C59136bb[size];
        this.f157149j = bbVarArr;
        this.f157144e = avVar;
        this.f157145f = C59121an.m91580a(avVar);
        this.f157147h = 0;
        this.f157146g = z;
        list.toArray(bbVarArr);
    }

    /* renamed from: u */
    private final void m91639u() {
        C59127at atVar;
        int i;
        C59136bb bbVar;
        C59128au auVar;
        double d;
        C59133az azVar = this;
        if (azVar.f157143d >= 3) {
            C59128au c = C59128au.m91615c();
            C59220n nVar = new C59220n();
            C59214h hVar = new C59214h();
            C59136bb bbVar2 = null;
            C59127at atVar2 = null;
            int i2 = 0;
            while (i2 <= azVar.f157143d) {
                C59136bb i3 = azVar.mo56481i(i2);
                C59127at atVar3 = new C59127at(i3);
                if (c.f157134a.mo56592h()) {
                    C59214h hVar2 = c.f157134a;
                    double d2 = new C59218l(atVar3.f157132a).f157299c;
                    if (hVar2.mo56592h()) {
                        hVar2.f157289a = d2;
                        hVar2.f157290b = d2;
                    } else if (d2 < hVar2.f157289a) {
                        hVar2.f157289a = d2;
                    } else if (d2 > hVar2.f157290b) {
                        hVar2.f157290b = d2;
                    }
                    C59220n nVar2 = c.f157135b;
                    double d3 = new C59218l(atVar3.f157133b).f157299c;
                    if (d3 == -3.141592653589793d) {
                        d3 = 3.141592653589793d;
                    }
                    C59220n nVar3 = new C59220n(d3, d3);
                    nVar3.mo56628f(d3, d3, true);
                    nVar2.mo56632i(nVar3);
                } else {
                    C59136bb k = C59136bb.m91668k(C59136bb.m91672o(bbVar2, i3), C59136bb.m91667j(bbVar2, i3));
                    double sqrt = Math.sqrt(k.mo56501e());
                    if (sqrt >= 1.91346E-15d) {
                        nVar.mo56626e(new C59218l(atVar2.f157133b).f157299c, new C59218l(atVar3.f157133b).f157299c);
                        double a = nVar.mo56625a();
                        double d4 = C59222p.f157311c;
                        if (a >= 3.141592653589793d - (d4 + d4)) {
                            nVar.mo56630h();
                        }
                        hVar.mo56588e(new C59218l(atVar2.f157132a).f157299c, new C59218l(atVar3.f157132a).f157299c);
                        C59136bb k2 = C59136bb.m91668k(k, C59136bb.f157160c);
                        double b = k2.mo56497b(bbVar2);
                        double b2 = k2.mo56497b(i3);
                        C59127at atVar4 = atVar3;
                        double d5 = (sqrt * 6.06638E-16d) + 6.83174E-31d;
                        if (b * b2 < C59203do.f157270a || Math.abs(b) <= d5 || Math.abs(b2) <= d5) {
                            double d6 = C59222p.f157311c;
                            atVar = atVar4;
                            i = i2;
                            double d7 = k.f157162e;
                            auVar = c;
                            double d8 = k.f157163f;
                            double min = Math.min(1.5707963267948966d, Math.atan2(Math.sqrt((d7 * d7) + (d8 * d8)), Math.abs(k.f157164g)) + (d6 * 3.0d));
                            double asin = Math.asin(Math.sqrt(C59136bb.m91672o(bbVar2, i3).mo56501e()) * 0.5d * Math.sin(min));
                            bbVar = i3;
                            double d9 = hVar.f157290b;
                            double d10 = min;
                            double d11 = (((asin + asin) - (d9 - hVar.f157289a)) * 0.5d) + C59222p.f157311c;
                            if (b > d5 || b2 < (-d5)) {
                                d = d10;
                            } else {
                                d = d10;
                                hVar.f157290b = Math.min(d, d9 + d11);
                            }
                            if (b2 <= d5 && b >= (-d5)) {
                                hVar.f157289a = Math.max(-d, hVar.f157289a - d11);
                            }
                        } else {
                            auVar = c;
                            atVar = atVar4;
                            i = i2;
                            bbVar = i3;
                        }
                        c = auVar;
                        c.mo56462e(new C59129av(hVar, nVar));
                        i2 = i + 1;
                        azVar = this;
                        bbVar2 = bbVar;
                        atVar2 = atVar;
                    } else if (bbVar2.mo56497b(i3) < C59203do.f157270a) {
                        C59214h hVar3 = c.f157134a;
                        hVar3.f157289a = -1.5707963267948966d;
                        hVar3.f157290b = 1.5707963267948966d;
                        c.f157135b.mo56630h();
                    } else {
                        C59214h d12 = C59214h.m91850d(new C59218l(atVar2.f157132a).f157299c, new C59218l(atVar3.f157132a).f157299c);
                        double d13 = new C59218l(atVar2.f157133b).f157299c;
                        double d14 = new C59218l(atVar3.f157133b).f157299c;
                        C59220n nVar4 = new C59220n();
                        nVar4.mo56626e(d13, d14);
                        c.mo56462e(new C59129av(d12, nVar4));
                    }
                }
                i = i2;
                bbVar = i3;
                atVar = atVar3;
                i2 = i + 1;
                azVar = this;
                bbVar2 = bbVar;
                atVar2 = atVar;
            }
            double d15 = C59222p.f157311c;
            C59129av i4 = c.mo56461d().mo56464f(new C59127at(d15 + d15, (double) C59203do.f157270a)).mo56465i();
            if (mo56486n(C59136bb.f157160c)) {
                i4 = new C59129av(new C59214h(i4.f157134a.f157289a, 1.5707963267948966d), C59220n.m91882d());
            }
            if (i4.f157135b.mo56636m() && mo56486n(C59136bb.f157161d)) {
                i4 = new C59129av(new C59214h(-1.5707963267948966d, i4.f157134a.f157290b), i4.f157135b);
            }
            this.f157144e = i4;
            this.f157145f = C59121an.m91580a(i4);
        } else if (mo56490r()) {
            C59129av h = C59129av.m91623h();
            azVar.f157144e = h;
            azVar.f157145f = h;
        } else {
            C59129av e = C59129av.m91622e();
            azVar.f157144e = e;
            azVar.f157145f = e;
        }
    }
}
