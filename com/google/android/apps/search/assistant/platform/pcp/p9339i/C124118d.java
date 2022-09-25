package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.d */
/* compiled from: PG */
public final class C124118d {
    /* renamed from: a */
    public static boolean m203544a(Context context) {
        try {
            context.getPackageManager().getApplicationInfo("com.google.android.gm", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
