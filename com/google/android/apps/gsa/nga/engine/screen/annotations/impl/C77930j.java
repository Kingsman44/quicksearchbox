package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.j */
/* compiled from: PG */
public final /* synthetic */ class C77930j implements Executor {

    /* renamed from: a */
    public final /* synthetic */ ScreenAnnotationEngineImpl f214668a;

    public /* synthetic */ C77930j(ScreenAnnotationEngineImpl screenAnnotationEngineImpl) {
        this.f214668a = screenAnnotationEngineImpl;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f214668a.f214637i;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] ScreenAnnotationEngine.parseAndAnnotate", new C77928h(runnable));
    }
}
