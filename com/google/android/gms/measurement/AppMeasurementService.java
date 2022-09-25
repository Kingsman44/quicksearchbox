package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.C145325dx;
import com.google.android.gms.measurement.internal.C145361ff;
import com.google.android.gms.measurement.internal.C145379fx;
import com.google.android.gms.measurement.internal.C145460ix;
import com.google.android.gms.measurement.internal.C145462iz;
import com.google.android.gms.measurement.internal.C145464ja;
import com.google.android.gms.measurement.internal.C145488jy;
import com.google.android.gms.measurement.internal.C145508x;

/* compiled from: PG */
public final class AppMeasurementService extends Service implements C145462iz {

    /* renamed from: a */
    private C145464ja f392203a;

    /* renamed from: d */
    private final C145464ja m235789d() {
        if (this.f392203a == null) {
            this.f392203a = new C145464ja(this);
        }
        return this.f392203a;
    }

    /* renamed from: a */
    public final void mo120646a(Intent intent) {
        AppMeasurementReceiver.m6237a(intent);
    }

    /* renamed from: b */
    public final boolean mo120647b(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: c */
    public final void mo120648c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        C145464ja d = m235789d();
        if (intent == null) {
            d.mo121176a().f392795c.mo120894a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C145379fx(C145488jy.m236417i(d.f393301a));
        }
        d.mo121176a().f392798f.mo120895b("onBind received unknown action", action);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        m235789d().mo121177b();
    }

    public final void onDestroy() {
        m235789d().mo121178c();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m235789d().mo121179d(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C145464ja d = m235789d();
        C145361ff i3 = C145361ff.m236186i(d.f393301a, (InitializationParams) null, (Long) null);
        C145325dx ar = i3.mo120965ar();
        if (intent == null) {
            ar.f392798f.mo120894a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        C145508x xVar = i3.f392936f;
        ar.f392803k.mo120896c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        d.mo121180e(new C145460ix(d, i2, ar, intent));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        m235789d().mo121181f(intent);
        return true;
    }
}
