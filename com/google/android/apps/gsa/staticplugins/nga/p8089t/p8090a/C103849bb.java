package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C103849bb implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C103868bu f289101a;

    public /* synthetic */ C103849bb(C103868bu buVar) {
        this.f289101a = buVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f289101a.f289135g;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] NgaSyncDumper.writeEventToDisk", new C103846az(runnable));
    }
}
