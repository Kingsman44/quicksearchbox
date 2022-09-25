package com.google.android.libraries.search.location.p3029a;

import com.google.common.base.C58817ah;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.libraries.search.location.a.q */
/* compiled from: PG */
public final /* synthetic */ class C38673q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38586af f102137a;

    /* renamed from: b */
    public final /* synthetic */ C38590aj f102138b;

    /* renamed from: c */
    public final /* synthetic */ OptionalLong f102139c;

    public /* synthetic */ C38673q(C38586af afVar, C38590aj ajVar, OptionalLong optionalLong) {
        this.f102137a = afVar;
        this.f102138b = ajVar;
        this.f102139c = optionalLong;
    }

    public final Object apply(Object obj) {
        C38586af afVar = this.f102137a;
        C38590aj ajVar = this.f102138b;
        OptionalLong optionalLong = this.f102139c;
        C38635c cVar = (C38635c) obj;
        if (!optionalLong.isPresent() || optionalLong.getAsLong() == cVar.f102094d) {
            long b = afVar.f101994e.mo26870b();
            if (ajVar.equals(C38590aj.CONSENT_REASON_TEMPORARILY_ALLOWED)) {
                afVar.mo41516m(C38591ak.f102016a, b);
            }
            C38590aj a = C38590aj.m67896a(cVar.f102092b);
            if (a == null) {
                a = C38590aj.CONSENT_REASON_UNKNOWN;
            }
            if (!a.equals(C38590aj.CONSENT_REASON_DECLINED) || !ajVar.equals(C38590aj.CONSENT_REASON_DISMISSED)) {
                ajVar.name();
                C38607b bVar = (C38607b) cVar.toBuilder();
                bVar.copyOnWrite();
                C38635c cVar2 = (C38635c) bVar.instance;
                cVar2.f102092b = ajVar.f102015g;
                cVar2.f102091a |= 1;
                boolean n = C38586af.m67880n(ajVar);
                bVar.copyOnWrite();
                C38635c cVar3 = (C38635c) bVar.instance;
                cVar3.f102091a |= 2;
                cVar3.f102093c = n;
                bVar.copyOnWrite();
                C38635c cVar4 = (C38635c) bVar.instance;
                cVar4.f102091a |= 4;
                cVar4.f102094d = b;
                return (C38635c) bVar.build();
            }
        }
        return cVar;
    }
}
