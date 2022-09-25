package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8128b;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.sidekick.main.actions.C91254m;
import com.google.android.apps.gsa.sidekick.main.actions.C91255n;
import com.google.android.apps.gsa.sidekick.main.p7218m.C91469h;
import com.google.android.apps.gsa.sidekick.main.p7218m.C91471j;
import com.google.android.apps.gsa.sidekick.main.p7218m.C91473l;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8146j.p8147a.C105381a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7799kj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.b.e */
/* compiled from: PG */
public final class C105123e extends C86734a implements C105381a {

    /* renamed from: a */
    public final C91473l f293096a;

    /* renamed from: b */
    private final C22871g f293097b;

    /* renamed from: c */
    private final C84413ad f293098c;

    /* renamed from: f */
    private final C68214a f293099f;

    /* renamed from: g */
    private final C68214a f293100g;

    public C105123e(C91473l lVar, C22871g gVar, C84413ad adVar, C68214a aVar, C68214a aVar2) {
        super(C118575h.WORKER_SECOND_SCREEN, "secondscreen");
        this.f293096a = lVar;
        this.f293097b = gVar;
        this.f293098c = adVar;
        this.f293100g = aVar;
        this.f293099f = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo94578a(C7718hj hjVar) {
        return this.f293097b.mo28201a("Dismiss Entry", new C105121c(this, hjVar));
    }

    /* renamed from: c */
    public final C60870cx mo94579c(C7799kj kjVar, C7642eo eoVar) {
        int b = this.f293098c.mo77965b();
        if (b != 0) {
            return C60856cj.m92899h(new C105119a(b));
        }
        if (((C86054o) this.f293100g.mo27525b()).mo79668a() == null) {
            return C60856cj.m92899h(new C105126h());
        }
        if (!((C85651bb) this.f293099f.mo27525b()).mo79133F()) {
            return C60856cj.m92899h(new C105125g());
        }
        if (!((C85651bb) this.f293099f.mo27525b()).mo79141N()) {
            return C60856cj.m92899h(new C105128j());
        }
        C22871g gVar = this.f293097b;
        C91473l lVar = this.f293096a;
        lVar.f255142f = kjVar;
        return gVar.mo28209i(lVar.f255140d.mo28209i(lVar.f255138b.mo85815a(eoVar, kjVar, false, true), "Second Screen Entry Provider store", new C91469h(lVar)), "parse interestResponse", new C105122d(this));
    }

    /* renamed from: e */
    public final void mo94580e(C7718hj hjVar) {
        this.f293096a.mo85821b(new C91254m(hjVar));
        this.f293096a.mo85821b(new C91255n(hjVar));
    }

    /* renamed from: f */
    public final void mo94581f(C7799kj kjVar) {
        C91473l lVar = this.f293096a;
        C7642eo eoVar = C7642eo.SECOND_SCREEN_FEEDBACK;
        C58838bb.m90869d(eoVar != C7642eo.OTHER, "Use a specific RequestTrace");
        lVar.f255142f = kjVar;
        C60870cx cxVar = lVar.f255143g;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        C7799kj kjVar2 = lVar.f255142f;
        if (kjVar2 != null) {
            lVar.f255143g = lVar.f255138b.mo85815a(eoVar, kjVar2, true, true);
            lVar.f255144h = new C91471j(lVar);
            lVar.f255140d.mo28211k(lVar.f255143g, "InterestResponseConsumer", lVar.f255144h);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
