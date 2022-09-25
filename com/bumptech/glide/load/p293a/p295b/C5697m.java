package com.bumptech.glide.load.p293a.p295b;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: com.bumptech.glide.load.a.b.m */
/* compiled from: PG */
public final class C5697m {

    /* renamed from: a */
    final Context f17165a;

    /* renamed from: b */
    final ActivityManager f17166b;

    /* renamed from: c */
    float f17167c = 1.0f;

    /* renamed from: d */
    public float f17168d = 0.4f;

    /* renamed from: e */
    final C5698n f17169e;

    public C5697m(Context context) {
        this.f17165a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f17166b = activityManager;
        this.f17169e = new C5698n(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f17167c = 0.0f;
        }
    }
}
