package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94639c;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94648l;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.l */
/* compiled from: PG */
public final class C95119l extends C94648l {

    /* renamed from: a */
    private boolean f266126a;

    /* renamed from: b */
    private boolean f266127b;

    /* renamed from: c */
    private final C95122o f266128c;

    public C95119l(C95118k kVar, C95122o oVar) {
        super(kVar);
        this.f266128c = oVar;
    }

    /* renamed from: a */
    public final C94639c mo88582a(C95455a aVar, C95065ab abVar, Runnable runnable) {
        C94639c a = super.mo88582a(aVar, abVar, runnable);
        this.f266126a = a.f264710a;
        return a;
    }

    /* renamed from: f */
    public final Integer mo88587f() {
        this.f266127b = true;
        return super.mo88587f();
    }

    /* renamed from: g */
    public final void mo88588g(int i) {
        super.mo88588g(i);
        C95122o oVar = this.f266128c;
        if (oVar.mo89010c(this)) {
            boolean z = true;
            if (!this.f266126a && !this.f266127b) {
                z = false;
            }
            oVar.mo89009b(i, z);
        }
    }

    /* renamed from: r */
    public final boolean mo88599r() {
        return false;
    }
}
