package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a;

import com.google.assistant.p3860as.C49802p;
import com.google.assistant.p3886c.C50841m;
import com.google.assistant.p3886c.C50842n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130798a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50841m f358038a;

    public /* synthetic */ C130798a(C50841m mVar) {
        this.f358038a = mVar;
    }

    public final void accept(Object obj) {
        C50841m mVar = this.f358038a;
        C49802p pVar = (C49802p) obj;
        mVar.copyOnWrite();
        C50842n nVar = (C50842n) mVar.instance;
        C50842n nVar2 = C50842n.f132378f;
        pVar.getClass();
        nVar.f132381b = pVar;
        nVar.f132380a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
