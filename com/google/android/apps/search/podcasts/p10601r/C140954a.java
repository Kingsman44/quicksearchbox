package com.google.android.apps.search.podcasts.p10601r;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.search.podcasts.r.a */
/* compiled from: PG */
public final class C140954a {
    /* renamed from: a */
    public static boolean m228911a(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData.containsKey("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
