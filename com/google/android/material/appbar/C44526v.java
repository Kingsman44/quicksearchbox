package com.google.android.material.appbar;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.v */
/* compiled from: PG */
class C44526v extends C44529y {

    /* renamed from: a */
    private Runnable f115761a;

    /* renamed from: b */
    private boolean f115762b;

    /* renamed from: c */
    private int f115763c = -1;

    /* renamed from: d */
    OverScroller f115764d;

    /* renamed from: e */
    private int f115765e;

    /* renamed from: f */
    private int f115766f = -1;

    /* renamed from: g */
    private VelocityTracker f115767g;

    public C44526v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo47462B(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo47423v(coordinatorLayout, view, i, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
    }

    /* renamed from: f */
    public final boolean mo4958f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f115766f < 0) {
            this.f115766f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f115762b) {
            int i = this.f115763c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f115765e) > this.f115766f) {
                this.f115765e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f115763c = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo47427z(view) && coordinatorLayout.mo4928l(view, x, y2);
            this.f115762b = z;
            if (z) {
                this.f115765e = y2;
                this.f115763c = motionEvent.getPointerId(0);
                if (this.f115767g == null) {
                    this.f115767g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f115764d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f115764d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f115767g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[ADDED_TO_REGION] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4963k(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r1 = 0
            r3 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0060
            r4 = 2
            if (r0 == r4) goto L_0x0039
            r2 = 3
            if (r0 == r2) goto L_0x0036
            r1 = 6
            if (r0 == r1) goto L_0x001c
        L_0x0019:
            r0 = 0
            goto L_0x00d1
        L_0x001c:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f115763c = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f115765e = r0
            goto L_0x0019
        L_0x0036:
            r0 = 0
            goto L_0x00c4
        L_0x0039:
            int r0 = r6.f115763c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r3) goto L_0x0042
            return r9
        L_0x0042:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f115765e
            r6.f115765e = r0
            int r4 = r6.mo47420s(r2)
            int r3 = r19.mo47422u()
            int r1 = r1 - r0
            int r3 = r3 - r1
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.mo47423v(r1, r2, r3, r4, r5)
            goto L_0x0019
        L_0x0060:
            android.view.VelocityTracker r0 = r6.f115767g
            if (r0 == 0) goto L_0x0036
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f115767g
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.f115767g
            int r4 = r6.f115763c
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.mo47421t(r2)
            int r4 = -r4
            java.lang.Runnable r5 = r6.f115761a
            if (r5 == 0) goto L_0x0084
            r2.removeCallbacks(r5)
            r6.f115761a = r1
        L_0x0084:
            android.widget.OverScroller r5 = r6.f115764d
            if (r5 != 0) goto L_0x0093
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.f115764d = r5
        L_0x0093:
            android.widget.OverScroller r10 = r6.f115764d
            r11 = 0
            int r12 = r19.mo47465C()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f115764d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            com.google.android.material.appbar.u r0 = new com.google.android.material.appbar.u
            r4 = r20
            r0.<init>(r6, r4, r2)
            r6.f115761a = r0
            androidx.core.p098j.C2043bi.m5520N(r2, r0)
            goto L_0x00c3
        L_0x00be:
            r4 = r20
            r19.mo47425x(r20, r21)
        L_0x00c3:
            r0 = 1
        L_0x00c4:
            r6.f115762b = r9
            r6.f115763c = r3
            android.view.VelocityTracker r2 = r6.f115767g
            if (r2 == 0) goto L_0x00d1
            r2.recycle()
            r6.f115767g = r1
        L_0x00d1:
            android.view.VelocityTracker r1 = r6.f115767g
            if (r1 == 0) goto L_0x00d8
            r1.addMovement(r7)
        L_0x00d8:
            boolean r1 = r6.f115762b
            if (r1 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            return r9
        L_0x00e0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C44526v.mo4963k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public int mo47420s(View view) {
        throw null;
    }

    /* renamed from: t */
    public int mo47421t(View view) {
        throw null;
    }

    /* renamed from: u */
    public int mo47422u() {
        throw null;
    }

    /* renamed from: v */
    public int mo47423v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    /* renamed from: x */
    public void mo47425x(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    /* renamed from: z */
    public boolean mo47427z(View view) {
        throw null;
    }

    public C44526v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
