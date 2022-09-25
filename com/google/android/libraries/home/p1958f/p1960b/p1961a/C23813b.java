package com.google.android.libraries.home.p1958f.p1960b.p1961a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: com.google.android.libraries.home.f.b.a.b */
/* compiled from: PG */
public final class C23813b {

    /* renamed from: a */
    public static final /* synthetic */ int f65230a = 0;

    /* renamed from: b */
    private static final Uri f65231b = new Uri.Builder().scheme("https").authority("home.app.goo.gl").appendQueryParameter("apn", "com.google.android.apps.chromecast.app").build();

    /* renamed from: a */
    public static final Intent m44343a(Context context, Uri uri, int i) {
        int i2;
        try {
            i2 = context.getPackageManager().getPackageInfo("com.google.android.apps.chromecast.app", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        if (i2 > i) {
            return new Intent("android.intent.action.VIEW", uri).setPackage("com.google.android.apps.chromecast.app");
        }
        return new Intent("android.intent.action.VIEW", f65231b.buildUpon().appendQueryParameter("amv", Integer.toString(i)).appendQueryParameter("link", uri.toString()).build());
    }

    /* renamed from: b */
    public static final Intent m44344b(Context context, String str, String str2, int i) {
        return m44343a(context, C23812a.f65229b.buildUpon().appendPath("deviceSettings").appendQueryParameter("userEmail", str).appendQueryParameter("deviceId", str2).build(), i);
    }
}
