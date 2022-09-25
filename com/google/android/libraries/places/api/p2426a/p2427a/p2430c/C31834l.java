package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.p2426a.p2427a.p2429b.C31786a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31792b;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31855k;
import com.google.android.libraries.places.api.p2437b.C31856l;
import com.google.android.libraries.places.p2424a.p2425a.C31778i;
import com.google.common.p4552o.p4564j.C60009ae;
import com.google.common.p4552o.p4564j.C60012ah;
import com.google.common.p4552o.p4564j.C60013ai;
import com.google.common.p4552o.p4564j.C60014aj;
import com.google.common.p4552o.p4564j.C60020ap;
import com.google.common.p4552o.p4564j.C60021aq;
import com.google.common.p4552o.p4564j.C60022ar;
import com.google.common.p4552o.p4564j.C60024at;

/* renamed from: com.google.android.libraries.places.api.a.a.c.l */
/* compiled from: PG */
public final /* synthetic */ class C31834l implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C31836n f85451a;

    /* renamed from: b */
    public final /* synthetic */ C31855k f85452b;

    public /* synthetic */ C31834l(C31836n nVar, C31855k kVar) {
        this.f85451a = nVar;
        this.f85452b = kVar;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31836n nVar = this.f85451a;
        C31855k kVar = this.f85452b;
        C31842a aVar = nVar.f85456b;
        C60013ai aiVar = (C60013ai) C60014aj.f162211d.createBuilder();
        aiVar.copyOnWrite();
        C60014aj ajVar = (C60014aj) aiVar.instance;
        ajVar.f162213a |= 2;
        ajVar.f162214b = 1;
        C60020ap apVar = (C60020ap) C60021aq.f162228b.createBuilder();
        apVar.mo57063a(C31792b.m59157b(kVar.mo37409d()));
        C60021aq aqVar = (C60021aq) apVar.build();
        aiVar.copyOnWrite();
        C60014aj ajVar2 = (C60014aj) aiVar.instance;
        aqVar.getClass();
        ajVar2.f162215c = aqVar;
        ajVar2.f162213a |= 4;
        C60014aj ajVar3 = (C60014aj) aiVar.build();
        C31786a aVar2 = (C31786a) aVar;
        C60022ar a = aVar2.mo37384a();
        a.copyOnWrite();
        C60024at atVar = (C60024at) a.instance;
        C60024at atVar2 = C60024at.f162232g;
        atVar.f162235b = 4;
        atVar.f162234a |= 1;
        a.copyOnWrite();
        C60024at atVar3 = (C60024at) a.instance;
        ajVar3.getClass();
        atVar3.f162238e = ajVar3;
        atVar3.f162234a |= 128;
        C60024at atVar4 = (C60024at) a.build();
        C60009ae b = C31778i.m59135b(aVar2.f85409a);
        b.copyOnWrite();
        C60012ah ahVar = (C60012ah) b.instance;
        C60012ah ahVar2 = C60012ah.f162194m;
        ahVar.f162197b = 1;
        ahVar.f162196a |= 2;
        b.copyOnWrite();
        C60012ah ahVar3 = (C60012ah) b.instance;
        atVar4.getClass();
        ahVar3.f162199d = atVar4;
        ahVar3.f162196a |= 64;
        String a2 = aVar2.f85410b.mo37400a();
        b.copyOnWrite();
        C60012ah ahVar4 = (C60012ah) b.instance;
        a2.getClass();
        ahVar4.f162196a |= 1073741824;
        ahVar4.f162207l = a2;
        AutocompleteSessionToken b2 = kVar.mo37407b();
        if (b2 != null) {
            String parcelUuid = b2.mo37477a().toString();
            b.copyOnWrite();
            C60012ah ahVar5 = (C60012ah) b.instance;
            parcelUuid.getClass();
            ahVar5.f162196a |= 33554432;
            ahVar5.f162204i = parcelUuid;
        }
        aVar2.mo37386c((C60012ah) b.build());
        C31836n.m59198d(C31164au.m58092b("FetchPlace"));
        return (C31856l) abVar.mo122488g();
    }
}
