package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79993cn;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79994co;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79995cp;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79996cq;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79997cr;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79998cs;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79999ct;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80000cu;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80005cz;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48590af;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.q */
/* compiled from: PG */
public final /* synthetic */ class C111152q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80005cz f309427a;

    public /* synthetic */ C111152q(C80005cz czVar) {
        this.f309427a = czVar;
    }

    public final void accept(Object obj) {
        C80005cz czVar = this.f309427a;
        C48590af afVar = (C48590af) obj;
        C121537f fVar = C111136ae.f309392a;
        C79995cp cpVar = (C79995cp) C80000cu.f219479e.createBuilder();
        C79993cn cnVar = (C79993cn) C79994co.f219450j.createBuilder();
        C58485gu guVar = (C58485gu) Collection.EL.stream(afVar.f125591a).map(C111160y.f309442a).collect(C58370cn.f155946a);
        long count = Collection.EL.stream(guVar).filter(C111142g.f309414a).count();
        cnVar.copyOnWrite();
        C79994co coVar = (C79994co) cnVar.instance;
        coVar.f219452a |= 4;
        coVar.f219457f = (float) count;
        long count2 = Collection.EL.stream(guVar).filter(C111143h.f309415a).count();
        cnVar.copyOnWrite();
        C79994co coVar2 = (C79994co) cnVar.instance;
        coVar2.f219452a |= 8;
        coVar2.f219458g = (float) count2;
        long count3 = Collection.EL.stream(guVar).filter(C111144i.f309416a).count();
        cnVar.copyOnWrite();
        C79994co coVar3 = (C79994co) cnVar.instance;
        coVar3.f219452a |= 16;
        coVar3.f219459h = (float) count3;
        long count4 = Collection.EL.stream(guVar).filter(C111145j.f309417a).count();
        cnVar.copyOnWrite();
        C79994co coVar4 = (C79994co) cnVar.instance;
        coVar4.f219452a |= 32;
        coVar4.f219460i = (float) count4;
        for (C51473j jVar : afVar.f125591a) {
            C51419h a = C51419h.m86180a(jVar.f134097f);
            if (a == null) {
                a = C51419h.UNKNOWN_ALARM_STATUS;
            }
            if (a != C51419h.UNKNOWN_ALARM_STATUS) {
                if (!jVar.f134099h.isEmpty()) {
                    if (a == C51419h.DISABLED) {
                        String str = jVar.f134099h;
                        cnVar.copyOnWrite();
                        C79994co coVar5 = (C79994co) cnVar.instance;
                        str.getClass();
                        C62971cq cqVar = coVar5.f219456e;
                        if (!cqVar.mo58948c()) {
                            coVar5.f219456e = C62942bv.mutableCopy(cqVar);
                        }
                        coVar5.f219456e.add(str);
                    } else {
                        String str2 = jVar.f134099h;
                        cnVar.copyOnWrite();
                        C79994co coVar6 = (C79994co) cnVar.instance;
                        str2.getClass();
                        C62971cq cqVar2 = coVar6.f219455d;
                        if (!cqVar2.mo58948c()) {
                            coVar6.f219455d = C62942bv.mutableCopy(cqVar2);
                        }
                        coVar6.f219455d.add(str2);
                    }
                }
                if (a == C51419h.SCHEDULED) {
                    C79994co coVar7 = (C79994co) cnVar.instance;
                    if ((coVar7.f219452a & 1) == 0 || coVar7.f219453b > ((float) jVar.f134098g) / 1000.0f) {
                        long j = jVar.f134098g;
                        cnVar.copyOnWrite();
                        C79994co coVar8 = (C79994co) cnVar.instance;
                        coVar8.f219452a |= 1;
                        coVar8.f219453b = ((float) j) / 1000.0f;
                    }
                }
                if (a == C51419h.SNOOZED) {
                    C79994co coVar9 = (C79994co) cnVar.instance;
                    if ((coVar9.f219452a & 2) == 0 || coVar9.f219454c > ((float) jVar.f134098g) / 1000.0f) {
                        long j2 = jVar.f134098g;
                        cnVar.copyOnWrite();
                        C79994co coVar10 = (C79994co) cnVar.instance;
                        coVar10.f219452a |= 2;
                        coVar10.f219454c = ((float) j2) / 1000.0f;
                    }
                }
            }
        }
        cpVar.copyOnWrite();
        C80000cu cuVar = (C80000cu) cpVar.instance;
        C79994co coVar11 = (C79994co) cnVar.build();
        coVar11.getClass();
        cuVar.f219482b = coVar11;
        cuVar.f219481a |= 1;
        C79996cq cqVar3 = (C79996cq) C79997cr.f219461g.createBuilder();
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(afVar.f125592b).map(C111146k.f309418a).collect(C58370cn.f155946a);
        long count5 = Collection.EL.stream(guVar2).filter(C111148m.f309423a).count();
        cqVar3.copyOnWrite();
        C79997cr crVar = (C79997cr) cqVar3.instance;
        crVar.f219463a |= 8;
        crVar.f219467e = (float) count5;
        long count6 = Collection.EL.stream(guVar2).filter(C111149n.f309424a).count();
        cqVar3.copyOnWrite();
        C79997cr crVar2 = (C79997cr) cqVar3.instance;
        crVar2.f219463a |= 16;
        crVar2.f219468f = (float) count6;
        Collection.EL.stream(afVar.f125592b).max(Comparator.CC.comparing(C111150o.f309425a)).ifPresent(new C111151p(cqVar3));
        cpVar.copyOnWrite();
        C80000cu cuVar2 = (C80000cu) cpVar.instance;
        C79997cr crVar3 = (C79997cr) cqVar3.build();
        crVar3.getClass();
        cuVar2.f219483c = crVar3;
        cuVar2.f219481a |= 2;
        C79998cs csVar = (C79998cs) C79999ct.f219469i.createBuilder();
        java.util.Comparator thenComparing = Comparator.EL.thenComparing(Comparator.CC.comparing(C111161z.f309443a), (Function) C111132aa.f309388a);
        C58485gu guVar3 = (C58485gu) Collection.EL.stream(afVar.f125593c).map(C111133ab.f309389a).collect(C58370cn.f155946a);
        long count7 = Collection.EL.stream(guVar3).filter(C111134ac.f309390a).count();
        csVar.copyOnWrite();
        C79999ct ctVar = (C79999ct) csVar.instance;
        ctVar.f219471a |= 32;
        ctVar.f219476f = (float) count7;
        csVar.copyOnWrite();
        C79999ct ctVar2 = (C79999ct) csVar.instance;
        ctVar2.f219471a |= 64;
        ctVar2.f219477g = (float) Collection.EL.stream(guVar3).filter(C111135ad.f309391a).count();
        long count8 = Collection.EL.stream(guVar3).filter(C111137b.f309409a).count();
        csVar.copyOnWrite();
        C79999ct ctVar3 = (C79999ct) csVar.instance;
        ctVar3.f219471a |= 128;
        ctVar3.f219478h = (float) count8;
        Collection.EL.stream(afVar.f125593c).filter(C111138c.f309410a).max(thenComparing).ifPresent(new C111139d(csVar));
        Collection.EL.stream(afVar.f125593c).filter(C111140e.f309412a).max(thenComparing).ifPresent(new C111141f(csVar));
        cpVar.copyOnWrite();
        C80000cu cuVar3 = (C80000cu) cpVar.instance;
        C79999ct ctVar4 = (C79999ct) csVar.build();
        ctVar4.getClass();
        cuVar3.f219484d = ctVar4;
        cuVar3.f219481a |= 4;
        C80000cu cuVar4 = (C80000cu) cpVar.build();
        czVar.copyOnWrite();
        C80007da daVar = (C80007da) czVar.instance;
        C80007da daVar2 = C80007da.f219520C;
        cuVar4.getClass();
        daVar.f219548y = cuVar4;
        daVar.f219524a |= 134217728;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
