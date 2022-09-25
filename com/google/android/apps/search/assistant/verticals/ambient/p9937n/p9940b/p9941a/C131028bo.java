package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131084g;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131088k;
import com.google.assistant.p3886c.p3887a.C50680p;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bo */
/* compiled from: PG */
public final /* synthetic */ class C131028bo implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131043cc f358434a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f358435b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f358436c;

    /* renamed from: d */
    public final /* synthetic */ Instant f358437d;

    public /* synthetic */ C131028bo(C131043cc ccVar, C60870cx cxVar, C60870cx cxVar2, Instant instant) {
        this.f358434a = ccVar;
        this.f358435b = cxVar;
        this.f358436c = cxVar2;
        this.f358437d = instant;
    }

    public final Object call() {
        C58485gu guVar;
        C131043cc ccVar = this.f358434a;
        C60870cx cxVar = this.f358435b;
        C60870cx cxVar2 = this.f358436c;
        Instant instant = this.f358437d;
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar);
        C58485gu guVar3 = (C58485gu) C60856cj.m92909r(cxVar2);
        C130992af afVar = ccVar.f358457c;
        C58485gu guVar4 = (C58485gu) Collection.EL.stream(guVar3).filter(new C130991ae(instant)).collect(C58370cn.f155946a);
        if (!guVar4.isEmpty() || !guVar2.isEmpty()) {
            guVar = (C58485gu) Collection.EL.stream(guVar4).map(new C130990ad(guVar2)).collect(C58370cn.f155946a);
        } else {
            ((C58970a) ((C58970a) afVar.f358383a.mo56226d()).mo56372aa(39022)).mo56393w("Empty recent connections and empty app events. Connection count: %d, app events count: %d", guVar4.size(), guVar2.size());
            guVar = C58485gu.m89845m();
        }
        ((C58970a) ((C58970a) ccVar.f358456b.mo56224b()).mo56372aa(39027)).mo56359L("AppEvents count: %d, Connections count: %d, ConnectionAppEvents count: %d", Integer.valueOf(guVar2.size()), Integer.valueOf(guVar3.size()), Integer.valueOf(guVar.size()));
        if (guVar.isEmpty()) {
            return Optional.empty();
        }
        C131088k kVar = (C131088k) C58557jl.m90130k(guVar, (Object) null);
        kVar.getClass();
        C131088k kVar2 = (C131088k) C58557jl.m90131l(guVar);
        C58485gu guVar5 = (C58485gu) Collection.EL.stream((C58485gu) Collection.EL.stream(((HashMap) Collection.EL.stream((C58485gu) Collection.EL.stream(guVar).flatMap(C131011ay.f358410a).collect(C58370cn.f155946a)).collect(Collectors.groupingBy(C131037bx.f358447a, C131038by.f358448a, C58370cn.f155946a))).values()).map(C131039bz.f358449a).collect(C58370cn.f155946a)).map(C131012az.f358411a).collect(C58370cn.f155946a);
        C50680p pVar = (C50680p) Collection.EL.stream(C131043cc.m213554g(guVar)).map(C130999am.f358397a).reduce(C131000an.f358398a).orElseGet(C131001ao.f358399a);
        if (guVar5 != null) {
            C58485gu g = C131043cc.m213554g(guVar);
            if (g != null) {
                long j = pVar.f131851b;
                Duration ofMillis = Duration.ofMillis(pVar.f131852c);
                if (ofMillis != null) {
                    Instant ofEpochMilli = Instant.ofEpochMilli(kVar.mo110058a().f131857c);
                    if (ofEpochMilli != null) {
                        Instant ofEpochMilli2 = Instant.ofEpochMilli(kVar2.mo110058a().f131858d);
                        if (ofEpochMilli2 != null) {
                            return Optional.m71637of(new C131084g(guVar5, j, ofMillis, g, ofEpochMilli, ofEpochMilli2));
                        }
                        throw new NullPointerException("Null lastDisconnectionTime");
                    }
                    throw new NullPointerException("Null firstConnectionTime");
                }
                throw new NullPointerException("Null headphoneDuration");
            }
            throw new NullPointerException("Null headphoneConnectionStats");
        }
        throw new NullPointerException("Null appEventSummaries");
    }
}
