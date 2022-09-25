package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131233b;
import com.google.assistant.p3886c.C50749bn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50813dj;
import com.google.common.p4552o.akf;
import com.google.common.p4552o.akg;
import com.google.common.p4552o.akm;
import com.google.common.p4552o.akn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ba */
/* compiled from: PG */
final class C130916ba {
    /* renamed from: a */
    static akn m213451a(C50813dj djVar, C50794cr crVar) {
        Object obj;
        C50794cr crVar2 = C50794cr.UNDEFINED;
        if (crVar.ordinal() != 2) {
            return akn.f158974a;
        }
        C62940bt r3 = C62942bv.checkIsLite(C50749bn.f132064d);
        djVar.mo58887l(r3);
        if (!djVar.f169962ag.mo58857o(r3.f169971d)) {
            return akn.f158974a;
        }
        akf akf = (akf) akg.f158961c.createBuilder();
        C62940bt r0 = C62942bv.checkIsLite(C50749bn.f132064d);
        djVar.mo58887l(r0);
        Object l = djVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        boolean e = C131233b.m213727e((C50749bn) obj);
        akf.copyOnWrite();
        akg akg = (akg) akf.instance;
        akg.f158964a |= 1;
        akg.f158965b = e;
        akm akm = (akm) akn.f158974a.createBuilder();
        akm.mo58885m(akg.f158962d, (akg) akf.build());
        return (akn) akm.build();
    }
}
