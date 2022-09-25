package com.google.android.apps.gsa.staticplugins.opa.p8315az;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.C109717mv;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.az.t */
/* compiled from: PG */
public final class C107709t implements C87681ai, C90991b {

    /* renamed from: a */
    public final C109717mv f299724a;

    /* renamed from: b */
    public final C68214a f299725b;

    /* renamed from: c */
    public final boolean f299726c;

    public C107709t(C109717mv mvVar, C68214a aVar, C58833ax axVar, C68214a aVar2) {
        this.f299724a = mvVar;
        this.f299725b = aVar;
        boolean z = false;
        if (axVar.mo56113h() && ((C74715bp) axVar.mo56107c()).mo71084e() && ((C86124t) aVar2.mo27525b()).mo79746e(C90014bt.f247449hP)) {
            z = true;
        }
        this.f299726c = z;
    }

    /* renamed from: a */
    public final void mo96239a(Bundle bundle) {
        if (this.f299726c) {
            ((C107705p) this.f299725b.mo27525b()).mo96235h();
        } else {
            this.f299724a.mo98047a().mo81947s(bundle);
        }
    }

    /* renamed from: b */
    public final void mo96240b() {
        if (this.f299726c) {
            ((C107705p) this.f299725b.mo27525b()).mo96236i();
        } else {
            this.f299724a.mo98047a().mo81948t(false);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f299724a.mo98047a().mo17602gS(fVar);
    }

    /* renamed from: i */
    public final void mo81937i(ClientEventData clientEventData) {
        if (this.f299726c) {
            ((C107705p) this.f299725b.mo27525b()).mo96232e(clientEventData);
        } else {
            this.f299724a.mo98047a().mo81937i(clientEventData);
        }
    }

    /* renamed from: l */
    public final void mo81940l(C87682aj ajVar, C88244um... umVarArr) {
        if (this.f299726c) {
            ((C107705p) this.f299725b.mo27525b()).mo96233f(ajVar, umVarArr);
        } else {
            this.f299724a.mo98047a().mo81940l(ajVar, umVarArr);
        }
    }

    /* renamed from: m */
    public final void mo81941m(C87682aj ajVar, C88244um... umVarArr) {
        if (this.f299726c) {
            ((C107705p) this.f299725b.mo27525b()).mo96234g(ajVar, umVarArr);
        } else {
            this.f299724a.mo98047a().mo81941m(ajVar, umVarArr);
        }
    }

    /* renamed from: w */
    public final boolean mo81951w() {
        if (this.f299726c) {
            return ((C107705p) this.f299725b.mo27525b()).mo96237j();
        }
        return this.f299724a.mo98047a().mo81951w();
    }
}
