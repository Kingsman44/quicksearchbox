package com.google.android.apps.gsa.staticplugins.s3request.producers;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.n */
/* compiled from: PG */
public final /* synthetic */ class C116355n implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C116358q f322643a;

    public /* synthetic */ C116355n(C116358q qVar) {
        this.f322643a = qVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f322643a.f322647a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("getS3RequestSource", new C116356o(runnable));
    }
}
