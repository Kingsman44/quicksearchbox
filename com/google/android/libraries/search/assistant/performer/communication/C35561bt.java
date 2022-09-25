package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52626ys;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.adf;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bt */
/* compiled from: PG */
public final /* synthetic */ class C35561bt implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f93377a;

    public /* synthetic */ C35561bt(C58485gu guVar) {
        this.f93377a = guVar;
    }

    public final Object apply(Object obj) {
        C52627yt ytVar;
        C58485gu guVar = this.f93377a;
        C58495hd hdVar = (C58495hd) obj;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            adm adm = (adm) guVar.get(i);
            C52623yp ypVar = adm.f134892b;
            if (ypVar == null) {
                ypVar = C52623yp.f138162g;
            }
            C52627yt ytVar2 = ypVar.f138165b;
            if (ytVar2 == null) {
                ytVar2 = C52627yt.f138176c;
            }
            C52617yj yjVar = (C52617yj) hdVar.get(Long.valueOf(ytVar2.f138178a.mo58927a(0)));
            if (yjVar != null) {
                C58528ij ijVar = (C58528ij) Collection.EL.stream(yjVar.f138148a).filter(C35728ex.f93639a).map(C35729ey.f93640a).filter(C35730ez.f93641a).map(C35759fa.f93685a).collect(C58370cn.f155947b);
                C52623yp ypVar2 = adm.f134892b;
                if (ypVar2 == null) {
                    ypVar2 = C52623yp.f138162g;
                }
                C58485gu guVar2 = (C58485gu) Collection.EL.stream(ypVar2.f138169f).map(new C35559br(ijVar)).collect(C58370cn.f155946a);
                adf adf = (adf) adm.toBuilder();
                C52623yp ypVar3 = adm.f134892b;
                if (ypVar3 == null) {
                    ypVar3 = C52623yp.f138162g;
                }
                C52622yo yoVar = (C52622yo) ypVar3.toBuilder();
                yoVar.copyOnWrite();
                ((C52623yp) yoVar.instance).f138169f = C52623yp.emptyProtobufList();
                yoVar.mo53890c(guVar2);
                C52626ys ysVar = (C52626ys) C52627yt.f138176c.createBuilder();
                ysVar.mo53902d(yjVar);
                C52627yt ytVar3 = (C52627yt) ysVar.build();
                yoVar.copyOnWrite();
                C52623yp ypVar4 = (C52623yp) yoVar.instance;
                ytVar3.getClass();
                C52627yt ytVar4 = ypVar4.f138165b;
                if (ytVar4 == null || ytVar4 == (ytVar = C52627yt.f138176c)) {
                    ypVar4.f138165b = ytVar3;
                } else {
                    C52626ys ysVar2 = (C52626ys) ytVar.createBuilder(ytVar4);
                    ysVar2.mergeFrom(ytVar3);
                    ypVar4.f138165b = (C52627yt) ysVar2.buildPartial();
                }
                ypVar4.f138164a |= 1;
                adf.copyOnWrite();
                adm adm2 = (adm) adf.instance;
                C52623yp ypVar5 = (C52623yp) yoVar.build();
                ypVar5.getClass();
                adm2.f134892b = ypVar5;
                adm2.f134891a |= 1;
                e.mo55395g((adm) adf.build());
            } else {
                e.mo55395g(adm);
            }
        }
        return e.mo55394f();
    }
}
