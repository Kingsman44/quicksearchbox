package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C103860bm implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C103868bu f289120a;

    public /* synthetic */ C103860bm(C103868bu buVar) {
        this.f289120a = buVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f289120a.f289134f;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] NgaSyncDumper.buildEvent.merge", new C103846az(runnable));
    }
}
