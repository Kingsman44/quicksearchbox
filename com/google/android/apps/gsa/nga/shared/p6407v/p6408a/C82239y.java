package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.y */
/* compiled from: PG */
public final /* synthetic */ class C82239y implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f224743a;

    public /* synthetic */ C82239y(Context context) {
        this.f224743a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        ActivityManager activityManager = (ActivityManager) this.f224743a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return "undefined";
        }
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        if (j <= 1073741824) {
            return "1";
        }
        if (j <= 2147483648L) {
            return "2";
        }
        if (j <= 3221225472L) {
            return "3";
        }
        if (j <= 4294967296L) {
            return "4";
        }
        if (j <= 6442450944L) {
            return "6";
        }
        if (j <= 8589934592L) {
            return "8";
        }
        if (j <= 17179869184L) {
            return "16";
        }
        return "undefined";
    }
}
