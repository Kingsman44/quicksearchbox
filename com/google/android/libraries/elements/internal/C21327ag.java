package com.google.android.libraries.elements.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: com.google.android.libraries.elements.internal.ag */
/* compiled from: PG */
public final class C21327ag {
    /* renamed from: a */
    public static boolean m40334a(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
