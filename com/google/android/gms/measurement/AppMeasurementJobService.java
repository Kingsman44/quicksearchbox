package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.C145325dx;
import com.google.android.gms.measurement.internal.C145361ff;
import com.google.android.gms.measurement.internal.C145459iw;
import com.google.android.gms.measurement.internal.C145462iz;
import com.google.android.gms.measurement.internal.C145464ja;
import com.google.android.gms.measurement.internal.C145508x;

/* compiled from: PG */
public final class AppMeasurementJobService extends JobService implements C145462iz {

    /* renamed from: a */
    private C145464ja f392201a;

    /* renamed from: d */
    private final C145464ja m235785d() {
        if (this.f392201a == null) {
            this.f392201a = new C145464ja(this);
        }
        return this.f392201a;
    }

    /* renamed from: a */
    public final void mo120646a(Intent intent) {
    }

    /* renamed from: b */
    public final boolean mo120647b(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo120648c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final void onCreate() {
        super.onCreate();
        m235785d().mo121177b();
    }

    public final void onDestroy() {
        m235785d().mo121178c();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m235785d().mo121179d(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C145464ja d = m235785d();
        C145361ff i = C145361ff.m236186i(d.f393301a, (InitializationParams) null, (Long) null);
        C145325dx ar = i.mo120965ar();
        String string = jobParameters.getExtras().getString("action");
        C145508x xVar = i.f392936f;
        ar.f392803k.mo120895b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        d.mo121180e(new C145459iw(d, ar, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        m235785d().mo121181f(intent);
        return true;
    }
}
