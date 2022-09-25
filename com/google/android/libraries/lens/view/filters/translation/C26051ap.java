package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2059ah.p2060a.C25120b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ap */
/* compiled from: PG */
final class C26051ap implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C26059ax f70774a;

    public C26051ap(C26059ax axVar) {
        this.f70774a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C26059ax.f70786c.mo56225c()).mo56382g(th)).mo56372aa(49377)).mo56386p("Unable to sync bluechip language settings.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49379)).mo56386p("Live Translate is not enabled.");
            return;
        }
        ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49378)).mo56386p("run Bluechip settings sync");
        ((C25120b) this.f70774a.f70820j.mo56107c()).mo30270b();
    }
}
