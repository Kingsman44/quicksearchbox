package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.by */
/* compiled from: PG */
public final class C113167by {

    /* renamed from: a */
    private final C86124t f313483a;

    /* renamed from: b */
    private final C22871g f313484b;

    public C113167by(C86124t tVar, C22871g gVar) {
        this.f313483a = tVar;
        this.f313484b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo99893a(String str, Callable callable) {
        C22871g gVar = this.f313484b;
        Objects.requireNonNull(callable);
        return gVar.mo28202b(str, new C113166bx(callable));
    }

    /* renamed from: b */
    public final C60870cx mo99894b(String str, Callable callable) {
        if (this.f313483a.mo79746e(C90063do.f249484eR)) {
            return mo99893a(str, callable);
        }
        try {
            return (C60870cx) callable.call();
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }
}
