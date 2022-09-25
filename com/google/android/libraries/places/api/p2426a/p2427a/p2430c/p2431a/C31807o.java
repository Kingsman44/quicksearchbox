package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.places.api.p2426a.p2427a.p2429b.C31786a;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31856l;
import com.google.common.p4552o.p4564j.C60038m;
import com.google.common.p4552o.p4564j.C60039n;
import com.google.common.p4552o.p4564j.C60040o;
import com.google.common.p4552o.p4564j.C60043r;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.o */
/* compiled from: PG */
public final /* synthetic */ class C31807o implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C31810r f85426a;

    /* renamed from: b */
    public final /* synthetic */ long f85427b;

    public /* synthetic */ C31807o(C31810r rVar, long j) {
        this.f85426a = rVar;
        this.f85427b = j;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31810r rVar = this.f85426a;
        long j = this.f85427b;
        long c = rVar.f85433d.mo26871c();
        C31842a aVar = rVar.f85432c;
        boolean j2 = abVar.mo122491j();
        C60038m mVar = (C60038m) C60039n.f162279d.createBuilder();
        mVar.copyOnWrite();
        C60039n nVar = (C60039n) mVar.instance;
        nVar.f162281a |= 1;
        nVar.f162282b = 1;
        mVar.copyOnWrite();
        C60039n nVar2 = (C60039n) mVar.instance;
        nVar2.f162281a |= 2;
        nVar2.f162283c = j2 ? 1 : 0;
        C60039n nVar3 = (C60039n) mVar.build();
        C60040o oVar = (C60040o) C60043r.f162286h.createBuilder();
        oVar.copyOnWrite();
        C60043r rVar2 = (C60043r) oVar.instance;
        rVar2.f162289b = 7;
        rVar2.f162288a |= 1;
        oVar.copyOnWrite();
        C60043r rVar3 = (C60043r) oVar.instance;
        nVar3.getClass();
        rVar3.f162292e = nVar3;
        rVar3.f162288a |= 32;
        int d = C31786a.m59143d(abVar);
        oVar.copyOnWrite();
        C60043r rVar4 = (C60043r) oVar.instance;
        rVar4.f162290c = d - 1;
        rVar4.f162288a |= 2;
        oVar.copyOnWrite();
        C60043r rVar5 = (C60043r) oVar.instance;
        rVar5.f162288a |= 4;
        rVar5.f162291d = (int) (c - j);
        ((C31786a) aVar).mo37385b((C60043r) oVar.build());
        return (C31856l) abVar.mo122488g();
    }
}
