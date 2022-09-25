package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.q */
/* compiled from: PG */
public final /* synthetic */ class C12744q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C12751x f39873a;

    /* renamed from: b */
    public final /* synthetic */ Intent f39874b;

    public /* synthetic */ C12744q(C12751x xVar, Intent intent) {
        this.f39873a = xVar;
        this.f39874b = intent;
    }

    public final Object call() {
        C12751x xVar = this.f39873a;
        return xVar.f39888c.getPackageManager().resolveService(this.f39874b, 0);
    }
}
