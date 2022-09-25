package com.google.common.p4535g;

/* renamed from: com.google.common.g.cc */
/* compiled from: PG */
public enum C59164cc {
    S2_LINEAR_PROJECTION(r3, 1.4400341929556038d),
    S2_TAN_PROJECTION(3.141592653589793d / (r1 + r1), 1.4616670325467394d),
    S2_QUADRATIC_PROJECTION((r2 + r2) / 3.0d, 1.4592137463861061d);
    

    /* renamed from: d */
    public static final int[][][] f157202d = null;

    /* renamed from: e */
    public static final C59162ca[] f157203e = null;

    /* renamed from: f */
    public static final C59164cc f157204f = null;

    /* renamed from: i */
    private static final C59163cb[] f157205i = null;

    /* renamed from: g */
    public final C59221o f157207g;

    /* renamed from: h */
    public final C59221o f157208h;

    static {
        C59164cc ccVar;
        f157202d = new int[][][]{new int[][]{new int[]{4, 1}, new int[]{5, 2}, new int[]{3, 0}}, new int[][]{new int[]{0, 3}, new int[]{5, 2}, new int[]{4, 1}}, new int[][]{new int[]{0, 3}, new int[]{1, 4}, new int[]{5, 2}}, new int[][]{new int[]{2, 5}, new int[]{1, 4}, new int[]{0, 3}}, new int[][]{new int[]{2, 5}, new int[]{3, 0}, new int[]{1, 4}}, new int[][]{new int[]{4, 1}, new int[]{3, 0}, new int[]{2, 5}}};
        f157203e = new C59162ca[]{new C59155bu(), new C59156bv(), new C59157bw(), new C59158bx(), new C59159by(), new C59160bz()};
        f157205i = new C59163cb[]{new C59149bo(), new C59150bp(), new C59151bq(), new C59152br(), new C59153bs(), new C59154bt()};
        f157204f = ccVar;
    }

    private C59164cc(double d, double d2) {
        Math.sqrt(3.0d);
        this.f157207g = new C59221o(d);
        this.f157208h = new C59221o(d2);
    }

    /* renamed from: b */
    public static double m91750b(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d * 4.6566128730773926E-10d;
    }

