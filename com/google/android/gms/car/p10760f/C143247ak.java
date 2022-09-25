package com.google.android.gms.car.p10760f;

import android.view.MotionEvent;

/* renamed from: com.google.android.gms.car.f.ak */
/* compiled from: PG */
public final /* synthetic */ class C143247ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388383a;

    /* renamed from: b */
    public final /* synthetic */ MotionEvent f388384b;

    public /* synthetic */ C143247ak(C143268bb bbVar, MotionEvent motionEvent) {
        this.f388383a = bbVar;
        this.f388384b = motionEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b2, code lost:
        if (r6.f388184a == r10) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a9, code lost:
        if (r7.mo118167v(r6) != false) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0552  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r0 = r33
            com.google.android.gms.car.f.bb r1 = r0.f388383a
            android.view.MotionEvent r9 = r0.f388384b
            com.google.android.gms.car.ac r2 = r1.f388461j
            if (r2 == 0) goto L_0x05d1
            boolean r2 = r1.mo118326v()
            r11 = 2
            r12 = 0
            r13 = 3
            r14 = 1
            r15 = 0
            if (r2 != 0) goto L_0x0019
            android.util.Pair r2 = r1.f388453b
            goto L_0x0582
        L_0x0019:
            android.util.Pair r2 = r1.f388453b
            com.google.android.gms.car.df r7 = r1.f388464m
            if (r7 == 0) goto L_0x0582
            java.lang.String r8 = "CAR.PROJECTION.PRES"
            boolean r2 = com.google.android.gms.car.C143109au.m232164a(r8, r13)
            r3 = 4
            if (r2 == 0) goto L_0x0047
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = r7.f388260h
            r2[r15] = r4
            r2[r14] = r9
            boolean r4 = r7.isShowing()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r11] = r4
            boolean r4 = r7.f388258f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r13] = r4
            java.lang.String r4 = "%s injectTouchEvent(event:%s) [isShowing():%b, ready:%b]"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r13, r8, r12, r4, r2)
        L_0x0047:
            boolean r2 = r7.f388273u
            if (r2 == 0) goto L_0x0050
            boolean r2 = r7.f388267o
            r7.f388267o = r15
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            boolean r4 = r7.isShowing()
            if (r4 == 0) goto L_0x057f
            boolean r4 = r7.f388258f
            if (r4 == 0) goto L_0x057f
            int r4 = r9.getSource()
            r5 = 4098(0x1002, float:5.743E-42)
            if (r4 != r5) goto L_0x0071
            r7.mo118145d(r14, r14)
            android.view.Window r2 = r7.mo118143c()
            r2.injectInputEvent(r9)
            android.util.Pair r2 = r7.f388255c
            goto L_0x0582
        L_0x0071:
            r7.mo118145d(r14, r15)
            int r4 = r9.getSource()
            r5 = 8194(0x2002, float:1.1482E-41)
            if (r4 != r5) goto L_0x008c
            android.view.View r4 = r7.getCurrentFocus()
            if (r4 == 0) goto L_0x008c
            boolean r4 = r4.dispatchGenericMotionEvent(r9)
            if (r4 == 0) goto L_0x008c
            android.util.Pair r2 = r7.f388255c
            goto L_0x0582
        L_0x008c:
            boolean r4 = r7.dispatchGenericMotionEvent(r9)
            if (r4 == 0) goto L_0x0096
            android.util.Pair r2 = r7.f388255c
            goto L_0x0582
        L_0x0096:
            int r4 = r9.getActionMasked()
            r5 = 8
            if (r4 != r5) goto L_0x01c0
            r2 = 9
            float r2 = r9.getAxisValue(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L_0x00a9
            r4 = 2
            goto L_0x00aa
        L_0x00a9:
            r4 = 1
        L_0x00aa:
            r5 = 0
            r16 = 0
        L_0x00ad:
            int r10 = java.lang.Math.abs(r2)
            if (r5 >= r10) goto L_0x01b4
            if (r16 != 0) goto L_0x01ab
            android.view.View r10 = r7.getCurrentFocus()
            android.view.Window r16 = r7.mo118143c()
            android.view.View r6 = r16.getDecorView()
            boolean r12 = r6 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x012d
            boolean r12 = r7.f388229D
            if (r12 == 0) goto L_0x00e2
            com.google.android.gms.car.da r12 = r7.f388233H
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            com.google.android.gms.car.bl r12 = (com.google.android.gms.car.C143128bl) r12
            android.view.ViewGroup r18 = r12.mo118060b(r10, r6)
            r21 = 0
            r16 = r12
            r17 = r6
            r19 = r10
            r20 = r4
            android.view.View r6 = r16.mo118059a(r17, r18, r19, r20, r21)
            goto L_0x012d
        L_0x00e2:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.ViewGroup r6 = com.google.android.gms.car.C143158cn.m232261a(r6, r10)
            r6.focusSearch(r4)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r6.addFocusables(r12, r4)
            boolean r16 = r12.isEmpty()
            if (r16 == 0) goto L_0x00fb
            r6 = 0
            goto L_0x012d
        L_0x00fb:
            int r13 = r12.size()
            if (r10 == 0) goto L_0x0126
            int r16 = r12.indexOf(r10)
            if (r4 != r11) goto L_0x010a
            r18 = 1
            goto L_0x010c
        L_0x010a:
            r18 = -1
        L_0x010c:
            int r11 = r16 + r18
            if (r11 < 0) goto L_0x0112
            if (r11 < r13) goto L_0x0127
        L_0x0112:
            boolean r6 = com.google.android.gms.car.C143158cn.m232262b(r6)
            if (r6 == 0) goto L_0x011b
            int r11 = r11 + r13
            int r11 = r11 % r13
            goto L_0x0127
        L_0x011b:
            int r13 = r13 + -1
            int r6 = java.lang.Math.min(r11, r13)
            int r11 = java.lang.Math.max(r6, r15)
            goto L_0x0127
        L_0x0126:
            r11 = 0
        L_0x0127:
            java.lang.Object r6 = r12.get(r11)
            android.view.View r6 = (android.view.View) r6
        L_0x012d:
            if (r6 != 0) goto L_0x0150
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r11 = r7.f388260h
            r6[r15] = r11
            r6[r14] = r10
            java.lang.String r10 = com.google.android.gms.car.C143200dq.m232322a(r4)
            r11 = 2
            r6[r11] = r10
            boolean r10 = r7.f388229D
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11 = 3
            r6[r11] = r10
            java.lang.String r10 = "%s moveFocus Nothing to grant focus to. current = %s, direction = %s, isFocusFinderEnabledInRotary = %s"
            r12 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r11, r8, r12, r10, r6)
        L_0x014d:
            r16 = 0
            goto L_0x01ad
        L_0x0150:
            r11 = 3
            if (r6 != r10) goto L_0x0174
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r13 = r7.f388260h
            r12[r15] = r13
            r12[r14] = r10
            java.lang.String r10 = com.google.android.gms.car.C143200dq.m232322a(r4)
            r13 = 2
            r12[r13] = r10
            boolean r10 = r7.f388229D
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12[r11] = r10
            java.lang.String r10 = "%s moveFocus left focus on same View. current = %s, direction = %s, isFocusFinderEnabledInRotary = %s"
            r13 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r11, r8, r13, r10, r12)
            r7.mo118167v(r6)
            goto L_0x014d
        L_0x0174:
            boolean r12 = com.google.android.gms.car.C143109au.m232164a(r8, r11)
            if (r12 == 0) goto L_0x01a5
            r12 = 6
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r12 = r7.f388260h
            r13[r15] = r12
            r13[r14] = r10
            boolean r10 = r6.isInTouchMode()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12 = 2
            r13[r12] = r10
            java.lang.String r10 = com.google.android.gms.car.C143200dq.m232322a(r4)
            r13[r11] = r10
            boolean r10 = r7.f388229D
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r13[r3] = r10
            r10 = 5
            r13[r10] = r6
            java.lang.String r10 = "%s moveFocus current = %s, touchMode = %s, direction = %s, isFocusFinderEnabledInRotary = %s requestFocusFromTouch() on %s"
            r12 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r11, r8, r12, r10, r13)
        L_0x01a5:
            boolean r6 = r7.mo118167v(r6)
            if (r6 == 0) goto L_0x014d
        L_0x01ab:
            r16 = 1
        L_0x01ad:
            int r5 = r5 + 1
            r11 = 2
            r12 = 0
            r13 = 3
            goto L_0x00ad
        L_0x01b4:
            if (r16 == 0) goto L_0x01ba
            android.util.Pair r2 = r7.f388255c
            goto L_0x0582
        L_0x01ba:
            android.util.Pair r2 = r7.mo118142b(r4)
            goto L_0x0582
        L_0x01c0:
            boolean r4 = r7.f388273u
            if (r4 == 0) goto L_0x057f
            int r4 = r9.getSource()
            r5 = 1048584(0x100008, float:1.469379E-39)
            if (r4 != r5) goto L_0x057f
            int r4 = r9.getActionMasked()
            if (r4 == 0) goto L_0x01d7
            boolean r4 = r7.f388268p
            if (r4 != 0) goto L_0x01ef
        L_0x01d7:
            float r4 = r9.getX()
            float r5 = r9.getY()
            r7.mo118152i(r4, r5)
            r7.f388269q = r15
            r7.f388272t = r15
            r7.f388268p = r14
            android.view.View r4 = r7.getCurrentFocus()
            r7.mo118162r(r4)
        L_0x01ef:
            int r4 = r9.getActionMasked()
            r5 = 2
            if (r4 != r5) goto L_0x0560
            if (r2 == 0) goto L_0x01fa
            r7.f388269q = r14
        L_0x01fa:
            float r2 = r9.getX()
            float r4 = r7.f388270r
            float r2 = r2 - r4
            float r4 = r9.getY()
            float r5 = r7.f388271s
            float r4 = r4 - r5
            boolean r5 = r7.f388269q
            if (r5 == 0) goto L_0x0213
            boolean r5 = r7.f388272t
            if (r5 != 0) goto L_0x0213
            int r5 = r7.f388275w
            goto L_0x0215
        L_0x0213:
            int r5 = r7.f388274v
        L_0x0215:
            float r6 = (float) r5
            r10 = 1077936128(0x40400000, float:3.0)
            float r10 = r6 / r10
            int r10 = (int) r10
            float r10 = (float) r10
            float r11 = r7.f388276x
            int r12 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0228
            float r12 = r11 - r2
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x024d
        L_0x0228:
            float r12 = r7.f388277y
            float r13 = -r10
            int r16 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x0235
            float r16 = r2 - r12
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r16 > 0) goto L_0x024d
        L_0x0235:
            float r3 = r7.f388278z
            int r18 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r18 <= 0) goto L_0x0241
            float r18 = r3 - r4
            int r18 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r18 > 0) goto L_0x024d
        L_0x0241:
            float r15 = r7.f388226A
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x025c
            float r13 = r4 - r15
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x025c
        L_0x024d:
            float r2 = r9.getX()
            float r3 = r9.getY()
            r7.mo118152i(r2, r3)
            android.util.Pair r2 = r7.f388255c
            goto L_0x0582
        L_0x025c:
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0263
            r7.f388276x = r2
            goto L_0x0269
        L_0x0263:
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0269
            r7.f388277y = r2
        L_0x0269:
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0270
            r7.f388278z = r4
            goto L_0x0276
        L_0x0270:
            int r3 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0276
            r7.f388226A = r4
        L_0x0276:
            float r3 = java.lang.Math.abs(r2)
            float r10 = java.lang.Math.abs(r4)
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x028a
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x028a
            android.util.Pair r2 = r7.f388255c
            goto L_0x0582
        L_0x028a:
            r6 = 66
            r11 = 17
            r12 = 130(0x82, float:1.82E-43)
            r13 = 33
            r15 = 0
            r20 = 0
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ae
            float r3 = java.lang.Math.signum(r2)
            double r3 = (double) r3
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x02a7
            r22 = r20
            r10 = 66
            goto L_0x02ab
        L_0x02a7:
            r22 = r20
            r10 = 17
        L_0x02ab:
            r20 = r3
            goto L_0x02be
        L_0x02ae:
            float r2 = java.lang.Math.signum(r4)
            double r2 = (double) r2
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            r22 = r2
            if (r4 < 0) goto L_0x02bc
            r10 = 130(0x82, float:1.82E-43)
            goto L_0x02be
        L_0x02bc:
            r10 = 33
        L_0x02be:
            if (r10 == r11) goto L_0x02d1
            if (r10 == r13) goto L_0x02ce
            if (r10 == r6) goto L_0x02cb
            if (r10 == r12) goto L_0x02c8
            r2 = 0
            goto L_0x02d3
        L_0x02c8:
            r2 = 20
            goto L_0x02d3
        L_0x02cb:
            r2 = 22
            goto L_0x02d3
        L_0x02ce:
            r2 = 19
            goto L_0x02d3
        L_0x02d1:
            r2 = 21
        L_0x02d3:
            if (r2 == 0) goto L_0x0558
            boolean r3 = r7.f388269q
            if (r3 == 0) goto L_0x02ed
            android.view.KeyEvent r3 = new android.view.KeyEvent
            r25 = 0
            r27 = 0
            r29 = 1
            r31 = 0
            r32 = 4096(0x1000, float:5.74E-42)
            r24 = r3
            r30 = r2
            r24.<init>(r25, r27, r29, r30, r31, r32)
            goto L_0x02f2
        L_0x02ed:
            android.view.KeyEvent r3 = new android.view.KeyEvent
            r3.<init>(r14, r2)
        L_0x02f2:
            int r2 = r9.getSource()
            r3.setSource(r2)
            boolean r2 = r7.dispatchKeyEvent(r3)
            if (r2 == 0) goto L_0x030e
            r2 = r7
            r3 = r9
            r4 = r5
            r5 = r20
            r11 = r7
            r7 = r22
            r2.mo118166t(r3, r4, r5, r7)
            android.util.Pair r2 = r11.f388255c
            goto L_0x0582
        L_0x030e:
            r11 = r7
            android.view.Window r2 = r11.mo118143c()
            android.view.View r2 = r2.getDecorView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = r11.getCurrentFocus()
            if (r3 == 0) goto L_0x0345
            if (r3 == r2) goto L_0x0327
            boolean r4 = com.google.android.gms.car.C143179df.m232281u(r3, r2)
            if (r4 == 0) goto L_0x032d
        L_0x0327:
            boolean r4 = r3.isFocusable()
            if (r4 != 0) goto L_0x0345
        L_0x032d:
            r4 = 3
            boolean r6 = com.google.android.gms.car.C143109au.m232164a(r8, r4)
            if (r6 == 0) goto L_0x0344
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = r11.f388260h
            r12 = 0
            r7[r12] = r6
            r7[r14] = r3
            java.lang.String r3 = "%s Current touchpad focus view is no longer part of the view hierarchy. Clearing focus for %s."
            r6 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r4, r8, r6, r3, r7)
        L_0x0344:
            r3 = 0
        L_0x0345:
            if (r3 != 0) goto L_0x0388
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r2.addFocusables(r3, r4)
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x035d
            java.lang.Object r2 = r3.get(r4)
            android.view.View r2 = (android.view.View) r2
            goto L_0x035e
        L_0x035d:
            r2 = 0
        L_0x035e:
            if (r2 == 0) goto L_0x0379
            r3 = 5
            boolean r5 = com.google.android.gms.car.C143109au.m232164a(r8, r3)
            if (r5 == 0) goto L_0x0376
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r11.f388260h
            r6[r4] = r5
            r6[r14] = r2
            java.lang.String r4 = "%s No touchpad focus even though there are focusables. requestFocus() on %s."
            r5 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r3, r8, r5, r4, r6)
        L_0x0376:
            r11.mo118168w(r2)
        L_0x0379:
            float r2 = r9.getX()
            float r3 = r9.getY()
            r11.mo118152i(r2, r3)
            android.util.Pair r2 = r11.f388257e
            goto L_0x0582
        L_0x0388:
            com.google.android.gms.car.bp r4 = r11.f388243R
            java.util.Deque r6 = r4.f388189a
            java.lang.Object r6 = r6.peek()
            com.google.android.gms.car.bo r6 = (com.google.android.gms.car.C143131bo) r6
            if (r6 != 0) goto L_0x0396
        L_0x0394:
            r12 = 0
            goto L_0x03b5
        L_0x0396:
            java.lang.ref.WeakReference r7 = r6.f388187c
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            java.lang.ref.WeakReference r12 = r6.f388188d
            java.lang.Object r12 = r12.get()
            android.view.View r12 = (android.view.View) r12
            long r14 = r6.f388185b
            boolean r4 = r4.mo118061c(r14, r7, r12)
            if (r4 == 0) goto L_0x0394
            if (r7 != r3) goto L_0x0394
            int r4 = r6.f388184a
            if (r4 == r10) goto L_0x03b5
            goto L_0x0394
        L_0x03b5:
            if (r12 == 0) goto L_0x03c6
            boolean r4 = r12.isFocusable()
            if (r4 == 0) goto L_0x03c6
            boolean r4 = com.google.android.gms.car.C143179df.m232281u(r12, r2)
            if (r4 != 0) goto L_0x03c4
            goto L_0x03c6
        L_0x03c4:
            r4 = 0
            goto L_0x03ea
        L_0x03c6:
            com.google.android.gms.car.f.bt r4 = r11.f388259g
            r6 = 1
            r4.mo118338c(r6)
            com.google.android.gms.car.da r4 = r11.f388233H
            boolean r6 = r11.f388269q
            com.google.android.gms.car.bl r4 = (com.google.android.gms.car.C143128bl) r4
            android.view.ViewGroup r26 = r4.mo118060b(r3, r2)
            r24 = r4
            r25 = r2
            r27 = r3
            r28 = r10
            r29 = r6
            android.view.View r12 = r24.mo118059a(r25, r26, r27, r28, r29)
            com.google.android.gms.car.f.bt r2 = r11.f388259g
            r4 = 0
            r2.mo118338c(r4)
        L_0x03ea:
            if (r12 != 0) goto L_0x0420
            r2 = 3
            boolean r3 = com.google.android.gms.car.C143109au.m232164a(r8, r2)
            if (r3 == 0) goto L_0x0407
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = r11.f388260h
            r5[r4] = r3
            java.lang.String r3 = com.google.android.gms.car.C143200dq.m232322a(r10)
            r4 = 1
            r5[r4] = r3
            java.lang.String r3 = "%s onTouchpadMoveEvent Nothing to grant focus to in direction %s"
            r4 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r2, r8, r4, r3, r5)
        L_0x0407:
            float r2 = r9.getX()
            float r3 = r9.getY()
            r11.mo118152i(r2, r3)
            boolean r2 = r11.f388269q
            if (r2 == 0) goto L_0x041a
            android.util.Pair r2 = r11.f388255c
            goto L_0x0582
        L_0x041a:
            android.util.Pair r2 = r11.mo118142b(r10)
            goto L_0x0582
        L_0x0420:
            if (r3 != r12) goto L_0x0431
            float r2 = r9.getX()
            float r3 = r9.getY()
            r11.mo118152i(r2, r3)
            android.util.Pair r2 = r11.f388255c
            goto L_0x0582
        L_0x0431:
            boolean r2 = r12 instanceof com.google.android.gms.car.p10760f.C143287bu
            if (r2 == 0) goto L_0x047d
            boolean r2 = r11.f388269q
            r3 = 3
            boolean r4 = com.google.android.gms.car.C143109au.m232164a(r8, r3)
            if (r4 == 0) goto L_0x045c
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r11.f388260h
            r7 = 0
            r4[r7] = r6
            r6 = 1
            r4[r6] = r12
            java.lang.String r6 = com.google.android.gms.car.C143200dq.m232322a(r10)
            r7 = 2
            r4[r7] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r4[r3] = r6
            java.lang.String r6 = "%s onTouchpadMoveEvent Found trampoline view %s in direction = %s. windowFocusChangeDisallowedByForceField = %s"
            r7 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r3, r8, r7, r6, r4)
        L_0x045c:
            if (r2 == 0) goto L_0x046d
            float r2 = r9.getX()
            float r3 = r9.getY()
            r11.mo118152i(r2, r3)
            android.util.Pair r2 = r11.f388255c
            goto L_0x0582
        L_0x046d:
            r2 = r11
            r3 = r9
            r4 = r5
            r5 = r20
            r7 = r22
            r2.mo118166t(r3, r4, r5, r7)
            android.util.Pair r2 = r11.mo118142b(r10)
            goto L_0x0582
        L_0x047d:
            r11.mo118161q()
            r2 = 3
            boolean r4 = com.google.android.gms.car.C143109au.m232164a(r8, r2)
            if (r4 == 0) goto L_0x04b1
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r11.f388260h
            r7 = 0
            r4[r7] = r6
            r6 = 1
            r4[r6] = r3
            boolean r6 = r12.isInTouchMode()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 2
            r4[r7] = r6
            java.lang.String r6 = com.google.android.gms.car.C143200dq.m232322a(r10)
            r4[r2] = r6
            android.graphics.Rect r6 = r11.f388231F
            r7 = 4
            r4[r7] = r6
            r6 = 5
            r4[r6] = r12
            java.lang.String r6 = "%s onTouchpadMoveEvent currentFocus = %s, touchMode = %s, requestFocus(%s, %s) on %s"
            r7 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r2, r8, r7, r6, r4)
        L_0x04b1:
            com.google.android.gms.car.bp r2 = r11.f388243R
            java.util.Deque r4 = r2.f388189a
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.car.bo r4 = (com.google.android.gms.car.C143131bo) r4
            if (r4 != 0) goto L_0x04be
            goto L_0x04ee
        L_0x04be:
            java.lang.ref.WeakReference r6 = r4.f388187c
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            java.lang.ref.WeakReference r7 = r4.f388188d
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            long r14 = r4.f388185b
            boolean r7 = r2.mo118061c(r14, r6, r7)
            if (r7 != 0) goto L_0x04dc
            java.util.Deque r4 = r2.f388189a
            r4.clear()
            goto L_0x04ee
        L_0x04dc:
            if (r6 == r3) goto L_0x04e4
            java.util.Deque r4 = r2.f388189a
            r4.clear()
            goto L_0x04ee
        L_0x04e4:
            int r4 = r4.f388184a
            if (r4 != r10) goto L_0x04ee
            java.util.Deque r2 = r2.f388189a
            r2.pop()
            goto L_0x0520
        L_0x04ee:
            int r27 = com.google.android.gms.car.C143132bp.m232181a(r10)
            java.util.Deque r4 = r2.f388189a
            com.google.android.gms.car.bo r6 = new com.google.android.gms.car.bo
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r12)
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference
            r14.<init>(r3)
            long r28 = android.os.SystemClock.elapsedRealtime()
            r24 = r6
            r25 = r7
            r26 = r14
            r24.<init>(r25, r26, r27, r28)
            r4.push(r6)
        L_0x0510:
            java.util.Deque r3 = r2.f388189a
            int r3 = r3.size()
            int r4 = r2.f388191c
            if (r3 <= r4) goto L_0x0520
            java.util.Deque r3 = r2.f388189a
            r3.removeLast()
            goto L_0x0510
        L_0x0520:
            android.graphics.Rect r2 = r11.f388231F
            r11.mo118169x(r12, r10, r2)
            r2 = r11
            r3 = r9
            r4 = r5
            r5 = r20
            r10 = r8
            r7 = r22
            r2.mo118166t(r3, r4, r5, r7)
            boolean r2 = r11.f388269q
            if (r2 == 0) goto L_0x0552
            boolean r2 = r11.f388272t
            if (r2 != 0) goto L_0x0552
            r2 = 3
            boolean r3 = com.google.android.gms.car.C143109au.m232164a(r10, r2)
            if (r3 == 0) goto L_0x054e
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r11.f388260h
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "%s onTouchpadMoveEvent multi-move started"
            r6 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r2, r10, r6, r5, r4)
            goto L_0x054f
        L_0x054e:
            r3 = 1
        L_0x054f:
            r11.f388272t = r3
            goto L_0x0553
        L_0x0552:
            r3 = 1
        L_0x0553:
            r11.f388269q = r3
            android.util.Pair r2 = r11.f388257e
            goto L_0x0582
        L_0x0558:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unsupported keycode 0"
            r1.<init>(r2)
            throw r1
        L_0x0560:
            r11 = r7
            r3 = 1
            int r2 = r9.getActionMasked()
            if (r2 != r3) goto L_0x0573
            r2 = 0
            r11.f388268p = r2
            android.view.View r3 = r11.getCurrentFocus()
            r11.mo118162r(r3)
            goto L_0x0574
        L_0x0573:
            r2 = 0
        L_0x0574:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r2 = 0
            android.util.Pair r3 = android.util.Pair.create(r3, r2)
            r2 = r3
            goto L_0x0582
        L_0x057f:
            r11 = r7
            android.util.Pair r2 = r11.f388256d
        L_0x0582:
            java.lang.String r3 = "CAR.PROJECTION.CAHI"
            r4 = 2
            boolean r5 = com.google.android.gms.car.C143109au.m232164a(r3, r4)
            if (r5 == 0) goto L_0x059f
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r1.f388473v
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r9
            r5[r4] = r2
            java.lang.String r6 = "%s.onTouchEvent(%s) hint=%s"
            r7 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r4, r3, r7, r6, r5)
            goto L_0x05a0
        L_0x059f:
            r7 = 0
        L_0x05a0:
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.second
            com.google.android.gms.car.f.bq r2 = (com.google.android.gms.car.p10760f.C143283bq) r2
            if (r2 == 0) goto L_0x05b1
            int r10 = r2.f388491a     // Catch:{ RemoteException -> 0x05ce }
            goto L_0x05b2
        L_0x05b1:
            r10 = -1
        L_0x05b2:
            if (r2 == 0) goto L_0x05b7
            android.graphics.Rect r12 = r2.f388492b     // Catch:{ RemoteException -> 0x05ce }
            goto L_0x05b8
        L_0x05b7:
            r12 = r7
        L_0x05b8:
            com.google.android.gms.car.cf r2 = r1.f388447O     // Catch:{ RemoteException -> 0x05ce }
            if (r2 == 0) goto L_0x05d1
            com.google.android.gms.car.TouchEventCompleteData r4 = new com.google.android.gms.car.TouchEventCompleteData     // Catch:{ RemoteException -> 0x05ce }
            r4.<init>(r3, r12, r10)     // Catch:{ RemoteException -> 0x05ce }
            android.os.Parcel r3 = r2.mo17260gA()     // Catch:{ RemoteException -> 0x05ce }
            com.google.android.p445a.C8850c.m23497f(r3, r4)     // Catch:{ RemoteException -> 0x05ce }
            r4 = 32
            r2.mo17262he(r4, r3)     // Catch:{ RemoteException -> 0x05ce }
            return
        L_0x05ce:
            r1.mo118322r()
        L_0x05d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.C143247ak.run():void");
    }
}
