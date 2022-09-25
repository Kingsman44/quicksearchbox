package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.setupcompat.p3549a.C45240c;

/* renamed from: com.google.android.h.a.b.a.e */
/* compiled from: PG */
public final class C146562e extends C146579j {

    /* renamed from: b */
    private final Context f395806b;

    public C146562e(Context context) {
        this.f395806b = context;
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("cbrand");
        this.f395862a.mo123374d("cbr");
        this.f395862a.mo123374d("cbrver");
        this.f395862a.mo123374d("cplatform");
        this.f395862a.mo123374d("cmodel");
        this.f395862a.mo123374d("cos");
        this.f395862a.mo123374d("cosver");
        this.f395862a.mo123374d(C45240c.f118157a);
        this.f395862a.mo123374d("cver");
        this.f395862a.mo123374d("cplayer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95070d() {
        String str;
        PackageInfo packageInfo;
        Context context = this.f395806b;
        if (C2612ak.m6959ai(context)) {
            str = "tv";
        } else {
            str = context.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp >= 540 ? "tablet" : "mobile";
        }
        String str2 = true != "tv".equals(str) ? "android" : "android_tv";
        Context applicationContext = this.f395806b.getApplicationContext();
        try {
            packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        String concat = String.valueOf((packageInfo == null || packageInfo.versionName == null) ? "Unknown" : packageInfo.versionName).concat("/E1.0.0-beta02");
        this.f395862a.mo123373c("cbrand", Uri.encode(Build.MANUFACTURER, ",:"));
        this.f395862a.mo123373c("cbr", Uri.encode(this.f395806b.getPackageName(), ",:"));
        this.f395862a.mo123373c("cbrver", Uri.encode(concat, ",:"));
        this.f395862a.mo123373c("cplatform", Uri.encode(str, ",:"));
        this.f395862a.mo123373c("cmodel", Uri.encode(Build.MODEL, ",:"));
        this.f395862a.mo123373c("cos", Uri.encode("Android", ",:"));
        this.f395862a.mo123373c("cosver", Uri.encode(Build.VERSION.RELEASE, ",:"));
        this.f395862a.mo123373c(C45240c.f118157a, Uri.encode(str2, ",:"));
        this.f395862a.mo123373c("cver", Uri.encode(concat, ",:"));
        this.f395862a.mo123373c("cplayer", Uri.encode("android_exoplayer_v2", ",:"));
    }
}
