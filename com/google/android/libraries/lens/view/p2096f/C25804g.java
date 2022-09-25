package com.google.android.libraries.lens.view.p2096f;

import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.f.g */
/* compiled from: PG */
public final /* synthetic */ class C25804g implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Executor f70106a;

    public /* synthetic */ C25804g(Executor executor) {
        this.f70106a = executor;
    }

    public final void execute(Runnable runnable) {
        this.f70106a.execute(C47810es.m84977q(new C25805h(runnable)));
    }
}
