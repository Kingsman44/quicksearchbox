package com.google.android.apps.search.podcasts.p10590o;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4082j.p4083a.C54431ec;
import com.google.p4017at.p4082j.p4083a.C54432ed;
import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.p4017at.p4082j.p4083a.C54458w;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.podcasts.o.i */
/* compiled from: PG */
public final /* synthetic */ class C140716i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140725r f382136a;

    /* renamed from: b */
    public final /* synthetic */ C140728u f382137b;

    public /* synthetic */ C140716i(C140725r rVar, C140728u uVar) {
        this.f382136a = rVar;
        this.f382137b = uVar;
    }

    public final Object apply(Object obj) {
        C140725r rVar = this.f382136a;
        C140728u uVar = this.f382137b;
        C140732y yVar = (C140732y) obj;
        C63042fg i = C62953e.m95484i(rVar.f382153e.mo26870b());
        C140731x xVar = (C140731x) yVar.toBuilder();
        C140704ae aeVar = yVar.f382166a;
        if (aeVar == null) {
            aeVar = C140704ae.f382118b;
        }
        C140702ac acVar = (C140702ac) aeVar.toBuilder();
        C140708ai.m228499b(acVar, uVar);
        xVar.copyOnWrite();
        C140704ae aeVar2 = (C140704ae) acVar.build();
        aeVar2.getClass();
        ((C140732y) xVar.instance).f382166a = aeVar2;
        C140730w wVar = yVar.f382167b;
        if (wVar == null) {
            wVar = C140730w.f382160c;
        }
        C140729v vVar = (C140729v) wVar.toBuilder();
        C54431ec ecVar = (C54431ec) C54432ed.f142944d.createBuilder();
        ecVar.copyOnWrite();
        i.getClass();
        ((C54432ed) ecVar.instance).f142948c = i;
        C54455t tVar = uVar.f382158a;
        if (tVar == null) {
            tVar = C54455t.f142988c;
        }
        ecVar.copyOnWrite();
        tVar.getClass();
        ((C54432ed) ecVar.instance).f142946a = tVar;
        C54458w a = C54458w.m87383a(uVar.f382159b);
        if (a == null) {
            a = C54458w.UNRECOGNIZED;
        }
        ecVar.copyOnWrite();
        ((C54432ed) ecVar.instance).f142947b = a.getNumber();
        vVar.copyOnWrite();
        C140730w wVar2 = (C140730w) vVar.instance;
        C54432ed edVar = (C54432ed) ecVar.build();
        edVar.getClass();
        wVar2.mo115845b();
        wVar2.f382163b.add(edVar);
        xVar.copyOnWrite();
        C140730w wVar3 = (C140730w) vVar.build();
        wVar3.getClass();
        ((C140732y) xVar.instance).f382167b = wVar3;
        return (C140732y) xVar.build();
    }
}
