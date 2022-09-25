package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.p3418j.C43838c;
import com.google.android.libraries.web.p3418j.C43843h;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.j.a.k */
/* compiled from: PG */
public final /* synthetic */ class C43822k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43824m f114244a;

    /* renamed from: b */
    public final /* synthetic */ Object f114245b;

    /* renamed from: c */
    public final /* synthetic */ Optional f114246c;

    public /* synthetic */ C43822k(C43824m mVar, Object obj, Optional optional) {
        this.f114244a = mVar;
        this.f114245b = obj;
        this.f114246c = optional;
    }

    public final void accept(Object obj) {
        C43824m mVar = this.f114244a;
        Object obj2 = this.f114245b;
        Optional optional = this.f114246c;
        C43843h hVar = mVar.f114249b;
        Objects.requireNonNull(hVar);
        ((C43838c) obj).mo46462a(obj2, optional.orElseGet(new C43820i(hVar)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
