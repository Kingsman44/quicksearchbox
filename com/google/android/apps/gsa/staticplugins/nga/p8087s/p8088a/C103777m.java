package com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a;

import android.view.View;
import android.view.ViewParent;
import androidx.core.p098j.C2043bi;
import androidx.customview.p103b.C2149g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.a.m */
/* compiled from: PG */
final class C103777m extends C2149g {

    /* renamed from: a */
    final /* synthetic */ C103779o f288966a;

    /* renamed from: b */
    private int f288967b;

    /* renamed from: c */
    private int f288968c = -1;

    public C103777m(C103779o oVar) {
        this.f288966a = oVar;
    }

    /* renamed from: a */
    public final int mo5392a(View view, int i, int i2) {
        return view.getTop();
    }

    /* renamed from: c */
    public final int mo5394c(View view) {
        return view.getWidth();
    }

    /* renamed from: f */
    public final void mo5397f(View view, int i) {
        ViewParent parent;
        this.f288968c = i;
        this.f288967b = view.getLeft();
        ViewParent parent2 = view.getParent();
        if (parent2 != null && (parent = parent2.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: g */
    public final void mo5398g(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (java.lang.Math.abs(r6.getLeft() - r5.f288967b) >= java.lang.Math.round(((float) r6.getWidth()) * 0.5f)) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5399h(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r8 = -1
            r5.f288968c = r8
            int r8 = r6.getWidth()
            r0 = 1
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
            int r2 = androidx.core.p098j.C2043bi.m5577f(r6)
            com.google.android.apps.gsa.staticplugins.nga.s.a.o r3 = r5.f288966a
            int r3 = r3.f288973b
            r4 = 2
            if (r3 != r4) goto L_0x0019
            goto L_0x004d
        L_0x0019:
            if (r3 != 0) goto L_0x0027
            if (r2 != r0) goto L_0x0022
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x004d
            goto L_0x0059
        L_0x0022:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0059
            goto L_0x004d
        L_0x0027:
            if (r2 != r0) goto L_0x002e
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0059
            goto L_0x004d
        L_0x002e:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x0059
            goto L_0x004d
        L_0x0033:
            int r7 = r6.getLeft()
            int r1 = r5.f288967b
            int r2 = r6.getWidth()
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 < r2) goto L_0x0059
        L_0x004d:
            int r7 = r6.getLeft()
            int r1 = r5.f288967b
            if (r7 >= r1) goto L_0x0057
            int r1 = r1 - r8
            goto L_0x005c
        L_0x0057:
            int r1 = r1 + r8
            goto L_0x005c
        L_0x0059:
            int r1 = r5.f288967b
            r0 = 0
        L_0x005c:
            com.google.android.apps.gsa.staticplugins.nga.s.a.o r7 = r5.f288966a
            androidx.customview.b.h r7 = r7.f288972a
            java.lang.Object r7 = p3186j$.util.Objects.requireNonNull(r7)
            androidx.customview.b.h r7 = (androidx.customview.p103b.C2150h) r7
            int r8 = r6.getTop()
            boolean r7 = r7.mo5411h(r1, r8)
            if (r7 == 0) goto L_0x007b
            com.google.android.apps.gsa.staticplugins.nga.s.a.n r7 = new com.google.android.apps.gsa.staticplugins.nga.s.a.n
            com.google.android.apps.gsa.staticplugins.nga.s.a.o r8 = r5.f288966a
            r7.<init>(r8, r6, r0)
            androidx.core.p098j.C2043bi.m5520N(r6, r7)
            return
        L_0x007b:
            if (r0 == 0) goto L_0x0086
            com.google.android.apps.gsa.staticplugins.nga.s.a.o r6 = r5.f288966a
            com.google.android.apps.gsa.staticplugins.nga.s.a.i r6 = r6.f288974c
            if (r6 == 0) goto L_0x0086
            r6.mo93842a()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a.C103777m.mo5399h(android.view.View, float, float):void");
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        return this.f288968c == -1;
    }

    /* renamed from: j */
    public final int mo5401j(View view, int i) {
        int i2;
        int i3;
        int width;
        int f = C2043bi.m5577f(view);
        int i4 = this.f288966a.f288973b;
        if (i4 != 0) {
            if (i4 != 1) {
                i3 = this.f288967b - view.getWidth();
                i2 = view.getWidth() + this.f288967b;
            } else if (f == 1) {
                i3 = this.f288967b;
                width = view.getWidth();
            } else {
                i3 = this.f288967b - view.getWidth();
                i2 = this.f288967b;
            }
            return Math.min(Math.max(i3, i), i2);
        } else if (f == 1) {
            i3 = this.f288967b - view.getWidth();
            i2 = this.f288967b;
            return Math.min(Math.max(i3, i), i2);
        } else {
            i3 = this.f288967b;
            width = view.getWidth();
        }
        i2 = width + i3;
        return Math.min(Math.max(i3, i), i2);
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        float width = ((float) this.f288967b) + (((float) view.getWidth()) * 0.0f);
        float width2 = ((float) this.f288967b) + (((float) view.getWidth()) * 0.5f);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
        }
    }
}
