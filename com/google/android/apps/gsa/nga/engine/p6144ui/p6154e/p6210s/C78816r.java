package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.r */
/* compiled from: PG */
public final class C78816r {

    /* renamed from: a */
    public static final C78815q f216932a;

    static {
        C78801c cVar = (C78801c) C78815q.f216927d.createBuilder();
        C78803e eVar = C78803e.f216897a;
        cVar.copyOnWrite();
        C78815q qVar = (C78815q) cVar.instance;
        eVar.getClass();
        qVar.f216930b = eVar;
        qVar.f216929a = 2;
        f216932a = (C78815q) cVar.build();
    }

    /* renamed from: a */
    public static Optional m126596a(C78815q qVar) {
        C78814p pVar;
        C78809k kVar;
        C78806h hVar;
        C78810l lVar = C78810l.NO_SESSION;
        int ordinal = C78810l.m126595a(qVar.f216929a).ordinal();
        if (ordinal == 1) {
            if (qVar.f216929a == 3) {
                pVar = (C78814p) qVar.f216930b;
            } else {
                pVar = C78814p.f216922d;
            }
            return Optional.m71637of(Long.valueOf(pVar.f216924a));
        } else if (ordinal == 2) {
            if (qVar.f216929a == 4) {
                kVar = (C78809k) qVar.f216930b;
            } else {
                kVar = C78809k.f216908c;
            }
            return Optional.m71637of(Long.valueOf(kVar.f216910a));
        } else if (ordinal != 3) {
            return Optional.empty();
        } else {
            if (qVar.f216929a == 5) {
                hVar = (C78806h) qVar.f216930b;
            } else {
                hVar = C78806h.f216899c;
            }
            return Optional.m71637of(Long.valueOf(hVar.f216901a));
        }
    }

    /* renamed from: b */
    public static boolean m126597b(C78815q qVar) {
        return qVar.f216929a == 2;
    }

    /* renamed from: c */
    public static boolean m126598c(C78815q qVar) {
        return qVar.f216929a != 2;
    }

    /* renamed from: d */
    public static boolean m126599d(C78815q qVar) {
        if (qVar.f216929a == 3) {
            return ((C78814p) qVar.f216930b).f216926c;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m126600e(C78815q qVar) {
        C78806h hVar;
        if (qVar.f216929a != 5) {
            return false;
        }
        C78810l lVar = C78810l.NO_SESSION;
        if (qVar.f216929a == 5) {
            hVar = (C78806h) qVar.f216930b;
        } else {
            hVar = C78806h.f216899c;
        }
        int a = C78805g.m126593a(hVar.f216902b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m126601f(C78815q qVar) {
        C78810l lVar = C78810l.NO_SESSION;
        int ordinal = C78810l.m126595a(qVar.f216929a).ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3;
    }

    /* renamed from: g */
    public static boolean m126602g(C78815q qVar) {
        int i = qVar.f216929a;
        return i == 3 || i == 6;
    }

    /* renamed from: h */
    public static boolean m126603h(C78815q qVar) {
        return qVar.f216929a == 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78805g.m126593a(((com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h) r3.f216930b).f216902b);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m126604i(com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q r3) {
        /*
            int r0 = r3.f216929a
            r1 = 5
            r2 = 0
            if (r0 != r1) goto L_0x0018
            java.lang.Object r3 = r3.f216930b
            com.google.android.apps.gsa.nga.engine.ui.e.s.h r3 = (com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h) r3
            int r3 = r3.f216902b
            int r3 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78805g.m126593a(r3)
            if (r3 == 0) goto L_0x0018
            r0 = 7
            if (r3 == r0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r3 = 1
            return r3
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r.m126604i(com.google.android.apps.gsa.nga.engine.ui.e.s.q):boolean");
    }

    /* renamed from: j */
    public static boolean m126605j(C78815q qVar) {
        return qVar.f216929a == 4;
    }

    /* renamed from: k */
    public static boolean m126606k(C78815q qVar) {
        if (qVar.f216929a != 4) {
            return false;
        }
        C78808j a = C78808j.m126594a(((C78809k) qVar.f216930b).f216911b);
        if (a == null) {
            a = C78808j.UNRECOGNIZED;
        }
        return a.equals(C78808j.APP_SHORTCUTS);
    }

    /* renamed from: l */
    public static boolean m126607l(C78815q qVar) {
        if (qVar.f216929a != 5) {
            return false;
        }
        int a = C78805g.m126593a(((C78806h) qVar.f216930b).f216902b);
        if (a == 0) {
            a = 1;
        }
        return a == 3 || a == 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78805g.m126593a(((com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h) r3.f216930b).f216902b);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m126608m(com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q r3) {
        /*
            int r0 = r3.f216929a
            r1 = 5
            r2 = 0
            if (r0 != r1) goto L_0x0019
            java.lang.Object r3 = r3.f216930b
            com.google.android.apps.gsa.nga.engine.ui.e.s.h r3 = (com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h) r3
            int r3 = r3.f216902b
            int r3 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78805g.m126593a(r3)
            if (r3 == 0) goto L_0x0019
            r0 = 8
            if (r3 == r0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r3 = 1
            return r3
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r.m126608m(com.google.android.apps.gsa.nga.engine.ui.e.s.q):boolean");
    }

    /* renamed from: n */
    public static boolean m126609n(C78815q qVar) {
        return qVar.f216929a == 3;
    }

    /* renamed from: o */
    public static boolean m126610o(C78815q qVar) {
        if (qVar.f216929a == 3) {
            return ((C78814p) qVar.f216930b).f216925b;
        }
        return false;
    }
}
