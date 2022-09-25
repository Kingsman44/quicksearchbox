package com.android.launcher3;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.TransactionTooLargeException;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
public final class LauncherAppWidgetHost extends AppWidgetHost {
    private final Launcher mLauncher;
    public final ArrayList mProviderChangeListeners = new ArrayList();
    public int mQsbWidgetId = -1;

    public LauncherAppWidgetHost(Launcher launcher) {
        super(launcher, 1024);
        this.mLauncher = launcher;
    }

    public final AppWidgetHostView createView(Context context, int i, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo) {
        boolean z = launcherAppWidgetProviderInfo.isCustomWidget;
        return super.createView(context, i, launcherAppWidgetProviderInfo);
    }

    /* access modifiers changed from: protected */
    public final AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        if (i == this.mQsbWidgetId) {
            return new LauncherAppWidgetHostView(context) {
                /* access modifiers changed from: protected */
                public final View getErrorView() {
                    return new View(getContext());
                }
            };
        }
        return new LauncherAppWidgetHostView(context);
    }

    /* access modifiers changed from: protected */
    public final void onProviderChanged(int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        LauncherAppWidgetProviderInfo fromProviderInfo$ar$ds = LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(appWidgetProviderInfo);
        super.onProviderChanged(i, fromProviderInfo$ar$ds);
        fromProviderInfo$ar$ds.initSpans();
    }

    /* access modifiers changed from: protected */
    public final void onProvidersChanged() {
        if (!this.mProviderChangeListeners.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.mProviderChangeListeners);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) arrayList.get(i)).run();
            }
        }
        if (Utilities.ATLEAST_MARSHMALLOW) {
            this.mLauncher.notifyWidgetProvidersChanged();
        }
    }

    public final void startListening() {
        try {
            super.startListening();
        } catch (Exception e) {
            if (!(e.getCause() instanceof TransactionTooLargeException) && !(e.getCause() instanceof DeadObjectException)) {
                throw new RuntimeException(e);
            }
        }
    }
}
