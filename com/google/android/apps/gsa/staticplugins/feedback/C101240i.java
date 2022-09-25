package com.google.android.apps.gsa.staticplugins.feedback;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.i */
/* compiled from: PG */
public final /* synthetic */ class C101240i implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f282531a;

    /* renamed from: b */
    public final /* synthetic */ String f282532b = "Release lock on RemoteWorkDataClient";

    public /* synthetic */ C101240i(C22871g gVar) {
        this.f282531a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f282531a;
        String str = this.f282532b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l(str, new C101242k(runnable));
    }
}
