package com.google.android.libraries.gsa.actionusermodel;

import com.google.protos.p4985f.p4986a.C64707q;
import com.google.protos.p4985f.p4986a.C64708r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.u */
/* compiled from: PG */
public final /* synthetic */ class C22149u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64707q f61095a;

    public /* synthetic */ C22149u(C64707q qVar) {
        this.f61095a = qVar;
    }

    public final void accept(Object obj) {
        C64707q qVar = this.f61095a;
        double doubleValue = ((Double) obj).doubleValue();
        qVar.copyOnWrite();
        C64708r rVar = (C64708r) qVar.instance;
        C64708r rVar2 = C64708r.f175399l;
        rVar.f175401a |= 16384;
        rVar.f175409i = doubleValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
