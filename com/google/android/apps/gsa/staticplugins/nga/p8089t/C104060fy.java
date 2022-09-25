package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fy */
/* compiled from: PG */
public final /* synthetic */ class C104060fy implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C104066gd f289537a;

    public /* synthetic */ C104060fy(C104066gd gdVar) {
        this.f289537a = gdVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f289537a.f289543a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] NgaSotConfigsCleanupTask.getAllRelevantKeys.transformAndMerge", new C104064gb(runnable));
    }
}
