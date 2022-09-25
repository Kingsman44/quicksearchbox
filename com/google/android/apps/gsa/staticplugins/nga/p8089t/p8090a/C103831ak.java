package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C103831ak implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f289083a;

    public /* synthetic */ C103831ak(C22871g gVar) {
        this.f289083a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f289083a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] NgaSyncDumper.readEventsFromDisk", new C103846az(runnable));
    }
}
