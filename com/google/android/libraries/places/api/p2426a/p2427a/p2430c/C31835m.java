package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.p2426a.p2427a.p2429b.C31786a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31793c;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31858n;
import com.google.android.libraries.places.api.p2437b.C31859o;
import com.google.android.libraries.places.p2424a.p2425a.C31778i;
import com.google.common.p4552o.p4564j.C60009ae;
import com.google.common.p4552o.p4564j.C60012ah;
import com.google.common.p4552o.p4564j.C60022ar;
import com.google.common.p4552o.p4564j.C60024at;
import com.google.common.p4552o.p4564j.C60044s;
import com.google.common.p4552o.p4564j.C60045t;
import com.google.common.p4552o.p4564j.C60050y;
import com.google.common.p4552o.p4564j.C60051z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.places.api.a.a.c.m */
/* compiled from: PG */
public final /* synthetic */ class C31835m implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C31836n f85453a;

    /* renamed from: b */
    public final /* synthetic */ C31858n f85454b;

    public /* synthetic */ C31835m(C31836n nVar, C31858n nVar2) {
        this.f85453a = nVar;
        this.f85454b = nVar2;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31836n nVar = this.f85453a;
        C31858n nVar2 = this.f85454b;
        C31842a aVar = nVar.f85456b;
        C60044s sVar = (C60044s) C60045t.f162295b.createBuilder();
        TypeFilter f = nVar2.mo37427f();
        if (f != null) {
            String a = C31793c.m59158a(f);
            sVar.copyOnWrite();
            C60045t tVar = (C60045t) sVar.instance;
            C62971cq cqVar = tVar.f162297a;
            if (!cqVar.mo58948c()) {
                tVar.f162297a = C62942bv.mutableCopy(cqVar);
            }
            tVar.f162297a.add(a);
        }
        C60045t tVar2 = (C60045t) sVar.build();
        C60050y yVar = (C60050y) C60051z.f162308c.createBuilder();
        if (tVar2 != null) {
            yVar.copyOnWrite();
            C60051z zVar = (C60051z) yVar.instance;
            zVar.f162311b = tVar2;
            zVar.f162310a |= 4;
        }
        C60051z zVar2 = (C60051z) yVar.build();
        C31786a aVar2 = (C31786a) aVar;
        C60022ar a2 = aVar2.mo37384a();
        a2.copyOnWrite();
        C60024at atVar = (C60024at) a2.instance;
        C60024at atVar2 = C60024at.f162232g;
        atVar.f162235b = 5;
        atVar.f162234a |= 1;
        a2.copyOnWrite();
        C60024at atVar3 = (C60024at) a2.instance;
        zVar2.getClass();
        atVar3.f162239f = zVar2;
        atVar3.f162234a |= 256;
        C60024at atVar4 = (C60024at) a2.build();
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
        String a3 = aVar2.f85410b.mo37400a();
        b.copyOnWrite();
        C60012ah ahVar4 = (C60012ah) b.instance;
        a3.getClass();
        ahVar4.f162196a |= 1073741824;
        ahVar4.f162207l = a3;
        AutocompleteSessionToken c = nVar2.mo37423c();
        if (c != null) {
            String parcelUuid = c.mo37477a().toString();
            b.copyOnWrite();
            C60012ah ahVar5 = (C60012ah) b.instance;
            parcelUuid.getClass();
            ahVar5.f162196a |= 33554432;
            ahVar5.f162204i = parcelUuid;
        }
        aVar2.mo37386c((C60012ah) b.build());
        C31836n.m59198d(C31164au.m58092b("FindAutocompletePredictions"));
        return (C31859o) abVar.mo122488g();
    }
}
