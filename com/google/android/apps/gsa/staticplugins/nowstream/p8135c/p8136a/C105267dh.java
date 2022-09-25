package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91819z;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105408p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105446p;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dh */
/* compiled from: PG */
public final class C105267dh extends C23056g implements C105408p {

    /* renamed from: c */
    private static final C59071e f293679c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.a.dh");

    /* renamed from: a */
    public final C86124t f293680a;

    /* renamed from: b */
    public final C91097g f293681b;

    /* renamed from: d */
    private final C105446p f293682d;

    public C105267dh(C23052c cVar, C105446p pVar, C86124t tVar, C91097g gVar) {
        super(cVar);
        this.f293682d = pVar;
        this.f293680a = tVar;
        this.f293681b = gVar;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C91819z zVar = (C91819z) C62942bv.parseFrom((C62942bv) C91819z.f256081c, protoParcelable.mo28513b(), C62921ba.m95368a());
            ((C23251a) this.f293682d.mo94638b()).mo28730f(Boolean.valueOf(zVar.f256083a), false);
            ((C23251a) this.f293682d.mo94641e()).mo28730f(Boolean.valueOf(zVar.f256084b), false);
        } catch (C62974ct e) {
            C59104x c = f293679c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PJFooterController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(22281)).mo56386p("Unable to parse input proto.");
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C58976aa aaVar = C58975e.f156826a;
        ((C23251a) this.f293682d.mo94639c()).mo28730f(this.f293680a.mo79758x(C90010bp.f246932aA), false);
        ((C23251a) this.f293682d.mo94640d()).mo28730f(this.f293680a.mo79758x(C90010bp.f246933aB), false);
    }
}
