package com.google.android.apps.gsa.staticplugins.p8770t.p8771a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87301a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90221a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90232h;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.p8770t.p8772b.C117459a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.t.a.a */
/* compiled from: PG */
public final class C117456a extends C23056g implements C90232h {

    /* renamed from: a */
    private static final C59071e f326013a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.t.a.a");

    /* renamed from: b */
    private final C117459a f326014b;

    public C117456a(C23052c cVar, C117459a aVar) {
        super(cVar);
        this.f326014b = aVar;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iv */
    public final void mo83943iv(C90231g gVar) {
        if (!(gVar instanceof C87301a)) {
            C59104x d = f326013a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BottomTooltipController");
            ((C59052c) ((C59052c) d).mo56372aa(18237)).mo56386p("Failed to show tooltip: Trying to set params of invalid type");
            int i = C90755l.f253831a;
            C90221a aVar = (C90221a) C90224d.f252050l.createBuilder();
            aVar.copyOnWrite();
            C90224d dVar = (C90224d) aVar.instance;
            dVar.f252053b = 0;
            dVar.f252052a |= 1;
            ((C23251a) this.f326014b.mo103311b()).mo28730f((C90224d) aVar.build(), false);
            return;
        }
        ((C23251a) this.f326014b.mo103311b()).mo28730f(((C87301a) gVar).f235767a, false);
    }
}
