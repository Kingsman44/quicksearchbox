package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113990i;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ei */
/* compiled from: PG */
final class C108805ei implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302546a;

    public C108805ei(C109040fj fjVar) {
        this.f302546a = fjVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109040fj.f303210a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChatUiController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(22619)).mo56386p("failed to fetch CardFactory for Zero State");
        this.f302546a.f303446k.mo83755a(th, 38435798, 29).mo83721a();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C87546b bVar = (C87546b) obj;
        if (this.f302546a.mo97530by()) {
            ((C113990i) ((C113988g) this.f302546a.f303450o).mo100834bg().mo56107c()).mo100919cy(bVar);
        }
    }
}
