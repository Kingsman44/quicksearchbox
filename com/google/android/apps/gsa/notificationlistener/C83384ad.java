package com.google.android.apps.gsa.notificationlistener;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.notificationlistener.ad */
/* compiled from: PG */
public final class C83384ad {

    /* renamed from: a */
    static final long f227259a = Duration.ofSeconds(2).toMillis();

    /* renamed from: b */
    public final Context f227260b;

    /* renamed from: c */
    public final PackageManager f227261c;

    /* renamed from: d */
    public final C60888db f227262d;

    /* renamed from: e */
    public final Object f227263e = new Object();

    /* renamed from: f */
    public int f227264f;

    /* renamed from: g */
    C60870cx f227265g;

    /* renamed from: h */
    public boolean f227266h;

    public C83384ad(Context context, PackageManager packageManager, C60888db dbVar) {
        this.f227260b = context;
        this.f227261c = packageManager;
        this.f227262d = dbVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo76683a() {
        synchronized (this.f227263e) {
            if (mo76684b()) {
                this.f227266h = false;
                C60870cx cxVar = this.f227265g;
                if (cxVar != null) {
                    cxVar.cancel(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo76684b() {
        boolean z;
        synchronized (this.f227263e) {
            z = this.f227266h;
        }
        return z;
    }
}
