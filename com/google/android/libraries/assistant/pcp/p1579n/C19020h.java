package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.android.libraries.assistant.pcp.p1578m.C18983m;
import com.google.android.libraries.assistant.pcp.p1578m.C18984n;
import com.google.android.libraries.assistant.pcp.p1578m.C18985o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.n.h */
/* compiled from: PG */
public final /* synthetic */ class C19020h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18984n f53404a;

    public /* synthetic */ C19020h(C18984n nVar) {
        this.f53404a = nVar;
    }

    public final void accept(Object obj) {
        C18984n nVar = this.f53404a;
        C18983m mVar = (C18983m) obj;
        nVar.copyOnWrite();
        C18985o oVar = (C18985o) nVar.instance;
        C18985o oVar2 = C18985o.f53347b;
        mVar.getClass();
        oVar.mo24235a();
        oVar.f53349a.add(mVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
