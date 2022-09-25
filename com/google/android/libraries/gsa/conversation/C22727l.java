package com.google.android.libraries.gsa.conversation;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.libraries.gsa.conversation.p1839c.C22365l;
import com.google.android.libraries.gsa.conversation.p1851e.C22571j;
import com.google.android.libraries.gsa.conversation.p1853g.C22618ae;
import com.google.android.libraries.gsa.conversation.p1855h.C22707k;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.gsa.conversation.l */
/* compiled from: PG */
public final class C22727l implements C22618ae {

    /* renamed from: a */
    public final C22594g f62547a;

    /* renamed from: b */
    public C22571j f62548b;

    /* renamed from: c */
    public final C22365l f62549c;

    public C22727l(C22365l lVar, C22594g gVar, C22571j jVar) {
        this.f62549c = lVar;
        this.f62547a = gVar;
        this.f62548b = jVar;
    }

    /* renamed from: a */
    public final void mo27740a() {
        this.f62547a.mo27699c(this.f62549c.mo27586b().f62228b);
    }

    /* renamed from: b */
    public final void mo27741b(C22722z zVar) {
        C58833ax axVar;
        C22365l lVar = this.f62549c;
        if (lVar != null) {
            lVar.mo27586b();
            if (this.f62549c.mo27586b().f62228b.mo56113h()) {
                C84349ah ahVar = (C84349ah) this.f62549c.mo27586b().f62228b.mo56107c();
                axVar = ahVar instanceof C84349ah ? C58833ax.m90834k(ahVar.f229566a) : C58836b.f156633a;
                C22707k kVar = (C22707k) zVar;
                this.f62547a.f62240f.mo27813a(new C22707k(kVar.f62504a, kVar.f62505b, kVar.f62506c, axVar));
            }
        }
        axVar = C58836b.f156633a;
        C22707k kVar2 = (C22707k) zVar;
        this.f62547a.f62240f.mo27813a(new C22707k(kVar2.f62504a, kVar2.f62505b, kVar2.f62506c, axVar));
    }
}
