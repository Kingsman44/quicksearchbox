package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138255f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.OneSearchInteractionHandler$deleteSuggestion$1", mo61344c = "OneSearchInteractionHandler.kt", mo61345d = "invokeSuspend", mo61346e = {42})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.d */
/* compiled from: PG */
public final class C138269d extends C69572j implements C69630p {

    /* renamed from: a */
    int f376185a;

    /* renamed from: b */
    final /* synthetic */ C138273h f376186b;

    /* renamed from: c */
    final /* synthetic */ C138255f f376187c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138269d(C138273h hVar, C138255f fVar, C69577g gVar) {
        super(2, gVar);
        this.f376186b = hVar;
        this.f376187c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138269d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f376185a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138273h hVar = this.f376186b;
            C138255f fVar = this.f376187c;
            this.f376185a = 1;
            obj = hVar.mo114226a(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138269d(this.f376186b, this.f376187c, gVar);
    }
}
