package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.ch */
/* compiled from: PG */
public final /* synthetic */ class C106927ch implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297849a;

    public /* synthetic */ C106927ch(C106941cv cvVar) {
        this.f297849a = cvVar;
    }

    public final void accept(Object obj) {
        C130701b bVar = (C130701b) obj;
        ((C58970a) ((C58970a) this.f297849a.f297873a.mo56224b()).mo56372aa(23414)).mo56359L("%s - Category: %s, Score: %f", bVar.mo109797h(), bVar.mo109795f().map(C106936cq.f297866a).orElse("Empty"), Double.valueOf(bVar.mo109791a()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
