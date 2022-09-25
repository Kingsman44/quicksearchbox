package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.x */
/* compiled from: PG */
public final /* synthetic */ class C78147x implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C78147x f215176a = new C78147x();

    private /* synthetic */ C78147x() {
    }

    public final void accept(Object obj) {
        ((C70862aj) obj).mo20122b(new RuntimeException("Consumer has to provide Client as part of NewConnection."));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
