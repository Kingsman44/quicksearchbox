package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.r */
/* compiled from: PG */
public final class C59224r implements Serializable, C59165cd {

    /* renamed from: a */
    public final C59136bb f157319a;

    /* renamed from: b */
    public final C59219m f157320b;

    public C59224r(C59136bb bbVar, C59219m mVar) {
        this.f157319a = bbVar;
        this.f157320b = mVar;
    }

    /* renamed from: b */
    public static C59224r m91904b() {
        return new C59224r(C59136bb.f157159b, C59219m.f157304e);
    }

    /* renamed from: c */
    public static C59224r m91905c(C59136bb bbVar, C59218l lVar) {
        return new C59224r(bbVar, C59219m.m91874e(new C59218l(Math.min(lVar.f157299c, 3.141592653589793d))));
    }

    /* renamed from: a */
    public final double mo56642a() {
        return this.f157320b.f157305f * 0.5d;
    }

    /* renamed from: d */
    public final boolean mo56643d(C59136bb bbVar) {
        return new C59219m(this.f157319a, bbVar).compareTo(this.f157320b) <= 0;
    }

    /* renamed from: e */
    public final boolean mo56644e(C59225s sVar, C59136bb[] bbVarArr) {
        C59136bb bbVar;
        if (this.f157320b.compareTo(C59219m.f157301b) >= 0 || this.f157320b.mo56621g()) {
            return false;
        }
        C59216j h = C59164cc.m91754h(sVar.f157321a, this.f157319a);
        if (h != null) {
            double d = h.f157293a;
            if (d >= sVar.f157325e && d <= sVar.f157326f) {
                double d2 = h.f157294b;
                if (d2 >= sVar.f157327g && d2 <= sVar.f157328h) {
                    return true;
                }
            }
        }
        double a = C59219m.m91872a(this.f157320b);
        int i = 0;
        while (i < 4) {
            if (i != 0) {
                bbVar = i != 1 ? i != 2 ? C59136bb.m91670m(C59164cc.m91758m(sVar.f157321a, sVar.f157325e)) : C59136bb.m91670m(C59164cc.m91759n(sVar.f157321a, sVar.f157328h)) : C59164cc.m91758m(sVar.f157321a, sVar.f157326f);
            } else {
                bbVar = C59164cc.m91759n(sVar.f157321a, sVar.f157327g);
            }
            double b = this.f157319a.mo56497b(bbVar);
            if (b <= C59203do.f157270a) {
                if (b * b > bbVar.mo56501e() * a) {
                    return false;
                }
                C59136bb k = C59136bb.m91668k(bbVar, this.f157319a);
                if (k.mo56497b(bbVarArr[i]) < C59203do.f157270a && k.mo56497b(bbVarArr[(i + 1) & 3]) > C59203do.f157270a) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59224r)) {
            return false;
        }
        C59224r rVar = (C59224r) obj;
        if ((!this.f157319a.mo56506q(rVar.f157319a) || !this.f157320b.equals(rVar.f157320b)) && ((!this.f157320b.mo56621g() || !rVar.f157320b.mo56621g()) && (!mo56646f() || !rVar.mo56646f()))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo56646f() {
        return C59219m.f157302c.equals(this.f157320b);
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        C59136bb[] bbVarArr = new C59136bb[4];
        for (int i = 0; i < 4; i++) {
            C59136bb n = C59136bb.m91671n(sVar.mo56650b(i));
            bbVarArr[i] = n;
            if (mo56643d(n)) {
                return true;
            }
        }
        return mo56644e(sVar, bbVarArr);
    }

    public final int hashCode() {
        if (mo56646f()) {
            return 17;
        }
        if (this.f157320b.mo56621g()) {
            return 37;
        }
        return ((this.f157319a.hashCode() + 629) * 37) + this.f157320b.hashCode();
    }

    public final String toString() {
        return "[Point = " + this.f157319a + " Radius = " + this.f157320b + "]";
    }
}
