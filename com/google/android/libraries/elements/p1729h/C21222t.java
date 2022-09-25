package com.google.android.libraries.elements.p1729h;

import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40369aa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.h.t */
/* compiled from: PG */
public final class C21222t implements C21292ch {

    /* renamed from: b */
    public final Object f59545b = new Object();

    /* renamed from: c */
    public final C21201ad f59546c;

    /* renamed from: d */
    public final C21201ad f59547d;

    /* renamed from: e */
    public final C21201ad f59548e;

    /* renamed from: f */
    public final int f59549f;

    /* renamed from: g */
    public final String f59550g;

    /* renamed from: h */
    public final List f59551h;

    /* renamed from: i */
    public final C21203af f59552i;

    /* renamed from: j */
    public final AtomicReference f59553j;

    /* renamed from: k */
    private final Executor f59554k;

    public C21222t(String str, int i, C40369aa aaVar, C21203af afVar, Executor executor) {
        this.f59549f = i;
        this.f59554k = executor;
        this.f59546c = new C21201ad(aaVar);
        this.f59547d = new C21201ad(aaVar);
        this.f59548e = new C21201ad(aaVar);
        this.f59551h = new ArrayList();
        this.f59552i = afVar;
        this.f59550g = str;
        this.f59553j = new AtomicReference();
    }

    /* renamed from: a */
    public final void mo26273a() {
        synchronized (this.f59545b) {
            this.f59546c.mo26239b();
            this.f59547d.mo26239b();
            this.f59548e.mo26239b();
            this.f59551h.clear();
        }
    }

    /* renamed from: b */
    public final void mo26274b() {
        this.f59547d.mo26240c();
    }

    /* renamed from: c */
    public final void mo26275c() {
        this.f59546c.mo26240c();
    }

    /* renamed from: d */
    public final void mo26276d() {
        this.f59548e.mo26240c();
    }

    /* renamed from: e */
    public final synchronized void mo26277e(boolean z) {
        if (z) {
            mo26273a();
        } else {
            this.f59554k.execute(new C21220r(this));
        }
    }

    /* renamed from: f */
    public final void mo26278f(long j) {
        synchronized (this.f59545b) {
            this.f59551h.add(new C21221s(j, C21224v.m39930a()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0004 A[LOOP:0: B:2:0x0004->B:5:0x0010, LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26279g(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference r0 = r2.f59553j
        L_0x0004:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0004
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1729h.C21222t.mo26279g(java.lang.String):void");
    }

    /* renamed from: h */
    public final void mo26280h() {
        this.f59547d.mo26241d();
    }

    /* renamed from: i */
    public final void mo26281i() {
        this.f59546c.mo26241d();
    }

    /* renamed from: j */
    public final void mo26282j() {
        this.f59548e.mo26241d();
    }

    /* renamed from: k */
    public final void mo26283k(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21227y yVar = (C21227y) it.next();
            yVar.mo26221c(Integer.valueOf(i));
            this.f59552i.mo26246e(this.f59550g, yVar.mo26219a());
        }
    }
}
