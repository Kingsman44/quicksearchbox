package com.google.android.apps.gsa.staticplugins.opa.p8331bc;

import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bc.d */
/* compiled from: PG */
final class C107953d extends C44893x {

    /* renamed from: a */
    final /* synthetic */ C44893x f300385a;

    /* renamed from: b */
    final /* synthetic */ C107955f f300386b;

    public C107953d(C107955f fVar, C44893x xVar) {
        this.f300386b = fVar;
        this.f300385a = xVar;
    }

    /* renamed from: a */
    public final void mo33564a(Snackbar snackbar, int i) {
        this.f300385a.mo33565b(snackbar, i);
        C107955f fVar = this.f300386b;
        C107954e eVar = fVar.f300389a;
        if (eVar != null && eVar.f300387a == snackbar) {
            fVar.f300389a = null;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33565b(Object obj, int i) {
        mo33565b((Snackbar) obj, i);
    }

    /* renamed from: c */
    public final void mo33566c(Snackbar snackbar) {
        this.f300385a.mo33567d(snackbar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo33567d(Object obj) {
        this.f300385a.mo33567d((Snackbar) obj);
    }
}
