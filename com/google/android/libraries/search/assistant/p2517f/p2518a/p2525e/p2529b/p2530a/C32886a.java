package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.providers.user.locale.LocaleProvider$1", mo61344c = "LocaleProvider.kt", mo61345d = "invokeSuspend", mo61346e = {93})
/* renamed from: com.google.android.libraries.search.assistant.f.a.e.b.a.a */
/* compiled from: PG */
final class C32886a extends C69572j implements C69626l {

    /* renamed from: a */
    int f88136a;

    /* renamed from: b */
    final /* synthetic */ C32903o f88137b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32886a(C32903o oVar, C69577g gVar) {
        super(1, gVar);
        this.f88137b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32886a(this.f88137b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f88136a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C58976aa aaVar = C58975e.f156826a;
            C32903o oVar = this.f88137b;
            this.f88136a = 1;
            if (oVar.mo38338b(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
