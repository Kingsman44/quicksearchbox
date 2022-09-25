package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.p3418j.C43838c;
import com.google.android.libraries.web.p3418j.C43839d;
import com.google.android.libraries.web.p3418j.C43840e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.web.j.a.q */
/* compiled from: PG */
public final class C43828q implements C43840e, C43839d {

    /* renamed from: a */
    public final C43831t f114258a;

    /* renamed from: b */
    private final C43824m f114259b;

    public C43828q(C43824m mVar, C43831t tVar) {
        this.f114259b = mVar;
        this.f114258a = tVar;
    }

    /* renamed from: a */
    public final void mo46838a(Object obj, C43838c cVar) {
        this.f114259b.mo46844h(obj, new C43827p(this, cVar));
        this.f114258a.mo46838a(obj, cVar);
    }

    /* renamed from: b */
    public final void mo46839b(Object obj) {
        this.f114259b.mo46839b(obj);
        this.f114258a.mo46839b(obj);
    }

    /* renamed from: c */
    public final void mo46840c(Object obj) {
        C43824m mVar = this.f114259b;
        C43831t tVar = this.f114258a;
        Objects.requireNonNull(tVar);
        mVar.mo46845i(obj, new C43826o(tVar));
    }

    /* renamed from: d */
    public final Object mo46841d() {
        C43824m mVar = this.f114259b;
        C43831t tVar = this.f114258a;
        Objects.requireNonNull(tVar);
        return mVar.mo46843g().orElseGet(new C43825n(tVar));
    }
}
