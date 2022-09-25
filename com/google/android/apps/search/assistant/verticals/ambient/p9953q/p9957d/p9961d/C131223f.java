package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d;

import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.d.f */
/* compiled from: PG */
public final /* synthetic */ class C131223f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131230m f358847a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f358848b;

    public /* synthetic */ C131223f(C131230m mVar, C50794cr crVar) {
        this.f358847a = mVar;
        this.f358848b = crVar;
    }

    public final Object apply(Object obj) {
        C131230m mVar = this.f358847a;
        C50794cr crVar = this.f358848b;
        C131222e eVar = (C131222e) obj;
        if (mVar.mo110119a(crVar, eVar)) {
            Instant a = mVar.f358856b.mo57444a();
            if (mVar.mo110120b(a, crVar, eVar)) {
                return eVar;
            }
            int i = crVar.f132222T;
            C62995dn dnVar = eVar.f358842b;
            Integer valueOf = Integer.valueOf(i);
            int intValue = dnVar.containsKey(valueOf) ? ((Integer) dnVar.get(valueOf)).intValue() : 0;
            C131220c cVar = (C131220c) eVar.toBuilder();
            int i2 = crVar.f132222T;
            int i3 = intValue + 1;
            cVar.copyOnWrite();
            C131222e eVar2 = (C131222e) cVar.instance;
            C62995dn dnVar2 = eVar2.f358842b;
            if (!dnVar2.f170058b) {
                eVar2.f358842b = dnVar2.mo58980a();
            }
            eVar2.f358842b.put(Integer.valueOf(i2), Integer.valueOf(i3));
            C63042fg c = C62950b.m95472c(a);
            cVar.copyOnWrite();
            C131222e eVar3 = (C131222e) cVar.instance;
            c.getClass();
            eVar3.f358843c = c;
            eVar3.f358841a |= 1;
            cVar.copyOnWrite();
            C131222e eVar4 = (C131222e) cVar.instance;
            eVar4.f358844d = crVar.f132222T;
            eVar4.f358841a |= 2;
            return (C131222e) cVar.build();
        }
        throw new C131229l();
    }
}
