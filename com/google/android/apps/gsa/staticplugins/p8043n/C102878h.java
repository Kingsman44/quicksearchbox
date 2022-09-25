package com.google.android.apps.gsa.staticplugins.p8043n;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.h */
/* compiled from: PG */
public final /* synthetic */ class C102878h implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f287319a;

    public /* synthetic */ C102878h(C22871g gVar) {
        this.f287319a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f287319a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("AudioMessageWorker background task", new C102881k(runnable));
    }
}
