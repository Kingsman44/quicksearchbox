package com.google.android.apps.gsa.notificationlistener;

import android.content.ComponentName;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.notificationlistener.ac */
/* compiled from: PG */
public final /* synthetic */ class C83383ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C83384ad f227258a;

    public /* synthetic */ C83383ac(C83384ad adVar) {
        this.f227258a = adVar;
    }

    public final Object call() {
        C83384ad adVar = this.f227258a;
        synchronized (adVar.f227263e) {
            if (!adVar.mo76684b()) {
                return null;
            }
            if (C83391h.m132726f()) {
                adVar.f227266h = false;
                return null;
            }
            int i = adVar.f227264f + 1;
            adVar.f227264f = i;
            if (i > 5) {
                adVar.f227266h = false;
                return null;
            }
            ComponentName componentName = new ComponentName(adVar.f227260b, GsaNotificationListenerService.class);
            adVar.f227261c.setComponentEnabledSetting(componentName, 2, 1);
            adVar.f227261c.setComponentEnabledSetting(componentName, 1, 1);
            adVar.f227265g = adVar.f227262d.mo29165e(C47810es.m84978r(new C83383ac(adVar)), C83384ad.f227259a, TimeUnit.MILLISECONDS);
            return null;
        }
    }
}
