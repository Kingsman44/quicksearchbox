package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.r */
/* compiled from: PG */
public final /* synthetic */ class C113639r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113640s f314692a;

    public /* synthetic */ C113639r(C113640s sVar) {
        this.f314692a = sVar;
    }

    public final void accept(Object obj) {
        C113640s sVar = this.f314692a;
        String str = (String) obj;
        C113611x xVar = sVar.f314697e;
        C59071e eVar = C113613z.f314555a;
        C58976aa aaVar = C58975e.f156826a;
        xVar.f314553b.mo19704H(str, xVar.f314552a);
        sVar.f314696d.mo100355d(str, sVar.f314693a, sVar.f314694b, sVar.f314695c, sVar.f314697e);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
