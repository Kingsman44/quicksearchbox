package com.google.android.libraries.search.p2904c.p2964r.p2965a;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.search.c.r.a.a */
/* compiled from: PG */
public final /* synthetic */ class C37958a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f100573a;

    public /* synthetic */ C37958a(Context context) {
        this.f100573a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        ActivityManager activityManager = (ActivityManager) this.f100573a.getSystemService("activity");
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
        return j <= 17179869184L ? "16" : ">16";
    }
}
