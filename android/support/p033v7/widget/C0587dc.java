package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0456aj;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.widget.dc */
/* compiled from: PG */
public abstract class C0587dc implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f2276a;

    /* renamed from: b */
    private final int f2277b;

    /* renamed from: c */
    final View f2278c;

    /* renamed from: d */
    public boolean f2279d;

    /* renamed from: e */
    private final int f2280e;

    /* renamed from: f */
    private Runnable f2281f;

    /* renamed from: g */
    private Runnable f2282g;

    /* renamed from: h */
    private int f2283h;

    /* renamed from: i */
    private final int[] f2284i = new int[2];

    public C0587dc(View view) {
        this.f2278c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2276a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2277b = tapTimeout;
        this.f2280e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public abstract C0456aj mo1611a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1612b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2723c() {
        C0456aj a = mo1611a();
        if (a == null || !a.mo1577x()) {
            return true;
        }
        a.mo1575m();
        return true;
    }

    /* renamed from: d */
    public final void mo2724d() {
        Runnable runnable = this.f2282g;
        if (runnable != null) {
            this.f2278c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2281f;
        if (runnable2 != null) {
            this.f2278c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r13 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r4 != 3) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f2279d
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x006b
            android.view.View r3 = r11.f2278c
            android.support.v7.view.menu.aj r4 = r11.mo1611a()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.mo1577x()
            if (r5 != 0) goto L_0x0016
            goto L_0x005f
        L_0x0016:
            android.widget.ListView r4 = r4.mo1574eJ()
            android.support.v7.widget.cu r4 = (android.support.p033v7.widget.C0578cu) r4
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L_0x005f
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f2284i
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f2284i
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f2283h
            boolean r3 = r4.mo2699a(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x0059
            if (r13 == r0) goto L_0x0059
            r13 = 1
            goto L_0x005a
        L_0x0059:
            r13 = 0
        L_0x005a:
            if (r3 == 0) goto L_0x005f
            if (r13 == 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            boolean r13 = r11.mo2723c()
            if (r13 != 0) goto L_0x0068
        L_0x0065:
            r13 = 1
            goto L_0x0119
        L_0x0068:
            r13 = 0
            goto L_0x0119
        L_0x006b:
            android.view.View r3 = r11.f2278c
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x0076
        L_0x0073:
            r13 = 0
            goto L_0x0102
        L_0x0076:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d4
            if (r4 == r1) goto L_0x00d0
            r5 = 2
            if (r4 == r5) goto L_0x0084
            if (r4 == r0) goto L_0x00d0
            goto L_0x0073
        L_0x0084:
            int r0 = r11.f2283h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0073
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f2276a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00be
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00be
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00be
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00be
            goto L_0x0073
        L_0x00be:
            r11.mo2724d()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            boolean r13 = r11.mo1612b()
            if (r13 == 0) goto L_0x0073
            r13 = 1
            goto L_0x0102
        L_0x00d0:
            r11.mo2724d()
            goto L_0x0073
        L_0x00d4:
            int r13 = r13.getPointerId(r2)
            r11.f2283h = r13
            java.lang.Runnable r13 = r11.f2281f
            if (r13 != 0) goto L_0x00e5
            android.support.v7.widget.da r13 = new android.support.v7.widget.da
            r13.<init>(r11)
            r11.f2281f = r13
        L_0x00e5:
            java.lang.Runnable r13 = r11.f2281f
            int r0 = r11.f2277b
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f2282g
            if (r13 != 0) goto L_0x00f8
            android.support.v7.widget.db r13 = new android.support.v7.widget.db
            r13.<init>(r11)
            r11.f2282g = r13
        L_0x00f8:
            java.lang.Runnable r13 = r11.f2282g
            int r0 = r11.f2280e
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x0073
        L_0x0102:
            if (r13 == 0) goto L_0x0119
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f2278c
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0119:
            r11.f2279d = r13
            if (r13 != 0) goto L_0x0121
            if (r12 == 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            return r2
        L_0x0121:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0587dc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f2279d = false;
        this.f2283h = -1;
        Runnable runnable = this.f2281f;
        if (runnable != null) {
            this.f2278c.removeCallbacks(runnable);
        }
    }
}
