package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.places.api.p2426a.p2427a.p2429b.C31786a;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31862r;
import com.google.common.p4552o.p4564j.C60034i;
import com.google.common.p4552o.p4564j.C60035j;
import com.google.common.p4552o.p4564j.C60040o;
import com.google.common.p4552o.p4564j.C60043r;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C31809q implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C31810r f85428a;

    /* renamed from: b */
    public final /* synthetic */ long f85429b;

    public /* synthetic */ C31809q(C31810r rVar, long j) {
        this.f85428a = rVar;
        this.f85429b = j;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31810r rVar = this.f85428a;
        long j = this.f85429b;
        long c = rVar.f85433d.mo26871c();
        C31842a aVar = rVar.f85432c;
        int size = abVar.mo122491j() ? ((C31862r) abVar.mo122488g()).mo37443a().size() : 0;
        C60034i iVar = (C60034i) C60035j.f162271c.createBuilder();
        iVar.copyOnWrite();
        C60035j jVar = (C60035j) iVar.instance;
        jVar.f162273a |= 1;
        jVar.f162274b = size;
        C60035j jVar2 = (C60035j) iVar.build();
        C60040o oVar = (C60040o) C60043r.f162286h.createBuilder();
        oVar.copyOnWrite();
        C60043r rVar2 = (C60043r) oVar.instance;
        rVar2.f162289b = 3;
        rVar2.f162288a |= 1;
        oVar.copyOnWrite();
        C60043r rVar3 = (C60043r) oVar.instance;
        jVar2.getClass();
        rVar3.f162293f = jVar2;
        rVar3.f162288a |= 128;
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
        return (C31862r) abVar.mo122488g();
    }
}
