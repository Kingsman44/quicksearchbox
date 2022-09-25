package com.google.android.apps.gsa.staticplugins.p7681cm;

import com.google.android.apps.gsa.search.core.p6807j.C86133b;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.c */
/* compiled from: PG */
final class C98003c extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C98009d f273651a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98003c(C98009d dVar) {
        super("Sync CustomTabs availability");
        this.f273651a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C98009d.f273666a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CustomTabsPreference");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(30367)).mo56386p("Could not sync Custom Tabs availability");
        this.f273651a.f273667b = null;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C98009d dVar = this.f273651a;
        dVar.f273668c = (C86133b) obj;
        dVar.mo90878a();
        this.f273651a.f273667b = null;
    }
}
