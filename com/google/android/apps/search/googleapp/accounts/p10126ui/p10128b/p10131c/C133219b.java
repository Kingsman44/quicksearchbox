package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.accounts.ui.data.searchconsoleinsights.SearchConsoleInsightsDataService$isPrimaryUserEligibleFromJava$1", mo61344c = "SearchConsoleInsightsDataService.kt", mo61345d = "invokeSuspend", mo61346e = {62})
/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.c.b */
/* compiled from: PG */
final class C133219b extends C69572j implements C69630p {

    /* renamed from: a */
    int f363102a;

    /* renamed from: b */
    final /* synthetic */ C133220c f363103b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133219b(C133220c cVar, C69577g gVar) {
        super(2, gVar);
        this.f363103b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133219b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f363102a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C133220c cVar = this.f363103b;
            this.f363102a = 1;
            obj = cVar.mo111028b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133219b(this.f363103b, gVar);
    }
}
