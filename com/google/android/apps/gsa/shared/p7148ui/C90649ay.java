package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.ObjectAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: com.google.android.apps.gsa.shared.ui.ay */
/* compiled from: PG */
public final class C90649ay {

    /* renamed from: h */
    private static final LinearInterpolator f253508h = new LinearInterpolator();

    /* renamed from: a */
    public final C90648ax f253509a;

    /* renamed from: b */
    public boolean f253510b;

    /* renamed from: c */
    public View f253511c;

    /* renamed from: d */
    public boolean f253512d;

    /* renamed from: e */
    public boolean f253513e = true;

    /* renamed from: f */
    public boolean f253514f = true;

    /* renamed from: g */
    public boolean f253515g = true;

    /* renamed from: i */
    private final float f253516i;

    /* renamed from: j */
    private final float f253517j;

    /* renamed from: k */
    private final VelocityTracker f253518k;

    /* renamed from: l */
    private float f253519l;

    /* renamed from: m */
    private boolean f253520m;

    /* renamed from: n */
    private boolean f253521n;

    public C90649ay(C90648ax axVar, float f, float f2) {
        this.f253509a = axVar;
        this.f253518k = VelocityTracker.obtain();
        this.f253516i = f;
        this.f253517j = f2;
    }

    /* renamed from: c */
    public static final float m148000c(View view) {
        float f = m148003f(view);
        float f2 = 0.65f * f;
        float translationX = view.getTranslationX();
        float f3 = 0.15f * f;
        return Math.max(Math.min(translationX >= f3 ? 1.0f - ((translationX - f3) / f2) : translationX < f * 0.85f ? ((f3 + translationX) / f2) + 1.0f : 1.0f, 1.0f), 0.0f);
    }

    /* renamed from: d */
    private final boolean m148001d(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        return this.f253521n ? i <= 0 ? this.f253514f : this.f253513e : i <= 0 ? this.f253513e : this.f253514f;
    }

