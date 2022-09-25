package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.search.core.state.p6872d.C86913ag;
import com.google.android.apps.gsa.search.core.state.p6872d.C86921ao;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105452v;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dn */
/* compiled from: PG */
public class C105273dn extends C105307x implements C87138if {

    /* renamed from: g */
    private final C86913ag f293703g;

    /* renamed from: h */
    private final C86921ao f293704h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105273dn(C23052c cVar, C105452v vVar, Context context, C91097g gVar, C68214a aVar, C86913ag agVar, C86124t tVar, C86921ao aoVar, C84515a aVar2, C58833ax axVar, C68214a aVar3, C68214a aVar4, C87571n nVar, C105367a aVar5, C58833ax axVar2, C89859i iVar) {
        super(cVar, vVar, context, gVar, aVar, tVar, aVar2, axVar, aVar3, aVar4, nVar, aVar5, axVar2, iVar);
        this.f293703g = agVar;
        this.f293704h = aoVar;
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C86898ct.m140157al(4, 2);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        if (icVar.mo80754a(4)) {
            C86921ao aoVar = this.f293704h;
            if (aoVar.f234738a != 1 || aoVar.mo80569g() == null) {
                ((C23251a) ((C105452v) this.f293808c).mo94644h()).mo28730f(C58836b.f156633a, false);
            } else {
                ((C23251a) ((C105452v) this.f293808c).mo94644h()).mo28730f(C58833ax.m90834k(this.f293704h.mo80569g()), false);
            }
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        super.mo28439iD(protoParcelable);
        ((C23251a) ((C105452v) this.f293808c).mo94610f()).mo28730f(Boolean.valueOf(this.f293811f), false);
        ((C23251a) ((C105452v) this.f293808c).mo94644h()).mo28730f(C58836b.f156633a, false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        super.mo28498iE();
        this.f293703g.mo80760l(this);
        C23251a aVar = (C23251a) ((C105452v) this.f293808c).mo94645i();
        boolean z = true;
        if (!((C85651bb) this.f293807b.mo27525b()).mo79134G() && !((C85651bb) this.f293807b.mo27525b()).mo79132E()) {
            z = false;
        }
        aVar.mo28730f(Boolean.valueOf(z), false);
        ((C23251a) ((C105452v) this.f293808c).mo94642d()).mo28730f(this.f293809d.mo79758x(C90010bp.f246970am), false);
        ((C23251a) ((C105452v) this.f293808c).mo94643g()).mo28730f(this.f293809d.mo79758x(C90010bp.f246971an), false);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        super.mo28499iW();
        this.f293703g.mo80761o(this);
    }
}
