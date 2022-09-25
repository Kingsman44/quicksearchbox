package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.d.j */
/* compiled from: PG */
public final /* synthetic */ class C131227j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131230m f358852a;

    public /* synthetic */ C131227j(C131230m mVar) {
        this.f358852a = mVar;
    }

    public final Object apply(Object obj) {
        C131230m mVar = this.f358852a;
        C131222e eVar = (C131222e) obj;
        if ((eVar.f358841a & 4) != 0) {
            return eVar;
        }
        C131220c cVar = (C131220c) eVar.toBuilder();
        C63042fg b = C62950b.m95471b(mVar.f358856b);
        cVar.copyOnWrite();
        C131222e eVar2 = (C131222e) cVar.instance;
        b.getClass();
        eVar2.f358845e = b;
        eVar2.f358841a |= 4;
        return (C131222e) cVar.build();
    }
}
