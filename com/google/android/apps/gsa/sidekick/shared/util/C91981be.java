package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.be */
/* compiled from: PG */
public final class C91981be {
    /* renamed from: a */
    public static String m150951a(String str, Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        String str2 = "mdpi";
        if (!(i == 120 || i == 160)) {
            str2 = "hdpi";
            if (!(i == 213 || i == 240)) {
                str2 = "xhdpi";
            }
        }
        return String.format(Locale.US, str, new Object[]{str2});
    }
}
