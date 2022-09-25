package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wn */
/* compiled from: PG */
final class C7393wn extends C6912es {

    /* renamed from: b */
    private final long f24185b;

    /* renamed from: c */
    private final long f24186c;

    /* renamed from: d */
    private final long f24187d;

    /* renamed from: e */
    private final int f24188e;

    /* renamed from: f */
    private final long f24189f;

    /* renamed from: g */
    private final long f24190g;

    /* renamed from: h */
    private final long f24191h;

    /* renamed from: i */
    private final C7416xj f24192i;

    /* renamed from: j */
    private final C6873dg f24193j;

    public C7393wn(long j, long j2, long j3, int i, long j4, long j5, long j6, C7416xj xjVar, C6873dg dgVar) {
        this.f24185b = j;
        this.f24186c = j2;
        this.f24187d = j3;
        this.f24188e = i;
        this.f24189f = j4;
        this.f24190g = j5;
        this.f24191h = j6;
        this.f24192i = xjVar;
        this.f24193j = dgVar;
    }

    /* renamed from: a */
    private static boolean m22286a(C7416xj xjVar) {
        return xjVar.f24298d && xjVar.f24299e != -9223372036854775807L && xjVar.f24296b == -9223372036854775807L;
    }

    /* renamed from: f */
    public final C6911er mo15478f(int i, C6911er erVar, long j) {
        C7403wx l;
        ary.m19468u(i, 1);
        long j2 = this.f24191h;
        if (m22286a(this.f24192i)) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f24190g) {
                    j2 = -9223372036854775807L;
                }
            }
            long j3 = this.f24189f + j2;
            long e = this.f24192i.mo16764e(0);
            int i2 = 0;
            while (i2 < this.f24192i.mo16761b() - 1 && j3 >= e) {
                j3 -= e;
                i2++;
                e = this.f24192i.mo16764e(i2);
            }
            C7421xo c = this.f24192i.mo16762c(i2);
            int size = c.f24329c.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((C7415xi) c.f24329c.get(i3)).f24290b == 2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (!(i3 == -1 || (l = ((C7426xt) ((C7415xi) c.f24329c.get(i3)).f24291c.get(0)).mo16783l()) == null || l.mo16734g(e) == 0)) {
                j2 = (j2 + l.mo16729b(l.mo16728a(j3, e))) - j3;
            }
        }
        long j4 = j2;
        Object obj = C6911er.f22042a;
        C6873dg dgVar = this.f24193j;
        C7416xj xjVar = this.f24192i;
        erVar.mo15846b(obj, dgVar, xjVar, this.f24185b, this.f24186c, this.f24187d, true, m22286a(xjVar), this.f24192i.f24298d, j4, this.f24190g, mo15781t() - 1, this.f24189f);
        return erVar;
    }

    /* renamed from: h */
    public final C6910eq mo15480h(int i, C6910eq eqVar, boolean z) {
        ary.m19468u(i, mo15781t());
        Integer num = null;
        String str = z ? this.f24192i.mo16762c(i).f24327a : null;
        if (z) {
            num = Integer.valueOf(this.f24188e + i);
        }
        eqVar.mo15844l(str, num, this.f24192i.mo16764e(i), C6821bi.m19755b(this.f24192i.mo16762c(i).f24328b - this.f24192i.mo16762c(0).f24328b) - this.f24189f);
        return eqVar;
    }

    /* renamed from: i */
    public final int mo15481i(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f24188e) >= 0 && intValue < mo15781t()) {
            return intValue;
        }
        return -1;
    }

    /* renamed from: j */
    public final Object mo15482j(int i) {
        ary.m19468u(i, mo15781t());
        return Integer.valueOf(this.f24188e + i);
    }

    /* renamed from: s */
    public final int mo15780s() {
        return 1;
    }

    /* renamed from: t */
    public final int mo15781t() {
        return this.f24192i.mo16761b();
    }
}
