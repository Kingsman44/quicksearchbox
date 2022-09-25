package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.C76692c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80503f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80505h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80510m;
import com.google.android.apps.gsa.nga.shared.p6312ai.C80632a;
import com.google.android.apps.gsa.nga.shared.p6312ai.C80643b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p4985f.p5030q.C65195fb;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C76496ay implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76501bc f211698a;

    public /* synthetic */ C76496ay(C76501bc bcVar) {
        this.f211698a = bcVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58485gu guVar;
        C80503f fVar;
        C80510m mVar;
        C76501bc bcVar = this.f211698a;
        if (!bcVar.f211706f.isEmpty()) {
            C65195fb fbVar = C65195fb.NO_ERROR;
            int b = bcVar.f211701b.mo71152e().mo71143b();
            int i = b - 1;
            if (b == 0) {
                throw null;
            } else if (i == 0) {
                C58480gp e = C58485gu.m89837e();
                if (bcVar.f211707g.mo72021b().mo72035a().mo71529i()) {
                    Stream filter = Collection.EL.stream((C58485gu) bcVar.f211701b.mo71158k().orElse(C58485gu.m89845m())).filter(C76494aw.f211696a);
                    Objects.requireNonNull(e);
                    filter.forEach(new C76495ax(e));
                }
                return ((C76692c) bcVar.f211706f.get()).mo72292b(bcVar.f211702c, bcVar.f211701b.mo71152e().mo71141c().mo71146c(), e.mo55394f(), bcVar.f211701b.mo71153f());
            } else if (i == 1) {
                C76692c cVar = (C76692c) bcVar.f211706f.get();
                C74965n nVar = bcVar.f211702c;
                C80506i a = bcVar.f211701b.mo71152e().mo71140a().mo71142a();
                int i2 = a.f221002a;
                int a2 = C80505h.m128184a(i2);
                int i3 = a2 - 1;
                if (a2 != 0) {
                    if (i3 == 0) {
                        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
                        if (a.f221002a == 1) {
                            fVar = (C80503f) a.f221003b;
                        } else {
                            fVar = C80503f.f220995d;
                        }
                        C51805du duVar = fVar.f220998b;
                        if (duVar == null) {
                            duVar = C51805du.f135924e;
                        }
                        ejVar.copyOnWrite();
                        C52078ek ekVar = (C52078ek) ejVar.instance;
                        duVar.getClass();
                        ekVar.f136675c = duVar;
                        ekVar.f136674b = 5;
                        eoVar.copyOnWrite();
                        C52083ep epVar = (C52083ep) eoVar.instance;
                        C52078ek ekVar2 = (C52078ek) ejVar.build();
                        ekVar2.getClass();
                        epVar.f136693c = ekVar2;
                        epVar.f136692b = 3;
                        guVar = C58485gu.m89846n((C52083ep) eoVar.build());
                    } else if (i3 == 1) {
                        if (i2 == 2) {
                            mVar = (C80510m) a.f221003b;
                        } else {
                            mVar = C80510m.f221010b;
                        }
                        guVar = (C58485gu) Collection.EL.stream(mVar.f221012a).map(C80632a.f221371a).collect(C58370cn.f155946a);
                    } else if (i3 == 2) {
                        ((C58970a) ((C58970a) C80643b.f221400a.mo56225c()).mo56372aa(6140)).mo56386p("Request not set");
                        guVar = C58485gu.m89845m();
                    } else {
                        throw new AssertionError();
                    }
                    return cVar.mo72291a(nVar, guVar);
                }
                throw null;
            } else {
                throw new AssertionError();
            }
        } else {
            throw new Exception("PopService is missing");
        }
    }
}
