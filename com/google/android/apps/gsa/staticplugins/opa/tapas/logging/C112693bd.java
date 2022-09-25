package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4552o.C60321oe;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.bd */
/* compiled from: PG */
final class C112693bd implements C22870f {

    /* renamed from: a */
    final /* synthetic */ C112694be f312403a;

    public C112693bd(C112694be beVar) {
        this.f312403a = beVar;
    }

    public final void run() {
        Optional optional = (Optional) this.f312403a.f312406c.getAndSet(Optional.empty());
        if (optional.isPresent()) {
            C112694be beVar = this.f312403a;
            C89949q.m146520d((C60321oe) optional.get(), beVar.f312412i - beVar.f312411h.mo26870b());
            this.f312403a.f312405b.set(Optional.empty());
            this.f312403a.f312409f.compareAndSet(false, true);
        }
    }
}
