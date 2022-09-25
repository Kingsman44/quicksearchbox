package com.google.android.apps.search.podcasts.widgets.p10627i;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.browser.p059a.C0963k;
import androidx.browser.p059a.C0964l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.i.a */
/* compiled from: PG */
public final class C141263a {

    /* renamed from: a */
    public static final /* synthetic */ int f383505a = 0;

    /* renamed from: b */
    private static final Uri f383506b = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.podcasts");

    /* renamed from: a */
    public static final boolean m229295a(Context context) {
        PackageInfo packageInfo;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(context, "context");
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.google.android.apps.podcasts", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m229296b(Context context) {
        C69664n.m101061g(context, "context");
        C0963k kVar = new C0963k();
        kVar.mo3588g(true);
        C0964l a = kVar.mo3582a();
        try {
            a.mo3590a(context, Uri.parse("market://details?id=com.google.android.apps.podcasts&referrer=utm_source%3Dgoogle_podcasts%26utm_campaign%3Din_app_promo"));
        } catch (ActivityNotFoundException unused) {
            a.mo3590a(context, f383506b);
        }
    }
}
