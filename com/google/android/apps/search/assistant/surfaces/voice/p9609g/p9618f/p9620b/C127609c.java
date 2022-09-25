package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9620b;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127589c;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127590d;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127591e;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127593g;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127595i;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127596j;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127597k;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127599m;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127606t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.settings.impl.InputModalityUpdateListener$onInputModalitySettingChanged$1", mo61344c = "InputModalityUpdateListener.kt", mo61345d = "invokeSuspend", mo61346e = {28})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.b.c */
/* compiled from: PG */
public final class C127609c extends C69572j implements C69630p {

    /* renamed from: a */
    int f351313a;

    /* renamed from: b */
    final /* synthetic */ C127610d f351314b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127609c(C127610d dVar, C69577g gVar) {
        super(2, gVar);
        this.f351314b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127609c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351313a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C59052c cVar = (C59052c) ((C59052c) C127610d.f351315a.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(37513));
                cVar.mo56386p("Input Modality Update failed");
            }
        } else {
            C69714l.m101134b(obj);
            C127606t tVar = this.f351314b.f351316b;
            C127596j jVar = (C127596j) C127597k.f351297b.createBuilder();
            C69664n.m101060f(jVar, "newBuilder()");
            C127599m a = C69664n.m101061g(jVar, "builder");
            C127589c cVar2 = (C127589c) C127593g.f351292c.createBuilder();
            C69664n.m101060f(cVar2, "newBuilder()");
            C127595i a2 = C69664n.m101061g(cVar2, "builder");
            C127590d dVar = (C127590d) C127591e.f351290a.createBuilder();
            C69664n.m101060f(dVar, "newBuilder()");
            C69664n.m101061g(dVar, "builder");
            C62942bv build = dVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C127591e eVar = (C127591e) build;
            C69664n.m101061g(eVar, "value");
            C127589c cVar3 = a2.f351296a;
            cVar3.copyOnWrite();
            C127593g gVar = (C127593g) cVar3.instance;
            eVar.getClass();
            gVar.f351295b = eVar;
            gVar.f351294a = 2;
            a.mo108144b(a2.mo108142a());
            C127597k a3 = a.mo108143a();
            this.f351313a = 1;
            if (tVar.mo108146b(a3, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        C59052c cVar4 = (C59052c) C127610d.f351315a.mo56224b();
        cVar4.mo56379ah(new C59094n(37512));
        cVar4.mo56386p("Input Modality Update Completed");
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127609c(this.f351314b, gVar);
    }
}
