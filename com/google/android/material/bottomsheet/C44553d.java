package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.p092d.C1886a;
import androidx.customview.p103b.C2149g;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.bottomsheet.d */
/* compiled from: PG */
final class C44553d extends C2149g {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f115936a;

    /* renamed from: b */
    private long f115937b;

    public C44553d(BottomSheetBehavior bottomSheetBehavior) {
        this.f115936a = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final int mo5392a(View view, int i, int i2) {
        return C1886a.m5145c(i, this.f115936a.mo47523z(), mo5395d(view));
    }

    /* renamed from: d */
    public final int mo5395d(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f115936a;
        return bottomSheetBehavior.mo47514L() ? bottomSheetBehavior.f115866I : bottomSheetBehavior.f115915z;
    }

    /* renamed from: g */
    public final void mo5398g(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f115936a;
            if (bottomSheetBehavior.f115861D) {
                bottomSheetBehavior.mo47512J(1);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f115936a;
        int i2 = bottomSheetBehavior.f115862E;
        if (i2 == 1 || bottomSheetBehavior.f115871N) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f115870M == i) {
            WeakReference weakReference = bottomSheetBehavior.f115868K;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        this.f115937b = System.currentTimeMillis();
        WeakReference weakReference2 = this.f115936a.f115867J;
        return weakReference2 != null && weakReference2.get() == view;
    }

    /* renamed from: j */
    public final int mo5401j(View view, int i) {
        return view.getLeft();
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        this.f115936a.mo47507E(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r9 > r10.f115913x) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        if (java.lang.Math.abs(r8.getTop() - r7.f115936a.mo47523z()) < java.lang.Math.abs(r8.getTop() - r7.f115936a.f115913x)) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d1, code lost:
        if (r7.f115936a.mo47521x() == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        if (java.lang.Math.abs(r9 - r10.f115912w) < java.lang.Math.abs(r9 - r7.f115936a.f115915z)) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010a, code lost:
        if (r7.f115936a.mo47521x() != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        if (r7.f115936a.mo47521x() == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (true != r10.mo47520w(r3, (((float) r9) * 100.0f) / ((float) r10.f115866I))) goto L_0x0034;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5399h(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            r0 = 6
            r1 = 3
            r2 = 4
            r3 = 0
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x003d
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r9 = r9.f115895f
            if (r9 == 0) goto L_0x0011
        L_0x000e:
            r0 = 3
            goto L_0x0129
        L_0x0011:
            int r9 = r8.getTop()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f115937b
            long r3 = r3 - r5
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f115936a
            boolean r5 = r10.mo47521x()
            if (r5 == 0) goto L_0x0037
            float r9 = (float) r9
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 * r0
            int r0 = r10.f115866I
            float r0 = (float) r0
            float r9 = r9 / r0
            boolean r9 = r10.mo47520w(r3, r9)
            r10 = 1
            if (r10 == r9) goto L_0x000e
        L_0x0034:
            r0 = 4
            goto L_0x0129
        L_0x0037:
            int r10 = r10.f115913x
            if (r9 <= r10) goto L_0x000e
            goto L_0x0129
        L_0x003d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r7.f115936a
            boolean r5 = r4.f115859B
            if (r5 == 0) goto L_0x009a
            boolean r4 = r4.mo47515M(r8, r10)
            if (r4 == 0) goto L_0x009a
            float r9 = java.lang.Math.abs(r9)
            float r2 = java.lang.Math.abs(r10)
            r3 = 5
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x005f
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            int r9 = r9.f115897h
            float r9 = (float) r9
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0070
        L_0x005f:
            int r9 = r8.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f115936a
            int r2 = r10.f115866I
            int r10 = r10.mo47523z()
            int r2 = r2 + r10
            int r2 = r2 / 2
            if (r9 <= r2) goto L_0x0073
        L_0x0070:
            r0 = 5
            goto L_0x0129
        L_0x0073:
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r9 = r9.f115895f
            if (r9 == 0) goto L_0x007a
            goto L_0x000e
        L_0x007a:
            int r9 = r8.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f115936a
            int r10 = r10.mo47523z()
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            int r10 = r8.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r7.f115936a
            int r2 = r2.f115913x
            int r10 = r10 - r2
            int r10 = java.lang.Math.abs(r10)
            if (r9 >= r10) goto L_0x0129
            goto L_0x000e
        L_0x009a:
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00d5
            float r9 = java.lang.Math.abs(r9)
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ab
            goto L_0x00d5
        L_0x00ab:
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r9 = r9.f115895f
            if (r9 == 0) goto L_0x00b2
            goto L_0x0034
        L_0x00b2:
            int r9 = r8.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f115936a
            int r10 = r10.f115913x
            int r10 = r9 - r10
            int r10 = java.lang.Math.abs(r10)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.f115936a
            int r1 = r1.f115915z
            int r9 = r9 - r1
            int r9 = java.lang.Math.abs(r9)
            if (r10 >= r9) goto L_0x0034
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r9 = r9.mo47521x()
            if (r9 == 0) goto L_0x0129
            goto L_0x0034
        L_0x00d5:
            int r9 = r8.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r7.f115936a
            boolean r3 = r10.f115895f
            if (r3 == 0) goto L_0x00f4
            int r10 = r10.f115912w
            int r10 = r9 - r10
            int r10 = java.lang.Math.abs(r10)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f115936a
            int r0 = r0.f115915z
            int r9 = r9 - r0
            int r9 = java.lang.Math.abs(r9)
            if (r10 >= r9) goto L_0x0034
            goto L_0x000e
        L_0x00f4:
            int r3 = r10.f115913x
            if (r9 >= r3) goto L_0x010e
            int r10 = r10.f115915z
            int r10 = r9 - r10
            int r10 = java.lang.Math.abs(r10)
            if (r9 >= r10) goto L_0x0104
            goto L_0x000e
        L_0x0104:
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r9 = r9.mo47521x()
            if (r9 == 0) goto L_0x0129
            goto L_0x0034
        L_0x010e:
            int r10 = r9 - r3
            int r10 = java.lang.Math.abs(r10)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.f115936a
            int r1 = r1.f115915z
            int r9 = r9 - r1
            int r9 = java.lang.Math.abs(r9)
            if (r10 >= r9) goto L_0x0034
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r9 = r9.mo47521x()
            if (r9 == 0) goto L_0x0129
            goto L_0x0034
        L_0x0129:
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r7.f115936a
            boolean r10 = r9.mo47522y()
            r9.mo47513K(r8, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.C44553d.mo5399h(android.view.View, float, float):void");
    }
}
