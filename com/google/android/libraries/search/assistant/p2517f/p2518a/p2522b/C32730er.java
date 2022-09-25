package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32598c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32819bn;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32823br;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SourceService$fetchFreshContextAsync$1$result$1$1", mo61344c = "SourceService.kt", mo61345d = "invokeSuspend", mo61346e = {404})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.er */
/* compiled from: PG */
final class C32730er extends C69572j implements C69630p {

    /* renamed from: a */
    Object f87735a;

    /* renamed from: b */
    int f87736b;

    /* renamed from: c */
    final /* synthetic */ C32750fk f87737c;

    /* renamed from: d */
    final /* synthetic */ C32785ag f87738d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32730er(C32750fk fkVar, C32785ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f87737c = fkVar;
        this.f87738d = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32730er) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C60870cx cxVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87736b != 0) {
            obj2 = this.f87735a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C58872ci d = C58872ci.m90947d(this.f87737c.f87874m);
            C32598c cVar = this.f87737c.f87867f;
            C32879y yVar = this.f87738d.f87960b;
            if (yVar == null) {
                yVar = C32879y.f88112f;
            }
            C32810be beVar = yVar.f88115b;
            if (beVar == null) {
                beVar = C32810be.f87993c;
            }
            C32796ar arVar = beVar.f87996b;
            if (arVar == null) {
                arVar = C32796ar.f87973c;
            }
            C32602g.m60429b(arVar);
            C58495hd hdVar = cVar.f87291a;
            C32796ar arVar2 = beVar.f87996b;
            if (arVar2 == null) {
                arVar2 = C32796ar.f87973c;
            }
            C32597b bVar = (C32597b) hdVar.get(arVar2);
            if (bVar == null) {
                cxVar = C60856cj.m92899h(new C70761fa(Status.f186914l, (C70334de) null, true));
            } else {
                cxVar = bVar.mo38175e(beVar);
            }
            C69664n.m101060f(cxVar, "registry.fetchContext(re…uest.fetchContextRequest)");
            this.f87735a = d;
            this.f87736b = 1;
            Object c = C71663i.m104690c(cxVar, this);
            if (c == aVar) {
                return aVar;
            }
            obj2 = d;
            obj = c;
        }
        C32801aw awVar = (C32801aw) obj;
        C32819bn bnVar = (C32819bn) C32821bp.f88014d.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C32823br a = C69664n.m101061g(bnVar, "builder");
        C69664n.m101060f(awVar, "freshContext");
        C69664n.m101061g(awVar, "value");
        C32819bn bnVar2 = a.f88020a;
        bnVar2.copyOnWrite();
        awVar.getClass();
        ((C32821bp) bnVar2.instance).f88016a = awVar;
        a.mo38314c(C32820bo.CONTEXT_PROVIDER);
        Duration ofNanos = Duration.ofNanos(((C58872ci) obj2).mo56159b());
        C69664n.m101060f(ofNanos, "stopwatch.elapsed()");
        a.mo38313b(C62949a.m95466a(ofNanos));
        return a.mo38312a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32730er(this.f87737c, this.f87738d, gVar);
    }
}
