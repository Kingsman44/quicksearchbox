package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134216e;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.FeedClient$executeNextPageRequest$2", mo61344c = "FeedClient.kt", mo61345d = "invokeSuspend", mo61346e = {82})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.be */
/* compiled from: PG */
final class C134973be extends C69572j implements C69630p {

    /* renamed from: a */
    int f367511a;

    /* renamed from: b */
    final /* synthetic */ C134980bl f367512b;

    /* renamed from: c */
    final /* synthetic */ UUID f367513c;

    /* renamed from: d */
    final /* synthetic */ C57259bn f367514d;

    /* renamed from: e */
    final /* synthetic */ C57303dd f367515e;

    /* renamed from: f */
    final /* synthetic */ String f367516f = "/httpservice/retry/InteractiveDiscoverAgaService/NextPageQuery";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134973be(C134980bl blVar, UUID uuid, C57259bn bnVar, C57303dd ddVar, C69577g gVar) {
        super(2, gVar);
        this.f367512b = blVar;
        this.f367513c = uuid;
        this.f367514d = bnVar;
        this.f367515e = ddVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134973be) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367511a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134216e a = this.f367512b.f367550b.mo111650a(this.f367513c, true, this.f367514d);
            C134980bl blVar = this.f367512b;
            C57303dd ddVar = this.f367515e;
            String str = this.f367516f;
            C57259bn bnVar = this.f367514d;
            this.f367511a = 1;
            obj = blVar.mo112098b(ddVar, str, a, bnVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134973be(this.f367512b, this.f367513c, this.f367514d, this.f367515e, gVar);
    }
}
