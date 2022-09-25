package com.google.lens.sdk;

import android.app.Activity;
import android.os.SystemClock;
import com.google.android.libraries.lens.p1995c.p1996a.C24079g;
import com.google.android.libraries.lens.p1995c.p1996a.C24081i;
import com.google.android.libraries.lens.p1995c.p1996a.C24092t;

/* renamed from: com.google.lens.sdk.d */
/* compiled from: PG */
public final /* synthetic */ class C62638d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LensApi f169138a;

    /* renamed from: b */
    public final /* synthetic */ Activity f169139b;

    /* renamed from: c */
    public final /* synthetic */ C62647m f169140c;

    public /* synthetic */ C62638d(LensApi lensApi, Activity activity, C62647m mVar) {
        this.f169138a = lensApi;
        this.f169139b = activity;
        this.f169140c = mVar;
    }

    public final void run() {
        LensApi lensApi = this.f169138a;
        Activity activity = this.f169139b;
        C62647m mVar = this.f169140c;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C24081i iVar = lensApi.f169110b;
        C62637c cVar = new C62637c(lensApi, mVar, elapsedRealtimeNanos, activity);
        C24092t.m44741a();
        iVar.mo29476e(new C24079g(iVar, cVar));
    }
}
