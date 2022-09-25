package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.hj */
/* compiled from: PG */
public final /* synthetic */ class C104099hj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f289610a;

    public /* synthetic */ C104099hj(C22871g gVar) {
        this.f289610a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f289610a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] WebrefManifestFileGroupPopulator", new C104102hm(runnable));
    }
}
