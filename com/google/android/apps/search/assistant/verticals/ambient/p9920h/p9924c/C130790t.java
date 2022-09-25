package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49744ag;
import com.google.assistant.p3860as.C49746ai;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3860as.C49798l;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.t */
/* compiled from: PG */
public final /* synthetic */ class C130790t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130739ac f358018a;

    /* renamed from: b */
    public final /* synthetic */ C49794h f358019b;

    /* renamed from: c */
    public final /* synthetic */ C8242v f358020c;

    /* renamed from: d */
    public final /* synthetic */ Optional f358021d;

    public /* synthetic */ C130790t(C130739ac acVar, C49794h hVar, C8242v vVar, Optional optional) {
        this.f358018a = acVar;
        this.f358019b = hVar;
        this.f358020c = vVar;
        this.f358021d = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130739ac acVar = this.f358018a;
        C49794h hVar = this.f358019b;
        C8242v vVar = this.f358020c;
        Optional optional = this.f358021d;
        C49744ag agVar = (C49744ag) obj;
        try {
            double d = (double) agVar.f128446a;
            double hours = (double) Duration.ofDays(30).toHours();
            Double.isNaN(d);
            Double.isNaN(hours);
            double d2 = d / hours;
            C58480gp e = C58485gu.m89837e();
            for (C49746ai aiVar : agVar.f128447b) {
                C8242v vVar2 = aiVar.f128457b;
                if (vVar2 == null) {
                    vVar2 = C8242v.f28952d;
                }
                if (vVar2.equals(vVar)) {
                    C49798l lVar = agVar.f128451f;
                    if (lVar == null) {
                        lVar = C49798l.f128635b;
                    }
                    C8242v vVar3 = vVar;
                    C58480gp gpVar = e;
                    gpVar.mo55396h(C130739ac.m213133b(hVar, 4, aiVar, d2, 1.0d, lVar));
                    e = gpVar;
                    vVar = vVar3;
                }
            }
            C58480gp gpVar2 = e;
            C58480gp e2 = C58485gu.m89837e();
            if (optional.isPresent()) {
                for (C49746ai aiVar2 : agVar.f128448c) {
                    if (aiVar2.f128456a.equals(optional.get())) {
                        C49798l lVar2 = agVar.f128451f;
                        if (lVar2 == null) {
                            lVar2 = C49798l.f128635b;
                        }
                        C58480gp gpVar3 = gpVar2;
                        C58480gp gpVar4 = e2;
                        gpVar4.mo55396h(C130739ac.m213133b(hVar, 3, aiVar2, d2, 1.0d, lVar2));
                        e2 = gpVar4;
                        gpVar2 = gpVar3;
                    }
                }
            }
            C58480gp gpVar5 = gpVar2;
            C58480gp gpVar6 = e2;
            C49746ai aiVar3 = agVar.f128449d;
            if (aiVar3 == null) {
                aiVar3 = C49746ai.f128454g;
            }
            C49746ai aiVar4 = aiVar3;
            C49798l lVar3 = agVar.f128451f;
            if (lVar3 == null) {
                lVar3 = C49798l.f128635b;
            }
            C58485gu b = C130739ac.m213133b(hVar, 2, aiVar4, d2, 0.3d, lVar3);
            C58485gu j = C58485gu.m89842j(agVar.f128450e);
            C49798l lVar4 = agVar.f128451f;
            if (lVar4 == null) {
                lVar4 = C49798l.f128635b;
            }
            return (C58485gu) Stream.CC.concat(Stream.CC.concat(Collection.EL.stream(gpVar5.mo55394f()), Collection.EL.stream(gpVar6.mo55394f())), Stream.CC.concat(Collection.EL.stream(b), Collection.EL.stream(C130739ac.m213134c(hVar, 1, j, 30.0d, d2, 0.05d, lVar4)))).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C130787q.f358011a))).collect(C58370cn.f155946a);
        } catch (C130738ab e3) {
            ((C58970a) ((C58970a) ((C58970a) acVar.f357931b.mo56225c()).mo56382g(e3)).mo56372aa(38960)).mo56386p("Failed to get location related applications");
            return C58485gu.m89845m();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
