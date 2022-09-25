package com.google.android.apps.gsa.shared.p7148ui.p7150b;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.shared.ui.b.b */
/* compiled from: PG */
final class C90653b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44565p f253527a;

    /* renamed from: b */
    final /* synthetic */ C90655d f253528b;

    public C90653b(C90655d dVar, C44565p pVar) {
        this.f253528b = dVar;
        this.f253527a = pVar;
    }

    public final void onClick(View view) {
        C90655d dVar = this.f253528b;
        dVar.f253530a.mo81961c(new C88489j(dVar.f253536g).mo82013a());
        this.f253527a.dismiss();
    }
}
