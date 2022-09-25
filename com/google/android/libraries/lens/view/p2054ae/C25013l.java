package com.google.android.libraries.lens.view.p2054ae;

import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.ae.l */
/* compiled from: PG */
public final /* synthetic */ class C25013l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25021t f68210a;

    public /* synthetic */ C25013l(C25021t tVar) {
        this.f68210a = tVar;
    }

    public final void run() {
        C25021t tVar = this.f68210a;
        Executor executor = tVar.f68225c;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C25018q(tVar)))));
    }
}
