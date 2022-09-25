package com.android.launcher3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.AsyncTask;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import com.android.launcher3.InstallShortcutReceiver;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import java.util.List;

/* compiled from: PG */
public class PackageSessionCommitReceiver extends BroadcastReceiver {

    /* compiled from: PG */
    final class PrefInitTask extends AsyncTask {
        private final Context mContext;

        public PrefInitTask(Context context) {
            this.mContext = context;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
            if (r11 != null) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
            if (r11 != null) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
            r11.close();
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r11) {
            /*
                r10 = this;
                java.lang.String r0 = "content://"
                java.lang.Void[] r11 = (java.lang.Void[]) r11
                android.content.Context r11 = r10.mContext
                android.content.pm.PackageManager r11 = r11.getPackageManager()
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.intent.action.MAIN"
                r1.<init>(r2)
                java.lang.String r2 = "android.intent.category.APP_MARKET"
                android.content.Intent r1 = r1.addCategory(r2)
                r2 = 1114112(0x110000, float:1.561203E-39)
                android.content.pm.ResolveInfo r11 = r11.resolveActivity(r1, r2)
                r1 = 0
                r2 = 1
                if (r11 != 0) goto L_0x0023
            L_0x0021:
                r0 = 1
                goto L_0x007d
            L_0x0023:
                android.content.Context r3 = r10.mContext     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                android.content.ContentResolver r4 = r3.getContentResolver()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                android.content.pm.ActivityInfo r11 = r11.activityInfo     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                java.lang.String r11 = r11.packageName     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                r3.<init>(r0)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                r3.append(r11)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                java.lang.String r11 = ".addtohomescreen"
                r3.append(r11)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                android.net.Uri r5 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
                boolean r0 = r11.moveToNext()     // Catch:{ Exception -> 0x0068 }
                if (r0 == 0) goto L_0x0065
                java.lang.String r0 = "value"
                int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0068 }
                int r0 = r11.getInt(r0)     // Catch:{ Exception -> 0x0068 }
                if (r0 == 0) goto L_0x005e
                r0 = 1
                goto L_0x005f
            L_0x005e:
                r0 = 0
            L_0x005f:
                if (r11 == 0) goto L_0x007d
                r11.close()
                goto L_0x007d
            L_0x0065:
                if (r11 == 0) goto L_0x0021
                goto L_0x0079
            L_0x0068:
                r0 = move-exception
                goto L_0x0070
            L_0x006a:
                r11 = move-exception
                r0 = r11
                goto L_0x0099
            L_0x006d:
                r11 = move-exception
                r0 = r11
                r11 = r1
            L_0x0070:
                java.lang.String r3 = "SessionCommitReceiver"
                java.lang.String r4 = "Error reading add to homescreen preference"
                android.util.Log.d(r3, r4, r0)     // Catch:{ all -> 0x0097 }
                if (r11 == 0) goto L_0x0021
            L_0x0079:
                r11.close()
                goto L_0x0021
            L_0x007d:
                android.content.Context r11 = r10.mContext
                android.content.SharedPreferences r11 = com.android.launcher3.Utilities.getPrefs(r11)
                android.content.SharedPreferences$Editor r11 = r11.edit()
                java.lang.String r3 = "pref_add_icon_to_home"
                android.content.SharedPreferences$Editor r11 = r11.putBoolean(r3, r0)
                java.lang.String r0 = "pref_add_icon_to_home_initialized"
                android.content.SharedPreferences$Editor r11 = r11.putBoolean(r0, r2)
                r11.apply()
                return r1
            L_0x0097:
                r0 = move-exception
                r1 = r11
            L_0x0099:
                if (r1 == 0) goto L_0x009e
                r1.close()
            L_0x009e:
                goto L_0x00a0
            L_0x009f:
                throw r0
            L_0x00a0:
                goto L_0x009f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.PackageSessionCommitReceiver.PrefInitTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    public static boolean isEnabled(Context context) {
        return Utilities.getPrefs(context).getBoolean("pref_add_icon_to_home", true);
    }

    public final void onReceive(Context context, Intent intent) {
        List activityList;
        if (isEnabled(context) && Utilities.ATLEAST_O) {
            PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) intent.getParcelableExtra("android.content.pm.extra.SESSION");
            UserHandle userHandle = (UserHandle) intent.getParcelableExtra("android.intent.extra.USER");
            if (!TextUtils.isEmpty(sessionInfo.getAppPackageName())) {
                try {
                    if (((Integer) PackageInstaller.SessionInfo.class.getDeclaredMethod("getInstallReason", new Class[0]).invoke(sessionInfo, new Object[0])).intValue() == 4 && Process.myUserHandle().equals(userHandle) && (activityList = LauncherAppsCompat.getInstance(context).getActivityList(sessionInfo.getAppPackageName(), UserHandleCompat.fromUser(userHandle))) != null && !activityList.isEmpty()) {
                        InstallShortcutReceiver.queuePendingShortcutInfo(new InstallShortcutReceiver.PendingInstallShortcutInfo((LauncherActivityInfoCompat) activityList.get(0), context), context);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
