package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.libraries.appactions.serviceengine.api.C147871d;
import com.google.android.libraries.appactions.serviceengine.api.C147875h;
import com.google.android.libraries.appactions.serviceengine.api.C147880m;
import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.s */
/* compiled from: PG */
public final /* synthetic */ class C135844s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C135824av f369986a;

    public /* synthetic */ C135844s(C135824av avVar) {
        this.f369986a = avVar;
    }

    public final void accept(Object obj) {
        C135824av avVar = this.f369986a;
        C147880m k = C147881n.m241026k();
        ((C147871d) k).f398907c = Optional.m71637of((String) obj);
        C147875h hVar = avVar.f369952b;
        avVar.mo112572c(k);
        avVar.f369956f = Optional.m71637of(hVar.mo124559a(k.mo124564e()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
