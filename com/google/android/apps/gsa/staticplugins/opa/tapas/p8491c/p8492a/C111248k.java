package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k */
/* compiled from: PG */
public final class C111248k {

    /* renamed from: a */
    public final C58485gu f309569a;

    /* renamed from: b */
    public final C86124t f309570b;

    public C111248k(Optional optional, C86124t tVar) {
        this.f309569a = (C58485gu) optional.orElse(C58485gu.m89845m());
        this.f309570b = tVar;
    }

    /* renamed from: a */
    public final void mo99076a(C111255r rVar, String str) {
        if (this.f309570b.mo79746e(C90063do.f249318bK) || this.f309570b.mo79746e(C90063do.f249319bL)) {
            Collection.EL.stream(this.f309569a).filter(new C111246i(rVar)).findFirst().ifPresent(new C111247j(str));
        }
    }

    /* renamed from: b */
    public final boolean mo99077b() {
        return !this.f309569a.isEmpty();
    }
}
