package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.shared.util.ap */
/* compiled from: PG */
public final class C90732ap {
    /* renamed from: a */
    public static final Intent m148195a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build());
        intent.addFlags(268435456);
        if (packageManager.resolveActivity(intent, 65536) != null) {
            return intent;
        }
        return new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("https").authority("play.google.com").path("/store/apps/details").appendQueryParameter("id", str).build());
    }
}
