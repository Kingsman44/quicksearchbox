package com.google.ads.interactivemedia.p367v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.p10725a.p10730b.C142676c;
import com.google.android.gms.p10725a.p10730b.C142677d;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aon */
/* compiled from: PG */
public final class aon {
    public final String deviceId;
    public final String idType;
    public final boolean isLimitedAdTracking;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aon(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            com.google.android.gms.a.b.c r0 = new com.google.android.gms.a.b.c
            r1 = 0
            java.lang.String r2 = ""
            r0.<init>(r2, r1)
            com.google.android.gms.a.b.c r0 = r3.getInfoFromPlayServices(r4)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r2 = "adid"
            goto L_0x0020
        L_0x0012:
            com.google.android.gms.a.b.c r0 = r3.getInfoFromContentResolver(r4)     // Catch:{ SettingNotFoundException -> 0x0019 }
            java.lang.String r2 = "afai"
            goto L_0x0020
        L_0x0019:
            java.lang.String r4 = "IMASDK"
            java.lang.String r1 = "Failed to get advertising ID."
            android.util.Log.w(r4, r1)
        L_0x0020:
            r3.idType = r2
            java.lang.String r4 = r0.f387158a
            r3.deviceId = r4
            boolean r4 = r0.f387159b
            r3.isLimitedAdTracking = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aon.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public C142676c getInfoFromContentResolver(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = Settings.Secure.getString(contentResolver, "advertising_id");
        boolean z = true;
        if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
            z = false;
        }
        return new C142676c(string, z);
    }

    /* access modifiers changed from: protected */
    public C142676c getInfoFromPlayServices(Context context) {
        return C142677d.m231497b(context);
    }
}
