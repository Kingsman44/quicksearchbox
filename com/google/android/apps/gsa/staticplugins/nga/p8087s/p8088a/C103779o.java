package com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1988h;
import androidx.customview.p103b.C2149g;
import androidx.customview.p103b.C2150h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.a.o */
/* compiled from: PG */
final class C103779o extends C1770c {

    /* renamed from: a */
    C2150h f288972a = null;

    /* renamed from: b */
    int f288973b = 2;

    /* renamed from: c */
    C103773i f288974c = null;

    /* renamed from: d */
    private boolean f288975d;

    /* renamed from: e */
    private final C2149g f288976e = new C103777m(this);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4958f(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            boolean r0 = r4.f288975d
            androidx.customview.b.h r1 = r4.f288972a
            if (r1 != 0) goto L_0x000e
            androidx.customview.b.g r1 = r4.f288976e
            androidx.customview.b.h r1 = androidx.customview.p103b.C2150h.m5963b(r5, r1)
            r4.f288972a = r1
        L_0x000e:
            int r1 = r7.getActionMasked()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x001c
            r5 = 3
            if (r1 == r5) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r4.f288975d = r3
        L_0x001e:
            r5 = 0
            goto L_0x0039
        L_0x0020:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r0 = r5.mo4928l(r6, r0, r1)
            r4.f288975d = r0
            if (r0 == 0) goto L_0x001e
            boolean r5 = r6.dispatchTouchEvent(r7)
            if (r5 != 0) goto L_0x001e
            r5 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x004e
            if (r5 != 0) goto L_0x004d
            androidx.customview.b.h r5 = r4.f288972a
            java.lang.Object r5 = p3186j$.util.Objects.requireNonNull(r5)
            androidx.customview.b.h r5 = (androidx.customview.p103b.C2150h) r5
            boolean r5 = r5.mo5412i(r7)
            if (r5 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            return r3
        L_0x004d:
            return r2
        L_0x004e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a.C103779o.mo4958f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: g */
    public final boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (C2043bi.m5575d(view) != 0) {
            return false;
        }
        C2043bi.m5551ae(view, 1);
        C2043bi.m5522P(view, 1048576);
        C2043bi.m5523Q(view, C1988h.f5911i, (CharSequence) null, new C103776l(this));
        return false;
    }

    /* renamed from: k */
    public final boolean mo4963k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C2150h hVar = this.f288972a;
        if (hVar == null) {
            return false;
        }
        hVar.mo5408e(motionEvent);
        return true;
    }
}
