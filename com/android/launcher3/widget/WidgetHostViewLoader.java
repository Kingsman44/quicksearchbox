package com.android.launcher3.widget;

import android.appwidget.AppWidgetHostView;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.android.launcher3.AppWidgetResizeFrame;
import com.android.launcher3.BaseActivity;
import com.android.launcher3.DragController;
import com.android.launcher3.DragSource;
import com.android.launcher3.Launcher;
import com.android.launcher3.Utilities;

/* compiled from: PG */
public final class WidgetHostViewLoader implements DragController.DragListener {
    public Runnable mBindWidgetRunnable = null;
    final Handler mHandler;
    Runnable mInflateWidgetRunnable = null;
    final PendingAddWidgetInfo mInfo;
    final Launcher mLauncher;
    final View mView;
    int mWidgetLoadingId = -1;

    public WidgetHostViewLoader(Launcher launcher, View view) {
        this.mLauncher = launcher;
        this.mHandler = new Handler();
        this.mView = view;
        this.mInfo = (PendingAddWidgetInfo) view.getTag();
    }

    public static Bundle getDefaultOptionsForWidget(BaseActivity baseActivity, PendingAddWidgetInfo pendingAddWidgetInfo) {
        Rect rect = new Rect();
        if (!Utilities.ATLEAST_JB_MR1) {
            return null;
        }
        AppWidgetResizeFrame.getWidgetSizeRanges$ar$ds(baseActivity, pendingAddWidgetInfo.spanX, pendingAddWidgetInfo.spanY, rect);
        Rect defaultPaddingForWidget = AppWidgetHostView.getDefaultPaddingForWidget(baseActivity, pendingAddWidgetInfo.componentName, (Rect) null);
        float f = baseActivity.getResources().getDisplayMetrics().density;
        int i = (int) (((float) (defaultPaddingForWidget.left + defaultPaddingForWidget.right)) / f);
        int i2 = (int) (((float) (defaultPaddingForWidget.top + defaultPaddingForWidget.bottom)) / f);
        Bundle bundle = new Bundle();
        bundle.putInt("appWidgetMinWidth", rect.left - i);
        bundle.putInt("appWidgetMinHeight", rect.top - i2);
        bundle.putInt("appWidgetMaxWidth", rect.right - i);
        bundle.putInt("appWidgetMaxHeight", rect.bottom - i2);
        return bundle;
    }

    public final void onDragEnd() {
        this.mLauncher.mDragController.mListeners.remove(this);
        this.mHandler.removeCallbacks(this.mBindWidgetRunnable);
        this.mHandler.removeCallbacks(this.mInflateWidgetRunnable);
        int i = this.mWidgetLoadingId;
        if (i != -1) {
            this.mLauncher.mAppWidgetHost.deleteAppWidgetId(i);
            this.mWidgetLoadingId = -1;
        }
        AppWidgetHostView appWidgetHostView = this.mInfo.boundWidget;
        if (appWidgetHostView != null) {
            this.mLauncher.mDragLayer.removeView(appWidgetHostView);
            this.mLauncher.mAppWidgetHost.deleteAppWidgetId(this.mInfo.boundWidget.getAppWidgetId());
            this.mInfo.boundWidget = null;
        }
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
    }
}
