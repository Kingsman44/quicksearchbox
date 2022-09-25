package com.android.launcher3;

import android.appwidget.AppWidgetHostView;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import com.android.launcher3.compat.UserHandleCompat;

/* compiled from: PG */
public final class LauncherAppWidgetInfo extends ItemInfo {
    int appWidgetId;
    AppWidgetHostView hostView = null;
    int installProgress = -1;
    public boolean mHasNotifiedInitialWidgetSizeChanged;
    final ComponentName providerName;
    int restoreStatus;

    public LauncherAppWidgetInfo(int i, ComponentName componentName) {
        if (i == -100) {
            this.itemType = 5;
        } else {
            this.itemType = 4;
        }
        this.appWidgetId = i;
        this.providerName = componentName;
        this.spanX = -1;
        this.spanY = -1;
        this.user = UserHandleCompat.myUserHandle();
        this.restoreStatus = 0;
    }

    public final boolean hasRestoreFlag(int i) {
        return (this.restoreStatus & i) == i;
    }

    public final boolean isCustomWidget() {
        return this.appWidgetId == -100;
    }

    public final void onAddToDatabase(Context context, ContentValues contentValues) {
        super.onAddToDatabase(context, contentValues);
        contentValues.put("appWidgetId", Integer.valueOf(this.appWidgetId));
        contentValues.put("appWidgetProvider", this.providerName.flattenToString());
        contentValues.put("restored", Integer.valueOf(this.restoreStatus));
    }

    public final String toString() {
        String num = Integer.toString(this.appWidgetId);
        return "AppWidget(id=" + num + ")";
    }

    public final void unbind() {
        this.hostView = null;
    }
}
