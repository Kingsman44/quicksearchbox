package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.main.p7205h.C91435q;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105432b;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.n */
/* compiled from: PG */
final class C105297n implements C91435q {

    /* renamed from: a */
    final /* synthetic */ C105432b f293783a;

    public C105297n(C105432b bVar) {
        this.f293783a = bVar;
    }

    /* renamed from: a */
    public final void mo85788a() {
        if (((C23186f) this.f293783a.mo94540e()).mo28631l()) {
            ((C23186f) this.f293783a.mo94540e()).mo28626g(C105295l.f293781a);
            ((C23251a) this.f293783a.mo94548m()).mo28730f(false, false);
            return;
        }
        C59104x d = C105305v.f293791g.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BaseFeedController");
        ((C59052c) ((C59052c) d).mo56372aa(22249)).mo56386p("Scrim dismissed without controller setup");
    }

    /* renamed from: b */
    public final void mo85789b() {
        if (((C23186f) this.f293783a.mo94540e()).mo28631l()) {
            ((C23251a) this.f293783a.mo94548m()).mo28730f(true, false);
            ((C23186f) this.f293783a.mo94540e()).mo28626g(C105296m.f293782a);
            return;
        }
        C59104x d = C105305v.f293791g.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BaseFeedController");
        ((C59052c) ((C59052c) d).mo56372aa(22250)).mo56386p("Scrim shown without controller setup");
    }
}
