package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3897e.p3921j.amr;
import com.google.assistant.p3897e.p3921j.ams;
import com.google.p386ak.C8396l;
import com.google.p386ak.C8397m;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8401q;
import com.google.p386ak.p388b.C8331ae;
import com.google.p386ak.p388b.C8332af;
import com.google.p386ak.p388b.C8336aj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.lang.reflect.Type;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.o */
/* compiled from: PG */
public final class C106059o implements C8397m {
    /* renamed from: a */
    public final /* synthetic */ Object mo17159a(C8398n nVar, Type type) {
        Object obj;
        Object obj2;
        nVar.getClass();
        type.getClass();
        C8401q g = nVar.mo17161g();
        amr amr = (amr) ams.f135389d.createBuilder();
        C8331ae aeVar = new C8331ae((C8332af) g.f29255a.entrySet());
        while (aeVar.hasNext()) {
            C8336aj a = aeVar.mo17064a();
            if ("triggerPhrase".equals(a.f29157f) && (obj2 = a.f29159h) != null) {
                String d = ((C8398n) obj2).mo17154d();
                amr.copyOnWrite();
                ams ams = (ams) amr.instance;
                d.getClass();
                ams.f135391a |= 1;
                ams.f135392b = d;
            }
            if ("alternativeTriggerPhrases".equals(a.f29157f) && (obj = a.f29159h) != null) {
                C8396l f = ((C8398n) obj).mo17160f();
                for (int i = 0; i < f.mo17151a(); i++) {
                    String d2 = f.mo17153c(i).mo17154d();
                    amr.copyOnWrite();
                    ams ams2 = (ams) amr.instance;
                    d2.getClass();
                    C62971cq cqVar = ams2.f135393c;
                    if (!cqVar.mo58948c()) {
                        ams2.f135393c = C62942bv.mutableCopy(cqVar);
                    }
                    ams2.f135393c.add(d2);
                }
            }
        }
        return (ams) amr.build();
    }
}
