package android.support.p033v7.widget;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.widget.hn */
/* compiled from: PG */
final class C0706hn extends TouchDelegate {

    /* renamed from: a */
    private final View f2532a;

    /* renamed from: b */
    private final Rect f2533b = new Rect();

    /* renamed from: c */
    private final Rect f2534c = new Rect();

    /* renamed from: d */
    private final Rect f2535d = new Rect();

    /* renamed from: e */
    private final int f2536e;

    /* renamed from: f */
    private boolean f2537f;

    public C0706hn(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f2536e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        mo3194a(rect, rect2);
        this.f2532a = view;
    }

    /* renamed from: a */
    public final void mo3194a(Rect rect, Rect rect2) {
        this.f2533b.set(rect);
        this.f2535d.set(rect);
        Rect rect3 = this.f2535d;
        int i = -this.f2536e;
        rect3.inset(i, i);
        this.f2534c.set(rect2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r5) goto L_0x0024
            if (r2 == r3) goto L_0x0024
            r6 = 3
            if (r2 == r6) goto L_0x001d
        L_0x001a:
            r2 = 1
            r5 = 0
            goto L_0x003e
        L_0x001d:
            boolean r2 = r7.f2537f
            r7.f2537f = r4
        L_0x0021:
            r5 = r2
        L_0x0022:
            r2 = 1
            goto L_0x003e
        L_0x0024:
            boolean r2 = r7.f2537f
            if (r2 == 0) goto L_0x0021
            android.graphics.Rect r6 = r7.f2535d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L_0x0021
            r5 = r2
            r2 = 0
            goto L_0x003e
        L_0x0033:
            android.graphics.Rect r2 = r7.f2533b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x001a
            r7.f2537f = r5
            goto L_0x0022
        L_0x003e:
            if (r5 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x005e
            android.graphics.Rect r2 = r7.f2534c
            boolean r2 = r2.contains(r0, r1)
            if (r2 != 0) goto L_0x005e
            android.view.View r0 = r7.f2532a
            int r0 = r0.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            android.view.View r1 = r7.f2532a
            int r1 = r1.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r8.setLocation(r0, r1)
            goto L_0x006d
        L_0x005e:
            android.graphics.Rect r2 = r7.f2534c
            int r2 = r2.left
            int r0 = r0 - r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.f2534c
            int r2 = r2.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r8.setLocation(r0, r1)
        L_0x006d:
            android.view.View r0 = r7.f2532a
            boolean r4 = r0.dispatchTouchEvent(r8)
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0706hn.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
