package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.p3418j.C43843h;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.j.a.c */
/* compiled from: PG */
public final /* synthetic */ class C43814c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43824m f114236a;

    public /* synthetic */ C43814c(C43824m mVar) {
        this.f114236a = mVar;
    }

    public final void accept(Object obj) {
        C43824m mVar = this.f114236a;
        Optional optional = (Optional) obj;
        C43843h hVar = mVar.f114249b;
        Objects.requireNonNull(hVar);
        Object orElseGet = mVar.mo46843g().orElseGet(new C43820i(hVar));
        Collection.EL.stream(mVar.f114250c.values()).forEach(new C43822k(mVar, orElseGet, optional));
        Collection.EL.stream(mVar.f114251d.values()).forEach(new C43813b(orElseGet, optional));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
