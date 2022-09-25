package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.os.Build;
import android.support.p031v4.app.Fragment;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136451d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136529g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136540q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.k */
/* compiled from: PG */
public final class C136508k {

    /* renamed from: a */
    public static final Duration f371624a = Duration.ofMillis(30);

    /* renamed from: b */
    public final C136504g f371625b;

    /* renamed from: c */
    public final C47274n f371626c;

    /* renamed from: d */
    public final C136540q f371627d;

    /* renamed from: e */
    public final C136453f f371628e;

    /* renamed from: f */
    public final boolean f371629f;

    /* renamed from: g */
    public Instant f371630g;

    /* renamed from: h */
    public Window f371631h;

    /* renamed from: i */
    public boolean f371632i;

    /* renamed from: j */
    public boolean f371633j;

    /* renamed from: k */
    public int f371634k;

    /* renamed from: l */
    public boolean f371635l;

    /* renamed from: m */
    public int f371636m = 4;

    /* renamed from: n */
    public C136529g f371637n;

    /* renamed from: o */
    private final C21370a f371638o;

    /* renamed from: p */
    private final boolean f371639p;

    public C136508k(C136504g gVar, C136540q qVar, C47274n nVar, C21370a aVar, boolean z) {
        boolean z2 = false;
        this.f371632i = false;
        this.f371633j = false;
        this.f371625b = gVar;
        this.f371627d = qVar;
        this.f371626c = nVar;
        this.f371638o = aVar;
        this.f371628e = new C136453f("SlidingFragmentPeer", 20, aVar);
        this.f371639p = nVar.getResources().getConfiguration().getLayoutDirection() == 1 ? true : z2;
        this.f371629f = z;
    }

    /* renamed from: b */
    public static C136504g m221836b(C136540q qVar) {
        C136504g gVar = new C136504g();
        C68324h.m98669f(gVar);
        C47243l.m84039a(gVar, qVar);
        return gVar;
    }

    /* renamed from: k */
    private final long m221837k(Instant instant) {
        return (instant.toEpochMilli() - this.f371638o.mo26870b()) + this.f371638o.mo26874f();
    }

    /* renamed from: l */
    private final void m221838l(Window window) {
        this.f371628e.mo113057a("enableTouch");
        window.clearFlags(24);
    }

