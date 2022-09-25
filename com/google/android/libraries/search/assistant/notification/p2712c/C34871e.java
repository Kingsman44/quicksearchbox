package com.google.android.libraries.search.assistant.notification.p2712c;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.notification.c.e */
/* compiled from: PG */
public final class C34871e {
    /* renamed from: a */
    public static String m63635a(Context context, String str) {
        String string = context.getString(R.string.unknown_app_name);
        PackageManager packageManager = context.getPackageManager();
        LauncherApps launcherApps = (LauncherApps) context.getSystemService(LauncherApps.class);
        for (UserHandle applicationInfo : launcherApps.getProfiles()) {
            try {
                CharSequence applicationLabel = packageManager.getApplicationLabel(launcherApps.getApplicationInfo(str, 0, applicationInfo));
                if (applicationLabel != null) {
                    return applicationLabel.toString();
                }
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
        }
        return string;
    }
}
