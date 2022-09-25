package com.google.android.libraries.lens.view.filters.translation;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.by */
/* compiled from: PG */
public final /* synthetic */ class C26087by implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26104co f70897a;

    public /* synthetic */ C26087by(C26104co coVar) {
        this.f70897a = coVar;
    }

    public final void onClick(View view) {
        C26104co coVar = this.f70897a;
        boolean i = coVar.f70934q.mo31316i();
        boolean z = !i;
        coVar.f70936s.mo33853c(C26104co.m48173a(coVar.f70934q.mo31318k(), z), C28485y.m53234a(view));
        coVar.f70934q.mo31314g(z);
        if (i) {
            coVar.f70934q.mo31313f();
        }
    }
}
