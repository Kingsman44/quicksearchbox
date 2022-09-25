package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8569b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8521b.C111711b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112310ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112311af;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112312ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113423fd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.C113428a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a.C113437f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.b.a */
/* compiled from: PG */
public final class C112999a {

    /* renamed from: a */
    private final C86124t f313164a;

    /* renamed from: b */
    private final C68214a f313165b;

    /* renamed from: c */
    private final C68214a f313166c;

    /* renamed from: d */
    private final C68214a f313167d;

    /* renamed from: e */
    private final C68214a f313168e;

    /* renamed from: f */
    private final C68214a f313169f;

    /* renamed from: g */
    private final C68214a f313170g;

    public C112999a(C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f313164a = tVar;
        this.f313165b = aVar;
        this.f313166c = aVar2;
        this.f313167d = aVar3;
        this.f313168e = aVar4;
        this.f313169f = aVar5;
        this.f313170g = aVar6;
    }

    /* renamed from: a */
    public final void mo99811a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f313164a.mo79746e(C90063do.f249302av)) {
            ((C113437f) ((C111711b) this.f313170g.mo27525b()).f310547b.mo27525b()).f314110b.f314143b.mo100234a();
        }
    }

    /* renamed from: b */
    public final void mo99812b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f313164a.mo79746e(C90014bt.f247740mp)) {
            C112312ag agVar = (C112312ag) this.f313169f.mo27525b();
            new C90873ag(agVar.mo99493b(), agVar.f311673e, "Getting APR and WAA bits", new C112310ae(agVar)).mo85223a(C112311af.f311668a);
        }
        if (this.f313164a.mo79746e(C90063do.f249400cn) && this.f313164a.mo79745c(C90063do.f249595gW).contains(C48672ag.COMPLETE_SERVER.name())) {
            ((C89037bh) this.f313168e.mo27525b()).mo27383i();
        }
    }

    /* renamed from: c */
    public final void mo99813c() {
        C58976aa aaVar = C58975e.f156826a;
        ((C113428a) this.f313165b.mo27525b()).mo100232b();
    }

    /* renamed from: d */
    public final void mo99814d() {
        C58976aa aaVar = C58975e.f156826a;
        ((C113423fd) this.f313167d.mo27525b()).f314084a.evictAll();
        C113251ad adVar = (C113251ad) this.f313166c.mo27525b();
        adVar.f313608a.evictAll();
        adVar.f313609b.evictAll();
        adVar.f313611d.evictAll();
        ((C113428a) this.f313165b.mo27525b()).mo100233c();
        if (this.f313164a.mo79746e(C90063do.f249302av)) {
            ((C113437f) ((C111711b) this.f313170g.mo27525b()).f310547b.mo27525b()).f314110b.mo100235a();
        }
    }
}
