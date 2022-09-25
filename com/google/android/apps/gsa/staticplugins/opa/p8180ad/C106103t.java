package com.google.android.apps.gsa.staticplugins.opa.p8180ad;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ad.t */
/* compiled from: PG */
public final class C106103t {
    /* renamed from: a */
    public static boolean m176757a(Context context) {
        if (!"samsung".equals(Build.MANUFACTURER.toLowerCase(Locale.US))) {
            return false;
        }
        Configuration configuration = context.getResources().getConfiguration();
        try {
            Class<?> cls = configuration.getClass();
            if (cls.getField("SEM_DESKTOP_MODE_ENABLED").getInt(cls) == cls.getField("semDesktopModeEnabled").getInt(configuration)) {
                return true;
            }
            return false;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
        }
    }
}
