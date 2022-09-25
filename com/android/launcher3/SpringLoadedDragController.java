package com.android.launcher3;

import android.animation.TimeInterpolator;

/* compiled from: PG */
public final class SpringLoadedDragController implements OnAlarmListener {
    final Alarm mAlarm;
    private final Launcher mLauncher;
    public CellLayout mScreen;

    public SpringLoadedDragController(Launcher launcher) {
        this.mLauncher = launcher;
        Alarm alarm = new Alarm();
        this.mAlarm = alarm;
        alarm.mAlarmListener = this;
    }

    public final void onAlarm$ar$ds() {
        CellLayout cellLayout = this.mScreen;
        if (cellLayout != null) {
            Workspace workspace = this.mLauncher.mWorkspace;
            int indexOfChild = workspace.indexOfChild(cellLayout);
            if (indexOfChild != workspace.mCurrentPage) {
                workspace.snapToPage(indexOfChild, 750, false, (TimeInterpolator) null);
                return;
            }
            return;
        }
        this.mLauncher.mDragController.cancelDrag();
    }
}
