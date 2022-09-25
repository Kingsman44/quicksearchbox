package com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a;

import com.google.assistant.p3861at.C50254qg;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.acs;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.h */
/* compiled from: PG */
public final /* synthetic */ class C9867h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C9885z f33901a;

    public /* synthetic */ C9867h(C9885z zVar) {
        this.f33901a = zVar;
    }

    public final Object apply(Object obj) {
        C9885z zVar = this.f33901a;
        act act = (act) obj;
        C50282rh rhVar = act.f128876C;
        if (rhVar == null) {
            rhVar = C50282rh.f130762c;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(zVar.f33930e.f130764a).map(new C9866g(zVar, (C58495hd) Collection.EL.stream(rhVar.f130765b).map(C9875p.f33910a).flatMap(C9876q.f33911a).filter(C9877r.f33912a).map(C9878s.f33913a).filter(C9870k.f33904a).collect(C58370cn.m89403c(C9863d.f33896a, C9864e.f33897a, C9865f.f33898a)))).collect(C58370cn.f155946a);
        acs acs = (acs) act.f128872P.createBuilder(act);
        C50282rh rhVar2 = act.f128876C;
        if (rhVar2 == null) {
            rhVar2 = C50282rh.f130762c;
        }
        C50254qg qgVar = (C50254qg) C50282rh.f130762c.createBuilder(rhVar2);
        qgVar.copyOnWrite();
        C50282rh rhVar3 = (C50282rh) qgVar.instance;
        C62971cq cqVar = rhVar3.f130764a;
        if (!cqVar.mo58948c()) {
            rhVar3.f130764a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) rhVar3.f130764a);
        C50282rh rhVar4 = (C50282rh) qgVar.build();
        acs.copyOnWrite();
        act act2 = (act) acs.instance;
        rhVar4.getClass();
        act2.f128876C = rhVar4;
        act2.f128895b |= 16;
        return (act) acs.build();
    }
}
