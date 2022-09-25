package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138210br;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.OneSearchInteractionHandler$reportSuggestion$1", mo61344c = "OneSearchInteractionHandler.kt", mo61345d = "invokeSuspend", mo61346e = {66})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.f */
/* compiled from: PG */
public final class C138271f extends C69572j implements C69630p {

    /* renamed from: a */
    int f376193a;

    /* renamed from: b */
    final /* synthetic */ C138273h f376194b;

    /* renamed from: c */
    final /* synthetic */ C138210br f376195c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138271f(C138273h hVar, C138210br brVar, C69577g gVar) {
        super(2, gVar);
        this.f376194b = hVar;
        this.f376195c = brVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138271f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f376193a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138273h hVar = this.f376194b;
            C138210br brVar = this.f376195c;
            this.f376193a = 1;
            obj = hVar.mo114227b(brVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138271f(this.f376194b, this.f376195c, gVar);
    }
}
