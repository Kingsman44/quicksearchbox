package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87310ai;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90232h;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91795b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105440j;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.bi */
/* compiled from: PG */
public final class C105214bi extends C23056g implements C90232h {

    /* renamed from: a */
    private final C105440j f293474a;

    public C105214bi(C23052c cVar, C105440j jVar) {
        super(cVar);
        this.f293474a = jVar;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91795b bVar = (C91795b) C23245b.m43557b(protoParcelable, C91795b.f255983c.getParserForType(), C62921ba.m95368a(), true);
        if (bVar != null) {
            C23251a aVar = ((C105182ad) this.f293474a).f293309c;
            C90229e a = C90229e.m146771a(bVar.f255986b);
            if (a == null) {
                a = C90229e.UNKNOWN;
            }
            aVar.mo28730f(C58833ax.m90834k(a), false);
        }
    }

    /* renamed from: iv */
    public final void mo83943iv(C90231g gVar) {
        if (gVar instanceof C87310ai) {
            C87310ai aiVar = (C87310ai) gVar;
            ((C105182ad) this.f293474a).f293308b.mo28730f((String) aiVar.f235795a.f252077a, false);
            ((C105182ad) this.f293474a).f293307a.mo28730f((Boolean) aiVar.f235796b.f252077a, false);
        }
    }
}
