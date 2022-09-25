package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.gms.learning.dynamite.training.at */
/* compiled from: PG */
public final /* synthetic */ class C144677at implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f391442a;

    /* renamed from: b */
    public final /* synthetic */ Context f391443b;

    public /* synthetic */ C144677at(C60870cx cxVar, Context context) {
        this.f391442a = cxVar;
        this.f391443b = context;
    }

    public final void run() {
        InAppTrainingServiceImpl.m235157b(this.f391442a, this.f391443b);
    }
}
