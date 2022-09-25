package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bl */
/* compiled from: PG */
public final /* synthetic */ class C76930bl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76534ab f212400a;

    public /* synthetic */ C76930bl(C76534ab abVar) {
        this.f212400a = abVar;
    }

    public final void accept(Object obj) {
        ((SettableFuture) obj).mo57356n(this.f212400a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
