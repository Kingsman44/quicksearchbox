package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.p4449cd.p4456g.C57981b;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.cq */
/* compiled from: PG */
public final /* synthetic */ class C103581cq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Executor f288576a;

    /* renamed from: b */
    public final /* synthetic */ C57981b f288577b;

    public /* synthetic */ C103581cq(Executor executor, C57981b bVar) {
        this.f288576a = executor;
        this.f288577b = bVar;
    }

    public final void run() {
        Executor executor = this.f288576a;
        C57981b bVar = this.f288577b;
        Objects.requireNonNull(bVar);
        executor.execute(new C103583cs(bVar));
    }
}
