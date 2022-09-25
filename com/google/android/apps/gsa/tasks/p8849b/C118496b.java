package com.google.android.apps.gsa.tasks.p8849b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.libraries.gsa.p1876k.C22868d;

/* renamed from: com.google.android.apps.gsa.tasks.b.b */
/* compiled from: PG */
final class C118496b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ long f328894a;

    /* renamed from: b */
    final /* synthetic */ C118497c f328895b;

    public C118496b(C118497c cVar, long j) {
        this.f328895b = cVar;
        this.f328894a = j;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C86610af afVar = this.f328895b.f328897a;
        long j = this.f328894a;
        C87684al alVar = new C87684al(C88244um.UNBIND_BACKGROUND_CLIENT);
        alVar.mo81966c(new DummyParcelable(th));
        afVar.mo80229j(j, alVar.mo81964a());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f328895b.f328897a.mo80229j(this.f328894a, new C87684al(C88244um.UNBIND_BACKGROUND_CLIENT).mo81964a());
    }
}
