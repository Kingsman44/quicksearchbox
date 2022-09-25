package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.y */
/* compiled from: PG */
public final /* synthetic */ class C117454y implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C117350ai f326011a;

    public /* synthetic */ C117454y(C117350ai aiVar) {
        this.f326011a = aiVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f326011a.f325760j;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("Create local channel", new C117437r(runnable));
    }
}
