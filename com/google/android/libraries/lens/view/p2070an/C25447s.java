package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.view.connectivity.C25749c;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.an.s */
/* compiled from: PG */
public final /* synthetic */ class C25447s implements C25749c {

    /* renamed from: a */
    public final /* synthetic */ C25453y f69329a;

    /* renamed from: b */
    public final /* synthetic */ Executor f69330b;

    public /* synthetic */ C25447s(C25453y yVar, Executor executor) {
        this.f69329a = yVar;
        this.f69330b = executor;
    }

    /* renamed from: a */
    public final void mo30486a(boolean z) {
        this.f69330b.execute(C47810es.m84977q(new C25446r(this.f69329a)));
    }
}
