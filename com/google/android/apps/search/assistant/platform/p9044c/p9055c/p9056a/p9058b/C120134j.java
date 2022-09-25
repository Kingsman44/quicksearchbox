package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.triggering.migration.surfaces.LegacySpecialAssistantExperienceServiceImpl$onActive$1", mo61344c = "LegacySpecialAssistantExperienceListenerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {67})
/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.j */
/* compiled from: PG */
final class C120134j extends C69572j implements C69630p {

    /* renamed from: a */
    int f334370a;

    /* renamed from: b */
    final /* synthetic */ C120141q f334371b;

    /* renamed from: c */
    final /* synthetic */ C120135k f334372c;

    /* renamed from: d */
    private /* synthetic */ Object f334373d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120134j(C120141q qVar, C120135k kVar, C69577g gVar) {
        super(2, gVar);
        this.f334371b = qVar;
        this.f334372c = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120134j) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334370a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f334373d;
            C120140p a = C120140p.m199079a(this.f334371b.f334387b);
            if (a == null) {
                a = C120140p.UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                throw new IllegalArgumentException("Unexpected experience value.");
            } else if (ordinal == 1) {
                C120125a aVar2 = C120125a.NAVIGATION;
                C59052c cVar = (C59052c) C120135k.f334374a.mo56224b();
                cVar.mo56379ah(new C59094n(34660));
                cVar.mo56389s("Legacy special assistant experience(%s) is active.", aVar2);
                if (this.f334372c.f334375b.mo62808g(C120125a.NONE, aVar2)) {
                    C120133i iVar = new C120133i(aVar2, this.f334372c);
                    this.f334370a = 1;
                    if (C71360an.m104022a(aoVar, iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    throw new IllegalStateException("Duplicate legacy special assistant experience stream is not expected.");
                }
            } else {
                throw new C69677g();
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120134j jVar = new C120134j(this.f334371b, this.f334372c, gVar);
        jVar.f334373d = obj;
        return jVar;
    }
}
