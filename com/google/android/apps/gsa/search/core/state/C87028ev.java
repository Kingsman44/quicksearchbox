package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6642ce.C85080a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.ev */
/* compiled from: PG */
public final class C87028ev extends C86898ct {

    /* renamed from: a */
    public static final C59071e f235072a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.ev");

    /* renamed from: b */
    public final C68214a f235073b;

    /* renamed from: c */
    public final C85080a f235074c;

    /* renamed from: d */
    public final C22871g f235075d;

    /* renamed from: e */
    public final C68214a f235076e;

    /* renamed from: f */
    public Query f235077f = Query.f252741b;

    /* renamed from: g */
    public ActionData f235078g = null;

    /* renamed from: h */
    private final C68214a f235079h;

    /* renamed from: i */
    private final C89994f f235080i;

    /* renamed from: j */
    private final C86124t f235081j;

    public C87028ev(C68214a aVar, C68214a aVar2, C68214a aVar3, C89994f fVar, C86124t tVar, C85080a aVar4, C22871g gVar, C68214a aVar5) {
        super(aVar, 57);
        this.f235079h = aVar2;
        this.f235073b = aVar3;
        this.f235080i = fVar;
        this.f235081j = tVar;
        this.f235074c = aVar4;
        this.f235075d = gVar;
        this.f235076e = aVar5;
    }

    /* renamed from: a */
    public final ActionData mo80642a(Query query) {
        if (mo80645i(query)) {
            return this.f235078g;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo80643e(Query query, ActionData actionData) {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 191;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        if (query.mo84383cP(this.f235077f)) {
            this.f235078g = actionData;
            mo80591ar();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo80644g(Query query) {
        String str;
        if (!query.mo84415cv() && query.mo84331bP() && ((int) this.f235081j.mo79743a(C90120fr.f250824ap)) != 0) {
            if (query.mo84403cj()) {
                str = this.f235080i.mo83863Z();
            } else {
                str = this.f235080i.mo83885ae();
            }
            if (((C87171z) this.f235079h.mo27525b()).mo80781M(query) || !C87032ez.m140541a(query, str) || query.mo84394ca()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PumpkinState");
        fVar.mo85285l(this.f235077f);
        fVar.mo85285l(this.f235078g);
    }

    /* renamed from: i */
    public final boolean mo80645i(Query query) {
        return this.f235078g != null && this.f235077f.mo84383cP(query);
    }

    public final String toString() {
        return "PumpkinState";
    }
}
