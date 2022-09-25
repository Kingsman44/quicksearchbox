package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62995dn;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.x */
/* compiled from: PG */
public final /* synthetic */ class C17734x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17695aa f50955a;

    /* renamed from: b */
    public final /* synthetic */ List f50956b;

    public /* synthetic */ C17734x(C17695aa aaVar, List list) {
        this.f50955a = aaVar;
        this.f50956b = list;
    }

    public final Object apply(Object obj) {
        C17695aa aaVar = this.f50955a;
        List list = this.f50956b;
        C48892ag agVar = (C48892ag) obj;
        C58480gp e = C58485gu.m89837e();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            String str = (String) G.next();
            if (agVar.mo53189b(str)) {
                str.getClass();
                C62995dn dnVar = agVar.f126520a;
                if (dnVar.containsKey(str)) {
                    C48917s sVar = ((C48899an) dnVar.get(str)).f126535b;
                    if (sVar == null) {
                        sVar = C48917s.f126578f;
                    }
                    C48919u uVar = sVar.f126581b;
                    if (uVar == null) {
                        uVar = C48919u.f126586g;
                    }
                    C36314g gVar = aaVar.f50880f;
                    C48900b a = C48900b.m85301a(uVar.f126589b);
                    if (a == null) {
                        a = C48900b.UNSPECIFIED;
                    }
                    String name = a.name();
                    String str2 = uVar.f126593f;
                    C48952az azVar = sVar.f126582c;
                    if (azVar == null) {
                        azVar = C48952az.f126657c;
                    }
                    String a2 = C36314g.m64795a(azVar);
                    C58976aa aaVar2 = C58975e.f156826a;
                    gVar.mo40100b(name, str2, a2, 1);
                    C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
                    pVar.copyOnWrite();
                    C48915q qVar = (C48915q) pVar.instance;
                    uVar.getClass();
                    qVar.f126577b = uVar;
                    qVar.f126576a |= 1;
                    e.mo55395g((C48915q) pVar.build());
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        return e.mo55394f();
    }
}
