package com.google.android.apps.gsa.shared.p7196z;

import android.app.AlarmManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.gsa.shared.z.a */
/* compiled from: PG */
public final class C91235a {
    /* renamed from: a */
    public static AlarmManager m149148a(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    /* renamed from: b */
    public static PackageInfo m149149b(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
