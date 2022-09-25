package com.google.android.apps.search.podcasts.widgets.nestedscrollablehost;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class NestedScrollableHost extends FrameLayout {

    /* renamed from: a */
    private int f383517a = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: b */
    private float f383518b;

    /* renamed from: c */
    private float f383519c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context) {
        super(context);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    private final View m229301a() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m229302b(int i, float f) {
        int i2 = -((int) Math.signum(f));
        if (i != 0) {
            View a = m229301a();
            if (a != null) {
                return a.canScrollVertically(i2);
            }
            return false;
        }
        View a2 = m229301a();
        if (a2 != null) {
            return a2.canScrollHorizontally(i2);
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[EDGE_INSN: B:48:0x0023->B:10:0x0023 ?: BREAK  
    EDGE_INSN: B:49:0x0023->B:10:0x0023 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "e"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            android.view.ViewParent r0 = r9.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x0011
            android.view.View r0 = (android.view.View) r0
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 != 0) goto L_0x0023
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0011
            android.view.View r0 = (android.view.View) r0
            goto L_0x0012
        L_0x0023:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L_0x002a
            r2 = r0
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
        L_0x002a:
            if (r2 == 0) goto L_0x00c3
            int r0 = r2.mo9209a()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r1 = r9.m229302b(r0, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x0040
            boolean r1 = r9.m229302b(r0, r2)
            if (r1 == 0) goto L_0x00c3
        L_0x0040:
            int r1 = r10.getAction()
            r3 = 1
            if (r1 != 0) goto L_0x005c
            float r0 = r10.getX()
            r9.f383518b = r0
            float r0 = r10.getY()
            r9.f383519c = r0
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L_0x00c3
        L_0x005c:
            int r1 = r10.getAction()
            r4 = 2
            if (r1 != r4) goto L_0x00c3
            float r1 = r10.getX()
            float r4 = r9.f383518b
            float r1 = r1 - r4
            float r4 = r10.getY()
            float r5 = r9.f383519c
            float r4 = r4 - r5
            r5 = r0 ^ 1
            float r6 = java.lang.Math.abs(r1)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r3 == r0) goto L_0x007e
            r8 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0080
        L_0x007e:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0080:
            float r6 = r6 * r8
            float r8 = java.lang.Math.abs(r4)
            if (r3 == r0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x008b:
            float r8 = r8 * r2
            int r2 = r9.f383517a
            float r2 = (float) r2
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0098
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c3
        L_0x0098:
            r2 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x009f
            r6 = 0
            goto L_0x00a0
        L_0x009f:
            r6 = 1
        L_0x00a0:
            if (r5 != r6) goto L_0x00aa
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L_0x00c3
        L_0x00aa:
            if (r3 == r0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r1 = r4
        L_0x00ae:
            boolean r0 = r9.m229302b(r0, r1)
            if (r0 == 0) goto L_0x00bc
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L_0x00c3
        L_0x00bc:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00c3:
            boolean r10 = super.onInterceptTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.widgets.nestedscrollablehost.NestedScrollableHost.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
    }
}
