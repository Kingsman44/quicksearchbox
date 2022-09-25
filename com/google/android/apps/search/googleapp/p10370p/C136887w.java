package com.google.android.apps.search.googleapp.p10370p;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60951j;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.p4480a.C58068e;
import java.util.Collections;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.search.googleapp.p.w */
/* compiled from: PG */
public final /* synthetic */ class C136887w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136848ao f372567a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f372568b;

    public /* synthetic */ C136887w(C136848ao aoVar, C58485gu guVar) {
        this.f372567a = aoVar;
        this.f372568b = guVar;
    }

    public final Object apply(Object obj) {
        C136848ao aoVar = this.f372567a;
        C58485gu guVar = this.f372568b;
        C136879o oVar = (C136879o) ((C136881q) obj).toBuilder();
        long b = aoVar.f372483i.mo26870b();
        C58072d a = C58068e.m88823a(Instant.ofEpochMilli(b).atZone(C60951j.f165070a).toLocalDate());
        long epochMilli = Instant.ofEpochMilli(b).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            int intValue = ((Integer) guVar.get(i)).intValue();
            C136873i iVar = (C136873i) oVar.mo113420a(intValue, C136875k.f372537e).toBuilder();
            if ((((C136875k) iVar.instance).f372539a & 1) == 0) {
                iVar.copyOnWrite();
                C136875k kVar = (C136875k) iVar.instance;
                a.getClass();
                kVar.f372540b = a;
                kVar.f372539a |= 1;
            }
            iVar.copyOnWrite();
            C136875k kVar2 = (C136875k) iVar.instance;
            a.getClass();
            kVar2.f372541c = a;
            kVar2.f372539a |= 2;
            Map unmodifiableMap = Collections.unmodifiableMap(kVar2.f372542d);
            Long valueOf = Long.valueOf(epochMilli);
            int intValue2 = unmodifiableMap.containsKey(valueOf) ? ((Integer) unmodifiableMap.get(valueOf)).intValue() : 0;
            iVar.copyOnWrite();
            ((C136875k) iVar.instance).mo113419a().put(valueOf, Integer.valueOf(intValue2 + 1));
            oVar.mo113421b(intValue, (C136875k) iVar.build());
        }
        return (C136881q) oVar.build();
    }
}
