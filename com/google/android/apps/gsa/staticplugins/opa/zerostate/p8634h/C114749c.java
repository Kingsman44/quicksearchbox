package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h;

import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51549lv;
import com.google.assistant.p3897e.p3917i.p3918a.C51551lx;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.h.c */
/* compiled from: PG */
public final class C114749c implements C85812bd {

    /* renamed from: a */
    private static final C58528ij f318453a = C58528ij.m90015O(51, 91, 57, 46, 115, 118, new Integer[0]);

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        if (!f318453a.contains(Integer.valueOf(query.mo84263a("android.opa.extra.TRIGGERED_BY")))) {
            C58976aa aaVar = C58975e.f156826a;
            query.mo84263a("android.opa.extra.TRIGGERED_BY");
            return C58836b.f156633a;
        }
        C51549lv lvVar = (C51549lv) C51551lx.f134363d.createBuilder();
        lvVar.copyOnWrite();
        C51551lx lxVar = (C51551lx) lvVar.instance;
        lxVar.f134365a |= 1;
        lxVar.f134366b = true;
        if (query.mo84263a("android.opa.extra.TRIGGERED_BY") == 115) {
            lvVar.copyOnWrite();
            C51551lx lxVar2 = (C51551lx) lvVar.instance;
            lxVar2.f134367c = 1;
            lxVar2.f134365a |= 2;
        } else if (query.mo84263a("android.opa.extra.TRIGGERED_BY") == 118) {
            lvVar.copyOnWrite();
            C51551lx lxVar3 = (C51551lx) lvVar.instance;
            lxVar3.f134367c = 2;
            lxVar3.f134365a |= 2;
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.snapshot.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.SnapshotParams";
        C63088z byteString = ((C51551lx) lvVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
