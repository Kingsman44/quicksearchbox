package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* renamed from: com.google.android.gms.measurement.internal.ja */
/* compiled from: PG */
public final class C145464ja {

    /* renamed from: a */
    public final Context f393301a;

    public C145464ja(Context context) {
        this.f393301a = context;
    }

    /* renamed from: a */
    public final C145325dx mo121176a() {
        return C145361ff.m236186i(this.f393301a, (InitializationParams) null, (Long) null).mo120965ar();
    }

    /* renamed from: b */
    public final void mo121177b() {
        C145361ff i = C145361ff.m236186i(this.f393301a, (InitializationParams) null, (Long) null);
        C145325dx ar = i.mo120965ar();
        C145508x xVar = i.f392936f;
        ar.f392803k.mo120894a("Local AppMeasurementService is starting up");
    }

    /* renamed from: c */
    public final void mo121178c() {
        C145361ff i = C145361ff.m236186i(this.f393301a, (InitializationParams) null, (Long) null);
        C145325dx ar = i.mo120965ar();
        C145508x xVar = i.f392936f;
        ar.f392803k.mo120894a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: d */
    public final void mo121179d(Intent intent) {
        if (intent == null) {
            mo121176a().f392795c.mo120894a("onRebind called with null intent");
            return;
        }
        mo121176a().f392803k.mo120895b("onRebind called. action", intent.getAction());
    }

    /* renamed from: e */
    public final void mo121180e(Runnable runnable) {
        C145488jy i = C145488jy.m236417i(this.f393301a);
        i.mo120966as().mo120960h(new C145461iy(i, runnable));
    }

    /* renamed from: f */
    public final void mo121181f(Intent intent) {
        if (intent == null) {
            mo121176a().f392795c.mo120894a("onUnbind called with null intent");
            return;
        }
        mo121176a().f392803k.mo120895b("onUnbind called for intent. action", intent.getAction());
    }
}
