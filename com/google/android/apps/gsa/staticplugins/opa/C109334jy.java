package com.google.android.apps.gsa.staticplugins.opa;

import android.net.Uri;
import android.provider.SettingsSlicesContract;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jy */
/* compiled from: PG */
public final /* synthetic */ class C109334jy {
    /* renamed from: a */
    public static Uri m182002a(String str) {
        return SettingsSlicesContract.BASE_URI.buildUpon().appendPath("action").appendPath(str).build();
    }
}
