package com.android.launcher3.widget;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.os.Bundle;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.PendingAddItemInfo;
import com.android.launcher3.compat.AppWidgetManagerCompat;

/* compiled from: PG */
public final class PendingAddWidgetInfo extends PendingAddItemInfo {
    public Bundle bindOptions = null;
    public AppWidgetHostView boundWidget;
    public final LauncherAppWidgetProviderInfo info;
    public final int previewImage;

    public PendingAddWidgetInfo(Context context, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo) {
        boolean z = launcherAppWidgetProviderInfo.isCustomWidget;
        this.itemType = 4;
        this.info = launcherAppWidgetProviderInfo;
        this.user = AppWidgetManagerCompat.getInstance(context).getUser(launcherAppWidgetProviderInfo);
        this.componentName = launcherAppWidgetProviderInfo.provider;
        this.previewImage = launcherAppWidgetProviderInfo.previewImage;
        int i = launcherAppWidgetProviderInfo.icon;
        this.spanX = launcherAppWidgetProviderInfo.spanX;
        this.spanY = launcherAppWidgetProviderInfo.spanY;
        this.minSpanX = launcherAppWidgetProviderInfo.minSpanX;
        this.minSpanY = launcherAppWidgetProviderInfo.minSpanY;
    }

    public final String toString() {
        return String.format("PendingAddWidgetInfo package=%s, name=%s", new Object[]{this.componentName.getPackageName(), this.componentName.getShortClassName()});
    }
}
