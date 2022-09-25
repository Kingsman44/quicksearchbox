package com.google.android.enterprise.connectedapps;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserManager;
import java.util.Iterator;

/* renamed from: com.google.android.enterprise.connectedapps.h */
/* compiled from: PG */
public final class C142574h {

    /* renamed from: a */
    private static boolean f386865a = false;

    /* renamed from: b */
    private static boolean f386866b = false;

    /* renamed from: a */
    public static boolean m231177a(Context context) {
        return !m231178b(context);
    }

    /* renamed from: b */
    public static boolean m231178b(Context context) {
        if (!f386865a) {
            UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
            f386865a = true;
            if (Build.VERSION.SDK_INT < 30) {
                if (userManager.getUserProfiles().size() >= 2) {
                    DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService(DevicePolicyManager.class);
                    PackageManager packageManager = context.getPackageManager();
                    f386866b = false;
                    Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (devicePolicyManager.isProfileOwnerApp(it.next().packageName)) {
                                f386866b = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    f386866b = false;
                    f386865a = false;
                }
            } else {
                f386866b = userManager.isManagedProfile();
            }
        }
        return f386866b;
    }
}
