package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e;

import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135507d;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.q */
/* compiled from: PG */
final class C135675q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C135665g f369554a;

    /* renamed from: b */
    final /* synthetic */ C135676r f369555b;

    public C135675q(C135665g gVar, C135676r rVar) {
        this.f369554a = gVar;
        this.f369555b = rVar;
    }

    public final void onClick(View view) {
        if (this.f369554a.f369531a.mo46595b() != 0) {
            this.f369555b.f369556a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        }
        if (this.f369554a.f369533c) {
            C47393f.m84237h(new C135507d(), view);
        }
        this.f369554a.f369531a.mo46597d();
    }
}
