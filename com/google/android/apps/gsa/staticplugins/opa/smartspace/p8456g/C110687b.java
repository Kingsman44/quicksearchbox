package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g;

import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50753br;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50844p;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.g.b */
/* compiled from: PG */
public final /* synthetic */ class C110687b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110688c f308424a;

    /* renamed from: b */
    public final /* synthetic */ C53190es f308425b;

    public /* synthetic */ C110687b(C110688c cVar, C53190es esVar) {
        this.f308424a = cVar;
        this.f308425b = esVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Object obj2;
        C110688c cVar = this.f308424a;
        C53190es esVar = this.f308425b;
        C50818do doVar = (C50818do) obj;
        if (doVar != null) {
            C50813dj djVar = doVar.f132329z;
            if (djVar == null) {
                djVar = C50813dj.f132278a;
            }
            C62940bt r2 = C62942bv.checkIsLite(C50753br.f132074d);
            djVar.mo58887l(r2);
            if (djVar.f169962ag.mo58857o(r2.f169971d)) {
                C58976aa aaVar = C58975e.f156826a;
                C50813dj djVar2 = doVar.f132329z;
                if (djVar2 == null) {
                    djVar2 = C50813dj.f132278a;
                }
                C62940bt r22 = C62942bv.checkIsLite(C50753br.f132074d);
                djVar2.mo58887l(r22);
                Object l = djVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj2 = r22.f169969b;
                } else {
                    obj2 = r22.mo58889c(l);
                }
                if (((C50753br) obj2).f132077b == null) {
                    C50844p pVar = C50844p.f132387m;
                }
            }
            C83798n k = C83800p.m133473k();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            amVar.f228252c = doVar;
            amVar.f228250a |= 4;
            C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
            C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
            aiVar.copyOnWrite();
            C83738aj ajVar = (C83738aj) aiVar.instance;
            esVar.getClass();
            ajVar.f228229b = esVar;
            ajVar.f228228a = 4;
            C83738aj ajVar2 = (C83738aj) aiVar.build();
            abVar.copyOnWrite();
            C83739ak akVar = (C83739ak) abVar.instance;
            ajVar2.getClass();
            akVar.f228233b = ajVar2;
            akVar.f228232a |= 1;
            C83739ak akVar2 = (C83739ak) abVar.build();
            alVar.copyOnWrite();
            C83741am amVar2 = (C83741am) alVar.instance;
            akVar2.getClass();
            amVar2.f228251b = akVar2;
            amVar2.f228250a |= 2;
            k.mo77043b((C83741am) alVar.build());
            return C60856cj.m92900i(k.mo77042a());
        }
        cVar.f308428b.mo109871G("CAN_NOT_CONSTRUCT_FLIGHT_CARD");
        return C60856cj.m92899h(new IllegalStateException("Flight card for Smartspace could not be constructed"));
    }
}
