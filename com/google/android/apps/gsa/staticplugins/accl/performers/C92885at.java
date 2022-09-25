package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.assistant.p3994s.p3995a.C53099bi;
import com.google.assistant.p3994s.p3995a.C53106bp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.at */
/* compiled from: PG */
public final /* synthetic */ class C92885at implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C53099bi f259144a;

    public /* synthetic */ C92885at(C53099bi biVar) {
        this.f259144a = biVar;
    }

    public final void accept(Object obj) {
        C53099bi biVar = this.f259144a;
        String str = (String) obj;
        biVar.copyOnWrite();
        C53106bp bpVar = (C53106bp) biVar.instance;
        C53106bp bpVar2 = C53106bp.f139165f;
        str.getClass();
        bpVar.f139167a |= 8;
        bpVar.f139170d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
