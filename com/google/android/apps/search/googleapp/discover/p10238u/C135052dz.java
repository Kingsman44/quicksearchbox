package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134226o;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4031b.p4035b.p4036a.C53883b;
import com.google.p4017at.p4027c.p4031b.p4035b.p4036a.C53884c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildBackgroundFeedRequestConfig$requestMaker$1$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {399})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.dz */
/* compiled from: PG */
final class C135052dz extends C69572j implements C69630p {

    /* renamed from: a */
    int f367781a;

    /* renamed from: b */
    final /* synthetic */ C135086ff f367782b;

    /* renamed from: c */
    final /* synthetic */ C134226o f367783c;

    /* renamed from: d */
    final /* synthetic */ C57259bn f367784d;

    /* renamed from: e */
    final /* synthetic */ C57303dd f367785e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135052dz(C135086ff ffVar, C134226o oVar, C57259bn bnVar, C57303dd ddVar, C69577g gVar) {
        super(2, gVar);
        this.f367782b = ffVar;
        this.f367783c = oVar;
        this.f367784d = bnVar;
        this.f367785e = ddVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135052dz) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367781a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135086ff ffVar = this.f367782b;
            C53883b bVar = (C53883b) ffVar.f367926k.mo112086b(ffVar.f367916a, this.f367783c, this.f367784d);
            C57303dd ddVar = this.f367785e;
            C70888j jVar = bVar.f189039a;
            C70338di diVar = C53884c.f141401b;
            if (diVar == null) {
                synchronized (C53884c.class) {
                    diVar = C53884c.f141401b;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("google.internal.discover.discofeed.feedrenderer.v1.DiscoverFeedRenderer", "QueryBackgroundFeed");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C57303dd.f152957d);
                        d.f187486b = C70850d.m103697c(C57309dj.f152970a);
                        diVar = d.mo62040a();
                        C53884c.f141401b = diVar;
                    }
                }
            }
            C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), ddVar);
            this.f367781a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135052dz(this.f367782b, this.f367783c, this.f367784d, this.f367785e, gVar);
    }
}
