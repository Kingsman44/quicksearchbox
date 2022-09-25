package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113165bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113189ct;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.common.p4520a.C58257l;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bi */
/* compiled from: PG */
final class C111968bi extends C58257l {

    /* renamed from: a */
    final /* synthetic */ C111971bl f311051a;

    public C111968bi(C111971bl blVar) {
        this.f311051a = blVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo54711a(Object obj) {
        C113165bw bwVar = (C113165bw) obj;
        C111971bl blVar = this.f311051a;
        C113404eo b = blVar.f311064k.mo99904b(bwVar.mo99884f(), bwVar.mo99878a(), bwVar.mo99879b(), bwVar.mo99880c());
        Optional e = bwVar.mo99882e();
        Objects.requireNonNull(b);
        e.ifPresent(new C113189ct(b));
        return blVar.mo99322a(b.mo100001a());
    }
}
