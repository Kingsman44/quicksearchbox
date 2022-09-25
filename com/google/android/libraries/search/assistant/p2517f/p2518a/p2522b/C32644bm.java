package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32855cw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.ClientIdFetcher$fetchClientId$3", mo61344c = "ClientIdFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bm */
/* compiled from: PG */
final class C32644bm extends C69572j implements C69626l {

    /* renamed from: a */
    int f87497a;

    /* renamed from: b */
    final /* synthetic */ C69626l f87498b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32644bm(C69626l lVar, C69577g gVar) {
        super(1, gVar);
        this.f87498b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32644bm(this.f87498b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87497a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69626l lVar = this.f87498b;
            this.f87497a = 1;
            obj = lVar.mo5761a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return C32679cu.m60573a((C32855cw) obj);
    }
}
