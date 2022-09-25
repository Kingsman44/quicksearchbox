package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.contacts.bz;
import com.google.android.apps.gsa.contacts.ci;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.p7270c.C92220c;
import com.google.assistant.p3897e.p3917i.p3918a.C51603nv;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.assistant.p3897e.p3917i.p3918a.C51607nz;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.bh */
/* compiled from: PG */
public final class C85816bh implements C85812bd {

    /* renamed from: a */
    private static final C58817ah f232045a = new C85815bg();

    /* renamed from: b */
    private final C86124t f232046b;

    /* renamed from: c */
    private final bz f232047c;

    /* renamed from: d */
    private final C92220c f232048d;

    public C85816bh(C86124t tVar, C92220c cVar, bz bzVar) {
        this.f232046b = tVar;
        this.f232048d = cVar;
        this.f232047c = bzVar;
    }

    /* renamed from: b */
    private final C51606ny m137890b(bz bzVar, C51605nx nxVar) {
        int a = (int) this.f232046b.mo79743a(C90014bt.f247706mH);
        ci ciVar = ci.a;
        C51605nx nxVar2 = C51605nx.UNKNOWN;
        int ordinal = nxVar.ordinal();
        if (ordinal == 2) {
            ciVar = ci.b;
        } else if (ordinal == 3) {
            ciVar = ci.c;
        }
        C51603nv nvVar = (C51603nv) C51606ny.f134497d.createBuilder();
        nvVar.copyOnWrite();
        C51606ny nyVar = (C51606ny) nvVar.instance;
        nyVar.f134501c = nxVar.f134496e;
        nyVar.f134499a |= 1;
        C58485gu i = C58485gu.m89841i(C58431eu.m89654f(bzVar.d(ciVar, a)).mo55247g(f232045a).mo55248h());
        nvVar.copyOnWrite();
        C51606ny nyVar2 = (C51606ny) nvVar.instance;
        nyVar2.mo53662a();
        C62947c.addAll((Iterable) i, (List) nyVar2.f134500b);
        return (C51606ny) nvVar.build();
    }

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        if (!this.f232048d.mo86898a()) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.TopContactParams";
        C51607nz nzVar = (C51607nz) C51609oa.f134502b.createBuilder();
        nzVar.mo53663a(m137890b(this.f232047c, C51605nx.AGGREGATED));
        nzVar.mo53663a(m137890b(this.f232047c, C51605nx.CALL));
        nzVar.mo53663a(m137890b(this.f232047c, C51605nx.TEXT));
        C63088z byteString = ((C51609oa) nzVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.communication.top_contact";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
