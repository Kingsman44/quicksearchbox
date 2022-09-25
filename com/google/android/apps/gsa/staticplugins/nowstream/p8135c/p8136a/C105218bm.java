package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105442l;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.bm */
/* compiled from: PG */
public final class C105218bm extends C105307x {
    public C105218bm(C23052c cVar, C105442l lVar, Context context, C91097g gVar, C68214a aVar, C86124t tVar, C84515a aVar2, C58833ax axVar, C68214a aVar3, C68214a aVar4, C87571n nVar, C105367a aVar5, C58833ax axVar2, C89859i iVar) {
        super(cVar, lVar, context, gVar, aVar, tVar, aVar2, axVar, aVar3, aVar4, nVar, aVar5, axVar2, iVar);
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if (str.equals("EVENT_LOGO_CLICKED")) {
            this.f293806a.mo65089a(this.f293810e.mo78218a("and.gsa.monet.minus1", C90208n.INTERESTS_TAB, false));
            return;
        }
        super.mo28493N(str, str2, parcelable);
    }

    /* renamed from: e */
    public final boolean mo94663e() {
        return !this.f293809d.mo79746e(C90010bp.f246967aj);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        super.mo28439iD(protoParcelable);
        ((C23251a) ((C105442l) this.f293808c).mo94610f()).mo28730f(Boolean.valueOf(this.f293811f), false);
        ((C23251a) ((C105442l) this.f293808c).mo94611g()).mo28730f(Boolean.valueOf(this.f293809d.mo79746e(C90010bp.f246968ak)), false);
        ((C23251a) ((C105442l) this.f293808c).mo94608d()).mo28730f(Boolean.valueOf(this.f293809d.mo79746e(C90010bp.f246967aj)), false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C23251a aVar = (C23251a) ((C105442l) this.f293808c).mo94612h();
        boolean z = true;
        if (!((C85651bb) this.f293807b.mo27525b()).mo79134G() && !((C85651bb) this.f293807b.mo27525b()).mo79132E()) {
            z = false;
        }
        aVar.mo28730f(Boolean.valueOf(z), false);
        ((C23251a) ((C105442l) this.f293808c).mo94613i()).mo28730f(Boolean.valueOf(this.f293809d.mo79746e(C90010bp.f246961ad)), false);
        super.mo28498iE();
    }
}
