package com.android.launcher3.shortcuts;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.DragLayer;
import com.android.launcher3.Launcher;

/* compiled from: PG */
public final class ShortcutsContainerListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private final DragLayer mDragLayer;
    public boolean mForwarding;
    private boolean mHasMappedTouchDownToContainerCoord;
    private boolean mIgnoreCurrentGesture;
    private final Launcher mLauncher;
    private final float mScaledTouchSlop;
    public DeepShortcutsContainer mShortcutsContainer;
    public final BubbleTextView mSrcIcon;
    private final int[] mTouchDown = new int[2];
    private Runnable mTriggerLongPress;

    /* compiled from: PG */
    final class TriggerLongPress implements Runnable {
        public TriggerLongPress() {
        }

        public final void run() {
            ShortcutsContainerListener shortcutsContainerListener = ShortcutsContainerListener.this;
            shortcutsContainerListener.clearCallbacks();
            BubbleTextView bubbleTextView = shortcutsContainerListener.mSrcIcon;
            if (bubbleTextView.isEnabled() && bubbleTextView.hasDeepShortcuts()) {
                shortcutsContainerListener.mShortcutsContainer = DeepShortcutsContainer.showForIcon(shortcutsContainerListener.mSrcIcon);
                if (shortcutsContainerListener.mShortcutsContainer != null) {
                    bubbleTextView.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    bubbleTextView.onTouchEvent(obtain);
                    obtain.recycle();
                    shortcutsContainerListener.mForwarding = true;
                }
            }
        }
    }

    public ShortcutsContainerListener(BubbleTextView bubbleTextView) {
        this.mSrcIcon = bubbleTextView;
        this.mScaledTouchSlop = (float) ViewConfiguration.get(bubbleTextView.getContext()).getScaledTouchSlop();
        bubbleTextView.addOnAttachStateChangeListener(this);
        Launcher launcher = Launcher.getLauncher(bubbleTextView.getContext());
        this.mLauncher = launcher;
        this.mDragLayer = launcher.mDragLayer;
    }

    public final void clearCallbacks() {
        Runnable runnable = this.mTriggerLongPress;
        if (runnable != null) {
            this.mSrcIcon.removeCallbacks(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r2 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r2 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r4 != 3) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r7 = r8.getAction()
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x002e
            com.android.launcher3.BubbleTextView r7 = r6.mSrcIcon
            boolean r7 = r7.hasDeepShortcuts()
            r7 = r7 ^ r0
            r6.mIgnoreCurrentGesture = r7
            int[] r7 = r6.mTouchDown
            float r2 = r8.getX()
            int r2 = (int) r2
            r7[r1] = r2
            int[] r7 = r6.mTouchDown
            float r2 = r8.getY()
            int r2 = (int) r2
            r7[r0] = r2
            com.android.launcher3.DragLayer r7 = r6.mDragLayer
            com.android.launcher3.BubbleTextView r2 = r6.mSrcIcon
            int[] r3 = r6.mTouchDown
            com.android.launcher3.Utilities.getDescendantCoordRelativeToParent(r2, r7, r3, r1)
            r6.mHasMappedTouchDownToContainerCoord = r1
        L_0x002e:
            boolean r7 = r6.mIgnoreCurrentGesture
            if (r7 == 0) goto L_0x0033
            return r1
        L_0x0033:
            boolean r7 = r6.mForwarding
            r2 = 3
            if (r7 == 0) goto L_0x0084
            com.android.launcher3.BubbleTextView r3 = r6.mSrcIcon
            com.android.launcher3.shortcuts.DeepShortcutsContainer r4 = r6.mShortcutsContainer
            if (r4 != 0) goto L_0x003f
            goto L_0x0080
        L_0x003f:
            int r5 = r8.getActionMasked()
            if (r5 == r0) goto L_0x0049
            if (r5 == r2) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            boolean r5 = r4.isLaidOut()
            if (r5 != 0) goto L_0x0055
            if (r2 == 0) goto L_0x0080
        L_0x0052:
            r8 = 1
            goto L_0x00d5
        L_0x0055:
            android.view.MotionEvent r8 = android.view.MotionEvent.obtainNoHistory(r8)
            com.android.launcher3.Utilities.toGlobalMotionEvent(r3, r8)
            com.android.launcher3.Utilities.toLocalMotionEvent(r4, r8)
            boolean r3 = r6.mHasMappedTouchDownToContainerCoord
            if (r3 != 0) goto L_0x006c
            com.android.launcher3.DragLayer r3 = r6.mDragLayer
            int[] r5 = r6.mTouchDown
            com.android.launcher3.Utilities.mapCoordInSelfToDescendent$ar$ds(r4, r3, r5)
            r6.mHasMappedTouchDownToContainerCoord = r0
        L_0x006c:
            int r3 = r6.mActivePointerId
            int[] r5 = r6.mTouchDown
            r4.mActivePointerId = r3
            r4.mTouchDown = r5
            boolean r3 = r4.dispatchTouchEvent(r8)
            r8.recycle()
            if (r3 == 0) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            goto L_0x0052
        L_0x0080:
            r8 = 0
            r6.mShortcutsContainer = r8
            goto L_0x008c
        L_0x0084:
            com.android.launcher3.BubbleTextView r3 = r6.mSrcIcon
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x008e
        L_0x008c:
            r8 = 0
            goto L_0x00d5
        L_0x008e:
            int r4 = r8.getActionMasked()
            if (r4 == 0) goto L_0x00bc
            if (r4 == r0) goto L_0x00b8
            r5 = 2
            if (r4 == r5) goto L_0x009c
            if (r4 == r2) goto L_0x00b8
            goto L_0x008c
        L_0x009c:
            int r2 = r6.mActivePointerId
            int r2 = r8.findPointerIndex(r2)
            if (r2 < 0) goto L_0x008c
            float r4 = r8.getX(r2)
            float r8 = r8.getY(r2)
            float r2 = r6.mScaledTouchSlop
            boolean r8 = com.android.launcher3.Utilities.pointInView(r3, r4, r8, r2)
            if (r8 != 0) goto L_0x008c
            r6.clearCallbacks()
            goto L_0x008c
        L_0x00b8:
            r6.clearCallbacks()
            goto L_0x008c
        L_0x00bc:
            int r8 = r8.getPointerId(r1)
            r6.mActivePointerId = r8
            java.lang.Runnable r8 = r6.mTriggerLongPress
            if (r8 != 0) goto L_0x00cd
            com.android.launcher3.shortcuts.ShortcutsContainerListener$TriggerLongPress r8 = new com.android.launcher3.shortcuts.ShortcutsContainerListener$TriggerLongPress
            r8.<init>()
            r6.mTriggerLongPress = r8
        L_0x00cd:
            java.lang.Runnable r8 = r6.mTriggerLongPress
            r4 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r8, r4)
            goto L_0x008c
        L_0x00d5:
            r6.mForwarding = r8
            if (r8 != 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            return r1
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.shortcuts.ShortcutsContainerListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
    }
}
