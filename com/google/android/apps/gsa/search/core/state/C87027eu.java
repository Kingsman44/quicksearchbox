package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.state.eu */
/* compiled from: PG */
final class C87027eu implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f235070a;

    /* renamed from: b */
    final /* synthetic */ C87028ev f235071b;

    public C87027eu(C87028ev evVar, Query query) {
        this.f235071b = evVar;
        this.f235070a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C87028ev.f235072a.mo56225c()).mo56382g(th)).mo56372aa(8776)).mo56386p("Pumpkin producer graph failed.");
        this.f235071b.mo80643e(this.f235070a, ActionData.f235991b);
        C89886e b = ((C89911f) this.f235071b.f235076e.mo27525b()).mo83756b(new C90452a(211, C89885b.PUMPKIN_TAG_FAILED_VALUE));
        b.mo83725d(this.f235070a.f252749G);
        b.mo83721a();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f235071b.mo80643e(this.f235070a, (ActionData) ((C58833ax) obj).mo56109e(ActionData.f235991b));
    }
}
