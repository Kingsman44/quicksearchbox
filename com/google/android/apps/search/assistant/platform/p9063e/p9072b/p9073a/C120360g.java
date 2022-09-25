package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119683b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119692k;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3910e.p3911a.C51197l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.concurrent.ConcurrentMap;
import p5535j.p5536a.p5545c.p5548c.C71143c;
import p5535j.p5536a.p5545c.p5548c.C71152f;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.g */
/* compiled from: PG */
final class C120360g implements C17268f {

    /* renamed from: a */
    private final C119692k f334854a;

    /* renamed from: b */
    private final C120333f f334855b;

    public C120360g(C119692k kVar, C120333f fVar) {
        this.f334854a = kVar;
        this.f334855b = fVar;
    }

    /* renamed from: a */
    public final void mo23256a() {
        this.f334854a.mo104482b((Throwable) null);
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        this.f334854a.mo104482b(th);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C51197l.f133283f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C51197l.f133283f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C51197l lVar = (C51197l) obj;
            C120333f fVar = this.f334855b;
            String str = lVar.f133286b;
            if (!((AtomicBoolean) ConcurrentMap.EL.computeIfAbsent(fVar.f334789b, str, C120299e.f334708a)).getAndSet(true)) {
                C37215b bVar = fVar.f334788a;
                C37258g gVar = C37176a.f96887bE;
                C62940bt btVar = C71152f.f189814g;
                C71143c cVar = (C71143c) C71152f.f189813f.createBuilder();
                cVar.copyOnWrite();
                C71152f fVar2 = (C71152f) cVar.instance;
                str.getClass();
                fVar2.f189816a |= 2;
                fVar2.f189818c = str;
                bVar.mo19974a(gVar.mo40812e(btVar, (C71152f) cVar.build()));
            }
            if ((lVar.f133285a & 8) != 0 && lVar.f133288d) {
                C120333f fVar3 = this.f334855b;
                String str2 = lVar.f133286b;
                C37215b bVar2 = fVar3.f334788a;
                C37258g gVar2 = C37176a.f96888bF;
                C62940bt btVar2 = C71152f.f189814g;
                C71143c cVar2 = (C71143c) C71152f.f189813f.createBuilder();
                cVar2.copyOnWrite();
                C71152f fVar4 = (C71152f) cVar2.instance;
                str2.getClass();
                fVar4.f189816a |= 2;
                fVar4.f189818c = str2;
                bVar2.mo19974a(gVar2.mo40812e(btVar2, (C71152f) cVar2.build()));
            }
            C119692k kVar = this.f334854a;
            if ((lVar.f133285a & 1) != 0) {
                kVar.f333500d.execute(C47810es.m84977q(new C119683b(kVar, lVar)));
                return;
            }
            C59104x d = C119692k.f333497a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvEngine.DynamicServices");
            ((C59052c) ((C59052c) d).mo56372aa(34557)).mo56386p("Received AssistantStreamChunk without streamId; ignoring.");
        }
    }
}
