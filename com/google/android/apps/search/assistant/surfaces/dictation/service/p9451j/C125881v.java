package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.v */
/* compiled from: PG */
public final /* synthetic */ class C125881v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125884y f346944a;

    public /* synthetic */ C125881v(C125884y yVar) {
        this.f346944a = yVar;
    }

    public final void accept(Object obj) {
        C125884y yVar = this.f346944a;
        Throwable th = (Throwable) obj;
        yVar.f346949b.mo107532b(C125884y.m205874e(C63122a.FAILURE_SHUTDOWN_ERROR));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