    /* renamed from: m */
    private final void m221839m(Window window) {
        this.f371628e.mo113057a("showOverlay");
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.alpha != 1.0f) {
            attributes.alpha = 1.0f;
            window.setAttributes(attributes);
        }
        this.f371632i = true;
    }

    /* renamed from: a */
    public final Fragment mo113103a() {
        return this.f371625b.getChildFragmentManager().f634a.mo670b(R.id.googleapp_content_view);
    }

    /* renamed from: c */
    public final C136512o mo113104c() {
        return (C136512o) this.f371625b.getView();
    }

    /* renamed from: d */
    public final void mo113105d(C136499b bVar) {
        C136451d dVar = this.f371627d.f371755c;
        if (dVar == null) {
            dVar = C136451d.f371493e;
        }
        if (Build.VERSION.SDK_INT < 31) {
            int i = dVar.f371495a;
            if ((i & 1) != 0 && (i & 2) != 0) {
                int i2 = dVar.f371496b;
                int i3 = dVar.f371497c;
                bVar.mo113097a(i2);
                return;
            }
            return;
        }
        bVar.mo113097a(this.f371626c.getColor(R.color.googleapp_android_s_background));
    }

    /* renamed from: e */
    public final void mo113106e(Window window) {
        this.f371628e.mo113057a("disableTouch");
        window.addFlags(24);
    }

    /* renamed from: f */
    public final void mo113107f(int i, int i2, Instant instant) {
        long j;
        C136512o c = mo113104c();
        if (c != null) {
            Instant instant2 = this.f371630g;
            if (instant2 == null) {
                j = 0;
            } else {
                j = m221837k(instant2);
            }
            long j2 = j;
            long k = m221837k(instant);
            if (this.f371639p) {
                i = -i;
            }
            MotionEvent obtain = MotionEvent.obtain(j2, k, i2, (float) i, 0.0f, 0);
            obtain.setSource(4098);
            c.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: g */
    public final void mo113108g(Window window) {
        this.f371628e.mo113057a("hideOverlay");
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.alpha != 0.0f) {
            attributes.alpha = 0.0f;
            window.setAttributes(attributes);
        }
        this.f371632i = false;
    }

    /* renamed from: h */
    public final boolean mo113109h() {
        C136512o c = mo113104c();
        return c != null ? c.mo17754z().f371687x : this.f371627d.f371754b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r9 != 4) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113110i(int r11, int r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.f371636m
            if (r0 == r11) goto L_0x0156
            r10.f371636m = r11
            com.google.android.apps.search.googleapp.launcher.b.c.f r11 = r10.f371628e
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r10.f371636m
            java.lang.String r4 = com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136495ac.m221813a(r3)
            r5 = 0
            if (r3 == 0) goto L_0x0155
            r3 = 0
            r2[r3] = r4
            java.lang.String r4 = "onOverlayStateChanged, currentState = %s"
            java.lang.String r0 = java.lang.String.format(r0, r4, r2)
            r11.mo113057a(r0)
            boolean r11 = r10.f371632i
            android.view.Window r0 = r10.f371631h
            r2 = 4
            r4 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0056
            int r7 = r10.f371636m
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x0055
            if (r8 == 0) goto L_0x004c
            if (r8 == r1) goto L_0x0048
            if (r8 == r6) goto L_0x0044
            if (r8 == r4) goto L_0x0040
            if (r8 == r2) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            r10.m221839m(r0)
            goto L_0x0056
        L_0x0040:
            r10.mo113108g(r0)
            goto L_0x0056
        L_0x0044:
            r10.mo113106e(r0)
            goto L_0x0056
        L_0x0048:
            r10.m221838l(r0)
            goto L_0x0056
        L_0x004c:
            r10.m221839m(r0)
            android.view.Window r0 = r10.f371631h
            r10.m221838l(r0)
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            com.google.android.apps.search.googleapp.launcher.b.i.g r0 = r10.f371637n
            if (r0 == 0) goto L_0x0156
            int r7 = r10.f371636m
            com.google.android.apps.search.googleapp.launcher.b.i.i r8 = r0.f371699a
            r8.f371725v = r7
            int r9 = r7 + -1
            if (r7 == 0) goto L_0x0154
            if (r9 == 0) goto L_0x011c
            if (r9 == r1) goto L_0x00c3
            if (r9 == r6) goto L_0x011c
            if (r9 == r4) goto L_0x0070
            if (r9 == r2) goto L_0x011c
            goto L_0x011f
        L_0x0070:
            com.google.android.apps.search.googleapp.launcher.b.i.k r1 = r8.mo22017i()
            if (r1 == 0) goto L_0x0079
            r1.mo113165d()
        L_0x0079:
            r8.mo113159k(r3)
            com.google.android.apps.search.googleapp.launcher.b.aj r1 = r8.f371726w
            com.google.android.apps.search.googleapp.launcher.b.ak r2 = r1.f371443b
            com.google.android.apps.search.googleapp.launcher.b.c.f r2 = r2.f371455j
            java.lang.String r4 = "onOverlayClosed"
            r2.mo113057a(r4)
            com.google.android.apps.search.googleapp.launcher.b.ak r2 = r1.f371443b
            r4 = 0
            r2.mo113040d(r4)
            com.google.android.apps.search.googleapp.launcher.b.ad r2 = r1.f371444c
            com.google.android.apps.search.googleapp.launcher.b.ae r7 = r2.f371413b
            boolean r8 = r7.f371427n
            if (r8 == 0) goto L_0x0096
            goto L_0x00c0
        L_0x0096:
            com.google.android.libraries.ab.f r8 = r2.f371412a
            r7.mo113028l(r8)
            if (r12 != r6) goto L_0x00a3
            com.google.android.apps.search.googleapp.launcher.b.ae r13 = r2.f371413b
            r13.mo113033x(r4)
            goto L_0x00a8
        L_0x00a3:
            com.google.android.apps.search.googleapp.launcher.b.ae r4 = r2.f371413b
            r4.mo113033x(r13)
        L_0x00a8:
            com.google.android.apps.search.googleapp.launcher.b.ae r13 = r2.f371413b
            r13.mo113022K(r12)
            com.google.android.apps.search.googleapp.launcher.b.ae r12 = r2.f371413b
            boolean r13 = r12.f371426m
            if (r13 == 0) goto L_0x00b7
            r12.mo113027k()
            goto L_0x00ba
        L_0x00b7:
            r12.mo113026j()
        L_0x00ba:
            com.google.android.apps.search.googleapp.launcher.b.ae r12 = r2.f371413b
            r12.f371425l = r5
            r12.f371426m = r3
        L_0x00c0:
            r1.f371442a = r3
            goto L_0x011f
        L_0x00c3:
            com.google.android.apps.search.googleapp.launcher.b.i.k r2 = r8.mo22017i()
            if (r2 == 0) goto L_0x00cc
            r2.mo113166e()
        L_0x00cc:
            r8.mo113159k(r3)
            com.google.android.apps.search.googleapp.launcher.b.aj r2 = r8.f371726w
            com.google.android.apps.search.googleapp.launcher.b.ak r4 = r2.f371443b
            com.google.android.apps.search.googleapp.launcher.b.c.f r4 = r4.f371455j
            java.lang.String r7 = "onOverlayOpened"
            r4.mo113057a(r7)
            com.google.android.apps.search.googleapp.launcher.b.ak r4 = r2.f371443b
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.mo113040d(r7)
            com.google.android.apps.search.googleapp.launcher.b.ad r4 = r2.f371444c
            com.google.android.apps.search.googleapp.launcher.b.ae r8 = r4.f371413b
            boolean r9 = r8.f371427n
            if (r9 == 0) goto L_0x00ea
            goto L_0x0119
        L_0x00ea:
            r8.mo113032w(r1)
            com.google.android.apps.search.googleapp.launcher.b.ae r8 = r4.f371413b
            com.google.android.libraries.ab.f r9 = r4.f371412a
            r8.mo113028l(r9)
            if (r12 != r6) goto L_0x00fc
            com.google.android.apps.search.googleapp.launcher.b.ae r13 = r4.f371413b
            r13.mo113033x(r7)
            goto L_0x0101
        L_0x00fc:
            com.google.android.apps.search.googleapp.launcher.b.ae r6 = r4.f371413b
            r6.mo113033x(r13)
        L_0x0101:
            com.google.android.apps.search.googleapp.launcher.b.ae r13 = r4.f371413b
            r13.mo113022K(r12)
            com.google.android.apps.search.googleapp.launcher.b.ae r12 = r4.f371413b
            boolean r13 = r12.f371426m
            if (r13 == 0) goto L_0x0110
            r12.mo113026j()
            goto L_0x0113
        L_0x0110:
            r12.mo113027k()
        L_0x0113:
            com.google.android.apps.search.googleapp.launcher.b.ae r12 = r4.f371413b
            r12.f371425l = r5
            r12.f371426m = r1
        L_0x0119:
            r2.f371442a = r1
            goto L_0x011f
        L_0x011c:
            r8.mo113159k(r1)
        L_0x011f:
            com.google.android.apps.search.googleapp.launcher.b.i.i r12 = r0.f371699a
            r12.mo113161m()
            boolean r12 = r10.f371632i
            if (r12 == r11) goto L_0x0156
            com.google.android.apps.search.googleapp.launcher.b.i.g r11 = r10.f371637n
            com.google.android.apps.search.googleapp.launcher.b.i.i r13 = r11.f371699a
            com.google.android.apps.search.googleapp.launcher.b.i.k r13 = r13.mo22017i()
            if (r13 == 0) goto L_0x0135
            r13.mo113168g(r12)
        L_0x0135:
            if (r12 == 0) goto L_0x014e
            com.google.android.apps.search.googleapp.launcher.b.i.i r12 = r11.f371699a
            android.view.Window r12 = r12.f122878z
            if (r12 == 0) goto L_0x014e
            android.view.View r12 = r12.getDecorView()
            android.view.ViewTreeObserver r12 = r12.getViewTreeObserver()
            com.google.android.apps.search.googleapp.launcher.b.i.f r13 = new com.google.android.apps.search.googleapp.launcher.b.i.f
            r13.<init>(r11)
            r12.addOnGlobalLayoutListener(r13)
            return
        L_0x014e:
            com.google.android.apps.search.googleapp.launcher.b.aj r11 = r11.f371700b
            r11.mo113036a(r3)
            return
        L_0x0154:
            throw r5
        L_0x0155:
            throw r5
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k.mo113110i(int, int, float):void");
    }

    /* renamed from: j */
    public final void mo113111j(Window window, C136529g gVar) {
        this.f371631h = window;
        this.f371637n = gVar;
        C136512o c = mo113104c();
        if (c != null) {
            C136521x a = c.mo17754z();
            a.mo113141i(a.f371671h);
        }
    }
}
