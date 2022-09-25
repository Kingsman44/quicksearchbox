package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.aei;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.assistant.p3931f.p3940d.p3941a.C52861ak;
import com.google.assistant.p3931f.p3940d.p3941a.C52862al;
import com.google.assistant.p3931f.p3940d.p3941a.C52891bn;
import com.google.assistant.p3931f.p3940d.p3941a.C52896c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.f */
/* compiled from: PG */
final class C120950f implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C70862aj f336273a;

    /* renamed from: b */
    final /* synthetic */ int f336274b;

    /* renamed from: c */
    final /* synthetic */ C120917am f336275c;

    /* renamed from: d */
    final /* synthetic */ C71422aw f336276d;

    /* renamed from: e */
    final /* synthetic */ C52896c f336277e;

    public C120950f(C70862aj ajVar, int i, C120917am amVar, C71422aw awVar, C52896c cVar) {
        this.f336273a = ajVar;
        this.f336274b = i;
        this.f336275c = amVar;
        this.f336276d = awVar;
        this.f336277e = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        Object obj2;
        C120933bb bbVar = (C120933bb) obj;
        if (bbVar == null) {
            return C69788q.f186170a;
        }
        if (bbVar instanceof C120944bm) {
            C120944bm bmVar = (C120944bm) bbVar;
            C70862aj ajVar = this.f336273a;
            int i = this.f336274b;
            C69664n.m101061g(ajVar, "requestObserver");
            aei aei = bmVar.f336258a;
            C62940bt r2 = C62942bv.checkIsLite(C48775a.f126213e);
            aei.mo58887l(r2);
            if (aei.f169962ag.mo58857o(r2.f169971d)) {
                C52861ak akVar = (C52861ak) C52862al.f138692c.createBuilder();
                C69664n.m101060f(akVar, "newBuilder()");
                C52891bn a = C69664n.m101061g(akVar, "builder");
                C52861ak akVar2 = a.f138732a;
                akVar2.copyOnWrite();
                ((C52862al) akVar2.instance).f138694a = i;
                aei aei2 = bmVar.f336258a;
                C62940bt r0 = C62942bv.checkIsLite(C48775a.f126213e);
                aei2.mo58887l(r0);
                Object l = aei2.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj2 = r0.f169969b;
                } else {
                    obj2 = r0.mo58889c(l);
                }
                C69664n.m101060f(obj2, "args.getExtension(\n     …mentRequest\n            )");
                a.mo53937b((C52846w) obj2);
                ajVar.mo20123c(a.mo53936a());
            }
        } else if (bbVar instanceof C120943bl) {
            this.f336273a.mo20121a();
        } else if (bbVar instanceof C120939bh) {
            C120917am amVar = this.f336275c;
            C71422aw awVar = this.f336276d;
            List list = ((C120939bh) bbVar).f336252a;
            int i2 = this.f336274b;
            C52896c cVar = this.f336277e;
            C69664n.m101060f(cVar, "futureStub");
            C71803m.m105043d(awVar, amVar.f336181b, (C71424ay) null, new C120907ac(amVar, list, cVar, i2, (C69577g) null), 2);
        } else {
            new StringBuilder("Received unknown host event ").append(bbVar);
            throw new RuntimeException("Received unknown host event ".concat(bbVar.toString()));
        }
        return C69788q.f186170a;
    }
}
