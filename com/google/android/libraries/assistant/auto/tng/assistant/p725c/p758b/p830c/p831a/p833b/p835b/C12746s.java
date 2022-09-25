package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.s */
/* compiled from: PG */
public final /* synthetic */ class C12746s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C12751x f39876a;

    /* renamed from: b */
    public final /* synthetic */ Intent f39877b;

    public /* synthetic */ C12746s(C12751x xVar, Intent intent) {
        this.f39876a = xVar;
        this.f39877b = intent;
    }

    public final Object call() {
        C12751x xVar = this.f39876a;
        return xVar.f39888c.getPackageManager().resolveActivity(this.f39877b, 0);
    }
}
