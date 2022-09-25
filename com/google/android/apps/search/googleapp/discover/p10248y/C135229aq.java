package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10203o.C134474c;
import com.google.android.apps.search.googleapp.discover.p10203o.C134475d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$loadDataSuspend$2$1$1", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {160})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.aq */
/* compiled from: PG */
final class C135229aq extends C69572j implements C69630p {

    /* renamed from: a */
    int f368361a;

    /* renamed from: b */
    final /* synthetic */ C135241bb f368362b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135229aq(C135241bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368362b = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135229aq) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368361a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C59052c cVar = (C59052c) ((C59052c) C135241bb.f368398a.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(40431));
                cVar.mo56386p("Error writing last minus one load time");
            }
        } else {
            C69714l.m101134b(obj);
            C134475d dVar = this.f368362b.f368405h;
            this.f368361a = 1;
            Object a = C71803m.m105040a(dVar.f366235d, new C134474c(dVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135229aq(this.f368362b, gVar);
    }
}
