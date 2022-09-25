package com.google.android.apps.search.googleapp.p10370p;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.p.af */
/* compiled from: PG */
public final /* synthetic */ class C136839af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136848ao f372463a;

    public /* synthetic */ C136839af(C136848ao aoVar) {
        this.f372463a = aoVar;
    }

    public final Object apply(Object obj) {
        C136848ao aoVar = this.f372463a;
        ((C59052c) ((C59052c) C136848ao.f372475a.mo56224b()).mo56372aa(40686)).mo56386p("#truncateUsage");
        Instant minus = Instant.ofEpochMilli(aoVar.f372483i.mo26870b()).truncatedTo(ChronoUnit.DAYS).minus(C136848ao.f372478d);
        C136879o oVar = (C136879o) ((C136881q) obj).toBuilder();
        C136881q qVar = (C136881q) oVar.build();
        for (Map.Entry entry : Collections.unmodifiableMap(qVar.f372554a).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            C136873i iVar = (C136873i) oVar.mo113420a(intValue, C136875k.f372537e).toBuilder();
            Set keySet = Collections.unmodifiableMap(((C136875k) entry.getValue()).f372542d).keySet();
            Stream filter = Collection.EL.stream(keySet).filter(new C136834aa(minus));
            Objects.requireNonNull(iVar);
            filter.forEach(new C136835ab(iVar));
            if (!keySet.isEmpty()) {
                oVar.mo113421b(intValue, (C136875k) iVar.build());
            }
        }
        Stream filter2 = Collection.EL.stream(Collections.unmodifiableMap(qVar.f372555b).keySet()).filter(new C136836ac(minus));
        Objects.requireNonNull(oVar);
        filter2.forEach(new C136837ad(oVar));
        return (C136881q) oVar.build();
    }
}
