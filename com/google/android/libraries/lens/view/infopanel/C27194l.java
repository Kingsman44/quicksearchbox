package com.google.android.libraries.lens.view.infopanel;

import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26970f;
import com.google.common.base.C58836b;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.infopanel.l */
/* compiled from: PG */
final class C27194l implements C26970f {

    /* renamed from: a */
    final /* synthetic */ C27195m f74327a;

    public C27194l(C27195m mVar) {
        this.f74327a = mVar;
    }

    /* renamed from: j */
    public final void mo30856j(C26968d dVar) {
        this.f74327a.mo32636p(dVar);
        C27195m mVar = this.f74327a;
        if (C62632i.m94823h(mVar.f74358v.mo32701h())) {
            if (dVar == C26968d.HIDDEN) {
                mVar.f74356t.mo30784a();
            } else {
                mVar.f74356t.mo30785b();
            }
        } else if (dVar == C26968d.FULLY_EXPANDED) {
            mVar.f74356t.mo30785b();
        } else {
            mVar.f74356t.mo30784a();
        }
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            this.f74327a.f74344h.mo32441h(C26968d.FULLY_EXPANDED);
        } else if (ordinal == 1) {
            this.f74327a.f74344h.mo32441h(C26968d.OPEN);
        } else if (ordinal == 2) {
            C27195m mVar2 = this.f74327a;
            ((InputMethodManager) mVar2.f74338b.getContext().getSystemService("input_method")).hideSoftInputFromWindow(mVar2.f74361y.getWindowToken(), 0);
        } else if (ordinal == 4) {
            this.f74327a.f74344h.mo32441h(C26968d.HIDDEN);
            this.f74327a.f74354r.f75782a.mo5708l(C58836b.f156633a);
        }
    }
}