    /* renamed from: e */
    public static int m91751e(double d) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((d * 1.073741824E9d) - 8.0d)));
    }

    /* renamed from: f */
    public static int m91752f(C59136bb bbVar) {
        return m91753g(bbVar.f157162e, bbVar.f157163f, bbVar.f157164g);
    }

    /* renamed from: g */
    static int m91753g(double d, double d2, double d3) {
        int i = C59136bb.m91666i(d, d2, d3);
        return i != 0 ? i != 1 ? d3 < C59203do.f157270a ? 5 : 2 : d2 < C59203do.f157270a ? 4 : 1 : d < C59203do.f157270a ? 3 : 0;
    }

    /* renamed from: h */
    public static C59216j m91754h(int i, C59136bb bbVar) {
        if (i < 3) {
            if (bbVar.mo56498c(i) <= C59203do.f157270a) {
                return null;
            }
        } else if (bbVar.mo56498c(i - 3) >= C59203do.f157270a) {
            return null;
        }
        C59216j jVar = new C59216j(C59203do.f157270a, C59203do.f157270a);
        m91761p(i, bbVar, jVar);
        return jVar;
    }

    /* renamed from: j */
    public static C59136bb m91755j(int i, C59216j jVar) {
        return m91756k(i, jVar.f157293a, jVar.f157294b);
    }

    /* renamed from: k */
    public static C59136bb m91756k(int i, double d, double d2) {
        C59163cb o = m91760o(i);
        return new C59136bb(o.mo56536a(d, d2), o.mo56537b(d, d2), o.mo56538c(d, d2));
    }

    /* renamed from: m */
    public static C59136bb m91758m(int i, double d) {
        int i2 = i;
        double d2 = d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new C59136bb(C59203do.f157270a, -1.0d, -d2) : new C59136bb(C59203do.f157270a, -d2, 1.0d) : new C59136bb(-d2, C59203do.f157270a, 1.0d) : new C59136bb(1.0d, C59203do.f157270a, d) : new C59136bb(1.0d, d, C59203do.f157270a) : new C59136bb(d, -1.0d, C59203do.f157270a);
    }

    /* renamed from: n */
    public static C59136bb m91759n(int i, double d) {
        C59136bb bbVar;
        int i2 = i;
        double d2 = d;
        if (i2 == 0) {
            return new C59136bb(-d2, C59203do.f157270a, 1.0d);
        }
        if (i2 == 1) {
            return new C59136bb(C59203do.f157270a, -d2, 1.0d);
        }
        if (i2 == 2) {
            return new C59136bb(C59203do.f157270a, -1.0d, -d2);
        }
        if (i2 == 3) {
            return new C59136bb(d, -1.0d, C59203do.f157270a);
        }
        if (i2 != 4) {
            double d3 = d;
            return bbVar;
        }
        new C59136bb(1.0d, d, C59203do.f157270a);
        return bbVar;
    }

    /* renamed from: o */
    static C59163cb m91760o(int i) {
        return f157205i[Math.min(5, i)];
    }

    /* renamed from: p */
    static void m91761p(int i, C59136bb bbVar, C59216j jVar) {
        C59162ca caVar = f157203e[i];
        double a = caVar.mo56539a(bbVar.f157162e, bbVar.f157163f, bbVar.f157164g);
        double b = caVar.mo56540b(bbVar.f157162e, bbVar.f157163f, bbVar.f157164g);
        jVar.f157293a = a;
        jVar.f157294b = b;
    }

    /* renamed from: a */
    public final double mo56541a(int i, int i2) {
        double d = (double) (i & (-i2));
        Double.isNaN(d);
        return mo56542c(d * 9.313225746154785E-10d);
    }

    /* renamed from: c */
    public final double mo56542c(double d) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (d + d) - 4.0d;
        }
        if (ordinal == 1) {
            double tan = Math.tan((d * 1.5707963267948966d) - 5.716814692820414d);
            return tan + (1.1102230246251565E-16d * tan);
        } else if (ordinal != 2) {
            throw null;
        } else if (d >= 0.5d) {
            return (((4.0d * d) * d) - 4.0d) * 0.3333333333333333d;
        } else {
            double d2 = 1.0d - d;
            return (1.0d - ((4.0d * d2) * d2)) * 0.3333333333333333d;
        }
    }

    /* renamed from: i */
    public final C59136bb mo56544i(int i, long j, long j2) {
        double d = (double) j;
        Double.isNaN(d);
        double c = mo56542c(d * 4.6566128730773926E-10d);
        double d2 = (double) j2;
        Double.isNaN(d2);
        return m91756k(i, c, mo56542c(d2 * 4.6566128730773926E-10d));
    }

    /* renamed from: d */
    public final double mo56543d(double d) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            throw null;
        } else if (ordinal == 1) {
            throw null;
        } else if (ordinal != 2) {
            throw null;
        } else if (d >= C59203do.f157270a) {
            return Math.sqrt((d * 3.0d) + 1.0d) * 0.5d;
        } else {
            return 1.0d - (Math.sqrt(1.0d - (d * 3.0d)) * 0.5d);
        }
    }

    /* renamed from: l */
    public static C59136bb m91757l(int i, C59136bb bbVar) {
        int i2 = i;
        C59136bb bbVar2 = bbVar;
        if (i2 == 0) {
            return new C59136bb(bbVar2.f157163f, bbVar2.f157164g, bbVar2.f157162e);
        }
        if (i2 == 1) {
            return new C59136bb(-bbVar2.f157162e, bbVar2.f157164g, bbVar2.f157163f);
        }
        if (i2 == 2) {
            return new C59136bb(-bbVar2.f157162e, -bbVar2.f157163f, bbVar2.f157164g);
        }
        if (i2 != 3) {
            return i2 != 4 ? new C59136bb(bbVar2.f157163f, bbVar2.f157162e, -bbVar2.f157164g) : new C59136bb(-bbVar2.f157164g, bbVar2.f157162e, -bbVar2.f157163f);
        }
        return new C59136bb(-bbVar2.f157164g, -bbVar2.f157163f, -bbVar2.f157162e);
    }
}
