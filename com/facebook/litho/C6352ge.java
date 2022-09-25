package com.facebook.litho;

import android.graphics.Rect;
import android.view.TouchDelegate;
import androidx.p060c.C0985o;

/* renamed from: com.facebook.litho.ge */
/* compiled from: PG */
final class C6352ge extends TouchDelegate {

    /* renamed from: c */
    private static final Rect f18794c = new Rect();

    /* renamed from: a */
    public final C0985o f18795a = new C0985o(10);

    /* renamed from: b */
    public C0985o f18796b;

    public C6352ge(ComponentHost componentHost) {
        super(f18794c, componentHost);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            androidx.c.o r0 = r11.f18795a
            int r0 = r0.mo3725d()
        L_0x0006:
            int r0 = r0 + -1
            r1 = 0
            if (r0 < 0) goto L_0x00ab
            androidx.c.o r2 = r11.f18795a
            java.lang.Object r2 = r2.mo3727f(r0)
            com.facebook.litho.gd r2 = (com.facebook.litho.C6351gd) r2
            if (r2 == 0) goto L_0x0006
            float r3 = r12.getX()
            int r3 = (int) r3
            float r4 = r12.getY()
            int r4 = (int) r4
            com.facebook.c.j r5 = r2.f18792b
            com.facebook.c.s r5 = r5.f17806d
            com.facebook.c.v r5 = r5.f17827b
            com.facebook.litho.du r5 = (com.facebook.litho.C6201du) r5
            com.facebook.litho.de r5 = r5.f18345a
            com.facebook.litho.hh r5 = r5.f18254d
            if (r5 != 0) goto L_0x002f
            r5 = 0
            goto L_0x0033
        L_0x002f:
            android.graphics.Rect r5 = r5.mo13399a()
        L_0x0033:
            if (r5 != 0) goto L_0x0036
            goto L_0x0006
        L_0x0036:
            android.view.View r6 = r2.f18791a
            android.content.Context r6 = r6.getContext()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            int r6 = r6.getScaledTouchSlop()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r7.set(r5)
            int r8 = -r6
            r7.inset(r8, r8)
            int r8 = r12.getAction()
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x007d
            if (r8 == r10) goto L_0x0066
            if (r8 == r9) goto L_0x0066
            r3 = 3
            if (r8 == r3) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            boolean r3 = r2.f18793c
            r2.f18793c = r1
            r1 = r3
            goto L_0x0083
        L_0x0066:
            boolean r5 = r2.f18793c
            if (r5 == 0) goto L_0x0072
            boolean r3 = r7.contains(r3, r4)
            if (r3 != 0) goto L_0x0072
            r3 = 0
            goto L_0x0073
        L_0x0072:
            r3 = 1
        L_0x0073:
            int r4 = r12.getAction()
            if (r4 != r10) goto L_0x007b
            r2.f18793c = r1
        L_0x007b:
            r1 = r5
            goto L_0x0084
        L_0x007d:
            boolean r1 = r5.contains(r3, r4)
            r2.f18793c = r1
        L_0x0083:
            r3 = 1
        L_0x0084:
            if (r1 == 0) goto L_0x0006
            if (r3 == 0) goto L_0x009c
            android.view.View r1 = r2.f18791a
            int r1 = r1.getWidth()
            int r1 = r1 / r9
            float r1 = (float) r1
            android.view.View r3 = r2.f18791a
            int r3 = r3.getHeight()
            int r3 = r3 / r9
            float r3 = (float) r3
            r12.setLocation(r1, r3)
            goto L_0x00a2
        L_0x009c:
            int r6 = r6 + r6
            int r1 = -r6
            float r1 = (float) r1
            r12.setLocation(r1, r1)
        L_0x00a2:
            android.view.View r1 = r2.f18791a
            boolean r1 = r1.dispatchTouchEvent(r12)
            if (r1 == 0) goto L_0x0006
            return r10
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6352ge.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
