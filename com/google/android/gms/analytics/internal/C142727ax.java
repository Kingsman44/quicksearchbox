package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.analytics.internal.ax */
/* compiled from: PG */
public final class C142727ax {

    /* renamed from: a */
    static Boolean f387314a;

    /* renamed from: a */
    public static boolean m231598a(Context context) {
        C143919bh.m233958a(context);
        Boolean bool = f387314a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean f = C142731ba.m231606f(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f387314a = Boolean.valueOf(f);
        return f;
    }
}
