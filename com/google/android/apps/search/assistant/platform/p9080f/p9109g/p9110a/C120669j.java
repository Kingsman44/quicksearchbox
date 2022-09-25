package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.apps.tiktok.tracing.C47810es;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.j */
/* compiled from: PG */
public final /* synthetic */ class C120669j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C120672m f335632a;

    /* renamed from: b */
    public final /* synthetic */ C120678r f335633b;

    public /* synthetic */ C120669j(C120672m mVar, C120678r rVar) {
        this.f335632a = mVar;
        this.f335633b = rVar;
    }

    public final void accept(Object obj) {
        C120672m mVar = this.f335632a;
        mVar.f335637a.execute(C47810es.m84977q(new C120663d(mVar, this.f335633b, (C33461o) obj)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
