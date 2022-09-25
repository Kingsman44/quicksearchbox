package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.an.ad */
/* compiled from: PG */
public final /* synthetic */ class C25366ad implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Executor f69094a;

    public /* synthetic */ C25366ad(Executor executor) {
        this.f69094a = executor;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f69094a;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C25365ac(runnable)))));
    }
}
