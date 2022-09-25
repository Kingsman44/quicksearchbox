package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.analytics.internal.ay */
/* compiled from: PG */
public final class C142728ay {

    /* renamed from: a */
    private static Boolean f387315a;

    /* renamed from: a */
    public static boolean m231599a(Context context) {
        C143919bh.m233958a(context);
        Boolean bool = f387315a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        f387315a = Boolean.valueOf(z);
        return z;
    }
}
