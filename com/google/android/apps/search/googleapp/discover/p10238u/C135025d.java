package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53872b;
import com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53873c;
import com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53875e;
import com.google.p4017at.p4027c.p4031b.p4032a.p4033a.C53877g;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57245b;
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
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70876o;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ActionUploader$triggerUpload$2", mo61344c = "ActionUploader.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.d */
/* compiled from: PG */
final class C135025d extends C69572j implements C69630p {

    /* renamed from: a */
    int f367688a;

    /* renamed from: b */
    final /* synthetic */ C53875e f367689b;

    /* renamed from: c */
    final /* synthetic */ C135053e f367690c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135025d(C53875e eVar, C135053e eVar2, C69577g gVar) {
        super(2, gVar);
        this.f367689b = eVar;
        this.f367690c = eVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135025d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367688a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C135053e.f367786a.mo56224b();
            cVar.mo56380ai(C58979ad.FULL);
            int size = this.f367689b.f141377a.size();
            C57245b bVar = this.f367689b.f141379c;
            if (bVar == null) {
                bVar = C57245b.f152815c;
            }
            int i = bVar.f152818b;
            cVar.mo56379ah(new C59094n(40379));
            cVar.mo56393w("#triggerUpload - gRPC count=%d remaining=%d", size, i);
            this.f367690c.f367788c.mo111603a();
            C135053e eVar = this.f367690c;
            C53872b bVar2 = (C53872b) eVar.f367789d.mo112087c((C70864c) eVar.f367787b.mo17428b());
            C53875e eVar2 = this.f367689b;
            C70888j jVar = bVar2.f189039a;
            C70338di diVar = C53873c.f141373a;
            if (diVar == null) {
                synchronized (C53873c.class) {
                    diVar = C53873c.f141373a;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("google.internal.discover.discofeed.actions.v1.DiscoverActions", "UploadActions");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C53875e.f141375d);
                        d.f187486b = C70850d.m103697c(C53877g.f141381b);
                        diVar = d.mo62040a();
                        C53873c.f141373a = diVar;
                    }
                }
            }
            C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, bVar2.f189040b), eVar2);
            this.f367688a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C53877g gVar = (C53877g) obj;
        this.f367690c.f367788c.mo111604b();
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135025d(this.f367689b, this.f367690c, gVar);
    }
}
