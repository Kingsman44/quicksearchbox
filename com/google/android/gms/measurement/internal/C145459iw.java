package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.iw */
/* compiled from: PG */
public final /* synthetic */ class C145459iw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145464ja f393287a;

    /* renamed from: b */
    public final /* synthetic */ C145325dx f393288b;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f393289c;

    public /* synthetic */ C145459iw(C145464ja jaVar, C145325dx dxVar, JobParameters jobParameters) {
        this.f393287a = jaVar;
        this.f393288b = dxVar;
        this.f393289c = jobParameters;
    }

    public final void run() {
        C145464ja jaVar = this.f393287a;
        C145325dx dxVar = this.f393288b;
        JobParameters jobParameters = this.f393289c;
        dxVar.f392803k.mo120894a("AppMeasurementJobService processed last upload request.");
        ((C145462iz) jaVar.f393301a).mo120648c(jobParameters);
    }
}
