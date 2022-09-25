package com.google.android.apps.gsa.shared.p7148ui.p7150b;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.shared.ui.b.a */
/* compiled from: PG */
final class C90652a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44565p f253525a;

    /* renamed from: b */
    final /* synthetic */ C90655d f253526b;

    public C90652a(C90655d dVar, C44565p pVar) {
        this.f253526b = dVar;
        this.f253525a = pVar;
    }

    public final void onClick(View view) {
        C90655d dVar = this.f253526b;
        dVar.f253530a.mo81961c(new C88489j(dVar.f253535f).mo82013a());
        this.f253525a.dismiss();
    }
}
