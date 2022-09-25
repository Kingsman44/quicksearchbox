package com.google.android.apps.gsa.nga.engine.p6243v.p6244a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79358h;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.a.a */
/* compiled from: PG */
public final class C79336a implements C76088d, C79358h {

    /* renamed from: a */
    private final C76092h f217855a;

    /* renamed from: b */
    private final C79338c f217856b;

    public C79336a(C76092h hVar, C79338c cVar) {
        this.f217855a = hVar;
        this.f217856b = cVar;
    }

    /* renamed from: Q */
    public final void mo71863Q() {
        C79338c cVar = this.f217856b;
        boolean f = this.f217855a.mo72021b().mo72041f();
        synchronized (cVar.f217857a) {
            cVar.f217858b = f;
        }
    }

    /* renamed from: a */
    public final void mo73590a(boolean z) {
        C79338c cVar = this.f217856b;
        synchronized (cVar.f217857a) {
            cVar.f217860d = false;
            cVar.f217859c = z;
        }
    }

    /* renamed from: g */
    public final void mo73591g() {
        C79338c cVar = this.f217856b;
        synchronized (cVar.f217857a) {
            cVar.f217860d = true;
        }
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return true;
    }

    /* renamed from: gE */
    public final /* synthetic */ void mo73903gE(C58528ij ijVar) {
    }

    /* renamed from: l */
    public final String mo71204l() {
        return getClass().getSimpleName();
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 26;
    }
}
