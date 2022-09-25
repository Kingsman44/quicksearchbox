package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.sidekick.main.p7205h.C91439u;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105432b;
import com.google.android.apps.p489g.p494d.C9268l;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5451f.p5452a.p5453a.p5454a.C69399au;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.k */
/* compiled from: PG */
final class C105294k implements C91439u {

    /* renamed from: a */
    final /* synthetic */ C105432b f293780a;

    public C105294k(C105432b bVar) {
        this.f293780a = bVar;
    }

    /* renamed from: a */
    public final void mo85793a(int i, C9268l lVar) {
        if (((C23186f) this.f293780a.mo94541f()).mo28631l()) {
            ((C23186f) this.f293780a.mo94541f()).mo28626g(new C105292i(i, lVar));
            return;
        }
        C59104x d = C105305v.f293791g.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BaseFeedController");
        ((C59052c) ((C59052c) d).mo56372aa(22247)).mo56386p("Tooltip shown without controller setup");
    }

    /* renamed from: b */
    public final void mo85794b(C69399au auVar) {
        if (((C23186f) this.f293780a.mo94541f()).mo28631l()) {
            ((C23186f) this.f293780a.mo94541f()).mo28626g(new C105293j(auVar));
            return;
        }
        C59104x d = C105305v.f293791g.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BaseFeedController");
        ((C59052c) ((C59052c) d).mo56372aa(22248)).mo56386p("Tooltip dismissed without controller setup");
    }
}
