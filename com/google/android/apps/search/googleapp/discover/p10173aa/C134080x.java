package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.C4381ae;
import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$enqueuePeriodicJobForEligibility$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {124})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.x */
/* compiled from: PG */
final class C134080x extends C69572j implements C69630p {

    /* renamed from: a */
    int f365238a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365239b;

    /* renamed from: c */
    final /* synthetic */ C134591i f365240c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134080x(C134018ak akVar, C134591i iVar, C69577g gVar) {
        super(2, gVar);
        this.f365239b = akVar;
        this.f365240c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134080x) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365238a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134018ak akVar = this.f365239b;
            C134061e eVar = akVar.f365056e;
            C134591i iVar = this.f365240c;
            C69664n.m101061g(iVar, "eligibilityStatus");
            C59052c cVar = (C59052c) C134061e.f365172a.mo56224b();
            cVar.mo56379ah(new C59094n(40547));
            cVar.mo56389s("#scheduledRefresh with eligibilityStatus %s", iVar);
            C4381ae a = eVar.mo111544a();
            Instant a2 = eVar.f365173b.mo57444a();
            C69664n.m101060f(a2, "timeSource.now()");
            C46586t tVar = new C134034b(a, a2, eVar.mo111548e(eVar.mo111547d(iVar)), eVar.f365175d).f365163c;
            this.f365238a = 1;
            if (akVar.mo111522k(tVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134080x(this.f365239b, this.f365240c, gVar);
    }
}
