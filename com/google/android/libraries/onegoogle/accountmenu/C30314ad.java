package com.google.android.libraries.onegoogle.accountmenu;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.ad */
/* compiled from: PG */
final class C30314ad extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C30317ag f81977a;

    public C30314ad(C30317ag agVar) {
        this.f81977a = agVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f81977a.f81985c = false;
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.animation.AnimatorSet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            com.google.android.libraries.onegoogle.accountmenu.ag r7 = r5.f81977a
            boolean r0 = r7.f81985c
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r7 = r7.f81983a
            com.google.common.base.ax r7 = r7.mo35866q()
            boolean r7 = r7.mo56113h()
            if (r7 == 0) goto L_0x0026
            com.google.android.libraries.onegoogle.accountmenu.ag r7 = r5.f81977a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r7 = r7.f81983a
            com.google.common.base.ax r7 = r7.mo35866q()
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.v r7 = (com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v) r7
            boolean r7 = r7.f81976b
            if (r7 != 0) goto L_0x003a
        L_0x0026:
            com.google.android.libraries.onegoogle.accountmenu.ag r7 = r5.f81977a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r7 = r7.f81983a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.o r7 = r7.mo35858i()
            com.google.android.libraries.onegoogle.accountmanagement.j r7 = r7.f81934a
            com.google.common.b.gu r7 = r7.mo35794b()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003b
        L_0x003a:
            return r1
        L_0x003b:
            float r7 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r8)
            r2 = 2
            r3 = 0
            r4 = 1
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0052
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0050
            r7 = 4
            goto L_0x0067
        L_0x0050:
            r7 = 5
            goto L_0x0067
        L_0x0052:
            float r7 = java.lang.Math.abs(r9)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0066
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0064
            r7 = 3
            goto L_0x0067
        L_0x0064:
            r7 = 2
            goto L_0x0067
        L_0x0066:
            r7 = 1
        L_0x0067:
            if (r7 != r4) goto L_0x006a
            return r1
        L_0x006a:
            com.google.android.libraries.onegoogle.accountmenu.ag r8 = r5.f81977a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r8 = r8.f81983a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.o r8 = r8.mo35858i()
            com.google.android.libraries.onegoogle.accountmanagement.j r8 = r8.f81934a
            com.google.android.libraries.onegoogle.account.c.b r8 = r8.f81883d
            java.lang.Object r8 = com.google.android.libraries.onegoogle.accountmanagement.C30281j.m56319c(r8)
            boolean r9 = com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56475e(r7)
            if (r9 == 0) goto L_0x0084
            if (r8 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            return r1
        L_0x0084:
            boolean r9 = com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56474d(r7)
            if (r9 == 0) goto L_0x009a
            com.google.android.libraries.onegoogle.accountmenu.ag r9 = r5.f81977a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r9 = r9.f81983a
            com.google.android.libraries.onegoogle.accountmenu.features.b r9 = r9.mo35860k()
            boolean r9 = r9.mo36185r()
            if (r9 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            return r1
        L_0x009a:
            com.google.android.libraries.onegoogle.accountmenu.ag r9 = r5.f81977a
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r9 = r9.f81984b
            r9.setEnabled(r1)
            if (r6 == 0) goto L_0x00b1
            com.google.android.libraries.onegoogle.accountmenu.ag r9 = r5.f81977a
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6)
            r6.setAction(r4)
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r9 = r9.f81984b
            r9.dispatchTouchEvent(r6)
        L_0x00b1:
            com.google.android.libraries.onegoogle.accountmenu.ag r6 = r5.f81977a
            r6.f81985c = r4
            com.google.android.libraries.onegoogle.accountmenu.ac r6 = new com.google.android.libraries.onegoogle.accountmenu.ac
            r6.<init>(r5)
            com.google.android.libraries.onegoogle.accountmenu.ag r9 = r5.f81977a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r0 = r9.f81983a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.o r0 = r0.mo35858i()
            boolean r1 = com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56475e(r7)
            if (r1 == 0) goto L_0x011a
            com.google.android.libraries.onegoogle.accountmanagement.j r0 = r0.f81934a
            com.google.common.b.gu r0 = r0.mo35794b()
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r1 = r9.f81983a
            com.google.android.libraries.onegoogle.accountmenu.features.b r1 = r1.mo35860k()
            com.google.common.base.ax r1 = r1.mo36179l()
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r3 = r9.f81983a
            r3.mo35852b()
            java.lang.Object r0 = com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56477g(r0, r8, r7, r1)
            boolean r0 = r9.mo35883a(r0, r8)
            if (r0 != 0) goto L_0x0102
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r0 = r9.f81983a
            com.google.android.libraries.onegoogle.accountmenu.features.b r0 = r0.mo35860k()
            com.google.common.base.ax r0 = r0.mo36180m()
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            com.google.android.libraries.onegoogle.accountmenu.aa r0 = new com.google.android.libraries.onegoogle.accountmenu.aa
            r0.<init>(r9, r8, r7)
            android.animation.AnimatorSet r6 = r9.mo35884b(r7, r6, r0)
            goto L_0x013b
        L_0x0102:
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r8 = r9.f81984b
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r8 = r8.f81902c
            android.animation.ObjectAnimator r7 = com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56476f(r8, r7)
            r7.setRepeatMode(r2)
            r7.setRepeatCount(r4)
            r8 = 100
            r7.setDuration(r8)
            r7.addListener(r6)
            r6 = r7
            goto L_0x013b
        L_0x011a:
            boolean r8 = com.google.android.libraries.onegoogle.accountmenu.C30317ag.m56474d(r7)
            r0 = 0
            if (r8 == 0) goto L_0x013a
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r8 = r9.f81983a
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r1 = r9.f81984b
            android.content.Context r1 = r1.getContext()
            com.google.android.libraries.onegoogle.accountmenu.d.e r8 = com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g.m56486a(r8, r1)
            if (r8 != 0) goto L_0x0130
            goto L_0x013a
        L_0x0130:
            com.google.android.libraries.onegoogle.accountmenu.ab r0 = new com.google.android.libraries.onegoogle.accountmenu.ab
            r0.<init>(r9, r7, r8)
            android.animation.AnimatorSet r6 = r9.mo35884b(r7, r6, r0)
            goto L_0x013b
        L_0x013a:
            r6 = r0
        L_0x013b:
            if (r6 == 0) goto L_0x0140
            r6.start()
        L_0x0140:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.C30314ad.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
