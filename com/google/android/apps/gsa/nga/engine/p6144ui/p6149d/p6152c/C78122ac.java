package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.ac */
/* compiled from: PG */
public final /* synthetic */ class C78122ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f215122a;

    public /* synthetic */ C78122ac(Throwable th) {
        this.f215122a = th;
    }

    public final void accept(Object obj) {
        ((C70862aj) obj).mo20122b(new RuntimeException("Closing connection due to request stream error", this.f215122a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
