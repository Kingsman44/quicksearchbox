package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.au */
/* compiled from: PG */
public final /* synthetic */ class C136064au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136066aw f370554a;

    /* renamed from: b */
    public final /* synthetic */ C136065av f370555b;

    public /* synthetic */ C136064au(C136066aw awVar, C136065av avVar) {
        this.f370554a = awVar;
        this.f370555b = avVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r5 < (r2 + r2)) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.aw r0 = r8.f370554a
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.av r1 = r8.f370555b
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.av r2 = com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136065av.ANIMATE_LATER
            r3 = 1
            if (r1 != r2) goto L_0x008a
            boolean r2 = r0.f370568e
            if (r2 != 0) goto L_0x0074
            j$.util.Optional r2 = r0.f370566c
            boolean r2 = r2.isPresent()
            r4 = 0
            if (r2 == 0) goto L_0x0075
            j$.util.Optional r2 = r0.f370566c
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.googleapp.googleappbrowser.feature.e.j r2 = (com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135767j) r2
            float r5 = r0.f370571h
            boolean r6 = r2.f369808b
            if (r6 == 0) goto L_0x0075
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0075
            com.google.android.apps.search.googleapp.googleappbrowser.feature.e.l r2 = r2.f369811e
            if (r2 == 0) goto L_0x0075
            com.google.android.apps.search.googleapp.googleappbrowser.feature.e.o r2 = r2.mo17754z()
            com.google.android.apps.search.googleapp.googleappbrowser.feature.e.s r5 = r2.f369823g
            boolean r5 = com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135770m.m220278a(r5)
            if (r5 == 0) goto L_0x0075
            com.google.android.apps.search.googleapp.googleappbrowser.feature.e.s r2 = r2.f369823g
            if (r2 == 0) goto L_0x0075
            com.google.at.h.a.a.a.s r2 = r2.f369842c
            if (r2 != 0) goto L_0x0045
            com.google.at.h.a.a.a.s r2 = com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s.f142008d
        L_0x0045:
            if (r2 == 0) goto L_0x0075
            com.google.at.h.a.a.a.av r2 = r2.f142012c
            if (r2 != 0) goto L_0x004d
            com.google.at.h.a.a.a.av r2 = com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av.f141935j
        L_0x004d:
            if (r2 == 0) goto L_0x0075
            com.google.at.h.a.a.a.b r2 = r2.f141940d
            if (r2 != 0) goto L_0x0055
            com.google.at.h.a.a.a.b r2 = com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54103b.f141956g
        L_0x0055:
            if (r2 == 0) goto L_0x0075
            float r2 = r2.f141959b
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r5 + r2
            float r5 = java.lang.Math.abs(r5)
            float r2 = java.lang.Math.ulp(r2)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = java.lang.Math.ulp(r6)
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x006f
            r2 = r6
        L_0x006f:
            float r2 = r2 + r2
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0075
        L_0x0074:
            r4 = 1
        L_0x0075:
            r0.f370568e = r4
            boolean r2 = r0.f370564a
            if (r2 != 0) goto L_0x0087
            boolean r2 = r0.f370569f
            if (r2 != 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.av r2 = com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136065av.ANIMATE_HALF_EXPANDED
            goto L_0x008b
        L_0x0084:
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.av r2 = com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136065av.ANIMATE_COLLAPSED
            goto L_0x008b
        L_0x0087:
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.av r2 = com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136065av.ANIMATE_HIDDEN
            goto L_0x008b
        L_0x008a:
            r2 = r1
        L_0x008b:
            int r2 = r2.ordinal()
            if (r2 == r3) goto L_0x00ad
            r4 = 2
            if (r2 == r4) goto L_0x00a6
            r4 = 3
            if (r2 != r4) goto L_0x00a0
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior r0 = r0.f370567d
            r0.f370626d = r3
            r1 = 6
            r0.mo47519v(r1)
            return
        L_0x00a0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior r0 = r0.f370567d
            r1 = 4
            r0.mo47519v(r1)
            return
        L_0x00ad:
            com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior r0 = r0.f370567d
            r1 = 5
            r0.mo47519v(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136064au.run():void");
    }
}
