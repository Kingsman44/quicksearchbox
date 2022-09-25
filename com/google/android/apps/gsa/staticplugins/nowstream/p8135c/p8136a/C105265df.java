package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91813t;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105444n;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.df */
/* compiled from: PG */
public final class C105265df extends C23056g {

    /* renamed from: a */
    private final C105444n f293676a;

    /* renamed from: b */
    private final C86124t f293677b;

    public C105265df(C23052c cVar, C105444n nVar, C86124t tVar) {
        super(cVar);
        this.f293676a = nVar;
        this.f293677b = tVar;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91813t tVar = (C91813t) C23245b.m43557b(protoParcelable, C91813t.f256060d.getParserForType(), C62921ba.m95368a(), true);
        tVar.getClass();
        ((C105187ai) this.f293676a).f293354c.mo28730f(Long.valueOf(tVar.f256063b), false);
        ((C105187ai) this.f293676a).f293352a.mo28730f(Boolean.valueOf(tVar.f256064c), false);
        ((C105187ai) this.f293676a).f293353b.mo28730f(Boolean.valueOf(this.f293677b.mo79746e(C90010bp.f246918N)), false);
    }
}
