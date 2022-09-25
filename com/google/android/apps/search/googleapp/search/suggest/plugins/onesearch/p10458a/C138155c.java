package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138167ab;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.logging.OneSearchLogger$createLogSession$1", mo61344c = "OneSearchLogger.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.c */
/* compiled from: PG */
public final class C138155c extends C69572j implements C69630p {

    /* renamed from: a */
    int f375866a;

    /* renamed from: b */
    final /* synthetic */ C138165m f375867b;

    /* renamed from: c */
    final /* synthetic */ C138167ab f375868c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138155c(C138165m mVar, C138167ab abVar, C69577g gVar) {
        super(2, gVar);
        this.f375867b = mVar;
        this.f375868c = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138155c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375866a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138165m mVar = this.f375867b;
            C138167ab abVar = this.f375868c;
            this.f375866a = 1;
            obj = mVar.mo114170a(abVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138155c(this.f375867b, this.f375868c, gVar);
    }
}
