package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.compliance.af */
/* compiled from: PG */
final class C133581af implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133576aa f363934a;

    public C133581af(C133576aa aaVar) {
        this.f363934a = aaVar;
    }

    public final void onClick(View view) {
        C133576aa aaVar = this.f363934a;
        aaVar.f363924g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        aaVar.mo111270a("https://policies.google.com/privacy/embedded");
    }
}
