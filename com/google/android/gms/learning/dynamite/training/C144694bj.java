package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.util.C144005e;
import com.google.common.util.concurrent.C60916ec;

/* renamed from: com.google.android.gms.learning.dynamite.training.bj */
/* compiled from: PG */
public final /* synthetic */ class C144694bj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f391470a;

    /* renamed from: b */
    public final /* synthetic */ Context f391471b;

    public /* synthetic */ C144694bj(Throwable th, Context context) {
        this.f391470a = th;
        this.f391471b = context;
    }

    public final void run() {
        Throwable th = this.f391470a;
        Context context = this.f391471b;
        C60916ec ecVar = new C60916ec(th);
        C144005e.m234184a(context, ecVar);
        throw ecVar;
    }
}
