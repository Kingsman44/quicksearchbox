package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.assistant.p3858ar.p3859a.C49734x;
import dagger.C68214a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.r */
/* compiled from: PG */
public final /* synthetic */ class C113479r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49734x f314205a;

    /* renamed from: b */
    public final /* synthetic */ C89849ae f314206b;

    public /* synthetic */ C113479r(C49734x xVar, C89849ae aeVar) {
        this.f314205a = xVar;
        this.f314206b = aeVar;
    }

    public final void accept(Object obj) {
        C49734x xVar = this.f314205a;
        ((C113388b) ((C68214a) obj).mo27525b()).mo99675j(xVar.f128413b, this.f314206b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
