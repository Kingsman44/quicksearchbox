package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65188ev;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.protos.p4985f.p5030q.C65204fk;
import com.google.protos.p4985f.p5030q.p5031a.C64986a;
import com.google.protos.p4985f.p5030q.p5031a.C64987b;
import com.google.speech.p5218j.C67082kj;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67087ko;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.e */
/* compiled from: PG */
final class C120730e implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71389v f335786a;

    /* renamed from: b */
    final /* synthetic */ C120737l f335787b;

    public C120730e(C71389v vVar, C120737l lVar) {
        this.f335786a = vVar;
        this.f335787b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C65188ev evVar;
        C67087ko koVar = (C67087ko) obj;
        C71389v vVar = this.f335786a;
        C120739n nVar = this.f335787b.f335811c;
        C69664n.m101061g(koVar, "sodaEvent");
        C67083kk kkVar = koVar.f182370c;
        if (kkVar == null) {
            kkVar = C67083kk.f182351g;
        }
        int a = C67082kj.m97421a(kkVar.f182354b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                evVar = C65188ev.REQUEST_TYPE_FINAL;
            } else if (i != 2) {
                evVar = C65188ev.REQUEST_TYPE_UNSPECIFIED;
            } else {
                evVar = C65188ev.REQUEST_TYPE_PREFETCH;
            }
            C65185es esVar = (C65185es) C65191ey.f176424p.createBuilder();
            C69664n.m101060f(esVar, "newBuilder()");
            C65204fk a2 = C69664n.m101061g(esVar, "builder");
            long andIncrement = nVar.f335822a.getAndIncrement();
            C65185es esVar2 = a2.f176484a;
            esVar2.copyOnWrite();
            ((C65191ey) esVar2.instance).f176431f = andIncrement;
            a2.mo59353b(evVar);
            C64986a aVar = (C64986a) C64987b.f175977b.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            List unmodifiableList = Collections.unmodifiableList(((C64987b) aVar.instance).f175979a);
            C69664n.m101060f(unmodifiableList, "_builder.getSodaEventsList()");
            new C62883b(unmodifiableList);
            List b = C69540x.m100944b(koVar);
            C69664n.m101061g(b, "values");
            aVar.copyOnWrite();
            C64987b bVar = (C64987b) aVar.instance;
            C62971cq cqVar = bVar.f175979a;
            if (!cqVar.mo58948c()) {
                bVar.f175979a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) b, (List) bVar.f175979a);
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C64987b bVar2 = (C64987b) build;
            C69664n.m101061g(bVar2, "value");
            C65185es esVar3 = a2.f176484a;
            esVar3.copyOnWrite();
            C65191ey eyVar = (C65191ey) esVar3.instance;
            bVar2.getClass();
            eyVar.f176428c = bVar2;
            eyVar.f176427b = 14;
            Object v = vVar.mo62729v(a2.mo59352a(), gVar);
            return v == C69554a.COROUTINE_SUSPENDED ? v : C69788q.f186170a;
        }
        throw null;
    }
}
