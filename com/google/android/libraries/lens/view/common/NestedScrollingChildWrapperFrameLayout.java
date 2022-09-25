package com.google.android.libraries.lens.view.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2110y;
import androidx.core.p098j.C2111z;
import com.google.android.libraries.web.webview.contrib.p3476a.C44351a;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class NestedScrollingChildWrapperFrameLayout extends FrameLayout implements C2110y, C44351a {

    /* renamed from: a */
    int f69962a;

    /* renamed from: b */
    public C25731a f69963b = null;

    /* renamed from: c */
    public boolean f69964c = false;

    /* renamed from: d */
    private int f69965d;

    /* renamed from: e */
    private C2111z f69966e;

    /* renamed from: f */
    private int f69967f;

    /* renamed from: g */
    private int f69968g;

    /* renamed from: h */
    private int f69969h;

    /* renamed from: i */
    private int f69970i;

    /* renamed from: j */
    private boolean f69971j;

    /* renamed from: k */
    private final int[] f69972k = new int[2];

    /* renamed from: l */
    private final int[] f69973l = new int[2];

    /* renamed from: m */
    private View f69974m = null;

    static {
        C58974d.m91135i("NSCWrapper");
    }

    public NestedScrollingChildWrapperFrameLayout(Context context) {
        super(context, (AttributeSet) null);
        m47513d();
    }

    /* renamed from: b */
    private final View m47511b() {
        View view = this.f69974m;
        if (view != null) {
            return view;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View c = m47512c(getChildAt(i));
            if (c != null) {
                this.f69974m = c;
                return c;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static View m47512c(View view) {
        if (C2043bi.m5571ay(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View c = m47512c(viewGroup.getChildAt(i));
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    /* renamed from: d */
    private final void m47513d() {
        C2111z zVar = new C2111z(this);
        this.f69966e = zVar;
        zVar.mo5279a(true);
        this.f69965d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    public final void mo30866a(int i, int i2, int i3, boolean z) {
        int i4 = i2 + i;
        if (i4 < 0) {
            this.f69971j = true;
        }
        boolean z2 = i4 > i3 || i4 < 0;
        boolean z3 = !z;
        if (z2 && !this.f69966e.mo5285g(z3 ? 1 : 0)) {
            this.f69966e.mo5286h(2, z3);
            if (this.f69966e.mo5283e(0, i, this.f69972k, this.f69973l, z3 ? 1 : 0)) {
                i -= this.f69972k[1];
            }
            this.f69966e.mo5284f(0, i, 0, 0, this.f69973l, z3 ? 1 : 0, (int[]) null);
            this.f69966e.mo5280b(z3);
        }
    }

    public final boolean canScrollVertically(int i) {
        if (m47511b() == null) {
            return super.canScrollVertically(i);
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View c = m47512c(getChildAt(i2));
            if (c != null && c.canScrollVertically(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f69966e.mo5283e(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f69966e.mo5284f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean hasNestedScrollingParent() {
        return this.f69966e.mo5285g(0);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f69966e.f6017a;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m47511b() == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            android.view.View r1 = r18.m47511b()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0010
            boolean r1 = super.onTouchEvent(r19)
            goto L_0x0110
        L_0x0010:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r19)
            int r5 = r19.getActionMasked()
            float r6 = r4.getY()
            int r6 = (int) r6
            float r7 = r4.getX()
            int r7 = (int) r7
            r8 = 2
            if (r5 == 0) goto L_0x00fb
            r9 = 0
            r10 = 3
            if (r5 == r3) goto L_0x00cc
            if (r5 == r8) goto L_0x003e
            if (r5 == r10) goto L_0x0033
            boolean r1 = r1.onTouchEvent(r4)
            goto L_0x0110
        L_0x0033:
            boolean r1 = r1.onTouchEvent(r4)
            androidx.core.j.z r4 = r0.f69966e
            r4.mo5280b(r2)
            goto L_0x0110
        L_0x003e:
            int r5 = r0.f69967f
            int r5 = r5 - r6
            int r8 = r0.f69968g
            int r8 = r8 - r7
            boolean r11 = r0.f69964c
            if (r11 == 0) goto L_0x004f
            boolean r11 = r0.f69971j
            if (r11 != 0) goto L_0x004f
            if (r5 >= 0) goto L_0x004f
            goto L_0x0099
        L_0x004f:
            int r11 = java.lang.Math.abs(r5)
            int r12 = java.lang.Math.abs(r8)
            if (r11 > r12) goto L_0x006e
            int r11 = r0.f69962a
            int r11 = java.lang.Math.abs(r11)
            if (r11 > 0) goto L_0x006e
            if (r5 == 0) goto L_0x0099
            int r8 = java.lang.Math.abs(r8)
            int r11 = java.lang.Math.abs(r5)
            int r8 = r8 / r11
            if (r8 >= r10) goto L_0x0099
        L_0x006e:
            int[] r14 = r0.f69972k
            int[] r15 = r0.f69973l
            androidx.core.j.z r11 = r0.f69966e
            r12 = 0
            r16 = 0
            r13 = r5
            boolean r8 = r11.mo5283e(r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x0099
            int[] r8 = r0.f69972k
            r8 = r8[r3]
            int r5 = r5 - r8
            int[] r8 = r0.f69973l
            r8 = r8[r3]
            int r6 = r6 - r8
            r0.f69967f = r6
            int r6 = -r8
            float r6 = (float) r6
            r4.offsetLocation(r9, r6)
            int r6 = r0.f69962a
            int[] r8 = r0.f69973l
            r8 = r8[r3]
            int r6 = r6 + r8
            r0.f69962a = r6
            goto L_0x009b
        L_0x0099:
            r0.f69967f = r6
        L_0x009b:
            r12 = r5
            r0.f69968g = r7
            int r5 = r0.f69962a
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L_0x00ad
            int r5 = r0.f69969h
            int r5 = r5 - r7
            float r5 = (float) r5
            r4.offsetLocation(r5, r9)
        L_0x00ad:
            boolean r1 = r1.onTouchEvent(r4)
            int[] r15 = r0.f69973l
            androidx.core.j.z r10 = r0.f69966e
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            boolean r4 = r10.mo5284f(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0110
            int r4 = r0.f69967f
            int[] r5 = r0.f69973l
            r5 = r5[r3]
            int r4 = r4 - r5
            r0.f69967f = r4
            goto L_0x0110
        L_0x00cc:
            int r5 = r0.f69962a
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L_0x00db
            int r5 = r0.f69969h
            int r5 = r5 - r7
            float r5 = (float) r5
            r4.offsetLocation(r5, r9)
        L_0x00db:
            int r5 = r0.f69962a
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L_0x00f1
            int r5 = r0.f69970i
            int r5 = r5 - r6
            int r5 = java.lang.Math.abs(r5)
            int r6 = r0.f69965d
            if (r5 >= r6) goto L_0x00f1
            r4.setAction(r10)
        L_0x00f1:
            boolean r1 = r1.onTouchEvent(r4)
            androidx.core.j.z r4 = r0.f69966e
            r4.mo5280b(r2)
            goto L_0x0110
        L_0x00fb:
            r0.f69962a = r2
            r0.f69971j = r2
            r0.f69967f = r6
            r0.f69968g = r7
            r0.f69969h = r7
            r0.f69970i = r6
            boolean r1 = r1.onTouchEvent(r4)
            androidx.core.j.z r4 = r0.f69966e
            r4.mo5286h(r8, r2)
        L_0x0110:
            if (r1 == 0) goto L_0x0113
            return r3
        L_0x0113:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.common.NestedScrollingChildWrapperFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void scrollBy(int i, int i2) {
        View b = m47511b();
        if (b != null) {
            b.scrollBy(i, i2);
        }
    }

    public final void scrollTo(int i, int i2) {
        View b = m47511b();
        if (b != null) {
            b.scrollTo(i, i2);
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f69966e.mo5279a(z);
    }

    public final boolean startNestedScroll(int i) {
        return this.f69966e.mo5286h(i, 0);
    }

    public final void stopNestedScroll() {
        this.f69966e.mo5280b(0);
    }

    public NestedScrollingChildWrapperFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47513d();
    }

    public NestedScrollingChildWrapperFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47513d();
    }

    public NestedScrollingChildWrapperFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m47513d();
    }
}
