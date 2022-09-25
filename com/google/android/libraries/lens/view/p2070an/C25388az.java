package com.google.android.libraries.lens.view.p2070an;

import android.app.ActivityManager;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.lens.view.an.az */
/* compiled from: PG */
public final /* synthetic */ class C25388az implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C25429ba f69162a;

    public /* synthetic */ C25388az(C25429ba baVar) {
        this.f69162a = baVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        ActivityManager activityManager = (ActivityManager) this.f69162a.f69302a.getSystemService("activity");
        activityManager.getClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem / 1000000);
    }
}
