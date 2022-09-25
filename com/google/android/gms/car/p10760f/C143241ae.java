package com.google.android.gms.car.p10760f;

import android.content.res.Configuration;
import com.google.android.gms.car.DrawingSpec;

/* renamed from: com.google.android.gms.car.f.ae */
/* compiled from: PG */
public final /* synthetic */ class C143241ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388371a;

    /* renamed from: b */
    public final /* synthetic */ int f388372b;

    /* renamed from: c */
    public final /* synthetic */ DrawingSpec f388373c;

    /* renamed from: d */
    public final /* synthetic */ Configuration f388374d;

    public /* synthetic */ C143241ae(C143268bb bbVar, int i, DrawingSpec drawingSpec, Configuration configuration) {
        this.f388371a = bbVar;
        this.f388372b = i;
        this.f388373c = drawingSpec;
        this.f388374d = configuration;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            com.google.android.gms.car.f.bb r1 = r0.f388371a
            int r2 = r0.f388372b
            com.google.android.gms.car.DrawingSpec r3 = r0.f388373c
            android.content.res.Configuration r4 = r0.f388374d
            android.util.SparseArray r5 = com.google.android.gms.car.p10760f.C143268bb.f388432a
            java.lang.String r5 = "CAR.PROJECTION.CAHI"
            r6 = 3
            boolean r7 = com.google.android.gms.car.C143109au.m232164a(r5, r6)
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r7 == 0) goto L_0x002f
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r12 = r1.f388473v
            r7[r9] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r7[r10] = r12
            r7[r8] = r3
            r7[r6] = r4
            java.lang.String r12 = "%s onVideoConfigurationChange(%s, %s, %s)"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r5, r11, r12, r7)
        L_0x002f:
            boolean r7 = r1.mo118326v()
            if (r7 != 0) goto L_0x0036
            return
        L_0x0036:
            r1.f388437E = r3
            r1.f388468q = r4
            r1.f388469r = r10
            com.google.android.gms.car.ac r7 = r1.f388461j
            if (r7 == 0) goto L_0x020f
            com.google.android.gms.car.a.a.db r7 = r1.f388477z
            r12 = 37
            boolean r7 = r7.mo117935q(r12)
            if (r7 == 0) goto L_0x0050
            boolean r7 = r1.f388438F
            if (r7 != 0) goto L_0x0050
            goto L_0x020f
        L_0x0050:
            int r4 = r4.uiMode
            r4 = r4 & 48
            android.app.Service r7 = r1.f388458g
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & 48
            if (r4 == r7) goto L_0x0082
            boolean r4 = com.google.android.gms.car.C143109au.m232164a(r5, r6)
            if (r4 == 0) goto L_0x0075
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r7 = r1.f388473v
            r4[r9] = r7
            java.lang.String r7 = "%s Configuration in onVideoConfigurationChange does not match context."
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r5, r11, r7, r4)
        L_0x0075:
            android.app.Service r4 = r1.f388458g
            android.content.Context r4 = r4.getBaseContext()
            android.content.res.Resources r4 = r4.getResources()
            r1.mo118325u(r4)
        L_0x0082:
            int r4 = r1.f388470s
            r7 = -1
            r4 = r4 ^ r7
            r2 = r2 & r4
            if (r2 != 0) goto L_0x00db
            com.google.android.gms.car.a.a.db r2 = r1.f388477z
            r4 = 33
            boolean r2 = r2.mo117935q(r4)
            if (r2 == 0) goto L_0x00af
            com.google.android.gms.car.df r2 = r1.f388464m
            com.google.android.gms.car.dg r2 = r2.f388237L
            r1.mo118323s(r2)
            r1.mo118324t()
            com.google.android.gms.car.ac r2 = r1.f388461j
            com.google.android.gms.car.df r4 = r1.f388464m
            com.google.android.gms.car.dg r4 = r4.f388237L
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            r2.mo17281b(r4)
            goto L_0x00d2
        L_0x00af:
            com.google.android.gms.car.df r2 = r1.f388464m
            android.content.Context r2 = r2.mo118141a()
            android.content.res.Resources r2 = r2.getResources()
            r1.mo118325u(r2)
            r1.mo118324t()
            com.google.android.gms.car.ac r2 = r1.f388461j
            com.google.android.gms.car.df r4 = r1.f388464m
            android.content.Context r4 = r4.mo118141a()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            r2.mo17281b(r4)
        L_0x00d2:
            if (r3 == 0) goto L_0x00d7
            r1.mo118321q(r3)
        L_0x00d7:
            r1.mo118315o()
            return
        L_0x00db:
            int r2 = r1.f388444L
            com.google.android.gms.car.df r4 = r1.f388464m
            boolean r4 = r4.f388263k
            if (r4 == 0) goto L_0x015d
            android.view.View r12 = r1.f388472u
            if (r12 == 0) goto L_0x015d
            boolean r13 = r12.isInTouchMode()
            if (r13 == 0) goto L_0x00ef
            goto L_0x015d
        L_0x00ef:
            android.view.View r13 = r12.findFocus()
            if (r13 == 0) goto L_0x0156
            int r14 = com.google.android.gms.car.C143205dv.m232325a(r13, r12)
            if (r14 == r7) goto L_0x0101
            com.google.android.gms.car.dv r12 = new com.google.android.gms.car.dv
            r12.<init>(r14)
            goto L_0x015e
        L_0x0101:
            android.view.ViewParent r14 = r13.getParent()
            r15 = r13
        L_0x0106:
            if (r14 == 0) goto L_0x0119
            if (r15 == r12) goto L_0x0119
            boolean r10 = r14 instanceof android.support.p033v7.widget.RecyclerView
            if (r10 == 0) goto L_0x0111
            android.support.v7.widget.RecyclerView r14 = (android.support.p033v7.widget.RecyclerView) r14
            goto L_0x011a
        L_0x0111:
            android.view.ViewParent r10 = r14.getParent()
            r15 = r14
            r14 = r10
            r10 = 1
            goto L_0x0106
        L_0x0119:
            r14 = r11
        L_0x011a:
            int r10 = com.google.android.gms.car.C143205dv.m232325a(r14, r12)
            if (r10 == r7) goto L_0x0156
            r12 = r15
            android.view.View r12 = (android.view.View) r12
            java.lang.Object r16 = p3186j$.util.Objects.requireNonNull(r14)
            r7 = r16
            android.support.v7.widget.RecyclerView r7 = (android.support.p033v7.widget.RecyclerView) r7
            int r7 = r7.getChildAdapterPosition(r12)
            android.support.v7.widget.fb r14 = r14.mAdapter
            r16 = -1
            if (r14 == 0) goto L_0x013d
            boolean r9 = r14.mHasStableIds
            if (r9 == 0) goto L_0x013d
            long r16 = r14.getItemId(r7)
        L_0x013d:
            r19 = r16
            if (r15 != r13) goto L_0x0144
            r21 = -1
            goto L_0x014a
        L_0x0144:
            int r9 = com.google.android.gms.car.C143205dv.m232325a(r13, r12)
            r21 = r9
        L_0x014a:
            com.google.android.gms.car.dv r12 = new com.google.android.gms.car.dv
            r16 = r12
            r17 = r10
            r18 = r7
            r16.<init>(r17, r18, r19, r21)
            goto L_0x015e
        L_0x0156:
            java.lang.String r7 = "GH.ViewFocusInfo"
            java.lang.String r9 = "Saving view focus state was desired, but couldn't identify the View."
            com.google.android.gms.car.p10764h.C143316a.m232511a(r7, r11, r9)
        L_0x015d:
            r12 = r11
        L_0x015e:
            boolean r7 = com.google.android.gms.car.p10764h.C143316a.m232515e(r5, r8)
            if (r7 == 0) goto L_0x0180
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r1.f388473v
            r9 = 0
            r6[r9] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r10 = 1
            r6[r10] = r7
            boolean r7 = r1.f388433A
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r8] = r7
            java.lang.String r7 = "%s onVideoConfigurationChange() [hasInputFocus:%b, inTouchMode:%b]"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r8, r5, r11, r7, r6)
            goto L_0x0182
        L_0x0180:
            r9 = 0
            r10 = 1
        L_0x0182:
            r1.mo118311k(r9, r10)
            if (r3 == 0) goto L_0x01c5
            com.google.android.gms.car.dx r5 = r1.f388463l
            android.util.DisplayMetrics r6 = new android.util.DisplayMetrics
            r6.<init>()
            android.hardware.display.VirtualDisplay r5 = r5.f388308a
            android.view.Display r5 = r5.getDisplay()
            r5.getMetrics(r6)
            int r5 = r3.f387987a
            int r7 = r6.widthPixels
            if (r5 != r7) goto L_0x01b1
            int r5 = r3.f387988b
            int r7 = r6.heightPixels
            if (r5 != r7) goto L_0x01b1
            int r5 = r3.f387989c
            int r6 = r6.densityDpi
            if (r5 != r6) goto L_0x01b1
            com.google.android.gms.car.dx r5 = r1.f388463l
            android.view.Surface r6 = r3.f387990d
            r5.mo118229c(r6)
            goto L_0x01c1
        L_0x01b1:
            com.google.android.gms.car.dx r5 = r1.f388463l
            r5.mo118228b()
            int r5 = r3.f387987a
            int r6 = r3.f387988b
            int r7 = r3.f387989c
            android.view.Surface r8 = r3.f387990d
            r1.mo118308h(r5, r6, r7, r8)
        L_0x01c1:
            r1.mo118321q(r3)
            goto L_0x01ca
        L_0x01c5:
            com.google.android.gms.car.dx r3 = r1.f388463l
            r3.mo118229c(r11)
        L_0x01ca:
            android.app.Service r3 = r1.f388458g
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.Class r5 = r1.f388460i
            java.lang.String r5 = r5.getName()
            com.google.android.gms.car.ac r3 = com.google.android.gms.car.p10760f.C143268bb.m232422w(r3, r5)
            r1.f388461j = r3
            android.os.Bundle r3 = r1.f388467p
            if (r3 == 0) goto L_0x01e9
            android.app.Service r5 = r1.f388458g
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r3.setClassLoader(r5)
        L_0x01e9:
            r3 = 0
            r1.mo118311k(r2, r3)
            android.view.View r2 = r1.f388472u
            if (r2 == 0) goto L_0x0200
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            com.google.android.gms.car.f.ba r3 = new com.google.android.gms.car.f.ba
            android.view.View r5 = r1.f388472u
            r3.<init>(r1, r4, r5, r12)
            r2.addOnGlobalLayoutListener(r3)
            goto L_0x020b
        L_0x0200:
            if (r4 == 0) goto L_0x020b
            com.google.android.gms.car.df r2 = r1.f388464m
            boolean r3 = r1.f388433A
            r4 = -1
            r5 = 1
            r2.mo118151h(r5, r3, r4, r11)
        L_0x020b:
            r1.mo118315o()
            return
        L_0x020f:
            if (r3 == 0) goto L_0x0214
            r1.mo118321q(r3)
        L_0x0214:
            r1.mo118315o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.C143241ae.run():void");
    }
}
