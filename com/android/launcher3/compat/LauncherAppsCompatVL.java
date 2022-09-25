package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.UserHandle;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class LauncherAppsCompatVL extends LauncherAppsCompatV16 {
    private Map mCallbacks = new HashMap();
    protected LauncherApps mLauncherApps;

    /* compiled from: PG */
    class WrappedCallback extends LauncherApps.Callback {
        private LauncherAppsCompat.OnAppsChangedCallbackCompat mCallback;

        public WrappedCallback(LauncherAppsCompat.OnAppsChangedCallbackCompat onAppsChangedCallbackCompat) {
            this.mCallback = onAppsChangedCallbackCompat;
        }

        public void onPackageAdded(String str, UserHandle userHandle) {
            this.mCallback.onPackageAdded(str, UserHandleCompat.fromUser(userHandle));
        }

        public void onPackageChanged(String str, UserHandle userHandle) {
            this.mCallback.onPackageChanged(str, UserHandleCompat.fromUser(userHandle));
        }

        public void onPackageRemoved(String str, UserHandle userHandle) {
            this.mCallback.onPackageRemoved(str, UserHandleCompat.fromUser(userHandle));
        }

        public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z) {
            this.mCallback.onPackagesAvailable(strArr, UserHandleCompat.fromUser(userHandle), z);
        }

        public void onPackagesSuspended(String[] strArr, UserHandle userHandle) {
            this.mCallback.onPackagesSuspended(strArr, UserHandleCompat.fromUser(userHandle));
        }

        public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z) {
            this.mCallback.onPackagesUnavailable(strArr, UserHandleCompat.fromUser(userHandle), z);
        }

        public void onPackagesUnsuspended(String[] strArr, UserHandle userHandle) {
            this.mCallback.onPackagesUnsuspended(strArr, UserHandleCompat.fromUser(userHandle));
        }

        public void onShortcutsChanged(String str, List list, UserHandle userHandle) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object shortcutInfoCompat : list) {
                arrayList.add(new ShortcutInfoCompat(shortcutInfoCompat));
            }
            this.mCallback.onShortcutsChanged(str, arrayList, UserHandleCompat.fromUser(userHandle));
        }
    }

    public LauncherAppsCompatVL(Context context) {
        super(context);
        this.mLauncherApps = (LauncherApps) context.getSystemService("launcherapps");
    }

    public void addOnAppsChangedCallback(LauncherAppsCompat.OnAppsChangedCallbackCompat onAppsChangedCallbackCompat) {
        WrappedCallback wrappedCallback = new WrappedCallback(onAppsChangedCallbackCompat);
        synchronized (this.mCallbacks) {
            this.mCallbacks.put(onAppsChangedCallbackCompat, wrappedCallback);
        }
        this.mLauncherApps.registerCallback(wrappedCallback);
    }

    public List getActivityList(String str, UserHandleCompat userHandleCompat) {
        List<LauncherActivityInfo> activityList = this.mLauncherApps.getActivityList(str, userHandleCompat.getUser());
        if (activityList.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(activityList.size());
        for (LauncherActivityInfo launcherActivityInfoCompatVL : activityList) {
            arrayList.add(new LauncherActivityInfoCompatVL(launcherActivityInfoCompatVL));
        }
        return arrayList;
    }

    public ApplicationInfo getApplicationInfo(String str, UserHandleCompat userHandleCompat) {
        List<LauncherActivityInfo> activityList = this.mLauncherApps.getActivityList(str, userHandleCompat.getUser());
        if (activityList.size() > 0) {
            return activityList.get(0).getApplicationInfo();
        }
        return null;
    }

    public boolean isActivityEnabledForProfile(ComponentName componentName, UserHandleCompat userHandleCompat) {
        return this.mLauncherApps.isActivityEnabled(componentName, userHandleCompat.getUser());
    }

    public boolean isPackageEnabledForProfile(String str, UserHandleCompat userHandleCompat) {
        return this.mLauncherApps.isPackageEnabled(str, userHandleCompat.getUser());
    }

    public boolean isPackageSuspendedForProfile(String str, UserHandleCompat userHandleCompat) {
        return false;
    }

    public void removeOnAppsChangedCallback(LauncherAppsCompat.OnAppsChangedCallbackCompat onAppsChangedCallbackCompat) {
        WrappedCallback wrappedCallback;
        synchronized (this.mCallbacks) {
            wrappedCallback = (WrappedCallback) this.mCallbacks.remove(onAppsChangedCallbackCompat);
        }
        if (wrappedCallback != null) {
            this.mLauncherApps.unregisterCallback(wrappedCallback);
        }
    }

    public LauncherActivityInfoCompat resolveActivity(Intent intent, UserHandleCompat userHandleCompat) {
        LauncherActivityInfo resolveActivity = this.mLauncherApps.resolveActivity(intent, userHandleCompat.getUser());
        if (resolveActivity != null) {
            return new LauncherActivityInfoCompatVL(resolveActivity);
        }
        return null;
    }

    public void showAppDetailsForProfile(ComponentName componentName, UserHandleCompat userHandleCompat) {
        this.mLauncherApps.startAppDetailsActivity(componentName, userHandleCompat.getUser(), (Rect) null, (Bundle) null);
    }

    public void startActivityForProfile(ComponentName componentName, UserHandleCompat userHandleCompat, Rect rect, Bundle bundle) {
        this.mLauncherApps.startMainActivity(componentName, userHandleCompat.getUser(), rect, bundle);
    }
}
