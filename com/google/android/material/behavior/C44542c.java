package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import androidx.core.p098j.C2043bi;
import androidx.customview.p103b.C2149g;
import com.google.android.material.snackbar.C44870aa;
import com.google.android.material.snackbar.C44883n;

/* renamed from: com.google.android.material.behavior.c */
/* compiled from: PG */
final class C44542c extends C2149g {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f115844a;

    /* renamed from: b */
    private int f115845b;

    /* renamed from: c */
    private int f115846c = -1;

    public C44542c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f115844a = swipeDismissBehavior;
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
        this.f115846c = i;
        this.f115845b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: g */
    public final void mo5398g(int i) {
        C44883n nVar = this.f115844a.f115840f;
        if (nVar == null) {
            return;
        }
        if (i != 0) {
            C44870aa.m79667a().mo48361e(nVar.f117130a.f117100u);
        } else {
            C44870aa.m79667a().mo48362f(nVar.f117130a.f117100u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (java.lang.Math.abs(r7.getLeft() - r6.f115845b) >= java.lang.Math.round(((float) r7.getWidth()) * r6.f115844a.f115837c)) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r8 = r7.getLeft();
        r1 = r6.f115845b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5399h(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.f115846c = r9
            int r9 = r7.getWidth()
            r0 = 1
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
            int r2 = androidx.core.p098j.C2043bi.m5577f(r7)
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r6.f115844a
            int r3 = r3.f115836b
            r4 = 2
            if (r3 != r4) goto L_0x0019
            goto L_0x004f
        L_0x0019:
            if (r3 != 0) goto L_0x0027
            if (r2 != r0) goto L_0x0022
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x004f
            goto L_0x0063
        L_0x0022:
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            goto L_0x004f
        L_0x0027:
            if (r2 != r0) goto L_0x002e
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            goto L_0x004f
        L_0x002e:
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0063
            goto L_0x004f
        L_0x0033:
            int r2 = r7.getLeft()
            int r3 = r6.f115845b
            int r4 = r7.getWidth()
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r6.f115844a
            float r5 = r5.f115837c
            float r4 = (float) r4
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            if (r2 < r4) goto L_0x0063
        L_0x004f:
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x005e
            int r8 = r7.getLeft()
            int r1 = r6.f115845b
            if (r8 >= r1) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            int r1 = r1 + r9
            goto L_0x0066
        L_0x005e:
            int r8 = r6.f115845b
            int r1 = r8 - r9
            goto L_0x0066
        L_0x0063:
            int r1 = r6.f115845b
            r0 = 0
        L_0x0066:
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.f115844a
            androidx.customview.b.h r8 = r8.f115835a
            int r9 = r7.getTop()
            boolean r8 = r8.mo5411h(r1, r9)
            if (r8 == 0) goto L_0x007f
            com.google.android.material.behavior.e r8 = new com.google.android.material.behavior.e
            com.google.android.material.behavior.SwipeDismissBehavior r9 = r6.f115844a
            r8.<init>(r9, r7, r0)
            androidx.core.p098j.C2043bi.m5520N(r7, r8)
            return
        L_0x007f:
            if (r0 == 0) goto L_0x008a
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.f115844a
            com.google.android.material.snackbar.n r8 = r8.f115840f
            if (r8 == 0) goto L_0x008a
            r8.mo48376a(r7)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.C44542c.mo5399h(android.view.View, float, float):void");
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        int i2 = this.f115846c;
        return (i2 == -1 || i2 == i) && this.f115844a.mo47491s(view);
    }

    /* renamed from: j */
    public final int mo5401j(View view, int i) {
        int i2;
        int i3;
        int width;
        int f = C2043bi.m5577f(view);
        int i4 = this.f115844a.f115836b;
        if (i4 != 0) {
            if (i4 != 1) {
                i3 = this.f115845b - view.getWidth();
                i2 = view.getWidth() + this.f115845b;
            } else if (f == 1) {
                i3 = this.f115845b;
                width = view.getWidth();
            } else {
                i3 = this.f115845b - view.getWidth();
                i2 = this.f115845b;
            }
            return Math.min(Math.max(i3, i), i2);
        } else if (f == 1) {
            i3 = this.f115845b - view.getWidth();
            i2 = this.f115845b;
            return Math.min(Math.max(i3, i), i2);
        } else {
            i3 = this.f115845b;
            width = view.getWidth();
        }
        i2 = width + i3;
        return Math.min(Math.max(i3, i), i2);
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        float width = ((float) view.getWidth()) * this.f115844a.f115838d;
        float width2 = ((float) view.getWidth()) * this.f115844a.f115839e;
        float abs = (float) Math.abs(i - this.f115845b);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m78740t(1.0f - ((abs - width) / (width2 - width))));
        }
    }
}
