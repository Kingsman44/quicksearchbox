package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9970e;

import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.e.f */
/* compiled from: PG */
public final /* synthetic */ class C131309f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C83730ab f358988a;

    public /* synthetic */ C131309f(C83730ab abVar) {
        this.f358988a = abVar;
    }

    public final void accept(Object obj) {
        C83730ab abVar = this.f358988a;
        C63088z zVar = (C63088z) obj;
        abVar.copyOnWrite();
        C83739ak akVar = (C83739ak) abVar.instance;
        C83739ak akVar2 = C83739ak.f228230q;
        zVar.getClass();
        akVar.f228232a |= 4096;
        akVar.f228245n = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
