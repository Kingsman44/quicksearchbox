package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import com.google.protos.p4985f.p4986a.C64668av;
import com.google.protos.p4985f.p4986a.C64669aw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.k */
/* compiled from: PG */
public final /* synthetic */ class C114293k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64668av f316922a;

    public /* synthetic */ C114293k(C64668av avVar) {
        this.f316922a = avVar;
    }

    public final void accept(Object obj) {
        C64668av avVar = this.f316922a;
        long longValue = ((Long) obj).longValue();
        avVar.copyOnWrite();
        C64669aw awVar = (C64669aw) avVar.instance;
        C64669aw awVar2 = C64669aw.f175288e;
        awVar.f175290a |= 8;
        awVar.f175293d = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
