package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138335t;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.logging.OneSearchLogger$logAbandonedSession$1", mo61344c = "OneSearchLogger.kt", mo61345d = "invokeSuspend", mo61346e = {130})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.f */
/* compiled from: PG */
public final class C138158f extends C69572j implements C69630p {

    /* renamed from: a */
    int f375883a;

    /* renamed from: b */
    final /* synthetic */ C138165m f375884b;

    /* renamed from: c */
    final /* synthetic */ C138335t f375885c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138158f(C138165m mVar, C138335t tVar, C69577g gVar) {
        super(2, gVar);
        this.f375884b = mVar;
        this.f375885c = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138158f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375883a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138165m mVar = this.f375884b;
            C138335t tVar = this.f375885c;
            this.f375883a = 1;
            obj = mVar.mo114172c(tVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138158f(this.f375884b, this.f375885c, gVar);
    }
}
