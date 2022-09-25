package com.google.android.libraries.search.assistant.invocation.p2646l.p2647a;

import com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33946f;
import com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33947g;
import com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33949i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.p4238bo.p4239a.p4240a.p4241a.C56125i;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.mediacontext.client.MediaContextGrpcClientImpl$getMediaContext$1", mo61344c = "MediaContextGrpcClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.libraries.search.assistant.invocation.l.a.c */
/* compiled from: PG */
public final class C33932c extends C69572j implements C69630p {

    /* renamed from: a */
    int f90501a;

    /* renamed from: b */
    final /* synthetic */ C61301b f90502b;

    /* renamed from: c */
    final /* synthetic */ C33933d f90503c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33932c(C61301b bVar, C33933d dVar, C69577g gVar) {
        super(2, gVar);
        this.f90502b = bVar;
        this.f90503c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33932c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C51450id idVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90501a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33933d dVar = this.f90503c;
            C33946f fVar = (C33946f) C33947g.f90518b.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C69664n.m101061g(fVar, "builder");
            C34053bp bpVar = dVar.f90507d;
            C69664n.m101061g(bpVar, "value");
            fVar.copyOnWrite();
            bpVar.getClass();
            ((C33947g) fVar.instance).f90520a = bpVar;
            C62942bv build = fVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C59052c cVar = (C59052c) C33933d.f90504a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.MediaCxt.Client");
            C61301b bVar = this.f90502b;
            cVar.mo56379ah(new C59094n(51304));
            cVar.mo56389s("Calling MediaContext service for invocation %s.", bVar);
            C60870cx b = C56125i.m87910b(this.f90503c.f90506c, C33931b.f90500a, (C33947g) build);
            this.f90501a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C33949i iVar = (C33949i) ((C56125i) obj).f149528b;
        if (iVar != null) {
            C59052c cVar2 = (C59052c) C33933d.f90504a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "INV.MediaCxt.Client");
            C61301b bVar2 = this.f90502b;
            cVar2.mo56379ah(new C59094n(51306));
            cVar2.mo56389s("MediaContext response received for %s.", bVar2);
            idVar = iVar.f90524a;
            if (idVar == null) {
                idVar = C51450id.f133992h;
            }
        } else {
            C59052c cVar3 = (C59052c) C33933d.f90504a.mo56225c();
            cVar3.mo56378ag(C58975e.f156826a, "INV.MediaCxt.Client");
            C61301b bVar3 = this.f90502b;
            cVar3.mo56379ah(new C59094n(51305));
            cVar3.mo56389s("No MediaContext returned for %s.", bVar3);
            idVar = C51450id.f133992h;
        }
        C69664n.m101060f(idVar, "if (payload != null) {\n …DefaultInstance()\n      }");
        return idVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33932c(this.f90502b, this.f90503c, gVar);
    }
}
