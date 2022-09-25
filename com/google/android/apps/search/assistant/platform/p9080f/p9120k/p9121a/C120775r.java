package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119354k;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36113e;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36114f;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import p5462h.C69692j;
import p5462h.C69714l;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.r */
/* compiled from: PG */
final class C120775r extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C120777t f335894a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120775r(C120777t tVar) {
        super(0);
        this.f335894a = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        Object obj;
        Object obj2;
        Object obj3;
        C58485gu c = this.f335894a.f335900d.mo104605c();
        C69664n.m101060f(c, "clientExecutionProxy\n      .supportedClientOps()");
        Iterator it = c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C69664n.m101066l(((C51785da) obj2).f135878b, "apa.HANDOVER_TO_OPA")) {
                break;
            }
        }
        C51785da daVar = (C51785da) obj2;
        if (daVar != null) {
            C52230ka kaVar = daVar.f135880d;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            if (kaVar != null) {
                try {
                    obj3 = (C36114f) C119354k.f332771c.mo38880b(kaVar);
                } catch (Throwable th) {
                    obj3 = C69714l.m101133a(th);
                }
                if (true != (obj3 instanceof C69692j)) {
                    obj = obj3;
                }
                C36114f fVar = (C36114f) obj;
                if (fVar != null) {
                    return fVar;
                }
            }
        }
        C36113e eVar = (C36113e) C36114f.f94447b.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        return C69664n.m101061g(eVar, "builder").mo39971a();
    }
}
