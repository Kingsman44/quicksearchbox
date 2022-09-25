package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120725a;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120750b;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120751c;
import com.google.android.libraries.search.p3055n.C39652cf;
import com.google.android.libraries.search.p3055n.C39653cg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65189ew;
import com.google.protos.p4985f.p5030q.C65190ex;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.protos.p4985f.p5030q.C65204fk;
import com.google.protos.p4985f.p5030q.C65206fm;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71592s;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.h */
/* compiled from: PG */
final class C120733h implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71389v f335794a;

    /* renamed from: b */
    final /* synthetic */ C120737l f335795b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f335796c;

    /* renamed from: d */
    final /* synthetic */ C71389v f335797d;

    public C120733h(C71389v vVar, C120737l lVar, C69644aa aaVar, C71389v vVar2) {
        this.f335794a = vVar;
        this.f335795b = lVar;
        this.f335796c = aaVar;
        this.f335797d = vVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C71587n nVar;
        C120751c cVar = (C120751c) obj;
        if (cVar instanceof C120725a) {
            C71389v vVar = this.f335794a;
            C120739n nVar2 = this.f335795b.f335811c;
            C58485gu guVar = ((C120725a) cVar).f335775a;
            C69664n.m101061g(guVar, "interactions");
            C65185es esVar = (C65185es) C65191ey.f176424p.createBuilder();
            C69664n.m101060f(esVar, "newBuilder()");
            C65204fk a = C69664n.m101061g(esVar, "builder");
            long andIncrement = nVar2.f335822a.getAndIncrement();
            C65185es esVar2 = a.f176484a;
            esVar2.copyOnWrite();
            ((C65191ey) esVar2.instance).f176431f = andIncrement;
            C65189ew ewVar = (C65189ew) C65190ex.f176421b.createBuilder();
            C69664n.m101060f(ewVar, "newBuilder()");
            C65206fm a2 = C69664n.m101061g(ewVar, "builder");
            a2.mo59356c();
            a2.mo59355b(guVar);
            C65190ex a3 = a2.mo59354a();
            C69664n.m101061g(a3, "value");
            C65185es esVar3 = a.f176484a;
            esVar3.copyOnWrite();
            C65191ey eyVar = (C65191ey) esVar3.instance;
            a3.getClass();
            eyVar.f176428c = a3;
            eyVar.f176427b = 7;
            Object v = vVar.mo62729v(a.mo59352a(), gVar);
            if (v != C69554a.COROUTINE_SUSPENDED) {
                return C69788q.f186170a;
            }
            return v;
        }
        if (cVar instanceof C120750b) {
            C69644aa aaVar = this.f335796c;
            if (!aaVar.f186023a) {
                aaVar.f186023a = true;
                C120737l lVar = this.f335795b;
                C71389v vVar2 = this.f335794a;
                C71389v vVar3 = this.f335797d;
                C120749x xVar = lVar.f335810b;
                C59052c cVar2 = (C59052c) xVar.f335854e.mo56224b();
                cVar2.mo56379ah(new C59094n(35585));
                cVar2.mo56386p("Starting speech recognizer");
                C59052c cVar3 = (C59052c) xVar.f335854e.mo56224b();
                cVar3.mo56379ah(new C59094n(35586));
                cVar3.mo56386p("Starting SODA session");
                try {
                    C39653cg cgVar = xVar.f335851b;
                    nVar = C71536cm.m104384b(C70748n.m103448a(cgVar.f189039a, C39652cf.m69119c(), C71592s.m104510d(xVar.f335855f), cgVar.f189040b, new C70334de()), new C120747v(xVar, (C69577g) null));
                } catch (Exception e) {
                    C59052c cVar4 = (C59052c) ((C59052c) xVar.f335854e.mo56225c()).mo56382g(e);
                    cVar4.mo56379ah(new C59094n(35587));
                    cVar4.mo56389s("Soda session exception: %s", e);
                    nVar = new C71552db(new C120748w((C69577g) null));
                }
                xVar.f335857h.mo38849b(new C120741p(C71803m.m105043d(xVar.f335850a, (C69585o) null, (C71424ay) null, new C120742q(xVar, (C69577g) null), 3)));
                lVar.f335812d.mo38849b(new C120729d(C71803m.m105043d(lVar.f335809a, (C69585o) null, (C71424ay) null, new C120731f(vVar3, nVar, vVar2, lVar, (C69577g) null), 3)));
                C69788q qVar = C69788q.f186170a;
                return qVar != C69554a.COROUTINE_SUSPENDED ? C69788q.f186170a : qVar;
            }
        }
        return C69788q.f186170a;
    }
}
