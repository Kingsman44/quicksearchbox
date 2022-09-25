package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107048a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107058b;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.assistant.p4016z.C53709bg;
import com.google.assistant.p4016z.C53710bh;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.c */
/* compiled from: PG */
public final /* synthetic */ class C106992c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f297997a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297998b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f297999c;

    /* renamed from: d */
    public final /* synthetic */ C106596h f298000d;

    public /* synthetic */ C106992c(C106989ao aoVar, C60870cx cxVar, C60870cx cxVar2, C106596h hVar) {
        this.f297997a = aoVar;
        this.f297998b = cxVar;
        this.f297999c = cxVar2;
        this.f298000d = hVar;
    }

    public final Object call() {
        C106989ao aoVar = this.f297997a;
        C60870cx cxVar = this.f297998b;
        C60870cx cxVar2 = this.f297999c;
        C106596h hVar = this.f298000d;
        C107048a aVar = aoVar.f297979b;
        List list = (List) C60856cj.m92909r(cxVar);
        List list2 = (List) C60856cj.m92909r(cxVar2);
        long j = hVar.f297215j;
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg a = aVar.mo95741a();
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        a.getClass();
        akVar.f140918d = a;
        akVar.f140915a |= 1;
        C53709bg bgVar = (C53709bg) C53710bh.f141001c.createBuilder();
        bgVar.copyOnWrite();
        C53710bh bhVar = (C53710bh) bgVar.instance;
        C62971cq cqVar = bhVar.f141003a;
        if (!cqVar.mo58948c()) {
            bhVar.f141003a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bhVar.f141003a);
        bgVar.copyOnWrite();
        C53710bh bhVar2 = (C53710bh) bgVar.instance;
        bhVar2.mo54009a();
        C62947c.addAll((Iterable) list2, (List) bhVar2.f141004b);
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        C53710bh bhVar3 = (C53710bh) bgVar.build();
        bhVar3.getClass();
        akVar2.f140917c = bhVar3;
        akVar2.f140916b = 5;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a |= 2;
        akVar3.f140919e = j;
        ((C107058b) aVar.f298089b.mo17428b()).mo95744a((C53686ak) ajVar.build());
        return C118826c.f331422a;
    }
}
