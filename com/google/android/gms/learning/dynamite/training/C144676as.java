package com.google.android.gms.learning.dynamite.training;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.gms.learning.dynamite.training.as */
/* compiled from: PG */
public final /* synthetic */ class C144676as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f391440a;

    /* renamed from: b */
    public final /* synthetic */ C144719o f391441b;

    public /* synthetic */ C144676as(C60870cx cxVar, C144719o oVar) {
        this.f391440a = cxVar;
        this.f391441b = oVar;
    }

    public final void run() {
        C60870cx cxVar = this.f391440a;
        C144719o oVar = this.f391441b;
        if (cxVar.isCancelled()) {
            InAppTrainingServiceImpl.m235158i(new C144683az(oVar));
        }
    }
}
