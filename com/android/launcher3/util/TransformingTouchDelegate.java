package com.android.launcher3.util;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
public final class TransformingTouchDelegate extends TouchDelegate {
    private static final Rect sTempRect = new Rect();
    public final RectF mBounds = new RectF();
    private boolean mDelegateTargeted;
    private final View mDelegateView;
    public final RectF mTouchCheckBounds = new RectF();
    private boolean mWasTouchOutsideBounds;

    public TransformingTouchDelegate(View view) {
        super(sTempRect, view);
        this.mDelegateView = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            if (r0 == r1) goto L_0x0014
            r1 = 2
            if (r0 == r1) goto L_0x0011
            r1 = 3
            if (r0 == r1) goto L_0x0014
            goto L_0x0070
        L_0x0011:
            boolean r0 = r5.mDelegateTargeted
            goto L_0x0018
        L_0x0014:
            boolean r0 = r5.mDelegateTargeted
            r5.mDelegateTargeted = r2
        L_0x0018:
            if (r0 != 0) goto L_0x003e
            goto L_0x0070
        L_0x001b:
            android.graphics.RectF r0 = r5.mTouchCheckBounds
            float r3 = r6.getX()
            float r4 = r6.getY()
            boolean r0 = r0.contains(r3, r4)
            r5.mDelegateTargeted = r0
            if (r0 == 0) goto L_0x0070
            android.graphics.RectF r0 = r5.mBounds
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r0 = r0.contains(r2, r3)
            r0 = r0 ^ r1
            r5.mWasTouchOutsideBounds = r0
        L_0x003e:
            float r0 = r6.getX()
            float r1 = r6.getY()
            boolean r2 = r5.mWasTouchOutsideBounds
            if (r2 == 0) goto L_0x005a
            android.graphics.RectF r2 = r5.mBounds
            float r2 = r2.centerX()
            android.graphics.RectF r3 = r5.mBounds
            float r3 = r3.centerY()
            r6.setLocation(r2, r3)
            goto L_0x0067
        L_0x005a:
            android.graphics.RectF r2 = r5.mBounds
            float r2 = r2.left
            float r2 = -r2
            android.graphics.RectF r3 = r5.mBounds
            float r3 = r3.top
            float r3 = -r3
            r6.offsetLocation(r2, r3)
        L_0x0067:
            android.view.View r2 = r5.mDelegateView
            boolean r2 = r2.dispatchTouchEvent(r6)
            r6.setLocation(r0, r1)
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.util.TransformingTouchDelegate.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
