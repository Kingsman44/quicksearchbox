package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106160a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.en */
/* compiled from: PG */
final class C108810en implements C106160a {

    /* renamed from: a */
    final /* synthetic */ Runnable f302555a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f302556b;

    public C108810en(C109040fj fjVar, Runnable runnable) {
        this.f302556b = fjVar;
        this.f302555a = runnable;
    }

    /* renamed from: a */
    public final void mo95332a() {
    }

    /* renamed from: b */
    public final void mo95333b(int i) {
        C109040fj fjVar = this.f302556b;
        fjVar.f303338bs = false;
        if (i == 1) {
            fjVar.mo97475ak(true);
            this.f302555a.run();
            if (this.f302556b.f303339bt != null) {
                C59104x b = C109040fj.f303210a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ChatUiController");
                ((C59052c) ((C59052c) b).mo56372aa(22624)).mo56386p("Keyguard unlocked, execute runnable per request");
                this.f302556b.f303339bt.run();
                this.f302556b.f303339bt = null;
                return;
            }
            return;
        }
        fjVar.f303441f.finish();
    }
}
