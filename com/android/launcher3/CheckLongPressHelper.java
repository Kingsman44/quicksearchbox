package com.android.launcher3;

import android.view.View;

/* compiled from: PG */
public final class CheckLongPressHelper {
    boolean mHasPerformedLongPress;
    public int mLongPressTimeout = 300;
    private CheckForLongPress mPendingCheckForLongPress;
    final View mView;

    /* compiled from: PG */
    final class CheckForLongPress implements Runnable {
        public CheckForLongPress() {
        }

        public final void run() {
            if (CheckLongPressHelper.this.mView.getParent() != null && CheckLongPressHelper.this.mView.hasWindowFocus()) {
                CheckLongPressHelper checkLongPressHelper = CheckLongPressHelper.this;
                if (!checkLongPressHelper.mHasPerformedLongPress && checkLongPressHelper.mView.performLongClick()) {
                    CheckLongPressHelper.this.mView.setPressed(false);
                    CheckLongPressHelper.this.mHasPerformedLongPress = true;
                }
            }
        }
    }

    public CheckLongPressHelper(View view) {
        this.mView = view;
    }

    public final void cancelLongPress() {
        this.mHasPerformedLongPress = false;
        CheckForLongPress checkForLongPress = this.mPendingCheckForLongPress;
        if (checkForLongPress != null) {
            this.mView.removeCallbacks(checkForLongPress);
            this.mPendingCheckForLongPress = null;
        }
    }

    public final void postCheckForLongPress() {
        this.mHasPerformedLongPress = false;
        if (this.mPendingCheckForLongPress == null) {
            this.mPendingCheckForLongPress = new CheckForLongPress();
        }
        this.mView.postDelayed(this.mPendingCheckForLongPress, (long) this.mLongPressTimeout);
    }
}
