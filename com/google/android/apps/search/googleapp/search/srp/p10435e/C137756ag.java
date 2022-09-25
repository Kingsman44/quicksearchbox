package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71688dx;
import kotlinx.coroutines.C71745ea;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.QueryFreeRequestDataDataService$getAndCacheQueryFreeRequestDataInternal$2$1$cookiesDeferred$1", mo61344c = "QueryFreeRequestDataDataService.kt", mo61345d = "invokeSuspend", mo61346e = {164, 169, 172})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ag */
/* compiled from: PG */
final class C137756ag extends C69572j implements C69630p {

    /* renamed from: a */
    int f374728a;

    /* renamed from: b */
    final /* synthetic */ C137764ao f374729b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137756ag(C137764ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f374729b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137756ag) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f374728a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C137764ao aoVar = this.f374729b;
            if (aoVar.f374760f) {
                if (aoVar.f374776v.compareTo(Duration.ZERO) > 0) {
                    C137764ao aoVar2 = this.f374729b;
                    Duration duration = aoVar2.f374776v;
                    C137755af afVar = new C137755af(aoVar2, (C69577g) null);
                    this.f374728a = 1;
                    if (C71745ea.m104929a(C60942a.m93083a(duration), afVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    C44041d dVar = this.f374729b.f374763i;
                    this.f374728a = 2;
                    if (dVar.mo46992d((C44042e) null, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else if (i == 1) {
            try {
                C69714l.m101134b(obj);
            } catch (C71688dx unused) {
                ((C58970a) C137764ao.f374755a.mo56224b()).mo56386p("Cookie validation and refresh timed out");
            }
        } else if (i != 2) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C137764ao aoVar3 = this.f374729b;
        C44051c cVar = aoVar3.f374762h;
        C136832c cVar2 = aoVar3.f374769o;
        int i2 = C136832c.f372447a;
        String uri = cVar2.mo113405k().appendPath("search").build().toString();
        C69664n.m101060f(uri, "googleUrlAnalyzer.getGoo…arch\").build().toString()");
        this.f374728a = 3;
        obj = cVar.mo47015d(uri, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137756ag(this.f374729b, gVar);
    }
}
