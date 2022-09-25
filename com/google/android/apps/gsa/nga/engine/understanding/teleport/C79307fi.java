package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fi */
/* compiled from: PG */
public final /* synthetic */ class C79307fi implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79326x f217801a;

    public /* synthetic */ C79307fi(C79326x xVar) {
        this.f217801a = xVar;
    }

    public final void accept(Object obj) {
        this.f217801a.mo73900a(String.format("ABORT - Matched entity has collection [%s] which is blacklisted.", new Object[]{(String) obj}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
