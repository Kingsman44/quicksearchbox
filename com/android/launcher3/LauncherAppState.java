package com.android.launcher3;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.util.Log;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.util.ConfigMonitor;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class LauncherAppState {
    public static LauncherAppState INSTANCE;
    public static Context sContext;
    public static WeakReference sLauncherProvider;
    public LauncherAccessibilityDelegate mAccessibilityDelegate;
    private final AppFilter mAppFilter;
    public final DeepShortcutManagerCompat mDeepShortcutManager;
    public final IconCache mIconCache;
    public InvariantDeviceProfile mInvariantDeviceProfile;
    public final LauncherModel mModel;
    public boolean mWallpaperChangedSinceLastCheck;
    public final WidgetPreviewLoader mWidgetCache;

    private LauncherAppState() {
        if (sContext != null) {
            Log.v("Launcher", "LauncherAppState inited");
            this.mInvariantDeviceProfile = new InvariantDeviceProfile(sContext);
            IconCache iconCache = new IconCache(sContext, this.mInvariantDeviceProfile);
            this.mIconCache = iconCache;
            this.mWidgetCache = new WidgetPreviewLoader(sContext, iconCache);
            DeepShortcutManagerCompat instance = DeepShortcutManagerCompat.getInstance(sContext);
            this.mDeepShortcutManager = instance;
            AppFilter loadByName = AppFilter.loadByName(sContext.getString(R.string.app_filter_class));
            this.mAppFilter = loadByName;
            LauncherModel launcherModel = new LauncherModel(this, iconCache, loadByName, instance);
            this.mModel = launcherModel;
            LauncherAppsCompat.getInstance(sContext).addOnAppsChangedCallback(launcherModel);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
            intentFilter.addAction("android.search.action.GLOBAL_SEARCH_ACTIVITY_CHANGED");
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_ADDED);
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_REMOVED);
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_AVAILABLE);
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNAVAILABLE);
            intentFilter.addAction(LauncherAppsCompat.ACTION_MANAGED_PROFILE_UNLOCKED);
            sContext.registerReceiver(launcherModel, intentFilter);
            UserManagerCompat.getInstance(sContext).enableAndResetCache();
            ConfigMonitor configMonitor = new ConfigMonitor(sContext);
            configMonitor.mContext.registerReceiver(configMonitor, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            sContext.registerReceiver(new WallpaperChangedReceiver(), new IntentFilter("android.intent.action.WALLPAPER_CHANGED"));
            return;
        }
        throw new IllegalStateException("LauncherAppState inited before app context set");
    }

    public static LauncherAppState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LauncherAppState();
        }
        return INSTANCE;
    }

    public static LauncherProvider getLauncherProvider() {
        return (LauncherProvider) sLauncherProvider.get();
    }

    public final void reloadWorkspace() {
        this.mModel.resetLoadedState$ar$ds(false);
        this.mModel.startLoaderFromBackground();
    }

    /* access modifiers changed from: package-private */
    public final LauncherModel setLauncher(Launcher launcher) {
        LauncherProvider launcherProvider = getLauncherProvider();
        launcherProvider.mListener = launcher;
        launcherProvider.mOpenHelper.mListener = launcherProvider.mListener;
        LauncherModel launcherModel = this.mModel;
        synchronized (launcherModel.mLock) {
            if (LauncherModel.sWorkerThread.getThreadId() != Process.myTid()) {
                synchronized (LauncherModel.mDeferredBindRunnables) {
                    LauncherModel.mDeferredBindRunnables.clear();
                }
                DeferredHandler deferredHandler = launcherModel.mHandler;
                synchronized (deferredHandler.mQueue) {
                    deferredHandler.mQueue.clear();
                }
                launcherModel.unbindWorkspaceItemsOnMainThread();
                launcherModel.mCallbacks = new WeakReference(launcher);
            } else {
                throw new RuntimeException("Expected unbindLauncherItemInfos() to be called from the main thread");
            }
        }
        LauncherAccessibilityDelegate launcherAccessibilityDelegate = null;
        if (launcher != null && Utilities.ATLEAST_LOLLIPOP) {
            launcherAccessibilityDelegate = new LauncherAccessibilityDelegate(launcher);
        }
        this.mAccessibilityDelegate = launcherAccessibilityDelegate;
        return this.mModel;
    }
}
