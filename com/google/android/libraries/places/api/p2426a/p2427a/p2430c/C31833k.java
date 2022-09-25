package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.places.api.p2426a.p2427a.p2429b.C31786a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a.C31792b;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31861q;
import com.google.android.libraries.places.api.p2437b.C31862r;
import com.google.android.libraries.places.p2424a.p2425a.C31778i;
import com.google.common.p4552o.p4564j.C60009ae;
import com.google.common.p4552o.p4564j.C60012ah;
import com.google.common.p4552o.p4564j.C60017am;
import com.google.common.p4552o.p4564j.C60019ao;
import com.google.common.p4552o.p4564j.C60020ap;
import com.google.common.p4552o.p4564j.C60021aq;

/* renamed from: com.google.android.libraries.places.api.a.a.c.k */
/* compiled from: PG */
public final /* synthetic */ class C31833k implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C31836n f85448a;

    /* renamed from: b */
    public final /* synthetic */ C31861q f85449b;

    /* renamed from: c */
    public final /* synthetic */ long f85450c;

    public /* synthetic */ C31833k(C31836n nVar, C31861q qVar, long j) {
        this.f85448a = nVar;
        this.f85449b = qVar;
        this.f85450c = j;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31836n nVar = this.f85448a;
        C31861q qVar = this.f85449b;
        long j = this.f85450c;
        long c = nVar.f85457c.mo26871c();
        C31842a aVar = nVar.f85456b;
        int i = 1;
        if (true == abVar.mo122491j()) {
            i = 2;
        }
        C60017am amVar = (C60017am) C60019ao.f162222e.createBuilder();
        C60020ap apVar = (C60020ap) C60021aq.f162228b.createBuilder();
        apVar.mo57063a(C31792b.m59157b(qVar.mo37439b()));
        C60021aq aqVar = (C60021aq) apVar.build();
        amVar.copyOnWrite();
        C60019ao aoVar = (C60019ao) amVar.instance;
        aqVar.getClass();
        aoVar.f162227d = aqVar;
        aoVar.f162224a |= 8;
        amVar.copyOnWrite();
        C60019ao aoVar2 = (C60019ao) amVar.instance;
        aoVar2.f162224a |= 4;
        aoVar2.f162226c = (int) (c - j);
        amVar.copyOnWrite();
        C60019ao aoVar3 = (C60019ao) amVar.instance;
        aoVar3.f162225b = i - 1;
        aoVar3.f162224a |= 2;
        C60019ao aoVar4 = (C60019ao) amVar.build();
        C31786a aVar2 = (C31786a) aVar;
        C60009ae b = C31778i.m59135b(aVar2.f85409a);
        b.copyOnWrite();
        C60012ah ahVar = (C60012ah) b.instance;
        C60012ah ahVar2 = C60012ah.f162194m;
        ahVar.f162197b = 6;
        ahVar.f162196a |= 2;
        b.copyOnWrite();
        C60012ah ahVar3 = (C60012ah) b.instance;
        aoVar4.getClass();
        ahVar3.f162200e = aoVar4;
        ahVar3.f162196a |= 1024;
        String a = aVar2.f85410b.mo37400a();
        b.copyOnWrite();
        C60012ah ahVar4 = (C60012ah) b.instance;
        a.getClass();
        ahVar4.f162196a |= 1073741824;
        ahVar4.f162207l = a;
        aVar2.mo37386c((C60012ah) b.build());
        C31836n.m59198d(C31164au.m58092b("FindCurrentPlace"));
        return (C31862r) abVar.mo122488g();
    }
}
