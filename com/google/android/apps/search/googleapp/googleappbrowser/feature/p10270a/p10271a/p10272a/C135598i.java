package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.C24883r;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C135598i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C135603n f369352a;

    public /* synthetic */ C135598i(C135603n nVar) {
        this.f369352a = nVar;
    }

    public final void accept(Object obj) {
        C135603n nVar = this.f369352a;
        C24898o oVar = nVar.f369369d;
        C24883r rVar = new C24883r();
        rVar.mo30112b((String) obj);
        oVar.mo30129f(rVar);
        nVar.f369369d.mo30125a();
        nVar.f369374i = Optional.empty();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
