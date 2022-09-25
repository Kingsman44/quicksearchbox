package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.as */
/* compiled from: PG */
final class C99402as implements C87366a {

    /* renamed from: a */
    final /* synthetic */ C99403at f278079a;

    public C99402as(C99403at atVar) {
        this.f278079a = atVar;
    }

    /* renamed from: a */
    public final C90208n mo81034a() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f278079a.f278110e.mo91441g()).f63720e;
        if (axVar.mo56113h()) {
            return (C90208n) axVar.mo56107c();
        }
        return C90208n.UNKNOWN_TAB;
    }

    /* renamed from: b */
    public final void mo81035b(boolean z) {
        if (((C84486a) this.f278079a.f278124s.mo27525b()).mo78205l()) {
            boolean z2 = false;
            if (z && mo81034a() == C90208n.COLLECTIONS_TAB && this.f278079a.f278115j.mo81002a().mo84354bm() == null) {
                z2 = true;
            }
            this.f278079a.mo91424l(z2);
            return;
        }
        this.f278079a.mo91427o(C90208n.INTERESTS_TAB);
    }
}
