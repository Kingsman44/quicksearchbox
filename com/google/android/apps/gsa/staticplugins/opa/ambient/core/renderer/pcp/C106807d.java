package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import androidx.lifecycle.C2391v;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.d */
/* compiled from: PG */
public final /* synthetic */ class C106807d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106816m f297659a;

    public /* synthetic */ C106807d(C106816m mVar) {
        this.f297659a = mVar;
    }

    public final void accept(Object obj) {
        C106816m mVar = this.f297659a;
        C106818o oVar = (C106818o) obj;
        if (mVar.f297673d.isPresent()) {
            Objects.requireNonNull(oVar);
            mVar.f297674e.mo5704e((C2391v) mVar.f297673d.get(), new C106808e(oVar));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
