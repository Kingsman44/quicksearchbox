package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83774q;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83780w;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.k */
/* compiled from: PG */
public final /* synthetic */ class C131507k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C83774q f359364a;

    public /* synthetic */ C131507k(C83774q qVar) {
        this.f359364a = qVar;
    }

    public final void accept(Object obj) {
        C83774q qVar = this.f359364a;
        C83780w wVar = (C83780w) obj;
        qVar.copyOnWrite();
        C83781x xVar = (C83781x) qVar.instance;
        C83781x xVar2 = C83781x.f228356c;
        wVar.getClass();
        C62971cq cqVar = xVar.f228359b;
        if (!cqVar.mo58948c()) {
            xVar.f228359b = C62942bv.mutableCopy(cqVar);
        }
        xVar.f228359b.add(wVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
