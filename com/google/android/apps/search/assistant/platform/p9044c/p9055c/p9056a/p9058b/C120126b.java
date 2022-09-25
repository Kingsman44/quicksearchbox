package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import com.google.protobuf.C62942bv;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.triggering.migration.surfaces.LegacySpecialAssistantExperienceListenerImpl$1", mo61344c = "LegacySpecialAssistantExperienceListenerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.b */
/* compiled from: PG */
final class C120126b extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f334360a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f334361b;

    /* renamed from: c */
    final /* synthetic */ C120127c f334362c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120126b(C69648ae aeVar, C120127c cVar, C69577g gVar) {
        super(2, gVar);
        this.f334361b = aeVar;
        this.f334362c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120126b) mo5194c((C120125a) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C120125a aVar2 = (C120125a) this.f334360a;
        C69585o oVar = (C69585o) this.f334361b.f186027a;
        if (oVar != null) {
            C71647ct.m104639c(oVar, (CancellationException) null);
        }
        C120125a aVar3 = C120125a.NONE;
        int ordinal = aVar2.ordinal();
        if (ordinal == 0) {
            return C69788q.f186170a;
        }
        if (ordinal == 1) {
            C120140p pVar = C120140p.NAVIGATION;
            C69648ae aeVar = this.f334361b;
            C120132h hVar = this.f334362c.f334363a;
            C120138n nVar = (C120138n) C120141q.f334384c.createBuilder();
            C69664n.m101060f(nVar, "newBuilder()");
            C69664n.m101061g(nVar, "builder");
            C69664n.m101061g(pVar, "value");
            nVar.copyOnWrite();
            C120141q qVar = (C120141q) nVar.instance;
            qVar.f334387b = pVar.f334383c;
            qVar.f334386a |= 1;
            C62942bv build = nVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C120141q qVar2 = (C120141q) build;
            C70334de deVar = new C70334de();
            C69664n.m101061g(qVar2, "request");
            aeVar.f186027a = C71594u.m104517d(C70748n.m103449b(hVar.f189039a, C120129e.m199069a(), qVar2, hVar.f189040b, deVar), this.f334362c.f334364b);
            return C69788q.f186170a;
        }
        throw new C69677g();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120126b bVar = new C120126b(this.f334361b, this.f334362c, gVar);
        bVar.f334360a = obj;
        return bVar;
    }
}
