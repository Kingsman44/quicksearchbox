package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ek */
/* compiled from: PG */
public final /* synthetic */ class C79282ek implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f217754a;

    public /* synthetic */ C79282ek(C22871g gVar) {
        this.f217754a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f217754a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA]: TeleportAnswering", new C79274ec(runnable));
    }
}
