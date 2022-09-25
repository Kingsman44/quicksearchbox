package com.android.launcher3.compat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import com.android.launcher3.Utilities;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.util.PackageManagerHelper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class LauncherAppsCompatV16 extends LauncherAppsCompat {
    private List mCallbacks = new ArrayList();
    protected Context mContext;
    private PackageMonitor mPackageMonitor;
    private PackageManager mPm;

    /* compiled from: PG */
    class PackageMonitor extends BroadcastReceiver {
        public PackageMonitor() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
            if ("android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_ADDED".equals(action)) {
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                    if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                        for (LauncherAppsCompat.OnAppsChangedCallbackCompat onPackageChanged : LauncherAppsCompatV16.this.getCallbacks()) {
                            onPackageChanged.onPackageChanged(schemeSpecificPart, myUserHandle);
                        }
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        if (!booleanExtra) {
                            for (LauncherAppsCompat.OnAppsChangedCallbackCompat onPackageRemoved : LauncherAppsCompatV16.this.getCallbacks()) {
                                onPackageRemoved.onPackageRemoved(schemeSpecificPart, myUserHandle);
                            }
                        }
                    } else if (!"android.intent.action.PACKAGE_ADDED".equals(action)) {
                    } else {
                        if (!booleanExtra) {
                            for (LauncherAppsCompat.OnAppsChangedCallbackCompat onPackageAdded : LauncherAppsCompatV16.this.getCallbacks()) {
                                onPackageAdded.onPackageAdded(schemeSpecificPart, myUserHandle);
                            }
                            return;
                        }
                        for (LauncherAppsCompat.OnAppsChangedCallbackCompat onPackageChanged2 : LauncherAppsCompatV16.this.getCallbacks()) {
                            onPackageChanged2.onPackageChanged(schemeSpecificPart, myUserHandle);
                        }
                    }
                }
            } else if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
                boolean booleanExtra2 = intent.getBooleanExtra("android.intent.extra.REPLACING", !Utilities.ATLEAST_KITKAT);
                String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
                for (LauncherAppsCompat.OnAppsChangedCallbackCompat onPackagesAvailable : LauncherAppsCompatV16.this.getCallbacks()) {
                    onPackagesAvailable.onPackagesAvailable(stringArrayExtra, myUserHandle, booleanExtra2);
                }
            } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
                boolean booleanExtra3 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                String[] stringArrayExtra2 = intent.getStringArrayExtra("android.intent.extra.changed_package_list");
                for (LauncherAppsCompat.OnAppsChangedCallbackCompat onPackagesUnavailable : LauncherAppsCompatV16.this.getCallbacks()) {
                    onPackagesUnavailable.onPackagesUnavailable(stringArrayExtra2, myUserHandle, booleanExtra3);
                }
            }
        }
    }

    public LauncherAppsCompatV16(Context context) {
        this.mPm = context.getPackageManager();
        this.mContext = context;
        this.mPackageMonitor = new PackageMonitor();
    }

    private void registerForPackageIntents() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        this.mContext.registerReceiver(this.mPackageMonitor, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        this.mContext.registerReceiver(this.mPackageMonitor, intentFilter2);
    }

    private void unregisterForPackageIntents() {
        this.mContext.unregisterReceiver(this.mPackageMonitor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void addOnAppsChangedCallback(com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0021
            java.util.List r0 = r1.mCallbacks     // Catch:{ all -> 0x001e }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0021
            java.util.List r0 = r1.mCallbacks     // Catch:{ all -> 0x001e }
            r0.add(r2)     // Catch:{ all -> 0x001e }
            java.util.List r2 = r1.mCallbacks     // Catch:{ all -> 0x001e }
            int r2 = r2.size()     // Catch:{ all -> 0x001e }
            r0 = 1
            if (r2 != r0) goto L_0x0021
            r1.registerForPackageIntents()     // Catch:{ all -> 0x001e }
            monitor-exit(r1)
            return
        L_0x001e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0021:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.LauncherAppsCompatV16.addOnAppsChangedCallback(com.android.launcher3.compat.LauncherAppsCompat$OnAppsChangedCallbackCompat):void");
    }

    public List getActivityList(String str, UserHandleCompat userHandleCompat) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = this.mPm.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList(queryIntentActivities.size());
        for (ResolveInfo launcherActivityInfoCompatV16 : queryIntentActivities) {
            arrayList.add(new LauncherActivityInfoCompatV16(this.mContext, launcherActivityInfoCompatV16));
        }
        return arrayList;
    }

    public ApplicationInfo getApplicationInfo(String str, UserHandleCompat userHandleCompat) {
        List<ResolveInfo> queryIntentActivities = this.mPm.queryIntentActivities(new Intent("android.intent.action.MAIN", (Uri) null).addCategory("android.intent.category.LAUNCHER").setPackage(str), 0);
        if (queryIntentActivities.size() > 0) {
            return queryIntentActivities.get(0).activityInfo.applicationInfo;
        }
        return null;
    }

    public synchronized List getCallbacks() {
        return new ArrayList(this.mCallbacks);
    }

    public List getCustomShortcutActivityList() {
        PackageManager packageManager = this.mContext.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0)) {
            arrayList.add(new ShortcutConfigActivityInfo.ShortcutConfigActivityInfoV16(resolveInfo.activityInfo, packageManager));
        }
        return arrayList;
    }

    public boolean isActivityEnabledForProfile(ComponentName componentName, UserHandleCompat userHandleCompat) {
        try {
            ActivityInfo activityInfo = this.mPm.getActivityInfo(componentName, 0);
            if (activityInfo == null || !activityInfo.isEnabled()) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public boolean isPackageEnabledForProfile(String str, UserHandleCompat userHandleCompat) {
        return PackageManagerHelper.isAppEnabled(this.mPm, str, 0);
    }

    public boolean isPackageSuspendedForProfile(String str, UserHandleCompat userHandleCompat) {
        return false;
    }

    public synchronized void removeOnAppsChangedCallback(LauncherAppsCompat.OnAppsChangedCallbackCompat onAppsChangedCallbackCompat) {
        this.mCallbacks.remove(onAppsChangedCallbackCompat);
        if (this.mCallbacks.size() == 0) {
            unregisterForPackageIntents();
        }
    }

    public LauncherActivityInfoCompat resolveActivity(Intent intent, UserHandleCompat userHandleCompat) {
        ResolveInfo resolveActivity = this.mPm.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            return new LauncherActivityInfoCompatV16(this.mContext, resolveActivity);
        }
        return null;
    }

    public void showAppDetailsForProfile(ComponentName componentName, UserHandleCompat userHandleCompat) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", componentName.getPackageName(), (String) null));
        intent.setFlags(276856832);
        this.mContext.startActivity(intent, (Bundle) null);
    }

    public void startActivityForProfile(ComponentName componentName, UserHandleCompat userHandleCompat, Rect rect, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(componentName);
        intent.setSourceBounds(rect);
        intent.addFlags(268435456);
        this.mContext.startActivity(intent, bundle);
    }
}
