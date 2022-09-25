package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.n */
/* compiled from: PG */
public final class C14144n implements View.OnTouchListener {

    /* renamed from: d */
    private static final Duration f42862d = Duration.ofMillis(350);

    /* renamed from: e */
    private static final Duration f42863e = Duration.ofMillis(500);

    /* renamed from: a */
    public final C14132bf f42864a;

    /* renamed from: b */
    public final C14142l f42865b;

    /* renamed from: c */
    public View f42866c = null;

    /* renamed from: f */
    private final GestureDetector f42867f;

    public C14144n(Context context, C14132bf bfVar, C14142l lVar) {
        this.f42867f = new GestureDetector(context, new C14143m(this));
        this.f42864a = bfVar;
        this.f42865b = lVar;
        this.f42866c = lVar.mo21462a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c5, code lost:
        if (r8.getTranslationX() != 0.0f) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.view.View r0 = r7.f42866c
            if (r0 != 0) goto L_0x0008
            r7.f42866c = r8
        L_0x0008:
            int r8 = r9.getAction()
            r0 = 1
            if (r8 != r0) goto L_0x00f3
            com.google.android.libraries.assistant.auto.tng.morris.c.l r8 = r7.f42865b
            boolean r8 = r8.mo21465d()
            r1 = 2
            java.lang.String r2 = "translationY"
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r4 = 0
            if (r8 == 0) goto L_0x006a
            android.view.View r8 = r7.f42866c
            r8.getClass()
            float r8 = r8.getTranslationY()
            android.view.View r5 = r7.f42866c
            r5.getClass()
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r3
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x006a
            com.google.android.libraries.assistant.auto.tng.morris.c.k r8 = new com.google.android.libraries.assistant.auto.tng.morris.c.k
            r8.<init>(r7)
            android.view.View r9 = r7.f42866c
            float[] r1 = new float[r1]
            r9.getClass()
            float r3 = r9.getTranslationY()
            r1[r4] = r3
            android.view.View r3 = r7.f42866c
            r3.getClass()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r1[r0] = r3
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r2, r1)
            j$.time.Duration r1 = f42862d
            long r1 = r1.toMillis()
            android.animation.ObjectAnimator r9 = r9.setDuration(r1)
            r9.addListener(r8)
            r9.start()
            return r0
        L_0x006a:
            com.google.android.libraries.assistant.auto.tng.morris.c.l r8 = r7.f42865b
            boolean r8 = r8.mo21466e()
            r5 = 0
            if (r8 == 0) goto L_0x00ad
            android.view.View r8 = r7.f42866c
            r8.getClass()
            float r8 = r8.getTranslationX()
            float r8 = java.lang.Math.abs(r8)
            android.view.View r6 = r7.f42866c
            r6.getClass()
            int r6 = r6.getWidth()
            float r6 = (float) r6
            float r6 = r6 * r3
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ad
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r8 = r7.f42864a
            android.view.View r9 = r7.f42866c
            r9.getClass()
            float r1 = r9.getTranslationX()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a2
            com.google.common.o.l.dk r1 = com.google.common.p4552o.p4566l.C60200dk.LEFT
            goto L_0x00a4
        L_0x00a2:
            com.google.common.o.l.dk r1 = com.google.common.p4552o.p4566l.C60200dk.RIGHT
        L_0x00a4:
            r8.mo21448e(r9, r1)
            com.google.android.libraries.assistant.auto.tng.morris.c.l r8 = r7.f42865b
            r8.mo21464c()
            return r0
        L_0x00ad:
            android.view.View r8 = r7.f42866c
            r8.getClass()
            float r8 = r8.getTranslationY()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x00c7
            android.view.View r8 = r7.f42866c
            r8.getClass()
            float r8 = r8.getTranslationX()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00f3
        L_0x00c7:
            float[] r8 = new float[r0]
            r8[r4] = r5
            java.lang.String r9 = "translationX"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r9, r8)
            float[] r9 = new float[r0]
            r9[r4] = r5
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofFloat(r2, r9)
            android.view.View r2 = r7.f42866c
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r1]
            r1[r4] = r8
            r1[r0] = r9
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r2, r1)
            j$.time.Duration r9 = f42863e
            long r0 = r9.toMillis()
            android.animation.ObjectAnimator r8 = r8.setDuration(r0)
            r8.start()
            return r4
        L_0x00f3:
            android.view.GestureDetector r8 = r7.f42867f
            boolean r8 = r8.onTouchEvent(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
