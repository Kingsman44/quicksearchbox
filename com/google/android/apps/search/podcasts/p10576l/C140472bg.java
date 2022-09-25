package com.google.android.apps.search.podcasts.p10576l;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import com.google.p4017at.p4082j.p4083a.C54425dx;

/* renamed from: com.google.android.apps.search.podcasts.l.bg */
/* compiled from: PG */
public final /* synthetic */ class C140472bg implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140488bw f381556a;

    /* renamed from: b */
    public final /* synthetic */ C54425dx f381557b;

    public /* synthetic */ C140472bg(C140488bw bwVar, C54425dx dxVar) {
        this.f381556a = bwVar;
        this.f381557b = dxVar;
    }

    public final Object apply(Object obj) {
        C140488bw bwVar = this.f381556a;
        C54425dx dxVar = this.f381557b;
        C140450al alVar = (C140450al) obj;
        C140448aj ajVar = (C140448aj) alVar.toBuilder();
        if (bwVar.f381579f) {
            C140440ab abVar = (C140440ab) C140441ac.f381485d.createBuilder();
            abVar.mo115674a(dxVar.f142932a);
            long b = bwVar.f381576c.mo26870b();
            abVar.copyOnWrite();
            ((C140441ac) abVar.instance).f381488b = b;
            abVar.copyOnWrite();
            ((C140441ac) abVar.instance).f381489c = false;
            ajVar.copyOnWrite();
            C140441ac acVar = (C140441ac) abVar.build();
            acVar.getClass();
            ((C140450al) ajVar.instance).f381515a = acVar;
            C140439aa aaVar = alVar.f381516b;
            if (aaVar == null) {
                aaVar = C140439aa.f381480d;
            }
            C140514z zVar = (C140514z) aaVar.toBuilder();
            zVar.copyOnWrite();
            ((C140439aa) zVar.instance).f381484c = false;
            ajVar.copyOnWrite();
            C140439aa aaVar2 = (C140439aa) zVar.build();
            aaVar2.getClass();
            ((C140450al) ajVar.instance).f381516b = aaVar2;
        }
        C140442ad adVar = (C140442ad) C140443ae.f381490d.createBuilder();
        C54362bo a = C54362bo.m87369a(dxVar.f142933b);
        if (a == null) {
            a = C54362bo.UNRECOGNIZED;
        }
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381492a = a.getNumber();
        long b2 = bwVar.f381576c.mo26870b();
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381493b = b2;
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381494c = false;
        ajVar.copyOnWrite();
        C140443ae aeVar = (C140443ae) adVar.build();
        aeVar.getClass();
        ((C140450al) ajVar.instance).f381519e = aeVar;
        long b3 = bwVar.f381576c.mo26870b();
        ajVar.copyOnWrite();
        ((C140450al) ajVar.instance).f381520f = b3;
        C140504p pVar = alVar.f381529o;
        if (pVar == null) {
            pVar = C140504p.f381619c;
        }
        C140503o oVar = (C140503o) pVar.toBuilder();
        boolean z = dxVar.f142934c;
        oVar.copyOnWrite();
        ((C140504p) oVar.instance).f381622b = !z;
        ajVar.copyOnWrite();
        C140504p pVar2 = (C140504p) oVar.build();
        pVar2.getClass();
        ((C140450al) ajVar.instance).f381529o = pVar2;
        return (C140450al) ajVar.build();
    }
}
