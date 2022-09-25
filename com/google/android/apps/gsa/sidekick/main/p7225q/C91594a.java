package com.google.android.apps.gsa.sidekick.main.p7225q;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.gsa.sidekick.shared.training.QuestionKey;
import com.google.android.apps.p489g.p495e.C9286c;
import com.google.android.apps.p489g.p495e.C9287d;
import com.google.common.p4522b.C58662ni;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C7931pg;
import com.google.p375ai.p378b.C8005s;
import com.google.p375ai.p378b.C8032t;
import com.google.p375ai.p378b.C8139wz;
import com.google.p375ai.p378b.C8164xx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.q.a */
/* compiled from: PG */
final class C91594a implements c {

    /* renamed from: a */
    final /* synthetic */ C8164xx f255458a;

    public C91594a(C8164xx xxVar) {
        this.f255458a = xxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85955a(Object obj) {
        Iterable iterable;
        C9286c cVar = (C9286c) ((C9287d) obj).toBuilder();
        C8164xx xxVar = this.f255458a;
        if ((xxVar.f28690a & 1) != 0) {
            C8139wz wzVar = xxVar.f28691b;
            if (wzVar == null) {
                wzVar = C8139wz.f28614d;
            }
            cVar.copyOnWrite();
            C9287d dVar = (C9287d) cVar.instance;
            wzVar.getClass();
            dVar.f32236b = wzVar;
            dVar.f32235a |= 1;
        }
        if ((xxVar.f28690a & 2) != 0) {
            C7931pg pgVar = xxVar.f28692c;
            if (pgVar == null) {
                pgVar = C7931pg.f27864d;
            }
            cVar.copyOnWrite();
            C9287d dVar2 = (C9287d) cVar.instance;
            pgVar.getClass();
            dVar2.f32237c = pgVar;
            dVar2.f32235a |= 2;
        }
        if ((xxVar.f28690a & 4) != 0) {
            C8032t tVar = xxVar.f28693d;
            if (tVar == null) {
                tVar = C8032t.f28216c;
            }
            int a = C8005s.m22922a(tVar.f28219b);
            if (a == 0 || a == 1) {
                List<C7918ou> unmodifiableList = Collections.unmodifiableList(((C9287d) cVar.instance).f32238d);
                C8032t tVar2 = xxVar.f28693d;
                if (tVar2 == null) {
                    tVar2 = C8032t.f28216c;
                }
                C62971cq<C7918ou> cqVar = tVar2.f28218a;
                HashMap j = C58662ni.m90351j(unmodifiableList.size() + cqVar.size());
                for (C7918ou ouVar : unmodifiableList) {
                    j.put(new QuestionKey(ouVar), ouVar);
                }
                for (C7918ou ouVar2 : cqVar) {
                    j.put(new QuestionKey(ouVar2), ouVar2);
                }
                iterable = j.values();
            } else {
                C8032t tVar3 = xxVar.f28693d;
                if (tVar3 == null) {
                    tVar3 = C8032t.f28216c;
                }
                iterable = tVar3.f28218a;
            }
            cVar.copyOnWrite();
            ((C9287d) cVar.instance).f32238d = C9287d.emptyProtobufList();
            cVar.copyOnWrite();
            C9287d dVar3 = (C9287d) cVar.instance;
            C62971cq cqVar2 = dVar3.f32238d;
            if (!cqVar2.mo58948c()) {
                dVar3.f32238d = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll(iterable, (List) dVar3.f32238d);
        }
        return (C9287d) cVar.build();
    }
}
