package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import com.google.android.apps.gsa.nga.shared.p6345h.C81247al;
import com.google.android.apps.gsa.nga.shared.p6345h.C81250ao;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.i */
/* compiled from: PG */
public final /* synthetic */ class C103801i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81247al f289026a;

    public /* synthetic */ C103801i(C81247al alVar) {
        this.f289026a = alVar;
    }

    public final void accept(Object obj) {
        C81247al alVar = this.f289026a;
        String str = (String) obj;
        alVar.copyOnWrite();
        C81250ao aoVar = (C81250ao) alVar.instance;
        C81250ao aoVar2 = C81250ao.f222431i;
        str.getClass();
        C62971cq cqVar = aoVar.f222437e;
        if (!cqVar.mo58948c()) {
            aoVar.f222437e = C62942bv.mutableCopy(cqVar);
        }
        aoVar.f222437e.add(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
