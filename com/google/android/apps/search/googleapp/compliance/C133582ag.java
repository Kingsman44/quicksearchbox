package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.compliance.ag */
/* compiled from: PG */
final class C133582ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133576aa f363935a;

    public C133582ag(C133576aa aaVar) {
        this.f363935a = aaVar;
    }

    public final void onClick(View view) {
        C133576aa aaVar = this.f363935a;
        aaVar.f363924g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        aaVar.mo111270a("https://policies.google.com/terms/embedded");
    }
}
