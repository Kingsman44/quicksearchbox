package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a;

import com.google.android.apps.search.assistant.verticals.ambient.p9916f.C130606b;
import com.google.assistant.p3860as.C49752ao;
import com.google.assistant.p3886c.C50841m;
import com.google.assistant.p3886c.C50842n;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130799b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50841m f358039a;

    public /* synthetic */ C130799b(C50841m mVar) {
        this.f358039a = mVar;
    }

    public final void accept(Object obj) {
        C50841m mVar = this.f358039a;
        C130606b bVar = (C130606b) obj;
        C49752ao aoVar = (C49752ao) bVar.mo109742b();
        mVar.copyOnWrite();
        C50842n nVar = (C50842n) mVar.instance;
        C50842n nVar2 = C50842n.f132378f;
        aoVar.getClass();
        nVar.f132382c = aoVar;
        nVar.f132380a |= 2;
        long b = C62953e.m95477b(bVar.mo109741a());
        mVar.copyOnWrite();
        C50842n nVar3 = (C50842n) mVar.instance;
        nVar3.f132380a |= 16;
        nVar3.f132384e = b;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
