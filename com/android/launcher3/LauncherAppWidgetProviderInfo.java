package com.android.launcher3;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;

/* compiled from: PG */
public class LauncherAppWidgetProviderInfo extends AppWidgetProviderInfo {
    public boolean isCustomWidget = false;
    public int minSpanX;
    public int minSpanY;
    public int spanX;
    public int spanY;

    public LauncherAppWidgetProviderInfo(Parcel parcel) {
        super(parcel);
        initSpans();
    }

    public static LauncherAppWidgetProviderInfo fromProviderInfo$ar$ds(AppWidgetProviderInfo appWidgetProviderInfo) {
        Parcel obtain = Parcel.obtain();
        appWidgetProviderInfo.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = new LauncherAppWidgetProviderInfo(obtain);
        obtain.recycle();
        return launcherAppWidgetProviderInfo;
    }

    public final Drawable getIcon$ar$ds(Context context) {
        return super.loadIcon(context, LauncherAppState.getInstance().mInvariantDeviceProfile.fillResIconDpi);
    }

    public final String getLabel(PackageManager packageManager) {
        return super.loadLabel(packageManager);
    }

    public final Point getMinSpans$ar$ds() {
        int i = -1;
        int i2 = (this.resizeMode & 1) != 0 ? this.minSpanX : -1;
        if ((this.resizeMode & 2) != 0) {
            i = this.minSpanY;
        }
        return new Point(i2, i);
    }

    public final void initSpans() {
        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
        Rect workspacePadding = invariantDeviceProfile.landscapeProfile.getWorkspacePadding(false);
        Rect workspacePadding2 = invariantDeviceProfile.portraitProfile.getWorkspacePadding(false);
        float min = (float) (Math.min((invariantDeviceProfile.landscapeProfile.widthPx - workspacePadding.left) - workspacePadding.right, (invariantDeviceProfile.portraitProfile.widthPx - workspacePadding2.left) - workspacePadding2.right) / invariantDeviceProfile.numColumns);
        float min2 = (float) (Math.min((invariantDeviceProfile.landscapeProfile.heightPx - workspacePadding.top) - workspacePadding.bottom, (invariantDeviceProfile.portraitProfile.heightPx - workspacePadding2.top) - workspacePadding2.bottom) / invariantDeviceProfile.numRows);
        Rect defaultPaddingForWidget = AppWidgetHostView.getDefaultPaddingForWidget(LauncherAppState.sContext, this.provider, (Rect) null);
        this.spanX = Math.max(1, (int) Math.ceil((double) (((float) ((this.minWidth + defaultPaddingForWidget.left) + defaultPaddingForWidget.right)) / min)));
        this.spanY = Math.max(1, (int) Math.ceil((double) (((float) ((this.minHeight + defaultPaddingForWidget.top) + defaultPaddingForWidget.bottom)) / min2)));
        this.minSpanX = Math.max(1, (int) Math.ceil((double) (((float) ((this.minResizeWidth + defaultPaddingForWidget.left) + defaultPaddingForWidget.right)) / min)));
        this.minSpanY = Math.max(1, (int) Math.ceil((double) (((float) ((this.minResizeHeight + defaultPaddingForWidget.top) + defaultPaddingForWidget.bottom)) / min2)));
    }
}
