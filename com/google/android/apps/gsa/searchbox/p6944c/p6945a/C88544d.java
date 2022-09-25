package com.google.android.apps.gsa.searchbox.p6944c.p6945a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;

/* renamed from: com.google.android.apps.gsa.searchbox.c.a.d */
/* compiled from: PG */
public final class C88544d {

    /* renamed from: b */
    private static final int[] f239313b;

    /* renamed from: c */
    private static final int f239314c;

    /* renamed from: a */
    public C89205j f239315a;

    /* renamed from: d */
    private final String f239316d;

    /* renamed from: e */
    private final String f239317e;

    /* renamed from: f */
    private final String f239318f;

    static {
        int[] iArr = {0, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
        f239313b = iArr;
        f239314c = iArr[19] + 1;
    }

    public C88544d(String str) {
        this.f239316d = "TOTAL_ROUND_TRIP_TIME_".concat(str);
        this.f239317e = "MAX_ROUND_TRIP_TIME_".concat(str);
        this.f239318f = "ROUND_TRIP_TIME_HISTOGRAM_".concat(str);
    }

    /* renamed from: f */
    private final void m143052f() {
        C89205j jVar = this.f239315a;
        String str = this.f239318f;
        int[] iArr = new int[(f239314c + 1)];
        Object obj = jVar.f241828a;
        if (obj != null) {
            synchronized (obj) {
                jVar.mo83163c().putIntArray(str, iArr);
            }
            return;
        }
        jVar.mo83163c().putIntArray(str, iArr);
    }

    /* renamed from: g */
    private final int[] m143053g() {
        int[] intArray;
        C89205j jVar = this.f239315a;
        if (jVar == null) {
            return null;
        }
        if (!jVar.mo83177q(this.f239318f)) {
            m143052f();
        }
        C89205j jVar2 = this.f239315a;
        String str = this.f239318f;
        Object obj = jVar2.f241828a;
        if (obj == null) {
            return jVar2.mo83163c().getIntArray(str);
        }
        synchronized (obj) {
            intArray = jVar2.mo83163c().getIntArray(str);
        }
        return intArray;
    }

    /* renamed from: a */
    public final int mo82207a() {
        C89205j jVar = this.f239315a;
        if (jVar == null) {
            return 0;
        }
        return jVar.mo83161a(this.f239317e);
    }

    /* renamed from: b */
    public final int mo82208b() {
        C89205j jVar = this.f239315a;
        if (jVar == null) {
            return 0;
        }
        return jVar.mo83161a(this.f239316d);
    }

    /* renamed from: c */
    public final String mo82209c() {
        int[] g = m143053g();
        if (g == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < g.length; i2++) {
            long j = (long) g[i2];
            if (j == 0) {
                i++;
            } else {
                if (sb.length() > 0) {
                    sb.append("j");
                }
                if (i == 1) {
                    sb.append("0j");
                } else if (i > 1) {
                    sb.append(i2 + "-");
                }
                sb.append(j);
                i = 0;
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo82210d(int i) {
        C89205j jVar = this.f239315a;
        if (jVar != null && i >= 0) {
            this.f239315a.mo83171k(this.f239316d, jVar.mo83161a(this.f239316d) + i);
            if (i > this.f239315a.mo83161a(this.f239317e)) {
                this.f239315a.mo83171k(this.f239317e, i);
            }
            int[] g = m143053g();
            if (g != null) {
                if (((long) i) <= 1999) {
                    int i2 = f239313b[i / 100];
                    g[i2] = g[i2] + 1;
                    return;
                }
                int i3 = f239314c;
                g[i3] = g[i3] + 1;
            }
        }
    }

    /* renamed from: e */
    public final void mo82211e() {
        C89205j jVar = this.f239315a;
        if (jVar != null) {
            jVar.mo83171k(this.f239316d, 0);
            this.f239315a.mo83171k(this.f239317e, 0);
            m143052f();
        }
    }
}
