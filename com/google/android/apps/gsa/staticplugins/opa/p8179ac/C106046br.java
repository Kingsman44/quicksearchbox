package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.p386ak.C8396l;
import com.google.p386ak.C8397m;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8400p;
import com.google.p386ak.C8401q;
import com.google.p386ak.C8402r;
import com.google.p386ak.C8404t;
import com.google.p386ak.p388b.C8331ae;
import com.google.p386ak.p388b.C8332af;
import com.google.p386ak.p388b.C8336aj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62987df;
import com.google.protobuf.C62988dg;
import com.google.protobuf.C63034ez;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import java.lang.reflect.Type;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.br */
/* compiled from: PG */
public final class C106046br implements C8397m {
    /* renamed from: b */
    private static C63063ga m176657b(C8398n nVar) {
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        if (nVar instanceof C8404t) {
            C8404t h = nVar.mo17162h();
            Object obj = h.f29256a;
            if (obj instanceof Number) {
                double doubleValue = h.mo17173a().doubleValue();
                fyVar.copyOnWrite();
                C63063ga gaVar = (C63063ga) fyVar.instance;
                gaVar.f170181a = 2;
                gaVar.f170182b = Double.valueOf(doubleValue);
            } else if (obj instanceof String) {
                String d = h.mo17154d();
                fyVar.copyOnWrite();
                C63063ga gaVar2 = (C63063ga) fyVar.instance;
                d.getClass();
                gaVar2.f170181a = 3;
                gaVar2.f170182b = d;
            } else if (obj instanceof Boolean) {
                boolean e = h.mo17155e();
                fyVar.copyOnWrite();
                C63063ga gaVar3 = (C63063ga) fyVar.instance;
                gaVar3.f170181a = 4;
                gaVar3.f170182b = Boolean.valueOf(e);
            }
        } else {
            if (nVar instanceof C8400p) {
                fyVar.copyOnWrite();
                C63063ga gaVar4 = (C63063ga) fyVar.instance;
                gaVar4.f170182b = 0;
                gaVar4.f170181a = 1;
            } else if (nVar instanceof C8401q) {
                C8401q g = nVar.mo17161g();
                C63034ez ezVar = (C63034ez) C63037fb.f170144b.createBuilder();
                C8331ae aeVar = new C8331ae((C8332af) g.f29255a.entrySet());
                while (aeVar.hasNext()) {
                    C8336aj a = aeVar.mo17064a();
                    ezVar.mo59079a((String) a.f29157f, m176657b((C8398n) a.f29159h));
                }
                C63037fb fbVar = (C63037fb) ezVar.build();
                fyVar.copyOnWrite();
                C63063ga gaVar5 = (C63063ga) fyVar.instance;
                fbVar.getClass();
                gaVar5.f170182b = fbVar;
                gaVar5.f170181a = 5;
            } else if (nVar instanceof C8396l) {
                C62987df dfVar = (C62987df) C62988dg.f170043b.createBuilder();
                C8396l f = nVar.mo17160f();
                int a2 = f.mo17151a();
                for (int i = 0; i < a2; i++) {
                    C63063ga b = m176657b(f.mo17153c(i));
                    dfVar.copyOnWrite();
                    C62988dg dgVar = (C62988dg) dfVar.instance;
                    b.getClass();
                    C62971cq cqVar = dgVar.f170045a;
                    if (!cqVar.mo58948c()) {
                        dgVar.f170045a = C62942bv.mutableCopy(cqVar);
                    }
                    dgVar.f170045a.add(b);
                }
                fyVar.copyOnWrite();
                C63063ga gaVar6 = (C63063ga) fyVar.instance;
                C62988dg dgVar2 = (C62988dg) dfVar.build();
                dgVar2.getClass();
                gaVar6.f170182b = dgVar2;
                gaVar6.f170181a = 6;
            } else {
                throw new C8402r("This json element is not in valid format");
            }
        }
        return (C63063ga) fyVar.build();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17159a(C8398n nVar, Type type) {
        nVar.getClass();
        type.getClass();
        return m176657b(nVar);
    }
}
