package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.compliance.ae */
/* compiled from: PG */
final class C133580ae implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133576aa f363933a;

    public C133580ae(C133576aa aaVar) {
        this.f363933a = aaVar;
    }

    public final void onClick(View view) {
        C133576aa aaVar = this.f363933a;
        aaVar.f363924g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        aaVar.mo111270a("https://policies.google.com/technologies/cookies/embedded");
    }
}
