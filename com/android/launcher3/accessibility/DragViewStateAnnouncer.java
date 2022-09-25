package com.android.launcher3.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
public final class DragViewStateAnnouncer implements Runnable {
    public final View mTargetView;

    private DragViewStateAnnouncer(View view) {
        this.mTargetView = view;
    }

    public static DragViewStateAnnouncer createFor(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            return new DragViewStateAnnouncer(view);
        }
        return null;
    }

    public final void announce(CharSequence charSequence) {
        this.mTargetView.setContentDescription(charSequence);
        this.mTargetView.removeCallbacks(this);
        this.mTargetView.postDelayed(this, 200);
    }

    public final void run() {
        this.mTargetView.sendAccessibilityEvent(4);
    }
}
