package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.common.p4552o.p4553a.C59489bm;
import com.google.common.p4552o.p4553a.C59490bn;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.an */
/* compiled from: PG */
public final /* synthetic */ class C75813an implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59489bm f210396a;

    public /* synthetic */ C75813an(C59489bm bmVar) {
        this.f210396a = bmVar;
    }

    public final void accept(Object obj) {
        C59489bm bmVar = this.f210396a;
        String str = (String) obj;
        bmVar.copyOnWrite();
        C59490bn bnVar = (C59490bn) bmVar.instance;
        C59490bn bnVar2 = C59490bn.f157833e;
        str.getClass();
        bnVar.f157835a |= 2;
        bnVar.f157837c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
