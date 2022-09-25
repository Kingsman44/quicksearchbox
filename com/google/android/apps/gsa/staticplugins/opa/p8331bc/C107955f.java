package com.google.android.apps.gsa.staticplugins.opa.p8331bc;

import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.material.snackbar.C44887r;
import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bc.f */
/* compiled from: PG */
public final class C107955f {

    /* renamed from: a */
    C107954e f300389a;

    /* renamed from: a */
    public final void mo96344a(long j) {
        C107954e eVar = this.f300389a;
        if (eVar != null && BitFlags.m148144f(eVar.f300388b.f253762b, j)) {
            eVar.f300387a.mo48340e(3);
            this.f300389a = null;
        }
    }

    /* renamed from: b */
    public final void mo96345b(C107954e eVar) {
        eVar.f300387a.mo48343h();
        this.f300389a = eVar;
    }

    /* renamed from: c */
    public final C107954e mo96346c(Snackbar snackbar, C44893x xVar, long j) {
        List list;
        C107953d dVar = new C107953d(this, xVar);
        C44887r rVar = snackbar.f117104v;
        if (!(rVar == null || (list = snackbar.f117098s) == null)) {
            list.remove(rVar);
        }
        snackbar.mo48348m(dVar);
        snackbar.f117104v = dVar;
        return new C107954e(snackbar, j);
    }
}
