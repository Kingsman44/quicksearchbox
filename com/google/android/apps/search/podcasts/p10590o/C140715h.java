package com.google.android.apps.search.podcasts.p10590o;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.p4017at.p4082j.p4083a.C54439ek;
import com.google.p4017at.p4082j.p4083a.C54440el;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.podcasts.o.h */
/* compiled from: PG */
public final /* synthetic */ class C140715h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140725r f382134a;

    /* renamed from: b */
    public final /* synthetic */ C140706ag f382135b;

    public /* synthetic */ C140715h(C140725r rVar, C140706ag agVar) {
        this.f382134a = rVar;
        this.f382135b = agVar;
    }

    public final Object apply(Object obj) {
        C140725r rVar = this.f382134a;
        C140706ag agVar = this.f382135b;
        C140732y yVar = (C140732y) obj;
        C63042fg i = C62953e.m95484i(rVar.f382153e.mo26870b());
        C140731x xVar = (C140731x) yVar.toBuilder();
        C140704ae aeVar = yVar.f382166a;
        if (aeVar == null) {
            aeVar = C140704ae.f382118b;
        }
        C140702ac acVar = (C140702ac) aeVar.toBuilder();
        C140708ai.m228498a(acVar, agVar);
        xVar.copyOnWrite();
        C140704ae aeVar2 = (C140704ae) acVar.build();
        aeVar2.getClass();
        ((C140732y) xVar.instance).f382166a = aeVar2;
        C140730w wVar = yVar.f382167b;
        if (wVar == null) {
            wVar = C140730w.f382160c;
        }
        C140729v vVar = (C140729v) wVar.toBuilder();
        C54439ek ekVar = (C54439ek) C54440el.f142961d.createBuilder();
        ekVar.copyOnWrite();
        i.getClass();
        ((C54440el) ekVar.instance).f142965c = i;
        C54394ct ctVar = agVar.f382123a;
        if (ctVar == null) {
            ctVar = C54394ct.f142866c;
        }
        ekVar.copyOnWrite();
        ctVar.getClass();
        ((C54440el) ekVar.instance).f142963a = ctVar;
        C54397cw a = C54397cw.m87374a(agVar.f382124b);
        if (a == null) {
            a = C54397cw.UNRECOGNIZED;
        }
        ekVar.copyOnWrite();
        ((C54440el) ekVar.instance).f142964b = a.getNumber();
        vVar.copyOnWrite();
        C140730w wVar2 = (C140730w) vVar.instance;
        C54440el elVar = (C54440el) ekVar.build();
        elVar.getClass();
        wVar2.mo115844a();
        wVar2.f382162a.add(elVar);
        xVar.copyOnWrite();
        C140730w wVar3 = (C140730w) vVar.build();
        wVar3.getClass();
        ((C140732y) xVar.instance).f382167b = wVar3;
        return (C140732y) xVar.build();
    }
}
