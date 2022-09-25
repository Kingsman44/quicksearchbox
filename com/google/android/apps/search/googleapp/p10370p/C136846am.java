package com.google.android.apps.search.googleapp.p10370p;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62995dn;
import com.google.protos.p5145v.C65906j;
import com.google.protos.p5145v.C65911o;
import java.util.Collections;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.p.am */
/* compiled from: PG */
public final /* synthetic */ class C136846am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136848ao f372473a;

    /* renamed from: b */
    public final /* synthetic */ Instant f372474b;

    public /* synthetic */ C136846am(C136848ao aoVar, Instant instant) {
        this.f372473a = aoVar;
        this.f372474b = instant;
    }

    public final Object apply(Object obj) {
        C136848ao aoVar = this.f372473a;
        Instant instant = this.f372474b;
        C136881q qVar = (C136881q) obj;
        ((C59052c) ((C59052c) C136848ao.f372475a.mo56224b()).mo56372aa(40685)).mo56386p("#cacheAggregateUsage");
        C136879o oVar = (C136879o) qVar.toBuilder();
        long epochMilli = instant.toEpochMilli();
        if (Collections.unmodifiableMap(((C136881q) oVar.instance).f372555b).containsKey(Long.valueOf(epochMilli))) {
            return qVar;
        }
        Set<Integer> keySet = Collections.unmodifiableMap(Collections.unmodifiableMap(((C136881q) oVar.instance).f372554a)).keySet();
        C136868d dVar = (C136868d) C136870f.f372528b.createBuilder();
        for (Integer intValue : keySet) {
            int intValue2 = intValue.intValue();
            C136875k kVar = C136875k.f372537e;
            C62995dn dnVar = qVar.f372554a;
            Integer valueOf = Integer.valueOf(intValue2);
            if (dnVar.containsKey(valueOf)) {
                kVar = (C136875k) dnVar.get(valueOf);
            }
            C65906j jVar = (C65906j) Map.EL.getOrDefault(aoVar.f372484j, valueOf, C65906j.f179236e);
            java.util.Map unmodifiableMap = Collections.unmodifiableMap(kVar.f372542d);
            C136847an a = C136848ao.m222535a(unmodifiableMap, instant.minus(C136848ao.f372476b), instant.minus(Duration.ofDays(1)));
            C136847an a2 = C136848ao.m222535a(unmodifiableMap, instant.minus(C136848ao.f372477c), instant.minus(Duration.ofDays(1)));
            C136876l lVar = (C136876l) C136877m.f372543f.createBuilder();
            C58072d dVar2 = kVar.f372540b;
            if (dVar2 == null) {
                dVar2 = C58072d.f155218d;
            }
            Duration duration = C136848ao.f372476b;
            C136833a aVar = (C136833a) a;
            int i = aVar.f372454a;
            C136848ao aoVar2 = aoVar;
            C65911o oVar2 = jVar.f179238a;
            if (oVar2 == null) {
                oVar2 = C65911o.f179247c;
            }
            C136872h e = C136848ao.m222537e(dVar2, instant, duration, i, oVar2);
            lVar.copyOnWrite();
            C136877m mVar = (C136877m) lVar.instance;
            e.getClass();
            mVar.f372546b = e;
            mVar.f372545a |= 1;
            Duration duration2 = C136848ao.f372476b;
            int i2 = aVar.f372455b;
            C65911o oVar3 = jVar.f179240c;
            if (oVar3 == null) {
                oVar3 = C65911o.f179247c;
            }
            C136872h e2 = C136848ao.m222537e(dVar2, instant, duration2, i2, oVar3);
            lVar.copyOnWrite();
            C136877m mVar2 = (C136877m) lVar.instance;
            e2.getClass();
            mVar2.f372547c = e2;
            mVar2.f372545a |= 2;
            Duration duration3 = C136848ao.f372477c;
            C136833a aVar2 = (C136833a) a2;
            int i3 = aVar2.f372454a;
            C65911o oVar4 = jVar.f179239b;
            if (oVar4 == null) {
                oVar4 = C65911o.f179247c;
            }
            C136872h e3 = C136848ao.m222537e(dVar2, instant, duration3, i3, oVar4);
            lVar.copyOnWrite();
            C136877m mVar3 = (C136877m) lVar.instance;
            e3.getClass();
            mVar3.f372548d = e3;
            mVar3.f372545a |= 4;
            Duration duration4 = C136848ao.f372477c;
            int i4 = aVar2.f372455b;
            C65911o oVar5 = jVar.f179241d;
            if (oVar5 == null) {
                oVar5 = C65911o.f179247c;
            }
            C136872h e4 = C136848ao.m222537e(dVar2, instant, duration4, i4, oVar5);
            lVar.copyOnWrite();
            C136877m mVar4 = (C136877m) lVar.instance;
            e4.getClass();
            mVar4.f372549e = e4;
            mVar4.f372545a |= 8;
            C136877m mVar5 = (C136877m) lVar.build();
            mVar5.getClass();
            dVar.copyOnWrite();
            C136870f fVar = (C136870f) dVar.instance;
            C62995dn dnVar2 = fVar.f372530a;
            if (!dnVar2.f170058b) {
                fVar.f372530a = dnVar2.mo58980a();
            }
            fVar.f372530a.put(valueOf, mVar5);
            aoVar = aoVar2;
        }
        C136870f fVar2 = (C136870f) dVar.build();
        fVar2.getClass();
        oVar.copyOnWrite();
        ((C136881q) oVar.instance).mo113422a().put(Long.valueOf(epochMilli), fVar2);
        return (C136881q) oVar.build();
    }
}
