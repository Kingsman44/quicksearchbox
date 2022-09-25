package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91786aj;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105413u;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105454x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dt */
/* compiled from: PG */
public final class C105279dt extends C23056g implements C105413u {

    /* renamed from: a */
    public final C91097g f293736a;

    /* renamed from: b */
    private final C105454x f293737b;

    /* renamed from: c */
    private final C86124t f293738c;

    public C105279dt(C23052c cVar, C105454x xVar, C91097g gVar, C86124t tVar) {
        super(cVar);
        this.f293737b = xVar;
        this.f293736a = gVar;
        this.f293738c = tVar;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91786aj ajVar = (C91786aj) C23245b.m43557b(protoParcelable, C91786aj.f255953c.getParserForType(), C62921ba.m95368a(), true);
        ajVar.getClass();
        ((C105192an) this.f293737b).f293379a.mo28730f(Boolean.valueOf(ajVar.f255956b), false);
        ((C105192an) this.f293737b).f293380b.mo28730f(Boolean.valueOf(this.f293738c.mo79746e(C90010bp.f246918N)), false);
    }
}
