package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.pm.PackageManager;
import android.os.Binder;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.u */
/* compiled from: PG */
public final class C109193u {
    /* renamed from: a */
    public static boolean m181710a(PackageManager packageManager) {
        return "com.google.android.googlequicksearchbox".equals(packageManager.getNameForUid(Binder.getCallingUid()));
    }
}
