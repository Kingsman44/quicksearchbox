package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.service.p6852g.C86729i;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.shared.logger.p7055e.C89909c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.g */
/* compiled from: PG */
final class C86709g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C86731k f234211a;

    /* renamed from: b */
    final /* synthetic */ C89909c f234212b;

    /* renamed from: c */
    final /* synthetic */ C86744b f234213c;

    /* renamed from: d */
    final /* synthetic */ C86710h f234214d;

    public C86709g(C86710h hVar, C86731k kVar, C89909c cVar, C86744b bVar) {
        this.f234214d = hVar;
        this.f234211a = kVar;
        this.f234212b = cVar;
        this.f234213c = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C86731k kVar = this.f234211a;
        kVar.f234286b.mo80341f(this.f234214d.f234221g.mo26870b(), C86729i.FAILED);
        this.f234212b.mo83745c(th);
        this.f234214d.mo80315f(this.f234213c);
        if (this.f234211a.mo80344e() != C86732l.CONTROLLED_BY_USER) {
            AssertionError assertionError = new AssertionError("Work requests returning `void` should never fail or throw any exceptions.");
            assertionError.initCause(th);
            throw assertionError;
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C86731k kVar = this.f234211a;
        kVar.f234286b.mo80341f(this.f234214d.f234221g.mo26870b(), C86729i.SUCCESS);
        this.f234212b.mo83747e();
        this.f234214d.mo80315f(this.f234213c);
    }
}
