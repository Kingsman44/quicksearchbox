package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.analytics.internal.k */
/* compiled from: PG */
public final class C142741k {

    /* renamed from: a */
    public final Context f387349a;

    /* renamed from: b */
    public final Context f387350b;

    public C142741k(Context context) {
        C143919bh.m233958a(context);
        Context applicationContext = context.getApplicationContext();
        C143919bh.m233971n(applicationContext, "Application context can't be null");
        this.f387349a = applicationContext;
        this.f387350b = applicationContext;
    }
}
