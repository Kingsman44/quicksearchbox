package com.android.launcher3.compat;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.Toast;
import com.android.launcher3.IconCache;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class ShortcutConfigActivityInfo {
    private static final String TAG = "SCActivityInfo";
    private final ComponentName mCn;
    private final UserHandleCompat mUser;

    /* compiled from: PG */
    class ShortcutConfigActivityInfoV16 extends ShortcutConfigActivityInfo {
        private final ActivityInfo mInfo;
        private final PackageManager mPm;

        public ShortcutConfigActivityInfoV16(ActivityInfo activityInfo, PackageManager packageManager) {
            super(new ComponentName(activityInfo.packageName, activityInfo.name), UserHandleCompat.myUserHandle());
            this.mInfo = activityInfo;
            this.mPm = packageManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            r0 = r0.getIconResource();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.drawable.Drawable getFullResIcon(com.android.launcher3.IconCache r4) {
            /*
                r3 = this;
                android.content.pm.ActivityInfo r0 = r3.mInfo
                android.content.pm.PackageManager r1 = r4.mPackageManager     // Catch:{ NameNotFoundException -> 0x000b }
                android.content.pm.ApplicationInfo r2 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x000b }
                android.content.res.Resources r1 = r1.getResourcesForApplication(r2)     // Catch:{ NameNotFoundException -> 0x000b }
                goto L_0x000c
            L_0x000b:
                r1 = 0
            L_0x000c:
                if (r1 == 0) goto L_0x0019
                int r0 = r0.getIconResource()
                if (r0 == 0) goto L_0x0019
                android.graphics.drawable.Drawable r4 = r4.getFullResIcon((android.content.res.Resources) r1, (int) r0)
                goto L_0x001d
            L_0x0019:
                android.graphics.drawable.Drawable r4 = r4.getFullResDefaultActivityIcon()
            L_0x001d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.ShortcutConfigActivityInfo.ShortcutConfigActivityInfoV16.getFullResIcon(com.android.launcher3.IconCache):android.graphics.drawable.Drawable");
        }

        public CharSequence getLabel() {
            return this.mInfo.loadLabel(this.mPm);
        }
    }

    /* compiled from: PG */
    class ShortcutConfigActivityInfoVO extends ShortcutConfigActivityInfo {
        private final LauncherActivityInfo mInfo;

        public ShortcutConfigActivityInfoVO(LauncherActivityInfo launcherActivityInfo) {
            super(launcherActivityInfo.getComponentName(), UserHandleCompat.fromUser(launcherActivityInfo.getUser()));
            this.mInfo = launcherActivityInfo;
        }

        public Drawable getFullResIcon(IconCache iconCache) {
            return new LauncherActivityInfoCompatVL(this.mInfo).getIcon(iconCache.mIconDpi);
        }

        public CharSequence getLabel() {
            return this.mInfo.getLabel();
        }

        public boolean startConfigActivity(Activity activity, int i) {
            if (getUser().equals(UserHandleCompat.myUserHandle())) {
                return ShortcutConfigActivityInfo.super.startConfigActivity(activity, i);
            }
            try {
                Activity activity2 = activity;
                activity2.startIntentSenderForResult((IntentSender) LauncherApps.class.getDeclaredMethod("getShortcutConfigActivityIntent", new Class[]{LauncherActivityInfo.class}).invoke(activity.getSystemService(LauncherApps.class), new Object[]{this.mInfo}), i, (Intent) null, 0, 0, 0);
                return true;
            } catch (Exception e) {
                Log.e(ShortcutConfigActivityInfo.TAG, "Error calling new API", e);
                return false;
            }
        }
    }

    protected ShortcutConfigActivityInfo(ComponentName componentName, UserHandleCompat userHandleCompat) {
        this.mCn = componentName;
        this.mUser = userHandleCompat;
    }

    public ComponentName getComponent() {
        return this.mCn;
    }

    public abstract Drawable getFullResIcon(IconCache iconCache);

    public abstract CharSequence getLabel();

    public UserHandleCompat getUser() {
        return this.mUser;
    }

    public boolean isPersistable() {
        return true;
    }

    public boolean startConfigActivity(Activity activity, int i) {
        Intent component = new Intent("android.intent.action.CREATE_SHORTCUT").setComponent(getComponent());
        try {
            activity.startActivityForResult(component, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
            return false;
        } catch (SecurityException e) {
            Toast.makeText(activity, R.string.activity_not_found, 0).show();
            String valueOf = String.valueOf(component);
            Log.e(TAG, "Launcher does not have the permission to launch " + valueOf + ". Make sure to create a MAIN intent-filter for the corresponding activity or use the exported attribute for this activity.", e);
            return false;
        }
    }
}
