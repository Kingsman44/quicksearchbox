package com.google.android.apps.gsa.shared.p7148ui;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100079v;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.shared.ui.z */
/* compiled from: PG */
public final class C90714z extends C90632ah implements C90991b {

    /* renamed from: a */
    public int f253746a;

    /* renamed from: b */
    public int f253747b;

    /* renamed from: c */
    public int f253748c;

    /* renamed from: d */
    int f253749d;

    /* renamed from: e */
    public int f253750e;

    /* renamed from: f */
    public int f253751f;

    /* renamed from: g */
    public int f253752g;

    /* renamed from: h */
    public C100079v f253753h;

    /* renamed from: i */
    private final C90712x f253754i;

    /* renamed from: j */
    private final boolean f253755j;

    /* renamed from: k */
    private final C90633ai f253756k;

    /* renamed from: l */
    private final C90713y f253757l;

    /* renamed from: m */
    private final Observer f253758m;

    /* renamed from: n */
    private boolean f253759n;

    /* renamed from: o */
    private C90714z f253760o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90714z(android.view.View r3, com.google.android.apps.gsa.shared.p7148ui.C90633ai r4) {
        /*
            r2 = this;
            com.google.android.apps.gsa.shared.ui.u r0 = new com.google.android.apps.gsa.shared.ui.u
            r0.<init>(r3)
            com.google.android.apps.gsa.shared.ui.w r3 = new com.google.android.apps.gsa.shared.ui.w
            android.view.View r1 = r0.f253741a
            r1.getClass()
            r3.<init>(r1)
            r1 = 1
            r2.<init>(r0, r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.C90714z.<init>(android.view.View, com.google.android.apps.gsa.shared.ui.ai):void");
    }

    /* renamed from: m */
    private final int m148132m() {
        return Math.max(0, this.f253755j ? this.f253750e : this.f253751f - this.f253750e);
    }

    /* renamed from: a */
    public final int mo85041a(int i, int i2) {
        int i3;
        int m = m148132m();
        int i4 = this.f253750e;
        if (i4 < 0) {
            i3 = -i4;
        } else {
            int i5 = this.f253751f;
            i3 = i4 > i5 ? i4 - i5 : 0;
        }
        int c = mo85042c();
        int i6 = this.f253746a;
        if (i6 == 3 || (i2 & 4) != 0) {
            return -(c + i3);
        }
        if (i6 == 2) {
            return Math.max(-c, (this.f253747b - m) + i3);
        }
        int i7 = this.f253747b;
        if (i7 > m) {
            return i3 + (i7 - m);
        }
        if (i6 == 1 || (i2 & 2) != 0) {
            return i3;
        }
        return Math.min(i3, Math.max((-this.f253750e) + this.f253747b, Math.max(-(c + i3), this.f253752g + i)));
    }

    /* renamed from: b */
    public final void mo81847b(int i, int i2) {
        int i3 = this.f253750e;
        if (i != i3 || i2 != this.f253751f) {
            this.f253750e = i;
            this.f253751f = i2;
            mo85047k(i3 - i, 0);
        }
    }

    /* renamed from: c */
    public final int mo85042c() {
        int i = this.f253749d;
        int i2 = this.f253748c;
        return i2 != 0 ? Math.min(i2, i) : i;
    }

    /* renamed from: e */
    public final void mo85043e() {
        C90633ai aiVar = this.f253756k;
        if (aiVar != null) {
            mo81847b(aiVar.getScrollY(), this.f253756k.mo84791d());
        }
        mo85047k(0, 9);
    }

    /* renamed from: f */
    public final void mo84898f() {
        mo84899g();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OnScrollViewHider");
        fVar.mo85279c("top at").mo85276a(C90752i.m148229c(true != this.f253755j ? "BOTTOM" : "TOP"));
        fVar.mo85279c("view height").mo85276a(C90752i.m148230d(Integer.valueOf(this.f253749d)));
        fVar.mo85279c("current offset").mo85276a(C90752i.m148230d(Integer.valueOf(this.f253752g)));
        C91005e c = fVar.mo85279c("stickiness");
        int i = this.f253746a;
        c.mo85276a(C90752i.m148229c(i != 0 ? i != 1 ? i != 2 ? "STUCK_OFF_SCREEN" : "STUCK_TO_SCROLLING_VIEW" : "STICKY" : "NOT_STICKY"));
        if (this.f253747b != 0) {
            fVar.mo85279c("offset from edge").mo85276a(C90752i.m148230d(Integer.valueOf(this.f253747b)));
        }
    }

    /* renamed from: h */
    public final void mo85044h(boolean z, boolean z2) {
        if (this.f253759n != z) {
            this.f253759n = z;
            if (z) {
                this.f253757l.addObserver(this.f253758m);
                this.f253749d = this.f253757l.mo85038a();
                C90633ai aiVar = this.f253756k;
                if (aiVar != null) {
                    aiVar.mo84822r(this);
                }
                if (z2) {
                    mo85043e();
                    return;
                }
                return;
            }
            this.f253757l.deleteObserver(this.f253758m);
            C90633ai aiVar2 = this.f253756k;
            if (aiVar2 != null) {
                aiVar2.mo84825s(this);
            }
        }
    }

    /* renamed from: i */
    public final void mo85045i(int i, boolean z) {
        if (i != this.f253747b) {
            this.f253747b = i;
            mo85047k(0, z ? 1 : 0);
        }
    }

    /* renamed from: j */
    public final void mo85046j(int i, boolean z, boolean z2) {
        int i2 = this.f253746a;
        if (i != i2) {
            boolean z3 = true;
            char c = 2;
            if (!(i2 == 2 || i2 == 3)) {
                z3 = false;
            }
            this.f253746a = i;
            if (!z3 || !z2) {
                c = 0;
            }
            mo85047k(0, c | z ? 1 : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r1 = r4.f253747b;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85047k(int r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.f253759n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r4.f253749d
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            int r0 = r4.mo85041a(r5, r6)
            int r1 = r4.f253752g
            if (r0 != r1) goto L_0x0018
            r1 = r6 & 8
            if (r1 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            int r1 = r4.f253746a
            r2 = 2
            if (r1 != r2) goto L_0x001e
            goto L_0x0031
        L_0x001e:
            int r1 = r4.f253747b
            if (r1 == 0) goto L_0x0033
            boolean r2 = r4.f253755j
            if (r2 == 0) goto L_0x002b
            int r2 = r4.f253750e
            if (r2 >= 0) goto L_0x0033
            goto L_0x0031
        L_0x002b:
            int r2 = r4.f253750e
            int r3 = r4.f253751f
            if (r2 <= r3) goto L_0x0033
        L_0x0031:
            r1 = r0
            goto L_0x0037
        L_0x0033:
            int r1 = java.lang.Math.min(r0, r1)
        L_0x0037:
            boolean r2 = r4.f253755j
            if (r2 != 0) goto L_0x003c
            int r1 = -r1
        L_0x003c:
            int r2 = r4.f253752g
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            r3 = 1
            if (r2 <= r5) goto L_0x0051
            r5 = r6 & 1
            if (r5 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            com.google.android.apps.gsa.shared.ui.x r5 = r4.f253754i
            r5.mo83198a()
            float r5 = (float) r1
            com.google.android.apps.gsa.shared.ui.x r6 = r4.f253754i
            r6.mo83199b(r5)
            com.google.android.apps.gsa.staticplugins.dr.d.v r6 = r4.f253753h
            if (r6 == 0) goto L_0x0077
            int r1 = r4.f253747b
            if (r1 == 0) goto L_0x0066
            float r1 = (float) r1
            float r5 = r5 / r1
        L_0x0066:
            com.google.android.apps.gsa.staticplugins.dr.d.at r6 = r6.f279910a
            com.google.android.apps.gsa.shared.ao.q r6 = r6.f279787B
            r6.f242012e = r5
            com.google.android.apps.gsa.shared.ao.o r6 = r6.f242013f
            if (r6 == 0) goto L_0x0077
            com.google.android.apps.gsa.shared.ao.e r6 = r6.f242006a
            com.google.android.apps.gsa.searchplate.n r6 = r6.f241980e
            r6.mo82835i(r5)
        L_0x0077:
            com.google.android.apps.gsa.shared.ui.x r5 = r4.f253754i
            r5.mo83200c(r3)
            r4.f253752g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.C90714z.mo85047k(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0 = r4.f253760o;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84899g() {
        /*
            r4 = this;
            int r0 = r4.f253746a
            r1 = 2
            if (r0 == r1) goto L_0x003c
            r2 = 1
            if (r0 == r2) goto L_0x003c
            r2 = 3
            if (r0 == r2) goto L_0x003c
            boolean r0 = r4.f253755j
            if (r0 != 0) goto L_0x0014
            int r0 = r4.f253747b
            if (r0 != 0) goto L_0x0014
            goto L_0x0020
        L_0x0014:
            int r0 = r4.f253747b
            int r2 = r4.f253749d
            int r0 = r0 + r2
            int r2 = r4.m148132m()
            if (r0 <= r2) goto L_0x0020
            goto L_0x003c
        L_0x0020:
            int r0 = r4.f253750e
            if (r0 > 0) goto L_0x0025
            goto L_0x0038
        L_0x0025:
            int r2 = r4.f253751f
            r3 = 4
            if (r0 < r2) goto L_0x002c
        L_0x002a:
            r1 = 4
            goto L_0x0038
        L_0x002c:
            com.google.android.apps.gsa.shared.ui.z r0 = r4.f253760o
            int r2 = r0.f253749d
            if (r2 == 0) goto L_0x0038
            int r0 = r0.f253752g
            int r0 = -r0
            int r2 = r2 / r1
            if (r0 >= r2) goto L_0x002a
        L_0x0038:
            r0 = 0
            r4.mo85047k(r0, r1)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.C90714z.mo84899g():void");
    }

    public C90714z(C90712x xVar, C90633ai aiVar, boolean z, C90713y yVar) {
        this.f253758m = new C90708t(this);
        this.f253754i = xVar;
        this.f253756k = aiVar;
        this.f253755j = true;
        this.f253757l = yVar;
        this.f253760o = this;
        this.f253753h = null;
        if (z) {
            mo85044h(true, false);
        }
    }
}
