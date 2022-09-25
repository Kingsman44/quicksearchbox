package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.places.api.p2426a.p2427a.p2429b.C31786a;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31859o;
import com.google.common.p4552o.p4564j.C60036k;
import com.google.common.p4552o.p4564j.C60037l;
import com.google.common.p4552o.p4564j.C60040o;
import com.google.common.p4552o.p4564j.C60043r;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C31805m implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C31810r f85424a;

    /* renamed from: b */
    public final /* synthetic */ long f85425b;

    public /* synthetic */ C31805m(C31810r rVar, long j) {
        this.f85424a = rVar;
        this.f85425b = j;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31810r rVar = this.f85424a;
        long j = this.f85425b;
        long c = rVar.f85433d.mo26871c();
        C31842a aVar = rVar.f85432c;
        int size = abVar.mo122491j() ? ((C31859o) abVar.mo122488g()).mo37433a().size() : 0;
        C60036k kVar = (C60036k) C60037l.f162275c.createBuilder();
        kVar.copyOnWrite();
        C60037l lVar = (C60037l) kVar.instance;
        lVar.f162277a |= 1;
        lVar.f162278b = size;
        C60037l lVar2 = (C60037l) kVar.build();
        C60040o oVar = (C60040o) C60043r.f162286h.createBuilder();
        oVar.copyOnWrite();
        C60043r rVar2 = (C60043r) oVar.instance;
        rVar2.f162289b = 5;
        rVar2.f162288a |= 1;
        oVar.copyOnWrite();
        C60043r rVar3 = (C60043r) oVar.instance;
        lVar2.getClass();
        rVar3.f162294g = lVar2;
        rVar3.f162288a |= 512;
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
        return (C31859o) abVar.mo122488g();
    }
}
