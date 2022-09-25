package com.android.launcher3;

import android.view.View;

/* compiled from: PG */
public final class StylusEventHelper {
    public boolean mIsButtonPressed;
    private final View mView;

    public StylusEventHelper(View view) {
        this.mView = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r5 != 3) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean checkAndPerformStylusEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.mView
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            android.view.View r1 = r6.mView
            boolean r1 = r1.isLongClickable()
            r2 = 0
            if (r1 == 0) goto L_0x0075
            int r1 = r7.getToolType(r2)
            r3 = 2
            r4 = 1
            if (r1 != r3) goto L_0x0029
            int r1 = r7.getButtonState()
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            int r5 = r7.getAction()
            if (r5 == 0) goto L_0x0066
            if (r5 == r4) goto L_0x0063
            if (r5 == r3) goto L_0x0038
            r7 = 3
            if (r5 == r7) goto L_0x0063
            goto L_0x0075
        L_0x0038:
            android.view.View r3 = r6.mView
            float r5 = r7.getX()
            float r7 = r7.getY()
            boolean r7 = com.android.launcher3.Utilities.pointInView(r3, r5, r7, r0)
            if (r7 == 0) goto L_0x0075
            boolean r7 = r6.mIsButtonPressed
            if (r7 != 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            android.view.View r7 = r6.mView
            boolean r7 = r7.performLongClick()
            if (r7 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            r6.mIsButtonPressed = r4
            return r4
        L_0x005a:
            boolean r7 = r6.mIsButtonPressed
            if (r7 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0075
            r6.mIsButtonPressed = r2
            goto L_0x0075
        L_0x0063:
            r6.mIsButtonPressed = r2
            goto L_0x0075
        L_0x0066:
            r6.mIsButtonPressed = r2
            if (r1 == 0) goto L_0x0075
            android.view.View r7 = r6.mView
            boolean r7 = r7.performLongClick()
            if (r7 == 0) goto L_0x0075
            r6.mIsButtonPressed = r4
            return r4
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.StylusEventHelper.checkAndPerformStylusEvent(android.view.MotionEvent):boolean");
    }
}