    /* renamed from: e */
    private static final ObjectAnimator m148002e(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{f});
    }

    /* renamed from: f */
    private static final float m148003f(View view) {
        return (float) view.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x00aa;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84941a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.f253515g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r5.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r2) goto L_0x004e
            r3 = 2
            if (r0 == r3) goto L_0x0017
            r5 = 3
            if (r0 == r5) goto L_0x004e
            goto L_0x00aa
        L_0x0017:
            android.view.View r0 = r4.f253511c
            if (r0 == 0) goto L_0x00aa
            android.view.VelocityTracker r0 = r4.f253518k
            r0.addMovement(r5)
            float r0 = r5.getX()
            float r1 = r4.f253519l
            float r0 = r0 - r1
            float r1 = java.lang.Math.abs(r0)
            float r3 = r4.f253517j
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x00aa
            boolean r0 = r4.m148001d(r0)
            if (r0 == 0) goto L_0x00aa
            com.google.android.apps.gsa.shared.ui.ax r0 = r4.f253509a
            android.view.View r1 = r4.f253511c
            r0.mo84929b(r1)
            r4.f253510b = r2
            float r5 = r5.getX()
            android.view.View r0 = r4.f253511c
            float r0 = r0.getTranslationX()
            float r5 = r5 - r0
            r4.f253519l = r5
            goto L_0x00aa
        L_0x004e:
            r4.f253510b = r1
            r5 = 0
            r4.f253511c = r5
            goto L_0x00aa
        L_0x0054:
            r4.f253510b = r1
            com.google.android.apps.gsa.shared.ui.ax r0 = r4.f253509a
            android.view.View r0 = r0.mo84928a(r5)
            r4.f253511c = r0
            android.view.VelocityTracker r0 = r4.f253518k
            r0.clear()
            android.view.View r0 = r4.f253511c
            if (r0 == 0) goto L_0x00a6
            boolean r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148876h(r0)
            r4.f253521n = r0
            com.google.android.apps.gsa.shared.ui.ax r0 = r4.f253509a
            android.view.View r3 = r4.f253511c
            boolean r0 = r0.mo84934g(r3)
            r4.f253520m = r0
            android.view.VelocityTracker r0 = r4.f253518k
            r0.addMovement(r5)
            float r5 = r5.getX()
            r4.f253519l = r5
            android.view.View r5 = r4.f253511c
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.max(r3, r0)
            int r3 = r5.getHeight()
            if (r3 >= r0) goto L_0x00a8
            int r5 = r5.getWidth()
            if (r5 >= r0) goto L_0x00a8
            r1 = 1
            goto L_0x00a8
        L_0x00a6:
            r4.f253520m = r1
        L_0x00a8:
            r4.f253512d = r1
        L_0x00aa:
            boolean r5 = r4.f253510b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.C90649ay.mo84941a(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r0 != 4) goto L_0x019b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84942b(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.f253515g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r12.f253510b
            if (r0 != 0) goto L_0x0014
            boolean r0 = r12.mo84941a(r13)
            if (r0 == 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            boolean r13 = r12.f253520m
            return r13
        L_0x0014:
            android.view.VelocityTracker r0 = r12.f253518k
            r0.addMovement(r13)
            int r0 = r13.getAction()
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x008e
            r4 = 2
            if (r0 == r4) goto L_0x002c
            r4 = 3
            if (r0 == r4) goto L_0x008e
            r1 = 4
            if (r0 == r1) goto L_0x002c
            goto L_0x019b
        L_0x002c:
            android.view.View r0 = r12.f253511c
            if (r0 == 0) goto L_0x019b
            float r13 = r13.getX()
            float r0 = r12.f253519l
            float r13 = r13 - r0
            boolean r0 = r12.m148001d(r13)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r12.f253520m
            if (r0 != 0) goto L_0x006f
        L_0x0041:
            android.view.View r0 = r12.f253511c
            float r0 = m148003f(r0)
            r1 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            float r4 = java.lang.Math.abs(r13)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x005c
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x005a
            r13 = r1
            goto L_0x006f
        L_0x005a:
            float r13 = -r1
            goto L_0x006f
        L_0x005c:
            float r13 = r13 / r0
            double r3 = (double) r13
            r5 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            double r3 = java.lang.Math.sin(r3)
            float r13 = (float) r3
            float r13 = r13 * r1
        L_0x006f:
            android.view.View r0 = r12.f253511c
            r0.setTranslationX(r13)
            com.google.android.apps.gsa.shared.ui.ax r13 = r12.f253509a
            r13.mo84932e()
            boolean r13 = r12.f253512d
            if (r13 == 0) goto L_0x019b
            boolean r13 = r12.f253520m
            if (r13 == 0) goto L_0x019b
            android.view.View r13 = r12.f253511c
            float r13 = m148000c(r13)
            android.view.View r0 = r12.f253511c
            r0.setAlpha(r13)
            goto L_0x019b
        L_0x008e:
            android.view.View r13 = r12.f253511c
            if (r13 == 0) goto L_0x019b
            android.view.VelocityTracker r13 = r12.f253518k
            float r0 = r12.f253516i
            r4 = 1157234688(0x44fa0000, float:2000.0)
            float r0 = r0 * r4
            r4 = 1000(0x3e8, float:1.401E-42)
            r13.computeCurrentVelocity(r4, r0)
            float r0 = r13.getXVelocity()
            float r13 = r13.getYVelocity()
            float r4 = r12.f253516i
            android.view.View r5 = r12.f253511c
            float r5 = r5.getTranslationX()
            float r6 = java.lang.Math.abs(r5)
            double r6 = (double) r6
            android.view.View r8 = r12.f253511c
            float r8 = m148003f(r8)
            double r8 = (double) r8
            r10 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r10
            float r10 = java.lang.Math.abs(r0)
            r11 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r11
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ee
            float r4 = java.lang.Math.abs(r0)
            float r13 = java.lang.Math.abs(r13)
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ee
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x00e3
            r13 = 0
            goto L_0x00e4
        L_0x00e3:
            r13 = 1
        L_0x00e4:
            int r4 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x00ea
            r4 = 0
            goto L_0x00eb
        L_0x00ea:
            r4 = 1
        L_0x00eb:
            if (r13 != r4) goto L_0x00ee
            r1 = 1
        L_0x00ee:
            com.google.android.apps.gsa.shared.ui.ax r13 = r12.f253509a
            android.view.View r4 = r12.f253511c
            boolean r13 = r13.mo84934g(r4)
            if (r13 == 0) goto L_0x0172
            boolean r13 = r12.m148001d(r5)
            if (r13 == 0) goto L_0x0172
            if (r1 != 0) goto L_0x0104
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0172
        L_0x0104:
            android.view.View r13 = r12.f253511c
            if (r2 == r1) goto L_0x0109
            r0 = 0
        L_0x0109:
            com.google.android.apps.gsa.shared.ui.ax r1 = r12.f253509a
            boolean r1 = r1.mo84934g(r13)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x012b
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x011f
            float r4 = r13.getTranslationX()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x012b
        L_0x011f:
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0126
            r13.getTranslationX()
        L_0x0126:
            float r4 = m148003f(r13)
            goto L_0x0130
        L_0x012b:
            float r4 = m148003f(r13)
            float r4 = -r4
        L_0x0130:
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x014f
            float r3 = r13.getTranslationX()
            float r3 = r4 - r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r5
            float r0 = java.lang.Math.abs(r0)
            float r3 = r3 / r0
            int r0 = (int) r3
            r3 = 150(0x96, float:2.1E-43)
            int r0 = java.lang.Math.min(r3, r0)
            goto L_0x0151
        L_0x014f:
            r0 = 75
        L_0x0151:
            android.animation.ObjectAnimator r3 = m148002e(r13, r4)
            android.view.animation.LinearInterpolator r4 = f253508h
            r3.setInterpolator(r4)
            long r4 = (long) r0
            r3.setDuration(r4)
            com.google.android.apps.gsa.shared.ui.at r0 = new com.google.android.apps.gsa.shared.ui.at
            r0.<init>(r12, r13, r1)
            r3.addListener(r0)
            com.google.android.apps.gsa.shared.ui.au r0 = new com.google.android.apps.gsa.shared.ui.au
            r0.<init>(r12, r1, r13)
            r3.addUpdateListener(r0)
            r3.start()
            goto L_0x019b
        L_0x0172:
            com.google.android.apps.gsa.shared.ui.ax r13 = r12.f253509a
            r13.mo84931d()
            android.view.View r13 = r12.f253511c
            com.google.android.apps.gsa.shared.ui.ax r0 = r12.f253509a
            boolean r0 = r0.mo84934g(r13)
            android.animation.ObjectAnimator r1 = m148002e(r13, r3)
            r3 = 150(0x96, double:7.4E-322)
            r1.setDuration(r3)
            com.google.android.apps.gsa.shared.ui.av r3 = new com.google.android.apps.gsa.shared.ui.av
            r3.<init>(r12, r0, r13)
            r1.addUpdateListener(r3)
            com.google.android.apps.gsa.shared.ui.aw r3 = new com.google.android.apps.gsa.shared.ui.aw
            r3.<init>(r12, r0, r13)
            r1.addListener(r3)
            r1.start()
        L_0x019b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.C90649ay.mo84942b(android.view.MotionEvent):boolean");
    }
}
