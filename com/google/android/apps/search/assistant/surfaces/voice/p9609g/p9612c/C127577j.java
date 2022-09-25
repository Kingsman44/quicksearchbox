package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127550n;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127553q;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127559w;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127560x;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.InvocationResourceCleanup$launchSearchProcessMonitorJob$1", mo61344c = "InvocationResourceCleanup.kt", mo61345d = "invokeSuspend", mo61346e = {209})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.j */
/* compiled from: PG */
final class C127577j extends C69572j implements C69630p {

    /* renamed from: a */
    int f351251a;

    /* renamed from: b */
    final /* synthetic */ C127579l f351252b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127577j(C127579l lVar, C69577g gVar) {
        super(2, gVar);
        this.f351252b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127577j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351251a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127553q qVar = this.f351252b.f351262c;
            C127559w wVar = (C127559w) C127560x.f351206a.createBuilder();
            C69664n.m101060f(wVar, "newBuilder()");
            C69664n.m101061g(wVar, "builder");
            C62942bv build = wVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C127560x xVar = (C127560x) build;
            C70334de deVar = new C70334de();
            C69664n.m101061g(xVar, "request");
            C71587n b = C71486aq.m104308b(C70748n.m103449b(qVar.f189039a, C127550n.m208527a(), xVar, qVar.f189040b, deVar), new C127575h(this.f351252b, (C69577g) null));
            C127576i iVar = new C127576i((C69577g) null);
            this.f351251a = 1;
            if (C71594u.m104515b(b, iVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127577j(this.f351252b, gVar);
    }
}
