package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.ix */
/* compiled from: PG */
public final /* synthetic */ class C145460ix implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145464ja f393290a;

    /* renamed from: b */
    public final /* synthetic */ int f393291b;

    /* renamed from: c */
    public final /* synthetic */ C145325dx f393292c;

    /* renamed from: d */
    public final /* synthetic */ Intent f393293d;

    public /* synthetic */ C145460ix(C145464ja jaVar, int i, C145325dx dxVar, Intent intent) {
        this.f393290a = jaVar;
        this.f393291b = i;
        this.f393292c = dxVar;
        this.f393293d = intent;
    }

    public final void run() {
        C145464ja jaVar = this.f393290a;
        int i = this.f393291b;
        C145325dx dxVar = this.f393292c;
        Intent intent = this.f393293d;
        if (((C145462iz) jaVar.f393301a).mo120647b(i)) {
            dxVar.f392803k.mo120895b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            jaVar.mo121176a().f392803k.mo120894a("Completed wakeful intent.");
            ((C145462iz) jaVar.f393301a).mo120646a(intent);
        }
    }
}
