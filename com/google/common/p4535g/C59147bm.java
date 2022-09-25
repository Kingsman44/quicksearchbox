package com.google.common.p4535g;

/* renamed from: com.google.common.g.bm */
/* compiled from: PG */
public final class C59147bm {
    /* renamed from: a */
    public static int m91710a(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        double d;
        double d2;
        C59136bb bbVar4 = bbVar;
        C59136bb bbVar5 = bbVar2;
        C59136bb bbVar6 = bbVar3;
        int i = 0;
        if (bbVar.mo56506q(bbVar2) || bbVar2.mo56506q(bbVar3) || bbVar6.mo56506q(bbVar4)) {
            return 0;
        }
        C59136bb o = C59136bb.m91672o(bbVar5, bbVar4);
        C59136bb o2 = C59136bb.m91672o(bbVar6, bbVar5);
        C59136bb o3 = C59136bb.m91672o(bbVar4, bbVar6);
        double e = o.mo56501e();
        double e2 = o2.mo56501e();
        double e3 = o3.mo56501e();
        double d3 = C59222p.f157311c * 3.2321d;
        if (e >= e2 && e >= e3) {
            d2 = -C59136bb.m91665f(bbVar6, o3, o2);
            d = Math.sqrt(e3 * e2);
        } else if (e2 >= e3) {
            d2 = -C59136bb.m91665f(bbVar4, o, o3);
            d = Math.sqrt(e * e3);
        } else {
            d2 = -C59136bb.m91665f(bbVar5, o2, o);
            d = Math.sqrt(e2 * e);
        }
        double d4 = d3 * d;
        int i2 = C59148bn.f157198a;
        int i3 = -1;
        int i4 = 1;
        int i5 = d2 > d4 ? 1 : d2 < (-d4) ? -1 : 0;
        if (i5 != 0) {
            return i5;
        }
        double[] dArr = C59217k.m91862a(C59217k.m91862a(C59217k.m91862a(C59217k.m91863c(bbVar5.f157163f, bbVar6.f157164g), C59217k.m91863c(bbVar5.f157164g, bbVar6.f157163f), true).mo56605b(bbVar4.f157162e), C59217k.m91862a(C59217k.m91863c(bbVar5.f157164g, bbVar6.f157162e), C59217k.m91863c(bbVar5.f157162e, bbVar6.f157164g), true).mo56605b(bbVar4.f157163f), false), C59217k.m91862a(C59217k.m91863c(bbVar5.f157162e, bbVar6.f157163f), C59217k.m91863c(bbVar5.f157163f, bbVar6.f157162e), true).mo56605b(bbVar4.f157164g), false).f157296a;
        double d5 = dArr[dArr.length - 1];
        if (d5 > C59203do.f157270a) {
            i = 1;
        } else if (d5 < C59203do.f157270a) {
            i = -1;
        }
        if (i != 0) {
            return i;
        }
        int h = bbVar.compareTo(bbVar2);
        if (h <= 0) {
            i3 = 1;
        }
        C59136bb bbVar7 = h > 0 ? bbVar4 : bbVar5;
        if (h > 0) {
            bbVar4 = bbVar5;
        }
        if (bbVar7.compareTo(bbVar6) > 0) {
            i3 = -i3;
        } else {
            C59136bb bbVar8 = bbVar7;
            bbVar7 = bbVar6;
            bbVar6 = bbVar8;
        }
        if (bbVar4.compareTo(bbVar6) > 0) {
            i3 = -i3;
            C59136bb bbVar9 = bbVar6;
            bbVar6 = bbVar4;
            bbVar4 = bbVar9;
        }
        if (!bbVar4.mo56506q(bbVar4) || !bbVar6.mo56506q(bbVar6) || !bbVar7.mo56506q(bbVar7)) {
            return -i3;
        }
        C59107a aVar = new C59107a(bbVar4);
        C59107a aVar2 = new C59107a(bbVar6);
        C59107a aVar3 = new C59107a(bbVar7);
        C59107a a = aVar2.mo56408a(aVar3);
        int signum = a.f157079a.multiply(aVar.f157079a).add(a.f157080b.multiply(aVar.f157080b)).add(a.f157081c.multiply(aVar.f157081c)).signum();
        if (signum != 0) {
            return i3 * signum;
        }
        int signum2 = a.f157081c.signum();
        if (signum2 == 0 && (signum2 = a.f157080b.signum()) == 0) {
            int signum3 = a.f157079a.signum();
            if (signum3 == 0 && (signum3 = aVar3.f157079a.multiply(aVar.f157080b).subtract(aVar3.f157080b.multiply(aVar.f157079a)).signum()) == 0 && (signum3 = aVar3.f157079a.signum()) == 0 && (signum3 = -aVar3.f157080b.signum()) == 0 && (signum3 = aVar3.f157081c.multiply(aVar.f157079a).subtract(aVar3.f157079a.multiply(aVar.f157081c)).signum()) == 0) {
                int signum4 = aVar3.f157081c.signum();
                if (signum4 == 0 && (signum4 = aVar.f157079a.multiply(aVar2.f157080b).subtract(aVar.f157080b.multiply(aVar2.f157079a)).signum()) == 0 && (signum4 = -aVar2.f157079a.signum()) == 0) {
                    int signum5 = aVar2.f157080b.signum();
                    if (!(signum5 == 0 && (signum5 = aVar.f157079a.signum()) == 0)) {
                        i4 = signum5;
                    }
                } else {
                    i4 = signum4;
                }
            } else {
                i4 = signum3;
            }
        } else {
            i4 = signum2;
        }
        return i3 * i4;
    }

    /* renamed from: b */
    public static int m91711b(C59136bb bbVar, C59136bb bbVar2, C59136bb bbVar3) {
        double f = C59136bb.m91665f(bbVar3, bbVar, bbVar2);
        int i = f >= 1.6E-15d ? 1 : f <= -1.6E-15d ? -1 : 0;
        return i == 0 ? m91710a(bbVar, bbVar2, bbVar3) : i;
    }
}
