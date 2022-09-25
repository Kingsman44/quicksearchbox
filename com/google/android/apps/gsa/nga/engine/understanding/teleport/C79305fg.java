package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fg */
/* compiled from: PG */
public final /* synthetic */ class C79305fg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79326x f217799a;

    public /* synthetic */ C79305fg(C79326x xVar) {
        this.f217799a = xVar;
    }

    public final void accept(Object obj) {
        this.f217799a.mo73900a(String.format("ABORT - Matched entity [%s] is blacklisted.", new Object[]{(String) obj}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
